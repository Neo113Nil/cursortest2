package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: InternalPullToRefresh.kt */
/* loaded from: classes17.dex */
public final class kge0 {
    public static final fh9 b = new fh9(new zh3(5), new av70(9));
    public final if2<Float, sq2> a;

    public kge0(if2<Float, sq2> if2Var) {
        this.a = if2Var;
    }

    public final float a() {
        return this.a.d().floatValue();
    }

    public final boolean b() {
        return ((Boolean) ((zak0) this.a.d).getValue()).booleanValue();
    }

    public final Object c(float f, SuspendLambda suspendLambda) {
        Object e = this.a.e(new Float(f), suspendLambda);
        return e == CoroutineSingletons.COROUTINE_SUSPENDED ? e : s3q0.a;
    }

    public kge0() {
        this(new if2(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), rte0.e, null, 12));
    }
}
