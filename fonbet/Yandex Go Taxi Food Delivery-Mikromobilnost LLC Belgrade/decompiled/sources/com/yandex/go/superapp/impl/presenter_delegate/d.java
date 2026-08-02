package com.yandex.go.superapp.impl.presenter_delegate;

import com.yandex.go.shortcuts.experiments.OrderShortcutsParamsExperiment;
import com.yandex.go.superapp.order.multi.old.provider.g;
import defpackage.d9n;
import defpackage.h1p;
import defpackage.lse;
import defpackage.mdh;
import defpackage.ru8;
import defpackage.sjh;
import defpackage.sm40;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wl40;
import ru.yandex.taxi.appdelegates.SupportedOrderType;

/* loaded from: classes14.dex */
public final class d {
    public final sm40 a;
    public final g b;
    public final tt2 c;
    public final ru.yandex.taxi.eatskit.c d;
    public final h1p e;

    public d(sm40 sm40Var, g gVar, tt2 tt2Var, ru.yandex.taxi.eatskit.c cVar, h1p h1pVar) {
        this.a = sm40Var;
        this.b = gVar;
        this.c = tt2Var;
        this.d = cVar;
        this.e = h1pVar;
    }

    public final boolean a() {
        h1p h1pVar = this.e;
        d9n d9nVar = new d9n(h1pVar.getValue());
        g gVar = this.b;
        if (!g.f(gVar.a(), d9nVar)) {
            return false;
        }
        wl40 a = gVar.a();
        SupportedOrderType supportedOrderType = SupportedOrderType.TAXI;
        if (!gVar.b.r() && !g.g(a) && a.j() <= 1) {
            return false;
        }
        OrderShortcutsParamsExperiment.Param param = (OrderShortcutsParamsExperiment.Param) this.a.a().d.get(h1pVar.getValue());
        return param != null && param.a;
    }

    public final void b(tse tseVar) {
        ru8 ru8Var = new ru8(lse.a, 4);
        this.c.getClass();
        sjh sjhVar = uyj.a;
        tje.N(tseVar, mdh.b.plus(ru8Var), null, new ExternalServiceOrdersDelegateImpl$collectOrders$1(this, null), 2);
    }
}
