package ru.ok.gl;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.util.Log;
import androidx.annotation.NonNull;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.ho8;

/* loaded from: classes9.dex */
public final class GlBitmapReader {
    public static final int MAX_CALIBRATION_ATTEMPTS = 15;
    private static final String TAG = "GlBitmapReader";
    private final ReadManager readManager;

    public static final class Async implements Reader {
        private static int BUFFER_CAPACITY = 2;
        private final Bitmap bitmap;
        private final int bitmapFrequency;
        private long bitmapNumber;
        private final int height;
        private int nextPboIndex;
        private final IntBuffer pboIds;
        private int readbackPboIndex;
        private final int size;
        private final int width;

        public Async(int i, int i2, int i3) {
            IntBuffer allocate = IntBuffer.allocate(BUFFER_CAPACITY);
            this.pboIds = allocate;
            this.readbackPboIndex = 1;
            this.width = i;
            this.height = i2;
            this.bitmapFrequency = i3;
            this.size = i * 4 * i2;
            GLES20.glGenBuffers(BUFFER_CAPACITY, allocate);
            GlBitmapReader.checkGlError("glGenBuffers");
            for (int i4 = 0; i4 < BUFFER_CAPACITY; i4++) {
                GLES20.glBindBuffer(35051, this.pboIds.get(i4));
                GlBitmapReader.checkGlError("glBindBuffer");
                GLES20.glBufferData(35051, this.size, null, 35045);
                GlBitmapReader.checkGlError("glBufferData");
            }
            GLES20.glBindBuffer(35051, 0);
            GlBitmapReader.checkGlError("glBindBuffer");
            this.bitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        }

        @Override // ru.ok.gl.GlBitmapReader.Reader
        public Bitmap getBitmap() {
            int i;
            GLES20.glBindBuffer(35051, this.pboIds.get(this.nextPboIndex));
            GlBitmapReader.checkGlError("glBindBuffer");
            GlesHelper.glReadPixelsFromPbo(0, 0, this.width, this.height, 6408, 5121);
            long j = this.bitmapNumber;
            boolean z = false;
            if (j <= 0 || !((i = this.bitmapFrequency) == 1 || j % i == 0)) {
                GLES20.glBindBuffer(35051, 0);
                GlBitmapReader.checkGlError("glBindBuffer");
            } else {
                z = GlesHelper.glReadPixelsFromPboToBitmap(0, this.size, this.pboIds.get(this.readbackPboIndex), this.bitmap);
            }
            this.bitmapNumber++;
            int i2 = this.nextPboIndex + 1;
            int i3 = BUFFER_CAPACITY;
            this.nextPboIndex = i2 % i3;
            this.readbackPboIndex = (this.readbackPboIndex + 1) % i3;
            if (z) {
                return this.bitmap;
            }
            return null;
        }

        @Override // ru.ok.gl.GlBitmapReader.Reader
        public boolean isSame(int i, int i2) {
            return this.width == i && this.height == i2;
        }

        @Override // ru.ok.gl.GlBitmapReader.Reader
        public void release(boolean z) {
            this.bitmap.recycle();
            if (z) {
                GLES20.glDeleteBuffers(BUFFER_CAPACITY, this.pboIds);
                if (GLES20.glGetError() != 0) {
                    Log.e(GlBitmapReader.TAG, "Error during release of GlBitmapReader");
                }
            }
        }
    }

    public interface DebugInfoConsumer {
        void consumeGlBitmapReaderStatus(@NonNull String str);
    }

    public static final class ReadManager {
        private int asyncFps;
        private int attemptCounter;
        private DebugInfoConsumer debugInfoConsumer;
        private boolean forceSync;
        private final Fps fps;
        private final int glVersion;
        private ArrayList<Reader> readers;
        private int stage = 0;
        private int syncFps;

        public ReadManager(int i, Fps fps, boolean z) {
            this.glVersion = GlesHelper.glIsGles3Supported() ? i : Math.min(2, i);
            this.fps = fps == null ? new Fps() { // from class: ru.ok.gl.GlBitmapReader.ReadManager.1
            } : fps;
            this.forceSync = z;
            this.readers = new ArrayList<>();
        }

        private void dispatchStatus(String str) {
            DebugInfoConsumer debugInfoConsumer = this.debugInfoConsumer;
            if (debugInfoConsumer != null) {
                debugInfoConsumer.consumeGlBitmapReaderStatus(str);
            }
        }

        public Bitmap getBitmap(int i, int i2) {
            Reader reader;
            Iterator<Reader> it = this.readers.iterator();
            while (true) {
                if (!it.hasNext()) {
                    reader = null;
                    break;
                }
                reader = it.next();
                if (reader.isSame(i, i2)) {
                    break;
                }
            }
            if (reader == null) {
                reader = this.forceSync ? new Sync(i, i2) : new Async(i, i2, 1);
                this.readers.add(reader);
            }
            this.stage = 2;
            return reader.getBitmap();
        }

        public void release(boolean z) {
            this.debugInfoConsumer = null;
            GlBitmapReader.checkGlError("Before release of GlBR");
            Iterator<Reader> it = this.readers.iterator();
            while (it.hasNext()) {
                it.next().release(z);
            }
        }

        public void setDebugInfoConsumer(DebugInfoConsumer debugInfoConsumer) {
            this.debugInfoConsumer = debugInfoConsumer;
        }
    }

    public interface Reader {
        Bitmap getBitmap();

        boolean isSame(int i, int i2);

        void release(boolean z);
    }

    public GlBitmapReader(int i, Fps fps, boolean z) {
        this.readManager = new ReadManager(i, fps, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void checkGlError(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        StringBuilder b = ho8.b(str, ": glError 0x");
        b.append(Integer.toHexString(glGetError));
        String sb = b.toString();
        Log.e(TAG, sb);
        throw new RuntimeException(sb);
    }

    public Bitmap getBitmap(int i, int i2) {
        return this.readManager.getBitmap(i, i2);
    }

    public void release(boolean z) {
        this.readManager.release(z);
    }

    public void setDebugInfoConsumer(DebugInfoConsumer debugInfoConsumer) {
        this.readManager.setDebugInfoConsumer(debugInfoConsumer);
    }

    public interface Fps {
        default int getFps() {
            return 0;
        }

        default void beginMeasure() {
        }

        default void endMeasure() {
        }

        default void refresh() {
        }
    }

    public static final class Sync implements Reader {
        private final Bitmap bitmap;
        private final int height;
        private final int width;

        public Sync(int i, int i2) {
            this.width = i;
            this.height = i2;
            this.bitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        }

        @Override // ru.ok.gl.GlBitmapReader.Reader
        public Bitmap getBitmap() {
            if (GlesHelper.glReadPixelsToBitmap(0, 0, this.width, this.height, 6408, 5121, this.bitmap)) {
                return this.bitmap;
            }
            return null;
        }

        @Override // ru.ok.gl.GlBitmapReader.Reader
        public boolean isSame(int i, int i2) {
            return this.width == i && this.height == i2;
        }

        @Override // ru.ok.gl.GlBitmapReader.Reader
        public void release(boolean z) {
        }
    }
}
