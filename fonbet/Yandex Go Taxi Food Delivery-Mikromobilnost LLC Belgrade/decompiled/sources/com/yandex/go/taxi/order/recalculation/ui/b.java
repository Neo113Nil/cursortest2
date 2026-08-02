package com.yandex.go.taxi.order.recalculation.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import com.yandex.go.address.models.Address;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.recalculation.experiment.PriceRecalculationExperiment;
import com.yandex.go.taxi.order.recalculation.model.response.NewRoutePrice;
import defpackage.a3y0;
import defpackage.ad5;
import defpackage.c0f0;
import defpackage.d0f0;
import defpackage.d0l0;
import defpackage.f0f0;
import defpackage.gwk0;
import defpackage.i0f0;
import defpackage.j0f0;
import defpackage.k7x0;
import defpackage.kdd0;
import defpackage.o2y0;
import defpackage.of9;
import defpackage.pav;
import defpackage.pzt0;
import defpackage.sue0;
import defpackage.tje;
import defpackage.tt2;
import defpackage.vld0;
import defpackage.w4y0;
import defpackage.x4e;
import defpackage.x770;
import defpackage.xdf;
import defpackage.yze0;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes14.dex */
public final class b extends ad5 {
    public final yze0 A;
    public final com.yandex.go.taxi.order.recalculation.domain.a B;
    public final w4y0 C;
    public final tt2 D;
    public final xdf E;
    public final Activity F;
    public final kdd0 G;
    public final k7x0 H;
    public final pav I;
    public final Context J;
    public final of9 K;
    public final a3y0 L;
    public pzt0 M;
    public pzt0 N;
    public pzt0 O;
    public String P;
    public Bitmap Q;
    public final o2y0 x;
    public final List y;
    public final sue0 z;

    public b(o2y0 o2y0Var, List list, sue0 sue0Var, yze0 yze0Var, com.yandex.go.taxi.order.recalculation.domain.a aVar, w4y0 w4y0Var, tt2 tt2Var, xdf xdfVar, Activity activity, kdd0 kdd0Var, k7x0 k7x0Var, pav pavVar, Context context, of9 of9Var) {
        super(c0f0.class);
        this.x = o2y0Var;
        this.y = list;
        this.z = sue0Var;
        this.A = yze0Var;
        this.B = aVar;
        this.C = w4y0Var;
        this.D = tt2Var;
        this.E = xdfVar;
        this.F = activity;
        this.G = kdd0Var;
        this.H = k7x0Var;
        this.I = pavVar;
        this.J = context;
        this.K = of9Var;
        this.L = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "PriceRecalculationPresenter");
        this.P = "";
    }

    public static final void Kg(b bVar, NewRoutePrice newRoutePrice) {
        yze0 yze0Var = bVar.A;
        String e = yze0Var.e(((f0f0) bVar.z.b).c);
        String c = yze0Var.c();
        String a = yze0Var.a();
        String b = yze0Var.b();
        String X = kotlin.collections.a.X(bVar.y, " ➞\n", null, null, new vld0(23), 30);
        String str = newRoutePrice.b;
        String a2 = bVar.E.a(gwk0.h(newRoutePrice.d), str, false, true);
        bVar.P = a2;
        ((c0f0) bVar.Dg()).i1(new j0f0(e, c, a, b, X, a2, new PriceRecalculationPresenter$bindNewPriceLoadedSuccessState$state$1(0, bVar, b.class, "onPriceAcceptPressed", "onPriceAcceptPressed()V", 0), new d0f0(bVar, a2, 0)));
    }

    public static final void Lg(b bVar) {
        yze0 yze0Var = bVar.A;
        String e = yze0Var.e(((f0f0) bVar.z.b).c);
        String c = yze0Var.c();
        String a = yze0Var.a();
        String b = yze0Var.b();
        PriceRecalculationExperiment d = yze0Var.d();
        String str = (String) d.c.getOrDefault(d.f.i, "");
        String X = kotlin.collections.a.X(bVar.y, " ➞\n", null, null, new vld0(25), 30);
        bVar.P = str;
        ((c0f0) bVar.Dg()).i1(new i0f0(e, c, a, b, X, str, new d0f0(bVar, str, 1), new d0f0(bVar, str, 2)));
        pzt0 pzt0Var = bVar.O;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        bVar.O = tje.N(bVar.Jg(), null, null, new PriceRecalculationPresenter$bindPriceLoadErrorState$1(bVar, null), 3);
    }

    public final void Mg() {
        d0l0 t = this.x.b().t();
        Address b = t.b();
        pzt0 pzt0Var = this.M;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.M = tje.N(Jg(), null, null, new PriceRecalculationPresenter$getNewRoutePrice$1(this, b, t, null), 3);
    }

    public final void Ng() {
        String str = this.P;
        kdd0 kdd0Var = this.G;
        x770 x770Var = (x770) kdd0Var.a;
        String str2 = ((o2y0) kdd0Var.d).b().a;
        if (str == null || str.length() <= 0) {
            str = null;
        }
        HashMap p = x4e.p("order_id", str2);
        if (str != null) {
            p.put("pricing_message", str);
        }
        x770Var.a.a("PriceChangeCard.Closed", p, 2, new HashMap());
    }
}
