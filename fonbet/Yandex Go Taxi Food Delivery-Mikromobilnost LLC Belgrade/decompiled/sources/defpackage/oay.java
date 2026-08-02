package defpackage;

import androidx.compose.foundation.text.HandleState;
import androidx.compose.runtime.f;

/* loaded from: classes10.dex */
public final class oay {
    public final oz40 A;
    public final oz40 B;
    public tly0 a;
    public final aii0 b;
    public final u5t0 c;
    public final jnn d = new jnn();
    public xpy0 e;
    public final oz40 f;
    public final oz40 g;
    public rzx h;
    public final oz40 i;
    public kk2 j;
    public final oz40 k;
    public final oz40 l;
    public final oz40 m;
    public final oz40 n;
    public final oz40 o;
    public boolean p;
    public final oz40 q;
    public final wjx r;
    public final oz40 s;
    public final oz40 t;
    public tls u;
    public final cre v;
    public final cre w;
    public final cre x;
    public final eb2 y;
    public long z;

    public oay(tly0 tly0Var, aii0 aii0Var, u5t0 u5t0Var) {
        this.a = tly0Var;
        this.b = aii0Var;
        this.c = u5t0Var;
        Boolean bool = Boolean.FALSE;
        this.f = f.j(bool);
        this.g = f.j(new y7m(0.0f));
        this.i = f.j(null);
        this.k = f.j(HandleState.None);
        this.l = f.j(bool);
        this.m = f.j(bool);
        this.n = f.j(bool);
        this.o = f.j(bool);
        this.p = true;
        this.q = f.j(Boolean.TRUE);
        this.r = new wjx(u5t0Var);
        this.s = f.j(bool);
        this.t = f.j(bool);
        this.u = new mtw(23);
        this.v = new cre(this, 1);
        this.w = new cre(this, 2);
        this.x = new cre(this, 3);
        this.y = new eb2();
        this.z = ldc.m;
        long j = asy0.b;
        this.A = f.j(new asy0(j));
        this.B = f.j(new asy0(j));
    }

    public final HandleState a() {
        return (HandleState) this.k.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    public final rzx c() {
        rzx rzxVar = this.h;
        if (rzxVar == null || !rzxVar.d()) {
            return null;
        }
        return rzxVar;
    }

    public final ery0 d() {
        return (ery0) this.i.getValue();
    }
}
