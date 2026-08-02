package xsna;

import android.view.View;
import java.util.List;
import xsna.t70;

/* compiled from: CallPrimaryActions.kt */
/* loaded from: classes7.dex */
public final class z89 extends t70 {
    public i9d0 e;
    public h69 f;
    public final w10 m;
    public final v10 n;
    public final cxq d = new cxq(null);
    public final w30 g = new w30(0, null, new v40(this, 10));
    public final sy h = new sy(null, new w40(this, 15));
    public final ty i = new ty(0, null, new ca(this, 13));
    public final c00 j = new c00(0, null, new px0(this, 11));
    public final k40 k = new k40(null, new com.vk.movika.sdk.base.ui.t(this, 14));
    public final r00 l = new r00(null, new m1(this, 10));
    public final w60 o = new w60(new ld(this, 13));

    public z89() {
        int i = 13;
        this.m = new w10(null, new jd(this, i));
        this.n = new v10(null, new kd(this, i));
    }

    @Override // xsna.t70
    public final List<ku<? extends Object, ? extends View>> a() {
        return e43.l(this.g, this.h, this.i, this.j, this.k, this.l, this.o, this.m, this.n);
    }

    @Override // xsna.t70
    public final List<ku<? extends Object, ? extends View>> b() {
        return e43.l(this.j, this.n);
    }

    @Override // xsna.t70
    public final ku<? extends t70.c, ? extends View> c() {
        return this.d;
    }

    public final void e(j9d0 j9d0Var) {
        i9d0 i9d0Var = this.e;
        if (i9d0Var != null) {
            i9d0Var.i.onNext(j9d0Var);
        }
    }
}
