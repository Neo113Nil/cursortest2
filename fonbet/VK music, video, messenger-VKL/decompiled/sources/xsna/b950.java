package xsna;

import android.content.Context;
import com.vk.money.subscription.MusicSubscriptionControlFragment;

/* compiled from: MusicSubscriptionControlContractPresenterContract.kt */
/* loaded from: classes3.dex */
public final class b950 implements z850 {
    public final MusicSubscriptionControlFragment b;
    public final oge0 c;
    public final mzp0 d;
    public io.reactivex.rxjava3.disposables.c e;

    public b950(MusicSubscriptionControlFragment musicSubscriptionControlFragment, oge0 oge0Var, mzp0 mzp0Var) {
        this.b = musicSubscriptionControlFragment;
        this.c = oge0Var;
        this.d = mzp0Var;
    }

    @Override // xsna.gm6
    public final boolean a0() {
        return false;
    }

    @Override // xsna.z850
    public final void b2(int i) {
        if (this.e != null) {
            return;
        }
        d950 d950Var = this.b.V;
        if (d950Var == null) {
            d950Var = null;
        }
        d950Var.C0(true);
        d950Var.k.x0(null);
        d950Var.n.x0(null);
        d950Var.o.x0(null);
        d950Var.m.x0(null);
        d950Var.l.x0(null);
        d950Var.p.x0(null);
        d950Var.r.x0(null);
        mzp0 mzp0Var = this.d;
        if (mzp0Var != null) {
            mzp0Var.a();
        }
        til0 til0Var = new til0(i);
        Context context = e43.a;
        this.e = fsk.P(til0Var, context != null ? context : null).subscribe(new sh6(new qw30(this, i), 25), new m330(new dn20(this, 7), 4));
    }

    @Override // xsna.gm6
    public final void d() {
    }

    @Override // xsna.cc6
    public final void onDestroy() {
    }

    @Override // xsna.gm6
    public final void onDestroyView() {
    }

    @Override // xsna.cc6
    public final void onPause() {
    }

    @Override // xsna.cc6
    public final void onResume() {
    }

    @Override // xsna.gm6
    public final void onStart() {
    }

    @Override // xsna.gm6
    public final void onStop() {
    }
}
