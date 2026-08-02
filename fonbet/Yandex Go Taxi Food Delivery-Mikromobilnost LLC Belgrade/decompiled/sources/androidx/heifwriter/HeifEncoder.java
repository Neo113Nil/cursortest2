package androidx.heifwriter;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.Image;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import com.google.android.gms.gcm.Task;
import defpackage.aqn;
import defpackage.dfu;
import defpackage.gqn;
import defpackage.kbs;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.ruy0;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Objects;
import org.webrtc.EglBase;

/* loaded from: classes10.dex */
public final class HeifEncoder implements AutoCloseable, SurfaceTexture.OnFrameAvailableListener {
    private static final boolean DEBUG = false;
    private static final int GRID_HEIGHT = 512;
    private static final int GRID_WIDTH = 512;
    private static final int INPUT_BUFFER_POOL_SIZE = 2;
    public static final int INPUT_MODE_BITMAP = 2;
    public static final int INPUT_MODE_BUFFER = 0;
    public static final int INPUT_MODE_SURFACE = 1;
    private static final double MAX_COMPRESS_RATIO = 0.25d;
    private static final String TAG = "HeifEncoder";
    final a mCallback;
    private ByteBuffer mCurrentBuffer;
    private final Rect mDstRect;
    b mEOSTracker;
    MediaCodec mEncoder;
    private gqn mEncoderEglSurface;
    private Surface mEncoderSurface;
    final int mGridCols;
    final int mGridHeight;
    final int mGridRows;
    final int mGridWidth;
    final Handler mHandler;
    private final HandlerThread mHandlerThread;
    final int mHeight;
    boolean mInputEOS;
    private int mInputIndex;
    private final int mInputMode;
    private Surface mInputSurface;
    private SurfaceTexture mInputTexture;
    private final int mNumTiles;
    private aqn mRectBlt;
    private final Rect mSrcRect;
    private int mTextureId;
    final boolean mUseGrid;
    final int mWidth;
    private final ArrayList<ByteBuffer> mEmptyBuffers = new ArrayList<>();
    private final ArrayList<ByteBuffer> mFilledBuffers = new ArrayList<>();
    final ArrayList<Integer> mCodecInputBuffers = new ArrayList<>();
    private final float[] mTmpMatrix = new float[16];

    public class EncoderCallback extends MediaCodec.Callback {
        private boolean mOutputEOS;

        public EncoderCallback() {
        }

        private void stopAndNotify(MediaCodec.CodecException codecException) {
            HeifEncoder.this.stopInternal();
            HeifEncoder heifEncoder = HeifEncoder.this;
            if (codecException == null) {
                heifEncoder.mCallback.a();
            } else {
                heifEncoder.mCallback.c(codecException);
            }
        }

        @Override // android.media.MediaCodec.Callback
        public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
            if (mediaCodec != HeifEncoder.this.mEncoder) {
                return;
            }
            Log.e(HeifEncoder.TAG, "onError: " + codecException);
            stopAndNotify(codecException);
        }

