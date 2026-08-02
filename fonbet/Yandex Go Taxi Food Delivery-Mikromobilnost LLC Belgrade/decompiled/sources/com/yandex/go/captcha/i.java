package com.yandex.go.captcha;

import androidx.lifecycle.Lifecycle;
import defpackage.gf41;
import defpackage.hb20;
import defpackage.i38;
import defpackage.jy60;
import defpackage.koe0;
import defpackage.oep0;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tse;

/* loaded from: classes.dex */
public final class i implements jy60 {
    public final gf41 a;
    public final i38 b;
    public final koe0 c;
    public final hb20 d;
    public final oep0 e;
    public final tse f;
    public final Lifecycle g;
    public boolean h;
    public pzt0 i;
    public f j;

    public i(gf41 gf41Var, i38 i38Var, koe0 koe0Var, hb20 hb20Var, oep0 oep0Var, tse tseVar, Lifecycle lifecycle) {
        this.a = gf41Var;
        this.b = i38Var;
        this.c = koe0Var;
        this.d = hb20Var;
        this.e = oep0Var;
        this.f = tseVar;
        this.g = lifecycle;
    }

    @Override // defpackage.s150
    public final String getName() {
        return "WebCaptchaActivityListener";
    }

    @Override // defpackage.jy60
    public final void h() {
        tje.N(this.f, null, null, new WebCaptchaActivityListener$onFirstContentfulPaint$1(this, null), 3);
    }
}
