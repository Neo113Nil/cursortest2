package one.video.gl;

import android.opengl.GLES20;
import android.opengl.GLException;
import android.util.Log;
import xsna.j100;
import xsna.lhg;
import xsna.pzl;
import xsna.rl3;
import xsna.zjq;

/* compiled from: GLESUtils.kt */
/* loaded from: classes8.dex */
public final class GLESUtils {

    /* compiled from: GLESUtils.kt */
    public static final class GLESUtilsException extends Exception {
    }

    public static void a(int i) {
        GLES20.glBindFramebuffer(36160, i);
        c("glBindFramebuffer", new int[0]);
    }

    public static void b(int i, int i2) {
        GLES20.glBindTexture(i, i2);
        c("glBindTexture", new int[0]);
    }

    public static void c(String str, int... iArr) {
        int i = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            Log.e("GLESUtils", str + ": " + new GLException(glGetError).getMessage());
            i = glGetError;
        }
        if (i == 0 || rl3.E(i, iArr)) {
            return;
        }
        GLESUtilsException gLESUtilsException = new GLESUtilsException(new GLException(i, pzl.b(str, ": ", new GLException(i).getMessage())));
        j100 j100Var = zjq.g;
        if (j100Var != null) {
            j100Var.logError(gLESUtilsException);
        }
    }

    public static int d(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        c(lhg.a(i, "glCreateShader type="), new int[0]);
        GLES20.glShaderSource(glCreateShader, str);
        c("glShaderSource", new int[0]);
        GLES20.glCompileShader(glCreateShader);
        c("glCompileShader", new int[0]);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        String str2 = "Could not compile shaderId: " + GLES20.glGetShaderInfoLog(glCreateShader);
        Log.e("GLESUtils", str2);
        throw new RuntimeException(str2);
    }

    public static void e(int i) {
        GLES20.glTexParameteri(i, 10240, 9729);
        c("glTexParameteri", new int[0]);
        GLES20.glTexParameteri(i, 10241, 9729);
        c("glTexParameteri", new int[0]);
        GLES20.glTexParameteri(i, 10242, 33071);
        c("glTexParameteri", new int[0]);
        GLES20.glTexParameteri(i, 10243, 33071);
        c("glTexParameteri", new int[0]);
    }
}