        @Override // android.media.MediaCodec.Callback
        public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
            HeifEncoder heifEncoder = HeifEncoder.this;
            if (mediaCodec != heifEncoder.mEncoder || heifEncoder.mInputEOS) {
                return;
            }
            heifEncoder.mCodecInputBuffers.add(Integer.valueOf(i));
            HeifEncoder.this.maybeCopyOneTileYUV();
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
            if (mediaCodec != HeifEncoder.this.mEncoder || this.mOutputEOS) {
                return;
            }
            if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0) {
                ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(i);
                outputBuffer.position(bufferInfo.offset);
                outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                b bVar = HeifEncoder.this.mEOSTracker;
                if (bVar != null) {
                    long j = bufferInfo.presentationTimeUs;
                    synchronized (bVar) {
                        bVar.f = j;
                        bVar.a();
                    }
                }
                HeifEncoder.this.mCallback.b(outputBuffer);
            }
            this.mOutputEOS = ((bufferInfo.flags & 4) != 0) | this.mOutputEOS;
            mediaCodec.releaseOutputBuffer(i, false);
            if (this.mOutputEOS) {
                stopAndNotify(null);
            }
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
            if (mediaCodec != HeifEncoder.this.mEncoder) {
                return;
            }
            if (!"image/vnd.android.heic".equals(mediaFormat.getString("mime"))) {
                mediaFormat.setString("mime", "image/vnd.android.heic");
                mediaFormat.setInteger("width", HeifEncoder.this.mWidth);
                mediaFormat.setInteger("height", HeifEncoder.this.mHeight);
                HeifEncoder heifEncoder = HeifEncoder.this;
                if (heifEncoder.mUseGrid) {
                    mediaFormat.setInteger("tile-width", heifEncoder.mGridWidth);
                    mediaFormat.setInteger("tile-height", HeifEncoder.this.mGridHeight);
                    mediaFormat.setInteger("grid-rows", HeifEncoder.this.mGridRows);
                    mediaFormat.setInteger("grid-cols", HeifEncoder.this.mGridCols);
                }
            }
            HeifEncoder.this.mCallback.d(mediaFormat);
        }
    }

    public static abstract class a {
        public abstract void a();

        public abstract void b(ByteBuffer byteBuffer);

        public abstract void c(MediaCodec.CodecException codecException);

        public abstract void d(MediaFormat mediaFormat);
    }

    public HeifEncoder(int i, int i2, boolean z, int i3, int i4, Handler handler, a aVar) throws IOException {
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean z2;
        int i5;
        boolean z3;
        int i6;
        int i7;
        if (i < 0 || i2 < 0 || i3 < 0 || i3 > 100) {
            ny61.g("invalid encoder inputs");
            throw null;
        }
        int i8 = 512;
        boolean z4 = z & (i > 512 || i2 > 512);
        try {
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType("image/vnd.android.heic");
            this.mEncoder = createEncoderByType;
            capabilitiesForType = createEncoderByType.getCodecInfo().getCapabilitiesForType("image/vnd.android.heic");
        } catch (Exception unused) {
            MediaCodec createEncoderByType2 = MediaCodec.createEncoderByType("video/hevc");
            this.mEncoder = createEncoderByType2;
            capabilitiesForType = createEncoderByType2.getCodecInfo().getCapabilitiesForType("video/hevc");
            z4 |= !capabilitiesForType.getVideoCapabilities().isSizeSupported(i, i2);
            z2 = false;
        }
        if (!capabilitiesForType.getVideoCapabilities().isSizeSupported(i, i2)) {
            this.mEncoder.release();
            this.mEncoder = null;
            throw new Exception();
        }
        z2 = true;
        this.mInputMode = i4;
        this.mCallback = aVar;
        Looper looper = handler != null ? handler.getLooper() : null;
        if (looper == null) {
            HandlerThread handlerThread = new HandlerThread("HeifEncoderThread", -2);
            this.mHandlerThread = handlerThread;
            handlerThread.start();
            looper = handlerThread.getLooper();
        } else {
            this.mHandlerThread = null;
        }
        Handler handler2 = new Handler(looper);
        this.mHandler = handler2;
        boolean z5 = i4 == 1 || i4 == 2;
        int i9 = z5 ? 2130708361 : 2135033992;
        this.mWidth = i;
        this.mHeight = i2;
        this.mUseGrid = z4;
        if (z4) {
            i7 = (i2 + 511) / 512;
            z3 = z4;
            i6 = (i + 511) / 512;
            i5 = 512;
        } else {
            i8 = i;
            i5 = i2;
            z3 = z4;
            i6 = 1;
            i7 = 1;
        }
        MediaFormat createVideoFormat = z2 ? MediaFormat.createVideoFormat("image/vnd.android.heic", i, i2) : MediaFormat.createVideoFormat("video/hevc", i8, i5);
        if (z3) {
            createVideoFormat.setInteger("tile-width", i8);
            createVideoFormat.setInteger("tile-height", i5);
            createVideoFormat.setInteger("grid-cols", i6);
            createVideoFormat.setInteger("grid-rows", i7);
        }
        if (z2) {
            this.mGridWidth = i;
            this.mGridHeight = i2;
            this.mGridRows = 1;
            this.mGridCols = 1;
        } else {
            this.mGridWidth = i8;
            this.mGridHeight = i5;
            this.mGridRows = i7;
            this.mGridCols = i6;
        }
        int i10 = this.mGridRows * this.mGridCols;
        this.mNumTiles = i10;
        createVideoFormat.setInteger("i-frame-interval", 0);
        createVideoFormat.setInteger("color-format", i9);
        createVideoFormat.setInteger("frame-rate", i10);
        createVideoFormat.setInteger("capture-rate", i10 * 30);
        MediaCodecInfo.EncoderCapabilities encoderCapabilities = capabilitiesForType.getEncoderCapabilities();
        if (encoderCapabilities.isBitrateModeSupported(0)) {
            Objects.toString(encoderCapabilities.getQualityRange());
            createVideoFormat.setInteger("bitrate-mode", 0);
            createVideoFormat.setInteger("quality", (int) ((((r6.getUpper().intValue() - r6.getLower().intValue()) * i3) / 100.0d) + r6.getLower().intValue()));
        } else {
            if (encoderCapabilities.isBitrateModeSupported(2)) {
                createVideoFormat.setInteger("bitrate-mode", 2);
            } else {
                createVideoFormat.setInteger("bitrate-mode", 1);
            }
            createVideoFormat.setInteger("bitrate", (int) ((((((i * i2) * 1.5d) * 8.0d) * MAX_COMPRESS_RATIO) * i3) / 100.0d));
        }
        this.mEncoder.setCallback(new EncoderCallback(), handler2);
        this.mEncoder.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
        if (z5) {
            Surface createInputSurface = this.mEncoder.createInputSurface();
            this.mEncoderSurface = createInputSurface;
            boolean z6 = (z3 && !z2) || i4 == 2;
            this.mEOSTracker = new b(this, z6);
            if (z6) {
                gqn gqnVar = new gqn();
                gqnVar.a = EGL14.EGL_NO_DISPLAY;
                gqnVar.b = EGL14.EGL_NO_CONTEXT;
                gqnVar.c = EGL14.EGL_NO_SURFACE;
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                createInputSurface.getClass();
                gqnVar.d = createInputSurface;
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                gqnVar.a = eglGetDisplay;
                if (Objects.equals(eglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
                    kbs.g("unable to get EGL14 display");
                    throw null;
                }
                int[] iArr = new int[2];
                if (!EGL14.eglInitialize(gqnVar.a, iArr, 0, iArr, 1)) {
                    gqnVar.a = null;
                    kbs.g("unable to initialize EGL14");
                    throw null;
                }
                if (!EGL14.eglChooseConfig(gqnVar.a, new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    kbs.g("unable to find RGB888+recordable ES2 EGL config");
                    throw null;
                }
                gqnVar.b = EGL14.eglCreateContext(gqnVar.a, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                gqn.a("eglCreateContext");
                if (gqnVar.b == null) {
                    kbs.g("null context");
                    throw null;
                }
                gqnVar.c = EGL14.eglCreateWindowSurface(gqnVar.a, eGLConfigArr[0], gqnVar.d, new int[]{12344}, 0);
                gqn.a("eglCreateWindowSurface");
                EGLSurface eGLSurface = gqnVar.c;
                if (eGLSurface == null) {
                    kbs.g("surface was null");
                    throw null;
                }
                EGL14.eglQuerySurface(gqnVar.a, eGLSurface, 12375, new int[1], 0);
                EGL14.eglQuerySurface(gqnVar.a, gqnVar.c, 12374, new int[1], 0);
                this.mEncoderEglSurface = gqnVar;
                gqnVar.b();
                int i11 = i4 == 2 ? 0 : 1;
                ruy0 ruy0Var = new ruy0();
                if (i11 == 0) {
                    ruy0Var.f = 3553;
                    ruy0Var.a = ruy0.c("precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
                } else {
                    if (i11 != 1) {
                        kbs.g(oyr.i(i11, "Unhandled type "));
                        throw null;
                    }
                    ruy0Var.f = 36197;
                    ruy0Var.a = ruy0.c("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
                }
                int i12 = ruy0Var.a;
                if (i12 == 0) {
                    kbs.g("Unable to create program");
                    throw null;
                }
                int glGetAttribLocation = GLES20.glGetAttribLocation(i12, "aPosition");
                ruy0Var.d = glGetAttribLocation;
                ruy0.b(glGetAttribLocation, "aPosition");
                int glGetAttribLocation2 = GLES20.glGetAttribLocation(ruy0Var.a, "aTextureCoord");
                ruy0Var.e = glGetAttribLocation2;
                ruy0.b(glGetAttribLocation2, "aTextureCoord");
                int glGetUniformLocation = GLES20.glGetUniformLocation(ruy0Var.a, "uMVPMatrix");
                ruy0Var.b = glGetUniformLocation;
                ruy0.b(glGetUniformLocation, "uMVPMatrix");
                int glGetUniformLocation2 = GLES20.glGetUniformLocation(ruy0Var.a, "uTexMatrix");
                ruy0Var.c = glGetUniformLocation2;
                ruy0.b(glGetUniformLocation2, "uTexMatrix");
                aqn aqnVar = new aqn(ruy0Var, i, i2);
                this.mRectBlt = aqnVar;
                ruy0 ruy0Var2 = aqnVar.e;
                ruy0Var2.getClass();
                int[] iArr2 = new int[1];
                GLES20.glGenTextures(1, iArr2, 0);
                ruy0.a("glGenTextures");
                int i13 = iArr2[0];
                int i14 = ruy0Var2.f;
                GLES20.glBindTexture(i14, i13);
                ruy0.a("glBindTexture " + i13);
                GLES20.glTexParameterf(i14, 10241, 9728.0f);
                GLES20.glTexParameterf(i14, Task.EXTRAS_LIMIT_BYTES, i14 != 3553 ? 9729.0f : 9728.0f);
                GLES20.glTexParameteri(i14, 10242, 33071);
                GLES20.glTexParameteri(i14, 10243, 33071);
                ruy0.a("glTexParameter");
                this.mTextureId = i13;
                if (i4 == 1) {
                    SurfaceTexture surfaceTexture = new SurfaceTexture(this.mTextureId, true);
                    this.mInputTexture = surfaceTexture;
                    surfaceTexture.setOnFrameAvailableListener(this);
                    this.mInputTexture.setDefaultBufferSize(i, i2);
                    this.mInputSurface = new Surface(this.mInputTexture);
                }
                this.mEncoderEglSurface.c();
            } else {
                this.mInputSurface = createInputSurface;
            }
        } else {
            for (int i15 = 0; i15 < 2; i15++) {
                this.mEmptyBuffers.add(ByteBuffer.allocateDirect(((this.mWidth * this.mHeight) * 3) / 2));
            }
        }
        this.mDstRect = new Rect(0, 0, this.mGridWidth, this.mGridHeight);
        this.mSrcRect = new Rect();
    }

    private ByteBuffer acquireEmptyBuffer() {
        ByteBuffer remove;
        synchronized (this.mEmptyBuffers) {
            while (!this.mInputEOS && this.mEmptyBuffers.isEmpty()) {
                try {
                    this.mEmptyBuffers.wait();
                } catch (InterruptedException unused) {
                }
            }
            remove = this.mInputEOS ? null : this.mEmptyBuffers.remove(0);
        }
        return remove;
    }

    private void addYuvBufferInternal(byte[] bArr) {
        ByteBuffer acquireEmptyBuffer = acquireEmptyBuffer();
        if (acquireEmptyBuffer == null) {
            return;
        }
        acquireEmptyBuffer.clear();
        if (bArr != null) {
            acquireEmptyBuffer.put(bArr);
        }
        acquireEmptyBuffer.flip();
        synchronized (this.mFilledBuffers) {
            this.mFilledBuffers.add(acquireEmptyBuffer);
        }
        this.mHandler.post(new dfu(this, 0));
    }

    private long computePresentationTime(int i) {
        return ((i * 1000000) / this.mNumTiles) + 132;
    }

    private static void copyOneTileYUV(ByteBuffer byteBuffer, Image image, int i, int i2, Rect rect, Rect rect2) {
        int i3;
        int i4;
        if (rect.width() != rect2.width() || rect.height() != rect2.height()) {
            ny61.g("src and dst rect size are different!");
            return;
        }
        if (i % 2 == 0 && i2 % 2 == 0) {
            int i5 = 2;
            if (rect.left % 2 == 0 && rect.top % 2 == 0 && rect.right % 2 == 0 && rect.bottom % 2 == 0 && rect2.left % 2 == 0 && rect2.top % 2 == 0 && rect2.right % 2 == 0 && rect2.bottom % 2 == 0) {
                Image.Plane[] planes = image.getPlanes();
                int i6 = 0;
                while (i6 < planes.length) {
                    ByteBuffer buffer = planes[i6].getBuffer();
                    int pixelStride = planes[i6].getPixelStride();
                    int min = Math.min(rect.width(), i - rect.left);
                    int min2 = Math.min(rect.height(), i2 - rect.top);
                    if (i6 > 0) {
                        i4 = ((i6 + 3) * (i * i2)) / 4;
                        i3 = i5;
                    } else {
                        i3 = 1;
                        i4 = 0;
                    }
                    for (int i7 = 0; i7 < min2 / i3; i7++) {
                        byteBuffer.position((rect.left / i3) + ((((rect.top / i3) + i7) * i) / i3) + i4);
                        buffer.position(((rect2.left * pixelStride) / i3) + (planes[i6].getRowStride() * ((rect2.top / i3) + i7)));
                        int i8 = 0;
                        while (true) {
                            int i9 = min / i3;
                            if (i8 < i9) {
                                buffer.put(byteBuffer.get());
                                if (pixelStride > 1 && i8 != i9 - 1) {
                                    buffer.position((buffer.position() + pixelStride) - 1);
                                }
                                i8++;
                            }
                        }
                    }
                    i6++;
                    i5 = 2;
                }
                return;
            }
        }
        ny61.g("src or dst are not aligned!");
    }

    private void copyTilesGL() {
        GLES20.glViewport(0, 0, this.mGridWidth, this.mGridHeight);
        for (int i = 0; i < this.mGridRows; i++) {
            for (int i2 = 0; i2 < this.mGridCols; i2++) {
                int i3 = this.mGridWidth;
                int i4 = i2 * i3;
                int i5 = this.mGridHeight;
                int i6 = i * i5;
                this.mSrcRect.set(i4, i6, i3 + i4, i5 + i6);
                aqn aqnVar = this.mRectBlt;
                int i7 = this.mTextureId;
                float[] fArr = ruy0.h;
                Rect rect = this.mSrcRect;
                float[] fArr2 = aqnVar.a;
                float f = rect.left;
                float f2 = aqnVar.c;
                float f3 = f / f2;
                fArr2[0] = f3;
                float f4 = rect.bottom;
                float f5 = aqnVar.d;
                float f6 = 1.0f - (f4 / f5);
                fArr2[1] = f6;
                float f7 = rect.right / f2;
                fArr2[2] = f7;
                fArr2[3] = f6;
                fArr2[4] = f3;
                float f8 = 1.0f - (rect.top / f5);
                fArr2[5] = f8;
                fArr2[6] = f7;
                fArr2[7] = f8;
                FloatBuffer floatBuffer = aqnVar.b;
                floatBuffer.put(fArr2);
                floatBuffer.position(0);
                ruy0 ruy0Var = aqnVar.e;
                float[] fArr3 = ruy0.g;
                FloatBuffer floatBuffer2 = aqn.f;
                FloatBuffer floatBuffer3 = aqnVar.b;
                ruy0Var.getClass();
                ruy0.a("draw start");
                GLES20.glUseProgram(ruy0Var.a);
                ruy0.a("glUseProgram");
                GLES20.glActiveTexture(33984);
                int i8 = ruy0Var.f;
                GLES20.glBindTexture(i8, i7);
                GLES20.glUniformMatrix4fv(ruy0Var.b, 1, false, fArr3, 0);
                ruy0.a("glUniformMatrix4fv");
                GLES20.glUniformMatrix4fv(ruy0Var.c, 1, false, fArr, 0);
                ruy0.a("glUniformMatrix4fv");
                int i9 = ruy0Var.d;
                GLES20.glEnableVertexAttribArray(i9);
                ruy0.a("glEnableVertexAttribArray");
                GLES20.glVertexAttribPointer(ruy0Var.d, 2, 5126, false, 8, (Buffer) floatBuffer2);
                ruy0.a("glVertexAttribPointer");
                int i10 = ruy0Var.e;
                GLES20.glEnableVertexAttribArray(i10);
                ruy0.a("glEnableVertexAttribArray");
                GLES20.glVertexAttribPointer(ruy0Var.e, 2, 5126, false, 8, (Buffer) floatBuffer3);
                ruy0.a("glVertexAttribPointer");
                GLES20.glDrawArrays(5, 0, 4);
                ruy0.a("glDrawArrays");
                GLES20.glDisableVertexAttribArray(i9);
                GLES20.glDisableVertexAttribArray(i10);
                GLES20.glBindTexture(i8, 0);
                GLES20.glUseProgram(0);
                gqn gqnVar = this.mEncoderEglSurface;
                int i11 = this.mInputIndex;
                this.mInputIndex = i11 + 1;
                EGLExt.eglPresentationTimeANDROID(gqnVar.a, gqnVar.c, computePresentationTime(i11) * 1000);
                gqn gqnVar2 = this.mEncoderEglSurface;
                EGL14.eglSwapBuffers(gqnVar2.a, gqnVar2.c);
            }
        }
    }

    private ByteBuffer getCurrentBuffer() {
        if (!this.mInputEOS && this.mCurrentBuffer == null) {
            synchronized (this.mFilledBuffers) {
                this.mCurrentBuffer = this.mFilledBuffers.isEmpty() ? null : this.mFilledBuffers.remove(0);
            }
        }
        if (this.mInputEOS) {
            return null;
        }
        return this.mCurrentBuffer;
    }

    private void returnEmptyBufferAndNotify(boolean z) {
        synchronized (this.mEmptyBuffers) {
            this.mInputEOS = z | this.mInputEOS;
            this.mEmptyBuffers.add(this.mCurrentBuffer);
            this.mEmptyBuffers.notifyAll();
        }
        this.mCurrentBuffer = null;
    }

    public void addBitmap(Bitmap bitmap) {
        if (this.mInputMode != 2) {
            ny61.r("addBitmap is only allowed in bitmap input mode");
            return;
        }
        if (this.mEOSTracker.c(computePresentationTime(this.mInputIndex) * 1000, computePresentationTime((this.mInputIndex + this.mNumTiles) - 1))) {
            synchronized (this) {
                try {
                    gqn gqnVar = this.mEncoderEglSurface;
                    if (gqnVar == null) {
                        return;
                    }
                    gqnVar.b();
                    aqn aqnVar = this.mRectBlt;
                    int i = this.mTextureId;
                    int i2 = aqnVar.e.f;
                    GLES20.glBindTexture(i2, i);
                    GLUtils.texImage2D(i2, 0, bitmap, 0);
                    copyTilesGL();
                    this.mEncoderEglSurface.c();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void addYuvBuffer(int i, byte[] bArr) {
        if (this.mInputMode != 0) {
            ny61.r("addYuvBuffer is only allowed in buffer input mode");
        } else if (bArr == null || bArr.length != ((this.mWidth * this.mHeight) * 3) / 2) {
            ny61.g("invalid data");
        } else {
            addYuvBufferInternal(bArr);
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.mEmptyBuffers) {
            this.mInputEOS = true;
            this.mEmptyBuffers.notifyAll();
        }
        this.mHandler.postAtFrontOfQueue(new dfu(this, 1));
    }

    public Surface getInputSurface() {
        if (this.mInputMode == 1) {
            return this.mInputSurface;
        }
        ny61.r("getInputSurface is only allowed in surface input mode");
        return null;
    }

    public void maybeCopyOneTileYUV() {
        while (true) {
            ByteBuffer currentBuffer = getCurrentBuffer();
            if (currentBuffer == null || this.mCodecInputBuffers.isEmpty()) {
                return;
            }
            int intValue = this.mCodecInputBuffers.remove(0).intValue();
            boolean z = this.mInputIndex % this.mNumTiles == 0 && currentBuffer.remaining() == 0;
            if (!z) {
                Image inputImage = this.mEncoder.getInputImage(intValue);
                int i = this.mGridWidth;
                int i2 = this.mInputIndex;
                int i3 = this.mGridCols;
                int i4 = (i2 % i3) * i;
                int i5 = this.mGridHeight;
                int i6 = ((i2 / i3) % this.mGridRows) * i5;
                this.mSrcRect.set(i4, i6, i + i4, i5 + i6);
                copyOneTileYUV(currentBuffer, inputImage, this.mWidth, this.mHeight, this.mSrcRect, this.mDstRect);
            }
            MediaCodec mediaCodec = this.mEncoder;
            int capacity = z ? 0 : mediaCodec.getInputBuffer(intValue).capacity();
            int i7 = this.mInputIndex;
            this.mInputIndex = i7 + 1;
            mediaCodec.queueInputBuffer(intValue, 0, capacity, computePresentationTime(i7), z ? 4 : 0);
            if (z || this.mInputIndex % this.mNumTiles == 0) {
                returnEmptyBufferAndNotify(z);
            }
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this) {
            try {
                gqn gqnVar = this.mEncoderEglSurface;
                if (gqnVar == null) {
                    return;
                }
                gqnVar.b();
                surfaceTexture.updateTexImage();
                surfaceTexture.getTransformMatrix(this.mTmpMatrix);
                if (this.mEOSTracker.c(surfaceTexture.getTimestamp(), computePresentationTime((this.mInputIndex + this.mNumTiles) - 1))) {
                    copyTilesGL();
                }
                surfaceTexture.releaseTexImage();
                this.mEncoderEglSurface.c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setEndOfInputStreamTimestamp(long j) {
        if (this.mInputMode != 1) {
            ny61.r("setEndOfInputStreamTimestamp is only allowed in surface input mode");
            return;
        }
        b bVar = this.mEOSTracker;
        if (bVar != null) {
            bVar.b(j);
        }
    }

    public void start() {
        this.mEncoder.start();
    }

    public void stopAsync() {
        int i = this.mInputMode;
        if (i == 2) {
            this.mEOSTracker.b(0L);
        } else if (i == 0) {
            addYuvBufferInternal(null);
        }
    }

    public void stopInternal() {
        MediaCodec mediaCodec = this.mEncoder;
        if (mediaCodec != null) {
            mediaCodec.stop();
            this.mEncoder.release();
            this.mEncoder = null;
        }
        synchronized (this.mEmptyBuffers) {
            this.mInputEOS = true;
            this.mEmptyBuffers.notifyAll();
        }
        synchronized (this) {
            try {
                aqn aqnVar = this.mRectBlt;
                if (aqnVar != null) {
                    if (aqnVar.e != null) {
                        aqnVar.e = null;
                    }
                    this.mRectBlt = null;
                }
                gqn gqnVar = this.mEncoderEglSurface;
                if (gqnVar != null) {
                    gqnVar.d();
                    this.mEncoderEglSurface = null;
                }
                SurfaceTexture surfaceTexture = this.mInputTexture;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    this.mInputTexture = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
