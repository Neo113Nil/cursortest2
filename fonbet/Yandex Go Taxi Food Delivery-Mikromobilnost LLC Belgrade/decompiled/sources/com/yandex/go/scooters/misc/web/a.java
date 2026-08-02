package com.yandex.go.scooters.misc.web;

import android.content.Context;
import defpackage.elo0;
import defpackage.j7g;
import defpackage.m230;
import defpackage.m7g;
import defpackage.m950;
import defpackage.o7g;
import defpackage.s6k0;
import defpackage.s8p0;
import defpackage.u45;
import defpackage.v8p0;
import defpackage.w030;
import defpackage.w8p0;
import defpackage.x8p0;
import defpackage.y8p0;
import defpackage.yya;
import defpackage.zm41;

/* loaded from: classes13.dex */
public final class a extends m230 implements m950 {
    public final w030 E;
    public final y8p0 F;
    public final m7g G;

    public a(w030 w030Var, y8p0 y8p0Var, m7g m7gVar) {
        super(null);
        this.E = w030Var;
        this.F = y8p0Var;
        this.G = m7gVar;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.E;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        w8p0 w8p0Var = (w8p0) obj;
        v8p0 v8p0Var = w8p0Var.b;
        s8p0 s8p0Var = w8p0Var.a;
        ScootersWebRouterImpl$provideModalView$1 scootersWebRouterImpl$provideModalView$1 = new ScootersWebRouterImpl$provideModalView$1(1, this, a.class, "openErrorDialog", "openErrorDialog(Ljava/lang/Throwable;)V", 0);
        yya yyaVar = new yya(1, v8p0Var);
        Boolean bool = w8p0Var.c;
        s6k0 s6k0Var = this.F.a;
        return new ScootersWebViewModalView((Context) ((j7g) s6k0Var.a).get(), (zm41) ((o7g) s6k0Var.b).get(), (x8p0) ((elo0) s6k0Var.c).get(), s8p0Var, scootersWebRouterImpl$provideModalView$1, yyaVar, bool);
    }
}
