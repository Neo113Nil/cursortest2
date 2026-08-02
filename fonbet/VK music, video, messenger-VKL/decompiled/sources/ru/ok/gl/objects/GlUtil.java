package ru.ok.gl.objects;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.GLES20;
import android.opengl.GLES31;
import android.opengl.GLUtils;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.facebook.soloader.MinElf;
import com.unity3d.services.UnityAdsConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.opengles.GL10;
import ru.ok.gl.util.IoHelper;
import ru.ok.gpu.SharedEglContext;
import xsna.ho8;

/* loaded from: classes9.dex */
public class GlUtil {
    public static final int EGL_RECORDABLE_ANDROID = 12610;
    private static volatile GLVersion GL_VERSION = null;
    private static final String TAG = "GlUtil";

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

    public static void checkLocationInProgram(int i, String str) {
        if (i >= 0) {
            return;
        }
        String str2 = "Unable to locate '" + str + "' in program";
        Log.e(TAG, str2);
        throw new RuntimeException(str2);
    }

    @NonNull
    public static int[] createBitmapTexture(@NonNull Bitmap bitmap, boolean z) {
        int[] iArr = new int[3];
        int i = createTextures(1)[0];
        iArr[0] = i;
        if (i == 0) {
            Log.e(TAG, "Could not create bitmap textures");
            throw new RuntimeException("Could not create bitmap textures");
        }
        iArr[1] = bitmap.getWidth();
        iArr[2] = bitmap.getHeight();
        GLUtils.texImage2D(3553, 0, GLUtils.getInternalFormat(bitmap), bitmap, 0);
        checkGlError("texImage2D");
        if (z) {
            GLES20.glGenerateMipmap(3553);
            checkGlError("glGenerateMipmap");
        }
        GLES20.glBindTexture(3553, 0);
        checkGlError("glBindTexture");
        return iArr;
    }

    public static int[] createExternalTextures(int i) {
        return createTexturesImpl(i, 36197);
    }

    public static FloatBuffer createFloatBuffer(float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((fArr.length * 32) / 8);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }

    public static int createProgram(@NonNull Context context, int i, int i2) {
        String safeReadTextFromRaw = IoHelper.safeReadTextFromRaw(context, i, "\r\n");
        if (TextUtils.isEmpty(safeReadTextFromRaw)) {
            return 0;
        }
        String safeReadTextFromRaw2 = IoHelper.safeReadTextFromRaw(context, i2, "\r\n");
        if (TextUtils.isEmpty(safeReadTextFromRaw2)) {
            return 0;
        }
        return createProgram(safeReadTextFromRaw, safeReadTextFromRaw2);
    }

    public static int createTextureForSurfaceTexture() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        checkGlError("glGenTextures");
        int i = iArr[0];
        GLES20.glBindTexture(36197, i);
        checkGlError("glBindTexture " + i);
        GLES20.glTexParameterf(36197, 10241, 9728.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        checkGlError("glTexParameter");
        GLES20.glBindTexture(36197, 0);
        checkGlError("glBindTexture unbind");
        return i;
    }

    public static int[] createTextures(int i) {
        return createTexturesImpl(i, 3553);
    }

    private static int[] createTexturesImpl(int i, int i2) {
        int[] iArr = new int[i];
        GLES20.glGenTextures(i, iArr, 0);
        GLES20.glActiveTexture(33984);
        for (int i3 = 0; i3 < i; i3++) {
            GLES20.glBindTexture(i2, iArr[i3]);
            GLES20.glTexParameterf(i2, 10241, 9729.0f);
            GLES20.glTexParameterf(i2, 10240, 9729.0f);
            GLES20.glTexParameteri(i2, 10242, 33071);
            GLES20.glTexParameteri(i2, 10243, 33071);
        }
        return iArr;
    }

    public static void deleteProgram(int i) {
        GLES20.glDeleteProgram(i);
        checkGlError("glDeleteProgram");
    }

    public static void deleteShader(int i) {
        GLES20.glDeleteShader(i);
        checkGlError("glDeleteShader");
    }

    public static void deleteTexture(int i) {
        GLES20.glDeleteTextures(1, new int[]{i}, 0);
        checkGlError("glDeleteTextures");
    }

