package defpackage;

import com.yandex.go.payments.api.model.PaymentsScreen;
import com.yandex.go.payments.paymentlist.di.a;
import com.yandex.go.payments.paymentlist.navigation.e;
import com.yandex.pulse.mvi.tracker.ResponsivenessTracker;
import com.yandex.pulse.mvi.tracker.TimeToInteractiveTracker;

/* loaded from: classes8.dex */
public final class k5g {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;

    public k5g(i6r i6rVar, PaymentsScreen paymentsScreen, tpr tprVar, e eVar, vba0 vba0Var, ffa0 ffa0Var, zba0 zba0Var, uba0 uba0Var) {
        this.a = i6rVar;
        int i = 15;
        this.b = new zw30((xvf0) new i5g(i6rVar, 18), (xvf0) new ec80(new i5g(i6rVar, 13), 26), (xvf0) new i5g(i6rVar, 14), i);
        this.c = new i5g(i6rVar, i);
        this.d = new i5g(i6rVar, 17);
        xvf0 b = i5m.b(eca0.a);
        this.e = b;
        this.h = new kgn(b, 1);
        this.i = new m9a0((zw30) this.b, (i5g) this.c, (i5g) this.d, (kgn) this.h, n3w.a(uba0Var));
        this.j = n3w.a(vba0Var);
        this.f = i5m.b(new a((m9a0) this.i, (n3w) this.j, n3w.a(eVar)));
        this.k = new i5g(i6rVar, 16);
        this.g = i5m.b(qba0.a);
        this.l = new i5g(i6rVar, 19);
    }

    public cxq0 a() {
        c0g c0gVar = (c0g) ((i6r) this.a);
        n20 n20Var = (n20) c0gVar.z.o4.get();
        q5z.h(n20Var);
        pba0 pba0Var = (pba0) ((xvf0) this.g).get();
        i5g i5gVar = (i5g) this.l;
        oep0 n = c0gVar.n();
        q5z.h(n);
        return new cxq0(n20Var, pba0Var, i5gVar, n, 28);
    }

    public edr b() {
        if (((edr) this.d) == null) {
            this.d = (edr) ((zu20) this.j).get();
        }
        return (edr) this.d;
    }

    public ResponsivenessTracker c() {
        thw0 thw0Var = (thw0) this.k;
        if (thw0Var == null) {
            return null;
        }
        if (((ResponsivenessTracker) this.e) == null) {
            this.e = (ResponsivenessTracker) thw0Var.get();
        }
        return (ResponsivenessTracker) this.e;
    }

    public TimeToInteractiveTracker d() {
        if (((TimeToInteractiveTracker) this.b) == null) {
            this.b = (TimeToInteractiveTracker) ((dv20) this.h).get();
        }
        return (TimeToInteractiveTracker) this.b;
    }

    public k5g(zu20 zu20Var, dv20 dv20Var, zu20 zu20Var2, zu20 zu20Var3, e89 e89Var, com.yandex.pulse.mvi.a aVar) {
        this.g = zu20Var;
        this.h = dv20Var;
        this.i = zu20Var2;
        this.j = zu20Var3;
        this.k = e89Var;
        this.l = aVar;
    }
}
