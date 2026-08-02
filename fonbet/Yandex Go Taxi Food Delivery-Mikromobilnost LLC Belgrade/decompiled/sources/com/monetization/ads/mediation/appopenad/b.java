package com.monetization.ads.mediation.appopenad;

import android.content.Context;
import defpackage.aj81;
import defpackage.d881;
import defpackage.mb71;
import defpackage.z581;

/* loaded from: classes7.dex */
public final class b implements mb71 {
    public final aj81 a;
    public final c b;
    public final a c;
    public final z581 d;

    public b(aj81 aj81Var, c cVar, a aVar, z581 z581Var) {
        this.a = aj81Var;
        this.b = cVar;
        this.c = aVar;
        this.d = z581Var;
    }

    @Override // defpackage.mb71
    public final void a(Context context, d881 d881Var) {
        this.a.b(context, this.c);
    }

    @Override // defpackage.mb71
    public final void a(Context context) {
        this.a.a(context);
    }
}