    public static int getGlVersion(@NonNull Context context) {
        return getPreciseGlVersion(context).majVersion;
    }

    public static float[] getOpenGLMatrix(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return new float[]{fArr[0], fArr[3], UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fArr[1], fArr[4], UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fArr[2], fArr[5], UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f};
    }

    public static GLVersion getPreciseGlVersion(@NonNull Context context) {
        if (GL_VERSION == null) {
            GL_VERSION = initGlVersion(context);
        }
        return GL_VERSION;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:14|(2:15|16)|(4:18|19|20|(2:22|(8:24|(6:39|40|42|43|(2:46|47)|45)|(2:35|36)|(2:34|32)|28|29|31|32)))|82|(0)|(0)|28|29|31|32) */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0098 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static GLVersion initGlVersion(Context context) {
        int i;
        Throwable th;
        EGLContext eGLContext;
        boolean z;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        EGLContext eGLContext2 = null;
        ConfigurationInfo deviceConfigurationInfo = activityManager != null ? activityManager.getDeviceConfigurationInfo() : null;
        if (deviceConfigurationInfo != null) {
            int i2 = deviceConfigurationInfo.reqGlEsVersion;
            return new GLVersion(i2 >> 16, i2 & MinElf.PN_XNUM);
        }
        int[] iArr = {12325, 0, 12326, 0, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344};
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            return new GLVersion(1);
        }
        int[] iArr2 = new int[2];
        int[] iArr3 = new int[1];
        int[] iArr4 = {3, 2};
        boolean z2 = false;
        for (0; i < 2; i + 1) {
            int i3 = iArr4[i];
            try {
                z = egl10.eglInitialize(eglGetDisplay, iArr2);
            } catch (Exception e) {
                e = e;
                eGLContext = null;
                z = false;
            } catch (Throwable th2) {
                th = th2;
            }
            if (z) {
                try {
                } catch (Exception e2) {
                    e = e2;
                    eGLContext = null;
                } catch (Throwable th3) {
                    th = th3;
                }
                if (egl10.eglChooseConfig(eglGetDisplay, iArr, null, 0, iArr3)) {
                    int i4 = iArr3[0];
                    EGLConfig[] eGLConfigArr = new EGLConfig[i4];
                    if (egl10.eglChooseConfig(eglGetDisplay, iArr, eGLConfigArr, i4, iArr3)) {
                        eGLContext = egl10.eglCreateContext(eglGetDisplay, eGLConfigArr[0], EGL10.EGL_NO_CONTEXT, new int[]{SharedEglContext.EGL_CONTEXT_CLIENT_VERSION, i3, 12344});
                        if (eGLContext != null) {
                            try {
                                try {
                                    GLVersion gLVersion = new GLVersion(i3);
                                    try {
                                        egl10.eglDestroyContext(eglGetDisplay, eGLContext);
                                    } catch (Exception unused) {
                                    }
                                    if (z) {
                                        try {
                                            egl10.eglTerminate(eglGetDisplay);
                                        } catch (Exception unused2) {
                                        }
                                    }
                                    return gLVersion;
                                } catch (Exception e3) {
                                    e = e3;
                                    Log.e(TAG, e.toString());
                                    if (eGLContext != null) {
                                        try {
                                            egl10.eglDestroyContext(eglGetDisplay, eGLContext);
                                        } catch (Exception unused3) {
                                        }
                                    }
                                    i = z ? 0 : i + 1;
                                    egl10.eglTerminate(eglGetDisplay);
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                eGLContext2 = eGLContext;
                                z2 = z;
                                if (eGLContext2 != null) {
                                    try {
                                        egl10.eglDestroyContext(eglGetDisplay, eGLContext2);
                                    } catch (Exception unused4) {
                                    }
                                }
                                if (!z2) {
                                    throw th;
                                }
                                try {
                                    egl10.eglTerminate(eglGetDisplay);
                                    throw th;
                                } catch (Exception unused5) {
                                    throw th;
                                }
                            }
                        }
                        if (eGLContext != null) {
                            try {
                                egl10.eglDestroyContext(eglGetDisplay, eGLContext);
                            } catch (Exception unused6) {
                            }
                        }
                        if (!z) {
                        }
                        egl10.eglTerminate(eglGetDisplay);
                    }
                }
            }
            eGLContext = null;
            if (eGLContext != null) {
            }
            if (!z) {
            }
            egl10.eglTerminate(eglGetDisplay);
        }
        return new GLVersion(1);
    }

