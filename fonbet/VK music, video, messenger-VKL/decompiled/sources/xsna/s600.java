package xsna;

import com.airbnb.lottie.compose.LottieCancellationBehavior;
import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: LottieAnimatable.kt */
/* loaded from: classes12.dex */
public interface s600 extends c700 {

    /* compiled from: LottieAnimatable.kt */
    public static final class a {
        public static Object a(s600 s600Var, i700 i700Var, int i, boolean z, float f, h700 h700Var, float f2, LottieCancellationBehavior lottieCancellationBehavior, boolean z2, SuspendLambda suspendLambda, int i2) {
            float f3;
            int M = s600Var.M();
            if ((i2 & 4) != 0) {
                i = s600Var.D();
            }
            int i3 = i;
            if ((i2 & 8) != 0) {
                z = s600Var.k();
            }
            boolean z3 = z;
            float z4 = (i2 & 16) != 0 ? s600Var.z() : f;
            h700 o = (i2 & 32) != 0 ? s600Var.o() : h700Var;
            if ((i2 & 64) != 0) {
                float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (z4 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || i700Var != null) {
                    if (i700Var != null) {
                        if (z4 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            if (o != null) {
                                f4 = o.a(i700Var);
                            }
                        } else if (o != null) {
                            f4 = o.b(i700Var);
                        }
                    }
                    f3 = f4;
                }
                f4 = 1.0f;
                f3 = f4;
            } else {
                f3 = f2;
            }
            return s600Var.l(i700Var, M, i3, z3, z4, o, f3, false, (i2 & 256) != 0 ? LottieCancellationBehavior.Immediately : lottieCancellationBehavior, (i2 & 1024) != 0 ? false : z2, suspendLambda);
        }
    }

    Object a(i700 i700Var, float f, int i, boolean z, SuspendLambda suspendLambda);

    Object l(i700 i700Var, int i, int i2, boolean z, float f, h700 h700Var, float f2, boolean z2, LottieCancellationBehavior lottieCancellationBehavior, boolean z3, SuspendLambda suspendLambda);
}
