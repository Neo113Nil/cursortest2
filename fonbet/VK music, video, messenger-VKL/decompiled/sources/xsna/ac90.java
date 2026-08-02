package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: PagerScrollScope.kt */
/* loaded from: classes11.dex */
public final class ac90 implements guy, ggh0 {
    public final /* synthetic */ ggh0 a;
    public final /* synthetic */ mc90 b;

    public ac90(ggh0 ggh0Var, mc90 mc90Var) {
        this.b = mc90Var;
        this.a = ggh0Var;
    }

    @Override // xsna.guy
    public final int a() {
        return this.b.f;
    }

    @Override // xsna.guy
    public final int b() {
        return this.b.e;
    }

    @Override // xsna.guy
    public final int c() {
        return ((e990) j5g.i0(this.b.n().g())).getIndex();
    }

    @Override // xsna.guy
    public final void d(int i, int i2) {
        mc90 mc90Var = this.b;
        float q = mc90Var.q();
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (q != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f = i2 / q;
        }
        mc90Var.x(f, i, true);
    }

    @Override // xsna.guy
    public final int e(int i) {
        mc90 mc90Var = this.b;
        return (int) (swe0.i(k7b0.d(mc90Var) + an10.b(((mc90Var.q() * (i - mc90Var.k())) - (mc90Var.l() * mc90Var.q())) + 0), mc90Var.h, mc90Var.g) - k7b0.d(mc90Var));
    }

    @Override // xsna.ggh0
    public final float f(float f) {
        return this.a.f(f);
    }

    @Override // xsna.guy
    public final int getItemCount() {
        return this.b.o();
    }
}