    public static int loadShader(int i, @NonNull String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        checkGlError("glCreateShader type=" + i);
        GLES20.glShaderSource(glCreateShader, str);
        checkGlError("glShaderSource");
        GLES20.glCompileShader(glCreateShader);
        checkGlError("glCompileShader");
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        Log.e(TAG, "Could not compile shader " + i + StringUtils.PROCESS_POSTFIX_DELIMITER);
        StringBuilder sb = new StringBuilder(" ");
        sb.append(GLES20.glGetShaderInfoLog(glCreateShader));
        Log.e(TAG, sb.toString());
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public static Bitmap readPixelsArgb8888(@NonNull GL10 gl10, int i, int i2, @NonNull ByteBuffer byteBuffer, @NonNull Bitmap bitmap, int i3, int i4, int i5, int i6, @NonNull Matrix matrix) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.rewind();
        gl10.glReadPixels(0, 0, i, i2, 6408, 5121, byteBuffer);
        checkGlError("glReadPixels");
        bitmap.copyPixelsFromBuffer(byteBuffer);
        return Bitmap.createBitmap(bitmap, i3, i4, i5, i6, matrix, false);
    }

    public static Bitmap safeReadPixelsArgb8888(@NonNull GL10 gl10, int i, int i2, ByteBuffer byteBuffer, Bitmap bitmap, Matrix matrix) {
        ByteBuffer byteBuffer2;
        Bitmap bitmap2;
        Matrix matrix2;
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        int i3 = i * 4 * i2;
        if (byteBuffer == null) {
            byteBuffer2 = ByteBuffer.allocateDirect(i3);
        } else {
            if (byteBuffer.capacity() < i3) {
                throw new IllegalArgumentException();
            }
            byteBuffer2 = byteBuffer;
        }
        if (bitmap == null) {
            bitmap2 = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        } else {
            if (bitmap.getWidth() != i || bitmap.getHeight() != i2) {
                throw new IllegalArgumentException();
            }
            bitmap2 = bitmap;
        }
        if (matrix == null) {
            Matrix matrix3 = new Matrix();
            matrix3.preScale(1.0f, -1.0f);
            matrix2 = matrix3;
        } else {
            matrix2 = matrix;
        }
        return readPixelsArgb8888(gl10, i, i2, byteBuffer2, bitmap2, 0, 0, i, i2, matrix2);
    }

    public static Bitmap saveCurrentRenderTarget(int i, int i2) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i * i2 * 4);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        GLES20.glReadPixels(0, 0, i, i2, 6408, 5121, allocateDirect);
        checkGlError("glReadPixels");
        allocateDirect.rewind();
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(allocateDirect);
        return createBitmap;
    }

    public static void syncGL() {
        GLES20.glFinish();
        GLES31.glMemoryBarrier(-1);
    }

    public static int createProgram(@NonNull String str, @NonNull String str2) {
        int loadShader = loadShader(35633, str);
        if (loadShader == 0) {
            return 0;
        }
        int loadShader2 = loadShader(35632, str2);
        if (loadShader2 == 0) {
            deleteShader(loadShader);
            return 0;
        }
        int createProgram = createProgram(loadShader, loadShader2);
        deleteShader(loadShader2);
        deleteShader(loadShader);
        return createProgram;
    }

    public static int createProgram(int i, int i2) {
        int glCreateProgram = GLES20.glCreateProgram();
        checkGlError("glCreateProgram");
        if (glCreateProgram == 0) {
            Log.e(TAG, "Could not create program");
            return 0;
        }
        GLES20.glAttachShader(glCreateProgram, i);
        checkGlError("glAttachShader");
        GLES20.glAttachShader(glCreateProgram, i2);
        checkGlError("glAttachShader");
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return glCreateProgram;
        }
        Log.e(TAG, "Could not link program: ");
        Log.e(TAG, GLES20.glGetProgramInfoLog(glCreateProgram));
        GLES20.glDeleteProgram(glCreateProgram);
        return 0;
    }
}
