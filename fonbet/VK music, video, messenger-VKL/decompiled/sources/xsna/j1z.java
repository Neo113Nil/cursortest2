package xsna;

import androidx.compose.foundation.text.HandleState;

/* compiled from: CoreTextField.kt */
/* loaded from: classes11.dex */
public final class j1z {
    public final wh50 A;
    public final wh50 B;
    public sdo0 a;
    public final vef0 b;
    public final nek0 c;
    public final cwm d;
    public sio0 e;
    public final wh50 f;
    public final wh50 g;
    public tny h;
    public final wh50<mjo0> i;
    public us2 j;
    public final wh50 k;
    public final wh50 l;
    public final wh50 m;
    public final wh50 n;
    public final wh50 o;
    public boolean p;
    public final wh50 q;
    public final sey r;
    public final wh50 s;
    public final wh50 t;
    public izs<? super tho0, s3q0> u;
    public final bzw v;
    public final c2u w;
    public final x2y x;
    public final va2 y;
    public long z;

    public j1z(sdo0 sdo0Var, vef0 vef0Var, nek0 nek0Var) {
        this.a = sdo0Var;
        this.b = vef0Var;
        this.c = nek0Var;
        cwm cwmVar = new cwm();
        us2 us2Var = zs2.a;
        long j = qko0.b;
        tho0 tho0Var = new tho0(us2Var, j, (qko0) null);
        cwmVar.b = tho0Var;
        cwmVar.c = new c2p(us2Var, tho0Var.b);
        this.d = cwmVar;
        Boolean bool = Boolean.FALSE;
        this.f = androidx.compose.runtime.k.b(bool);
        this.g = cq.f(0);
        this.i = androidx.compose.runtime.k.b(null);
        this.k = androidx.compose.runtime.k.b(HandleState.None);
        this.l = androidx.compose.runtime.k.b(bool);
        this.m = androidx.compose.runtime.k.b(bool);
        this.n = androidx.compose.runtime.k.b(bool);
        this.o = androidx.compose.runtime.k.b(bool);
        this.p = true;
        this.q = androidx.compose.runtime.k.b(Boolean.TRUE);
        this.r = new sey(nek0Var);
        this.s = androidx.compose.runtime.k.b(bool);
        this.t = androidx.compose.runtime.k.b(bool);
        this.u = new pey(1);
        this.v = new bzw(this, 2);
        this.w = new c2u(this, 5);
        this.x = new x2y(this, 2);
        this.y = new va2();
        this.z = l5g.k;
        this.A = androidx.compose.runtime.k.b(new qko0(j));
        this.B = androidx.compose.runtime.k.b(new qko0(j));
    }

    public final HandleState a() {
        return (HandleState) ((zak0) this.k).getValue();
    }

    public final boolean b() {
        return ((Boolean) ((zak0) this.f).getValue()).booleanValue();
    }

    public final tny c() {
        tny tnyVar = this.h;
        if (tnyVar == null || !tnyVar.e()) {
            return null;
        }
        return tnyVar;
    }

    public final mjo0 d() {
        return (mjo0) ((zak0) this.i).getValue();
    }

    public final void e(long j) {
        ((zak0) this.B).setValue(new qko0(j));
    }

    public final void f(long j) {
        ((zak0) this.A).setValue(new qko0(j));
    }
}
