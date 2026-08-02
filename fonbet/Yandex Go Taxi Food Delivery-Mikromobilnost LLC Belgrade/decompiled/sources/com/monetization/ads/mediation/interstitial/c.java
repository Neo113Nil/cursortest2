package com.monetization.ads.mediation.interstitial;

import android.content.Context;
import defpackage.aj81;
import defpackage.bq71;
import defpackage.d881;
import defpackage.f171;
import defpackage.mb71;
import defpackage.z581;

/* loaded from: classes7.dex */
public final class c implements mb71 {
    public final bq71 a;
    public final aj81 b;
    public final b c;
    public final a d;
    public final z581 e;
    public final f171 f;

    public c(bq71 bq71Var, aj81 aj81Var, b bVar, a aVar, z581 z581Var, f171 f171Var) {
        this.a = bq71Var;
        this.b = aj81Var;
        this.c = bVar;
        this.d = aVar;
        this.e = z581Var;
        this.f = f171Var;
    }

    @Override // defpackage.mb71
    public final void a(Context context) {
        this.f.getClass();
        this.a.d.a();
        this.b.a(context);
    }

    @Override // defpackage.mb71
    public final void a(Context context, d881 d881Var) {
        this.b.b(context, this.d);
    }
}
