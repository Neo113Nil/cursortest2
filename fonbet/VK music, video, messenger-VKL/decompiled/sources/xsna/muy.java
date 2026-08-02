package xsna;

import androidx.compose.foundation.gestures.Orientation;
import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.puy;

/* compiled from: LazyLayoutSemanticState.kt */
/* loaded from: classes11.dex */
public final class muy implements luy {
    public final /* synthetic */ mc90 a;
    public final /* synthetic */ boolean b;

    public muy(mc90 mc90Var, boolean z) {
        this.a = mc90Var;
        this.b = z;
    }

    @Override // xsna.luy
    public final int a() {
        mc90 mc90Var = this.a;
        return mc90Var.n().c() + mc90Var.n().b();
    }

    @Override // xsna.luy
    public final float b() {
        mc90 mc90Var = this.a;
        return rc90.a(mc90Var.n(), mc90Var.o());
    }

    @Override // xsna.luy
    public final q4g c() {
        boolean z = this.b;
        mc90 mc90Var = this.a;
        return z ? new q4g(mc90Var.o(), 1) : new q4g(1, mc90Var.o());
    }

    @Override // xsna.luy
    public final int d() {
        mc90 mc90Var = this.a;
        return (int) (mc90Var.n().getOrientation() == Orientation.Vertical ? mc90Var.n().a() & 4294967295L : mc90Var.n().a() >> 32);
    }

    @Override // xsna.luy
    public final float e() {
        return k7b0.d(this.a);
    }

    @Override // xsna.luy
    public final Object f(int i, puy.a aVar) {
        Object w = this.a.w(i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar);
        return w == CoroutineSingletons.COROUTINE_SUSPENDED ? w : s3q0.a;
    }
}
