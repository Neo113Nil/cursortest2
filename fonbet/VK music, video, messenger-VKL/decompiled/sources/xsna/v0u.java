package xsna;

import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* compiled from: GlUtil.java */
/* loaded from: classes12.dex */
public final class v0u {
    static {
        Matrix.setIdentityM(new float[16], 0);
    }

    public static void a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        StringBuilder b = ho8.b(str, ": glError 0x");
        b.append(Integer.toHexString(glGetError));
        String sb = b.toString();
        Log.e("Grafika", sb);
        throw new RuntimeException(sb);
    }

    public static void b(int i, String str) {
        if (i < 0) {
            throw new RuntimeException(zr.a("Unable to locate '", str, "' in program"));
        }
    }

    public static int c(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        a("glCreateShader type=" + i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        Log.e("Grafika", "Could not compile shader " + i + StringUtils.PROCESS_POSTFIX_DELIMITER);
        StringBuilder sb = new StringBuilder(" ");
        sb.append(GLES20.glGetShaderInfoLog(glCreateShader));
        Log.e("Grafika", sb.toString());
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }
}
