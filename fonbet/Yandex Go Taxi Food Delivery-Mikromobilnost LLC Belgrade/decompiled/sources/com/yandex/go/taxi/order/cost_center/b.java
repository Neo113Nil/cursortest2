package com.yandex.go.taxi.order.cost_center;

import com.yandex.go.taxi.order.api.ChangeOrderApi;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.b20;
import defpackage.cda0;
import defpackage.e2y0;
import defpackage.exe;
import defpackage.ga9;
import defpackage.o2y0;
import defpackage.sk7;
import defpackage.spk0;
import defpackage.wnt;
import defpackage.x99;
import defpackage.ysg;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Calendar;
import ru.yandex.taxi.costcenters.ride.c;

/* loaded from: classes14.dex */
public final class b {
    public final b20 a;
    public final ChangeOrderApi b;
    public final ga9 c;
    public final ysg d;
    public final cda0 e;
    public final wnt f;
    public final e2y0 g;
    public final zuj0 h;
    public boolean i = true;

    public b(b20 b20Var, ChangeOrderApi changeOrderApi, ga9 ga9Var, ysg ysgVar, cda0 cda0Var, wnt wntVar, e2y0 e2y0Var, zuj0 zuj0Var) {
        this.a = b20Var;
        this.b = changeOrderApi;
        this.c = ga9Var;
        this.d = ysgVar;
        this.e = cda0Var;
        this.f = wntVar;
        this.g = e2y0Var;
        this.h = zuj0Var;
    }

    public final void a(o2y0 o2y0Var, ArrayList arrayList, exe exeVar) {
        b20 b20Var = this.a;
        TaxiOrder b = o2y0Var.b();
        if (this.i) {
            b20Var.e = new a(this, o2y0Var);
            this.i = false;
        }
        synchronized (b) {
            b.i = b.i.j(arrayList);
        }
        String str = b.a;
        this.d.g(b);
        ((c) exeVar.a.c).c.g(zy11.a);
        sk7 a = this.c.a(str);
        b20Var.a(new spk0(new x99((String) a.b, (String) a.c, arrayList, (Calendar) a.w), new RideCostCenterUpdaterImpl$update$1(1, exeVar, exe.class, "onFail", "onFail(Ljava/lang/String;)V", 0)), str);
    }
}
