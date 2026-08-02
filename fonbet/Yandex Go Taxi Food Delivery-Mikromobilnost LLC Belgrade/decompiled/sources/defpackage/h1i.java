package defpackage;

import android.content.Context;
import ru.yandex.taxi.contacts.a;
import ru.yandex.taxi.contacts.g;
import ru.yandex.taxi.delivery.contacts.DeliveryContactsModalView;
import ru.yandex.taxi.delivery.experiments.e;
import ru.yandex.taxi.logistics.payment_method_selector.c;

/* loaded from: classes5.dex */
public final class h1i extends m230 {
    public final i130 E;
    public final s14 F;

    public h1i(i130 i130Var, s14 s14Var) {
        super(null);
        this.E = i130Var;
        this.F = s14Var;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.E.a();
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        f1i f1iVar = (f1i) obj;
        x0i x0iVar = f1iVar.a;
        rdq0 rdq0Var = f1iVar.b;
        sdq0 sdq0Var = f1iVar.c;
        iii iiiVar = f1iVar.d;
        qnh qnhVar = new qnh(this);
        s14 s14Var = this.F;
        s14Var.getClass();
        Context context = (Context) s14Var.c;
        q5z.h(context);
        a aVar = (a) s14Var.a;
        q5z.h(aVar);
        zuj0 zuj0Var = (zuj0) s14Var.d;
        q5z.h(zuj0Var);
        zde zdeVar = new zde();
        g gVar = (g) s14Var.e;
        q5z.h(gVar);
        apf apfVar = (apf) s14Var.m;
        q5z.h(apfVar);
        rqo rqoVar = (rqo) s14Var.g;
        q5z.h(rqoVar);
        ut90 ut90Var = new ut90(rqoVar);
        k7x0 k7x0Var = (k7x0) s14Var.i;
        q5z.h(k7x0Var);
        wt90 wt90Var = (wt90) s14Var.j;
        q5z.h(wt90Var);
        pho phoVar = (pho) s14Var.o;
        q5z.h(phoVar);
        gde gdeVar = new gde(0, new b1(phoVar));
        oep0 oep0Var = (oep0) s14Var.b;
        q5z.h(oep0Var);
        wti wtiVar = new wti(ut90Var, k7x0Var, wt90Var, iiiVar, gdeVar, oep0Var);
        y5i y5iVar = (y5i) s14Var.k;
        q5z.h(y5iVar);
        iei ieiVar = new iei(y5iVar);
        e eVar = (e) s14Var.l;
        q5z.h(eVar);
        c cVar = (c) s14Var.n;
        q5z.h(cVar);
        ru.yandex.taxi.delivery.contacts.a aVar2 = new ru.yandex.taxi.delivery.contacts.a(aVar, zuj0Var, zdeVar, gVar, x0iVar, rdq0Var, sdq0Var, apfVar, wtiVar, wt90Var, ieiVar, eVar, qnhVar, cVar);
        ru.yandex.taxi.contacts.c cVar2 = new ru.yandex.taxi.contacts.c(context);
        uq1 uq1Var = (uq1) s14Var.f;
        q5z.h(uq1Var);
        pav pavVar = (pav) s14Var.h;
        q5z.h(pavVar);
        return new DeliveryContactsModalView(context, aVar2, cVar2, uq1Var, pavVar);
    }
}
