package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: GraphicsLayerModifier.kt */
/* loaded from: classes11.dex */
public final class rdu {
    public static sfg0 a;

    public static final q630 a(q630 q630Var, izs<? super tdu, s3q0> izsVar) {
        return q630Var.g(new bf7(izsVar));
    }

    public static q630 b(q630 q630Var, float f, float f2, float f3, float f4, r5j0 r5j0Var, int i) {
        float f5 = (i & 1) != 0 ? 1.0f : f;
        float f6 = (i & 2) != 0 ? 1.0f : f2;
        float f7 = (i & 4) != 0 ? 1.0f : f3;
        float f8 = (i & 32) != 0 ? 0.0f : f4;
        long j = lkp0.b;
        r5j0 r5j0Var2 = (i & 2048) != 0 ? androidx.compose.ui.graphics.e.a : r5j0Var;
        long j2 = udu.a;
        return q630Var.g(new odu(f5, f6, f7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j, r5j0Var2, false, j2, j2, 0));
    }

    public static q630 c(q630 q630Var, float f, float f2, float f3, float f4, float f5, float f6, r5j0 r5j0Var, int i) {
        float f7 = (i & 1) != 0 ? 1.0f : f;
        float f8 = (i & 2) != 0 ? 1.0f : f2;
        float f9 = (i & 4) != 0 ? 1.0f : f3;
        float f10 = (i & 8) != 0 ? 0.0f : f4;
        float f11 = (i & 16) != 0 ? 0.0f : f5;
        float f12 = (i & 256) != 0 ? 0.0f : f6;
        long j = lkp0.b;
        r5j0 r5j0Var2 = (i & 2048) != 0 ? androidx.compose.ui.graphics.e.a : r5j0Var;
        boolean z = (i & 4096) == 0;
        long j2 = udu.a;
        return q630Var.g(new odu(f7, f8, f9, f10, f11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f12, j, r5j0Var2, z, j2, j2, (i & 65536) != 0 ? 0 : 1));
    }
}
