package defpackage;

import android.content.Context;
import com.yandex.go.chargers.data.f;
import com.yandex.go.chargers.discounts.activate.d;
import com.yandex.go.chargers.discounts.api.ChargersDiscountsListEntryPoint;
import com.yandex.go.chargers.discounts.data.mappers.b;
import com.yandex.go.chargers.discounts.list.ui.h;
import com.yandex.go.chargers.discounts.list.ui.i;
import com.yandex.go.chargers.error.data.a;
import java.util.Set;
import ru.yandex.taxi.widget.c;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes12.dex */
public final class lw9 extends h55 {
    public final ke8 D;
    public final yvf0 E;
    public s14 F;
    public final Set G;

    public lw9(ke8 ke8Var, fr3 fr3Var) {
        super(null);
        this.D = ke8Var;
        this.E = fr3Var;
        this.G = j73.f0(new ChargersDiscountsListEntryPoint[]{ChargersDiscountsListEntryPoint.DISCOVERY, ChargersDiscountsListEntryPoint.DEEPLINK});
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        hw9 hw9Var = (hw9) obj;
        int i = iw9.a[hw9Var.f.ordinal()];
        if (i == 1) {
            R(hw9Var);
        } else if (i == 2) {
            Q(hw9Var, false);
        } else {
            w511.b();
        }
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.F = null;
    }

    public final s14 P() {
        s14 s14Var = this.F;
        if (s14Var != null) {
            return s14Var;
        }
        ke8 ke8Var = this.D;
        ke8Var.getClass();
        s14 s14Var2 = new s14(ke8Var);
        this.F = s14Var2;
        return s14Var2;
    }

    public final void Q(hw9 hw9Var, boolean z) {
        s14 P = P();
        ke8 ke8Var = (ke8) P.c;
        Context context = (Context) ke8Var.a;
        q5z.h(context);
        em9 em9Var = (em9) ke8Var.e;
        q5z.h(em9Var);
        w030 w030Var = (w030) ke8Var.r;
        q5z.h(w030Var);
        pwy0 pwy0Var = (pwy0) ke8Var.j;
        q5z.h(pwy0Var);
        zuj0 zuj0Var = (zuj0) ke8Var.d;
        q5z.h(zuj0Var);
        d dVar = new d(pwy0Var, zuj0Var, (xt9) ((xvf0) P.o).get());
        rpa rpaVar = (rpa) ke8Var.o;
        q5z.h(rpaVar);
        a aVar = (a) ke8Var.l;
        q5z.h(aVar);
        po21 po21Var = (po21) ke8Var.n;
        q5z.h(po21Var);
        vt9 vt9Var = new vt9(context, em9Var, w030Var, dVar, new c06(rpaVar, new com.yandex.go.chargers.discounts.activate.domain.a(em9Var, aVar, new com.yandex.go.chargers.discounts.activate.data.a(po21Var, i5m.a((xvf0) P.a)), (xt9) ((xvf0) P.o).get())));
        String str = hw9Var.b;
        tsa tsaVar = hw9Var.c;
        A(vt9Var, new yoj(tsaVar != null ? new xoj(tsaVar.b, tsaVar.a) : null, str, hw9Var.g), new jw9(this, z, hw9Var));
    }

    public final void R(hw9 hw9Var) {
        s14 P = P();
        ke8 ke8Var = (ke8) P.c;
        Context context = (Context) ke8Var.a;
        q5z.h(context);
        txf txfVar = (txf) P.d;
        w030 w030Var = (w030) ke8Var.r;
        q5z.h(w030Var);
        txf txfVar2 = (txf) P.e;
        em9 em9Var = (em9) ke8Var.e;
        q5z.h(em9Var);
        pwy0 pwy0Var = (pwy0) ke8Var.j;
        q5z.h(pwy0Var);
        e eVar = (e) ke8Var.g;
        q5z.h(eVar);
        c cVar = (c) ke8Var.h;
        q5z.h(cVar);
        com.yandex.go.chargers.domain.mapper.a aVar = (com.yandex.go.chargers.domain.mapper.a) ke8Var.i;
        q5z.h(aVar);
        e eVar2 = (e) ke8Var.g;
        q5z.h(eVar2);
        b bVar = new b(eVar, cVar, aVar, new yfa(eVar2));
        zuj0 zuj0Var = (zuj0) ke8Var.d;
        q5z.h(zuj0Var);
        e eVar3 = (e) ke8Var.g;
        q5z.h(eVar3);
        c cVar2 = (c) ke8Var.h;
        q5z.h(cVar2);
        com.yandex.go.chargers.domain.mapper.a aVar2 = (com.yandex.go.chargers.domain.mapper.a) ke8Var.i;
        q5z.h(aVar2);
        e eVar4 = (e) ke8Var.g;
        q5z.h(eVar4);
        yfa yfaVar = new yfa(eVar4);
        com.yandex.go.chargers.payments.data.a aVar3 = (com.yandex.go.chargers.payments.data.a) ke8Var.q;
        q5z.h(aVar3);
        com.yandex.go.chargers.discounts.data.mappers.a aVar4 = new com.yandex.go.chargers.discounts.data.mappers.a(zuj0Var, eVar3, cVar2, aVar2, yfaVar, aVar3);
        em9 em9Var2 = (em9) ke8Var.e;
        q5z.h(em9Var2);
        hh5 hh5Var = new hh5(24, em9Var2);
        po21 po21Var = (po21) ke8Var.n;
        q5z.h(po21Var);
        h3y a = i5m.a((xvf0) P.a);
        a aVar5 = (a) ke8Var.l;
        q5z.h(aVar5);
        f fVar = (f) ke8Var.k;
        q5z.h(fVar);
        lpa lpaVar = (lpa) ke8Var.m;
        q5z.h(lpaVar);
        rpa rpaVar = (rpa) ke8Var.o;
        q5z.h(rpaVar);
        com.yandex.go.chargers.discounts.list.data.a aVar6 = new com.yandex.go.chargers.discounts.list.data.a(po21Var, a, aVar5, fVar, lpaVar, rpaVar, aVar3);
        e eVar5 = (e) ke8Var.g;
        q5z.h(eVar5);
        c cVar3 = (c) ke8Var.h;
        q5z.h(cVar3);
        com.yandex.go.chargers.domain.mapper.a aVar7 = (com.yandex.go.chargers.domain.mapper.a) ke8Var.i;
        q5z.h(aVar7);
        e eVar6 = (e) ke8Var.g;
        q5z.h(eVar6);
        h hVar = new h(em9Var, pwy0Var, bVar, aVar4, hh5Var, aVar6, new i(eVar3, cVar2, new b(eVar5, cVar3, aVar7, new yfa(eVar6))), rpaVar, (spa) ((xvf0) P.f).get(), (av9) ((xvf0) P.g).get(), aVar3);
        av9 av9Var = (av9) ((xvf0) P.g).get();
        yc ycVar = (yc) P.l;
        em9 em9Var3 = (em9) ke8Var.e;
        q5z.h(em9Var3);
        A(new lv9(context, txfVar, w030Var, txfVar2, hVar, av9Var, ycVar, new boj0(em9Var, new hh5(24, em9Var3), rpaVar, aVar3, (spa) ((xvf0) P.f).get(), (opa) ((xvf0) P.m).get(), 8), (txf) P.n), hw9Var, new kw9(this, hw9Var));
    }
}
