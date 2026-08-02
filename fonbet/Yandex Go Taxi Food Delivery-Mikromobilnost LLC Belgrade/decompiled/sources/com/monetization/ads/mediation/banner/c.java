package com.monetization.ads.mediation.banner;

import android.app.Activity;
import android.content.Context;
import com.yandex.mobile.ads.banner.BannerAdView;
import defpackage.a271;
import defpackage.ag81;
import defpackage.aj81;
import defpackage.bq71;
import defpackage.cf71;
import defpackage.ct71;
import defpackage.d881;
import defpackage.ej81;
import defpackage.ey61;
import defpackage.fe81;
import defpackage.hn71;
import defpackage.i371;
import defpackage.j471;
import defpackage.rr41;
import defpackage.s1n;
import defpackage.tb71;
import defpackage.v981;
import defpackage.z581;
import defpackage.zs81;
import java.util.List;
import kotlin.collections.EmptyList;
import yads.qp1;

/* loaded from: classes7.dex */
public final class c implements ct71 {
    public final d881 a;
    public final a b;
    public final aj81 c;

    public c(Context context, j471 j471Var, bq71 bq71Var, d881 d881Var, qp1 qp1Var) {
        this.a = d881Var;
        fe81 fe81Var = bq71Var.b;
        v981 v981Var = bq71Var.c;
        ej81 ej81Var = new ej81(fe81Var);
        z581 z581Var = new z581(fe81Var, v981Var, d881Var);
        rr41 rr41Var = new rr41(z581Var);
        ey61 ey61Var = new ey61(new s1n(qp1Var.b, ej81Var, z581Var, new cf71((Object) rr41Var, (Object) new hn71(13, rr41Var, new ag81()), false, 8), 16), 1);
        aj81 aj81Var = new aj81(context, fe81Var, bq71Var.a, new b(), z581Var, ey61Var, new i371(j471Var, qp1Var));
        this.c = aj81Var;
        BannerAdView bannerAdView = j471Var.U;
        a271 a271Var = bq71Var.b.d.a;
        this.b = new a(j471Var, bq71Var, aj81Var, new zs81(bannerAdView));
    }

    @Override // defpackage.ct71
    public final void a(Context context, d881 d881Var) {
        Activity a = tb71.a();
        if (a != null) {
            context = a;
        }
        this.c.b(context, this.b);
    }

    @Override // defpackage.ct71
    public final List b() {
        return EmptyList.a;
    }

    @Override // defpackage.ct71
    public final String c() {
        return this.a.e;
    }

    @Override // defpackage.ct71
    public final String getAdInfo() {
        return this.a.c;
    }

    @Override // defpackage.ct71
    public final void a(Context context) {
        this.c.a(context);
    }

    @Override // defpackage.ct71
    public final String a() {
        return null;
    }
}
