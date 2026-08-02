package xsna;

import com.vk.clips.sdk.shared.api.routing.models.ClipFeedOpenAction;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.gsf;
import xsna.iuf;
import xsna.vsf;
import xsna.ypf;

/* compiled from: ClipsWrapperRepositoryImpl.kt */
/* loaded from: classes17.dex */
public final class ktf implements jtf {
    public final gsf a;

    public ktf(gsf gsfVar) {
        this.a = gsfVar;
    }

    @Override // xsna.jtf
    public final ypf T0() {
        stf stfVar;
        ypf ypfVar;
        gx6 gx6Var = (gx6) this.a.b.get("common_state_id");
        return (gx6Var == null || (stfVar = (stf) gx6Var.b()) == null || (ypfVar = stfVar.e) == null) ? ypf.c.a : ypfVar;
    }

    @Override // xsna.jtf
    public final io.reactivex.rxjava3.internal.operators.observable.j1 a(String str) {
        return this.a.c(str).U(new z8(fsf.b, 7));
    }

    @Override // xsna.jtf
    public final void b(String str, quf qufVar) {
        gx6<stf> b = this.a.b(str);
        if (b.b.c) {
            return;
        }
        stf P0 = b.a.P0();
        stf stfVar = P0;
        if (stfVar == null) {
            stfVar = new stf(0);
        }
        stf stfVar2 = stfVar;
        if (!epx.f(stfVar2.a, qufVar)) {
            stfVar2 = stf.a(stfVar2, qufVar, null, null, null, null, null, 62);
        }
        if (P0 != stfVar2) {
            b.a.onNext(stfVar2);
        }
    }

    @Override // xsna.jtf
    public final io.reactivex.rxjava3.internal.operators.mixed.m c(String str) {
        return new io.reactivex.rxjava3.internal.operators.mixed.m(this.a.c(str), new gsf.a(new ruq0(1)));
    }

    @Override // xsna.jtf
    public final void d(String str, iuf.a aVar) {
        this.a.c.onNext(new wsf(str, aVar));
    }

    @Override // xsna.jtf
    public final void e(String str, psf psfVar) {
        this.a.e.onNext(new wsf(str, psfVar));
    }

    @Override // xsna.jtf
    public final void f(String str, tlo0 tlo0Var) {
        gx6<stf> b = this.a.b(str);
        if (b.b.c) {
            return;
        }
        stf P0 = b.a.P0();
        stf stfVar = P0;
        if (stfVar == null) {
            stfVar = new stf(0);
        }
        stf stfVar2 = stfVar;
        if (!epx.f(stfVar2.b.a, tlo0Var)) {
            stfVar2 = stf.a(stfVar2, null, new guf(tlo0Var, stfVar2.b.b), null, null, null, null, 61);
        }
        if (P0 != stfVar2) {
            b.a.onNext(stfVar2);
        }
    }

    @Override // xsna.jtf
    public final io.reactivex.rxjava3.internal.operators.observable.j1 g(String str) {
        return gsf.a(this.a.e, str);
    }

    @Override // xsna.jtf
    public final io.reactivex.rxjava3.internal.operators.observable.j1 h(String str) {
        return this.a.c(str).U(new xq(new mo1(16), 11));
    }

    @Override // xsna.jtf
    public final io.reactivex.rxjava3.internal.operators.observable.j1 i(String str) {
        return this.a.c(str).U(new yh1(new com.vk.movika.sdk.base.observable.s(19), 10));
    }

    @Override // xsna.jtf
    public final void j(int i, String str) {
        gx6<stf> b = this.a.b(str);
        if (b.b.c) {
            return;
        }
        stf P0 = b.a.P0();
        stf stfVar = P0;
        if (stfVar == null) {
            stfVar = new stf(0);
        }
        stf stfVar2 = stfVar;
        duf dufVar = stfVar2.c;
        if (dufVar.b != i) {
            stfVar2 = stf.a(stfVar2, null, null, new duf(dufVar.a, i), null, null, null, 59);
        }
        if (P0 != stfVar2) {
            b.a.onNext(stfVar2);
        }
    }

    @Override // xsna.jtf
    public final io.reactivex.rxjava3.internal.operators.observable.j1 k(String str) {
        return gsf.a(this.a.d, str);
    }

    @Override // xsna.jtf
    public final duf l(String str) {
        stf stfVar;
        duf dufVar;
        gx6 gx6Var = (gx6) this.a.b.get(str);
        return (gx6Var == null || (stfVar = (stf) gx6Var.b()) == null || (dufVar = stfVar.c) == null) ? new duf(0) : dufVar;
    }

