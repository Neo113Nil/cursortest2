package com.yandex.go.captcha;

import defpackage.bi41;
import defpackage.dg41;
import defpackage.dp41;
import defpackage.em41;
import defpackage.gg41;
import defpackage.h331;
import defpackage.h55;
import defpackage.sls;
import defpackage.u6s0;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes12.dex */
public final class f extends h55 {
    public final gg41 D;
    public final sls E;
    public final sls F;
    public final sls G;
    public final u6s0 H;

    public f(gg41 gg41Var, sls slsVar, sls slsVar2, sls slsVar3, u6s0 u6s0Var) {
        super(null);
        this.D = gg41Var;
        this.E = slsVar;
        this.F = slsVar2;
        this.G = slsVar3;
        this.H = u6s0Var;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        A(this.D, new dg41((UiWebViewConfig) obj, (bi41) ((WebCaptchaActivityListener$onFirstContentfulPaint$1$1$1$1$wrapper$2) this.F).invoke(), (dp41) ((WebCaptchaActivityListener$onFirstContentfulPaint$1$1$1$1$wrapper$3) this.G).invoke(), null, (em41) ((WebCaptchaActivityListener$onFirstContentfulPaint$1$1$1$1$wrapper$1) this.E).invoke(), null, null, 216), new h331(this, 3));
    }
}
