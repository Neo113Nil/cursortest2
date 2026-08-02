package com.ybsdk.feature.redirect.url.internal.presentation;

import com.ybsdk.di.modules.features.o;
import com.ybsdk.feature.deeplink.api.Deeplink;
import com.ybsdk.feature.deeplink.api.DeeplinkNavigation;
import defpackage.bmi0;
import defpackage.cmi0;
import defpackage.d7g0;
import defpackage.ds31;
import defpackage.emi0;
import defpackage.gao;
import defpackage.hkg0;
import defpackage.if8;
import defpackage.j3h;
import defpackage.l3h;
import defpackage.sue0;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.uc5;
import defpackage.v0h;
import defpackage.x4c;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final RedirectUrlParams B;
    public final o C;
    public final tfl0 D;
    public final sue0 E;
    public final if8 F;

    public a(RedirectUrlParams redirectUrlParams, o oVar, tfl0 tfl0Var, sue0 sue0Var, if8 if8Var) {
        super(new hkg0(20), new d7g0(6));
        this.B = redirectUrlParams;
        this.C = oVar;
        this.D = tfl0Var;
        this.E = sue0Var;
        this.F = if8Var;
        if (emi0.a[redirectUrlParams.getAuth().ordinal()] == 1) {
            tje.N(ds31.a(this), null, null, new RedirectUrlViewModel$startLoadAuthUrl$1(this, null), 3);
        } else {
            x4c.g("RedirectUrlScreen was launched with Auth.NONE param", null, redirectUrlParams.getUri(), null, 10);
            Z(new bmi0(redirectUrlParams.getUri()));
        }
    }

    public final void b0() {
        d0(null);
    }

    public final void c0() {
        this.D.e();
    }

    public final void d0(Throwable th) {
        Deeplink fallback = this.B.getFallback();
        if (((l3h) ((j3h) this.E.b)).d(fallback != null ? Deeplink.copy$default(fallback, null, null, DeeplinkNavigation.Replace.INSTANCE, null, null, null, false, false, 251, null) : null) instanceof v0h) {
            return;
        }
        Z(new cmi0(gao.e(null, null, th, 3)));
        this.D.e();
    }
}
