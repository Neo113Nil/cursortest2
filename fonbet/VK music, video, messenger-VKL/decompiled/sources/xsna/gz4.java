package xsna;

import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Shader;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: AudioTrackDrawDelegateTools.kt */
/* loaded from: classes18.dex */
public final class gz4 {
    public static LinearGradient a(int i, int i2) {
        return new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, iah0.f().widthPixels, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new int[]{i, i, i2, i2}, new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.5f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
    }

    public static void b(RectF rectF, float f, Matrix matrix, LinearGradient linearGradient) {
        float f2 = (-rectF.left) + f;
        wqo0 wqo0Var = mn10.b;
        qcy<Object>[] qcyVarArr = mn10.a;
        qcy<Object> qcyVar = qcyVarArr[0];
        wqo0Var.getClass();
        matrix.getValues((float[]) wqo0Var.get());
        qcy<Object> qcyVar2 = qcyVarArr[0];
        wqo0Var.getClass();
        if (((float[]) wqo0Var.get())[2] == f2) {
            return;
        }
        matrix.setTranslate(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        linearGradient.setLocalMatrix(matrix);
    }
}