    @Override // xsna.jtf
    public final void m(String str, a7j<ClipFeedOpenAction> a7jVar) {
        this.a.f.onNext(new wsf(str, a7jVar));
    }

    @Override // xsna.jtf
    public final void n(String str, int i, hfz hfzVar, boolean z) {
        gx6<stf> b = this.a.b(str);
        if (b.b.c) {
            return;
        }
        stf P0 = b.a.P0();
        stf stfVar = P0;
        if (stfVar == null) {
            stfVar = new stf(0);
        }
        stf stfVar2 = stfVar;
        tqf tqfVar = stfVar2.d.a;
        if (tqfVar == null || tqfVar.a != i || tqfVar.b != z || !tqfVar.c.equals(hfzVar)) {
            uqf uqfVar = stfVar2.d;
            tqf tqfVar2 = new tqf(i, hfzVar, z);
            uqfVar.getClass();
            stfVar2 = stf.a(stfVar2, null, null, null, new uqf(tqfVar2), null, null, 55);
        }
        if (P0 != stfVar2) {
            b.a.onNext(stfVar2);
        }
    }

    @Override // xsna.jtf
    public final io.reactivex.rxjava3.internal.operators.observable.j1 o(String str) {
        return this.a.c(str).U(new io.reactivex.rxjava3.internal.operators.mixed.n(7, new com.vk.movika.sdk.base.observable.u(15)));
    }

    @Override // xsna.jtf
    public final io.reactivex.rxjava3.internal.operators.observable.j1 p(String str) {
        return gsf.a(this.a.f, str);
    }

    @Override // xsna.jtf
    public final io.reactivex.rxjava3.internal.operators.observable.j1 q(String str) {
        return gsf.a(this.a.c, str);
    }

    @Override // xsna.jtf
    public final void r(String str, duf dufVar) {
        gx6<stf> b = this.a.b(str);
        if (b.b.c) {
            return;
        }
        stf P0 = b.a.P0();
        stf stfVar = P0;
        if (stfVar == null) {
            stfVar = new stf(0);
        }
        stf a = stf.a(stfVar, null, null, dufVar, null, null, null, 59);
        if (P0 != a) {
            b.a.onNext(a);
        }
    }

    @Override // xsna.jtf
    public final List<ClipFeedTab> s(String str) {
        stf stfVar;
        duf dufVar;
        List<ClipFeedTab> list;
        gx6 gx6Var = (gx6) this.a.b.get(str);
        return (gx6Var == null || (stfVar = (stf) gx6Var.b()) == null || (dufVar = stfVar.c) == null || (list = dufVar.a) == null) ? EmptyList.b : list;
    }

    @Override // xsna.jtf
    public final void t(String str) {
        gx6<stf> b = this.a.b(str);
        if (b.b.c) {
            return;
        }
        stf P0 = b.a.P0();
        stf stfVar = P0;
        if (stfVar == null) {
            stfVar = new stf(0);
        }
        stf stfVar2 = stfVar;
        vsf.b bVar = vsf.b.a;
        if (!epx.f(stfVar2.f, bVar)) {
            stfVar2 = stf.a(stfVar2, null, null, null, null, null, bVar, 31);
        }
        if (P0 != stfVar2) {
            b.a.onNext(stfVar2);
        }
    }

    @Override // xsna.jtf
    public final void u(String str) {
        gx6 gx6Var = (gx6) this.a.b.remove(str);
        if (gx6Var != null) {
            gx6Var.b.dispose();
        }
    }

    @Override // xsna.jtf
    public final void v(ypf ypfVar) {
        gx6<stf> b = this.a.b("common_state_id");
        if (b.b.c) {
            return;
        }
        stf P0 = b.a.P0();
        stf stfVar = P0;
        if (stfVar == null) {
            stfVar = new stf(0);
        }
        stf a = stf.a(stfVar, null, null, null, null, ypfVar, null, 47);
        if (P0 != a) {
            b.a.onNext(a);
        }
    }

    @Override // xsna.jtf
    public final io.reactivex.rxjava3.internal.operators.observable.j1 w(String str) {
        return gsf.a(this.a.a, str);
    }

    @Override // xsna.jtf
    public final io.reactivex.rxjava3.internal.operators.mixed.m x(String str) {
        return new io.reactivex.rxjava3.internal.operators.mixed.m(this.a.c(str), new gsf.a(new dnb(2)));
    }

    @Override // xsna.jtf
    public final io.reactivex.rxjava3.internal.operators.observable.j1 y() {
        return this.a.c("common_state_id").U(new pj4(dsf.b, 14));
    }

    @Override // xsna.jtf
    public final void z(String str, aqf aqfVar) {
        this.a.a.onNext(new wsf(str, aqfVar));
    }
}
