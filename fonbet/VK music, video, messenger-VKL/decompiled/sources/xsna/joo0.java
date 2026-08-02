package xsna;

import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import com.unity3d.services.UnityAdsConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* compiled from: TextureRender.java */
/* loaded from: classes8.dex */
public final class joo0 {
    public final FloatBuffer a;
    public final float[] c;
    public int d;
    public int f;
    public int g;
    public int h;
    public int i;
    public final float[] b = new float[16];
    public int e = -12345;

    public joo0() {
        float[] fArr = new float[16];
        this.c = fArr;
        float[] fArr2 = {-1.0f, -1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, -1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -1.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f};
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(80).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.a = asFloatBuffer;
        asFloatBuffer.put(fArr2).position(0);
        Matrix.setIdentityM(fArr, 0);
    }

    public static void a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        Log.e("TextureRender", str + ": glError " + glGetError);
        throw new RuntimeException(na8.a(glGetError, str, ": glError "));
    }

    public static int b(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        a("glCreateShader type=" + i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        Log.e("TextureRender", "Could not compile shader " + i + StringUtils.PROCESS_POSTFIX_DELIMITER);
        StringBuilder sb = new StringBuilder(" ");
        sb.append(GLES20.glGetShaderInfoLog(glCreateShader));
        Log.e("TextureRender", sb.toString());
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }
}
