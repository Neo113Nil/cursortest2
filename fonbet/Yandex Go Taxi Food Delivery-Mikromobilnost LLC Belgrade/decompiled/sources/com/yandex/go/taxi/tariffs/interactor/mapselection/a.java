package com.yandex.go.taxi.tariffs.interactor.mapselection;

import defpackage.czo0;
import defpackage.hbp0;
import defpackage.og9;
import defpackage.ysd0;
import defpackage.zy11;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.common_models.net.map_object.r;
import ru.yandex.taxi.layers.presentation.walkroute.simple.b;

/* loaded from: classes12.dex */
public final class a {
    public final ysd0 a;
    public final og9 b;
    public final b c;
    public final com.yandex.go.drive.mapselection.a d;
    public final hbp0 e = new hbp0(new czo0(14), "", null);

    public a(ysd0 ysd0Var, og9 og9Var, b bVar, com.yandex.go.drive.mapselection.a aVar) {
        this.a = ysd0Var;
        this.b = og9Var;
        this.c = bVar;
        this.d = aVar;
    }

    public final void a() {
        hbp0 hbp0Var = this.e;
        hbp0Var.a();
        ((ru.yandex.taxi.map_common.b) this.a).a(r.class, this.b);
        com.yandex.go.coroutines.b.g(hbp0Var, null, null, new TariffsPointActionsRoutersInteractorImpl$attach$1(this, null), 3);
    }

    public final void b() {
        n0 n0Var = (n0) this.b.c;
        zy11 zy11Var = zy11.a;
        n0Var.g(zy11Var);
        this.c.c.g(zy11Var);
        this.e.b();
        ((ru.yandex.taxi.map_common.b) this.a).b(r.class);
    }
}
