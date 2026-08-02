package ru.ok.media.utils;

import android.graphics.Bitmap;
import android.opengl.GLSurfaceView;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.opengles.GL10;
import ru.ok.media.utils.GlUtils;
import xsna.et;
import xsna.ho8;
import xsna.ir;
import xsna.ne7;
import xsna.v0u;

/* loaded from: classes9.dex */
public class GlUtils {
    public static final int EGL_RECORDABLE_ANDROID = 12610;
    private static final String TAG = "ru.ok.media.utils.GlUtils";

    public interface Listener {
        void bitmapCaptured(@Nullable Bitmap bitmap);
    }

    public static void captureBitmap(GLSurfaceView gLSurfaceView, final Listener listener) {
        final int width = gLSurfaceView.getWidth();
        final int height = gLSurfaceView.getHeight();
        if (width == 0 || height == 0) {
            listener.bitmapCaptured(null);
        } else {
            gLSurfaceView.queueEvent(new Runnable() { // from class: xsna.w0u
                @Override // java.lang.Runnable
                public final void run() {
                    GlUtils.lambda$captureBitmap$0(width, height, listener);
                }
            });
        }
    }

    public static void checkEglError(GL10 gl10, String str) {
        int glGetError = gl10.glGetError();
        if (glGetError == 12288) {
            return;
        }
        String str2 = TAG;
        StringBuilder b = ho8.b(str, ": EGL error: 0x");
        b.append(Integer.toHexString(glGetError));
        ne7.n(str2, b.toString());
        throw new RuntimeException(et.a(glGetError, ho8.b(str, ": EGL error: 0x")));
    }

    @Nullable
    public static Bitmap createBitmapFromGLSurface(int i, int i2, int i3, int i4, GL10 gl10) {
        ByteBuffer readPixels = readPixels(i, i2, i3, i4, gl10);
        if (readPixels == null) {
            return null;
        }
        return createBitmapFromPixels(i3, i4, readPixels);
    }

    @Nullable
    public static Bitmap createBitmapFromPixels(int i, int i2, ByteBuffer byteBuffer) {
        int i3 = i * 4;
        byte[] bArr = new byte[i3];
        byte[] bArr2 = new byte[i3];
        int position = byteBuffer.position();
        int b = ir.b(i2, 1, i3, position);
        int i4 = position;
        for (int i5 = 0; i5 < i2 / 2; i5++) {
            byteBuffer.position(i4);
            byteBuffer.get(bArr);
            byteBuffer.position(b);
            byteBuffer.get(bArr2);
            byteBuffer.position(i4);
            byteBuffer.put(bArr2);
            byteBuffer.position(b);
            byteBuffer.put(bArr);
            i4 += i3;
            b -= i3;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            byteBuffer.position(position);
            createBitmap.copyPixelsFromBuffer(byteBuffer);
            return createBitmap;
        } catch (OutOfMemoryError e) {
            ne7.K(TAG, "Failed to create bitmap: ", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$captureBitmap$0(int i, int i2, Listener listener) {
        listener.bitmapCaptured(createBitmapFromGLSurface(0, 0, i, i2, (GL10) ((EGL10) EGLContext.getEGL()).eglGetCurrentContext().getGL()));
    }

    public static ByteBuffer readPixels(int i, int i2, int i3, int i4, GL10 gl10) {
        try {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i3 * 4 * i4);
            try {
                gl10.glReadPixels(i, i2, i3, i4, 6408, 5121, allocateDirect);
                v0u.a("glReadPixels");
                return allocateDirect;
            } catch (Exception e) {
                ne7.o(TAG, "createBitmapFromGLSurface: ", e);
                return null;
            }
        } catch (Exception e2) {
            ne7.K(TAG, "failed to create bitmap from glSurface: ", e2);
            return null;
        }
    }
}
