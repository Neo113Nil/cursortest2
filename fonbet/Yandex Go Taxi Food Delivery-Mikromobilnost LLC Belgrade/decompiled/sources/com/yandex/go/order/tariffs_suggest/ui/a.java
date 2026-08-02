package com.yandex.go.order.tariffs_suggest.ui;

import com.yandex.go.taxi.order.domain.repositories.f0;
import defpackage.ad5;
import defpackage.hp8;
import defpackage.ip8;
import defpackage.kb80;
import defpackage.lb80;
import defpackage.nb80;
import defpackage.o2y0;
import defpackage.oep0;
import defpackage.pm5;
import defpackage.sg9;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tt2;
import defpackage.y2s0;
import defpackage.yj70;
import defpackage.yxx0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public final class a extends ad5 {
    public final sg9 A;
    public final yj70 B;
    public final tt2 C;
    public final y2s0 D;
    public final oep0 E;
    public com.yandex.go.order.tariffs_suggest.router.a F;
    public int G;
    public final com.yandex.go.order.tariffs_suggest.repository.a x;
    public final f0 y;
    public final pm5 z;

    public a(com.yandex.go.order.tariffs_suggest.repository.a aVar, f0 f0Var, pm5 pm5Var, sg9 sg9Var, yj70 yj70Var, tt2 tt2Var, y2s0 y2s0Var, oep0 oep0Var) {
        super(nb80.class);
        this.x = aVar;
        this.y = f0Var;
        this.z = pm5Var;
        this.A = sg9Var;
        this.B = yj70Var;
        this.C = tt2Var;
        this.D = y2s0Var;
        this.E = oep0Var;
        this.G = 6;
    }

    public static final void Kg(a aVar) {
        lb80 Lg = aVar.Lg(true);
        if (Lg != null) {
            yxx0.c((yxx0) aVar.B.a, Lg.a, Lg.b, Lg.c);
        }
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        com.yandex.go.order.tariffs_suggest.router.a aVar = this.F;
        if (aVar != null) {
            aVar.i();
        }
        this.F = null;
        super.Cg();
    }

    public final lb80 Lg(boolean z) {
        o2y0 o2y0Var = (o2y0) this.y.q.getValue();
        String str = o2y0Var != null ? o2y0Var.b().a : null;
        String str2 = this.x.n;
        List list = ((ip8) this.x.j.a.getValue()).c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            hp8 hp8Var = (hp8) obj;
            if (!z || hp8Var.g) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((hp8) it.next()).a);
        }
        if (str == null || str2 == null) {
            return null;
        }
        return new lb80(str, str2, arrayList2);
    }

    public final kb80 Mg(String str) {
        o2y0 o2y0Var = (o2y0) this.y.q.getValue();
        String str2 = o2y0Var != null ? o2y0Var.b().a : null;
        String str3 = this.x.n;
        if (str2 == null || str3 == null) {
            return null;
        }
        return new kb80(str2, str, str3);
    }

    public final void Ng() {
        tje.N(Jg(), null, null, new OrderWithTariffSuggestPresenter$proceedTariffChange$1(this, null), 3);
    }
}
