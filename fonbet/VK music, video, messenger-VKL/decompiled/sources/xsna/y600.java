package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: LottieAnimatable.kt */
/* loaded from: classes12.dex */
public final class y600 {
    public static final s600 a(androidx.compose.runtime.a aVar) {
        aVar.T(2024497114);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(2024497114, 0, -1, "com.airbnb.lottie.compose.rememberLottieAnimatable (LottieAnimatable.kt:28)");
        }
        aVar.T(-610207850);
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x = new w600();
            aVar.R(x);
        }
        s600 s600Var = (s600) x;
        aVar.b0();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.b0();
        return s600Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(s600 s600Var, SuspendLambda suspendLambda) {
        Object a;
        i700 G = s600Var.G();
        h700 o = s600Var.o();
        float z = s600Var.z();
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (z >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || G != null) {
            if (G != null) {
                if (z < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    if (o != null) {
                        f = o.a(G);
                    }
                } else if (o != null) {
                    f = o.b(G);
                }
            }
            a = s600Var.a(s600Var.G(), f, (r9 & 4) != 0 ? s600Var.M() : 1, !(r7 == r6.getProgress()), suspendLambda);
            return a != CoroutineSingletons.COROUTINE_SUSPENDED ? a : s3q0.a;
        }
        f = 1.0f;
        a = s600Var.a(s600Var.G(), f, (r9 & 4) != 0 ? s600Var.M() : 1, !(r7 == r6.getProgress()), suspendLambda);
        if (a != CoroutineSingletons.COROUTINE_SUSPENDED) {
        }
    }
}
