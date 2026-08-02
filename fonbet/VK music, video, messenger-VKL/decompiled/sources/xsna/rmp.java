package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: TopAppBarScrollBehavior.kt */
/* loaded from: classes17.dex */
public final class rmp implements v6p0 {
    public final x6p0 a;
    public final iq2<Float> b;
    public final l7l<Float> c;
    public final gzs<Boolean> d;
    public final qmp e = new qmp(this);

    public rmp(x6p0 x6p0Var, iq2 iq2Var, l7l l7lVar, gzs gzsVar) {
        this.a = x6p0Var;
        this.b = iq2Var;
        this.c = l7lVar;
        this.d = gzsVar;
    }

    @Override // xsna.v6p0
    public final d160 a() {
        return this.e;
    }

    @Override // xsna.v6p0
    public final Object b(wd00 wd00Var) {
        x6p0 x6p0Var = this.a;
        if (x6p0Var.b() >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return s3q0.a;
        }
        Object c = nkn0.c(x6p0Var.b(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, new a86(this, 7), wd00Var, 12);
        return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : s3q0.a;
    }

    @Override // xsna.v6p0
    public final x6p0 getState() {
        return this.a;
    }
}
