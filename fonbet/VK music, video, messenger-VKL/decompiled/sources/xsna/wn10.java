package xsna;

import android.opengl.Matrix;
import com.google.common.collect.ImmutableList;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* compiled from: MatrixUtils.java */
/* loaded from: classes12.dex */
public final class wn10 {
    public static final float[][] a = {new float[]{1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f}, new float[]{-1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f}, new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f}, new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f}, new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f}, new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -1.0f, 1.0f}};

    public static float[] a(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        fxc0.q(fArr2.length == 4, "Expecting 4 plane parameters");
        float f = fArr[0];
        float f2 = fArr3[0];
        float f3 = fArr2[0];
        float f4 = fArr[1];
        float f5 = fArr3[1];
        float f6 = fArr2[1];
        float f7 = fArr[2];
        float f8 = fArr3[2];
        float f9 = fArr2[2];
        float f10 = ((f7 - f8) * f9) + ((f4 - f5) * f6) + ((f - f2) * f3);
        float f11 = fArr4[0] - f2;
        float f12 = fArr4[1] - f5;
        float f13 = fArr4[2] - f8;
        float f14 = f10 / ((f9 * f13) + ((f6 * f12) + (f3 * f11)));
        return new float[]{(f11 * f14) + f2, (f12 * f14) + f5, (f13 * f14) + f8, 1.0f};
    }

    public static jxj0 b(int i, int i2, List<j0u> list) {
        fxc0.q(i > 0, "inputWidth must be positive");
        fxc0.q(i2 > 0, "inputHeight must be positive");
        jxj0 jxj0Var = new jxj0(i, i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            jxj0Var = list.get(i3).e(jxj0Var.a, jxj0Var.b);
        }
        return jxj0Var;
    }

    public static boolean c(float[] fArr, float[] fArr2) {
        fxc0.q(fArr2.length == 4, "Expecting 4 plane parameters");
        return (fArr2[2] * fArr[2]) + ((fArr2[1] * fArr[1]) + (fArr2[0] * fArr[0])) <= fArr2[3];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static com.google.common.collect.g d(float[] fArr, ImmutableList immutableList) {
        ImmutableList.a aVar = new ImmutableList.a();
        int i = 0;
        while (i < immutableList.size()) {
            float[] fArr2 = new float[4];
            float[] fArr3 = fArr;
            Matrix.multiplyMV(fArr2, 0, fArr3, 0, (float[]) immutableList.get(i), 0);
            float f = fArr2[0];
            float f2 = fArr2[3];
            fArr2[0] = f / f2;
            fArr2[1] = fArr2[1] / f2;
            fArr2[2] = fArr2[2] / f2;
            fArr2[3] = 1.0f;
            aVar.c(fArr2);
            i++;
            fArr = fArr3;
        }
        return aVar.g();
    }
}
