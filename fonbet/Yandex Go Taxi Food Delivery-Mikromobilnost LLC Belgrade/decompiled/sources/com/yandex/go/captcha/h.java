package com.yandex.go.captcha;

import defpackage.hxx;
import defpackage.pep0;
import defpackage.sls;
import defpackage.u6s0;
import defpackage.zy11;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes12.dex */
public final class h implements sls {
    public final /* synthetic */ i a;
    public final /* synthetic */ UiWebViewConfig b;

    public h(i iVar, UiWebViewConfig uiWebViewConfig) {
        this.a = iVar;
        this.b = uiWebViewConfig;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        i iVar = this.a;
        f fVar = new f(iVar.a.a().b(), new WebCaptchaActivityListener$onFirstContentfulPaint$1$1$1$1$wrapper$1(iVar), new WebCaptchaActivityListener$onFirstContentfulPaint$1$1$1$1$wrapper$2(iVar), new WebCaptchaActivityListener$onFirstContentfulPaint$1$1$1$1$wrapper$3(iVar), new u6s0(6, iVar));
        iVar.j = fVar;
        ((pep0) iVar.e).f(fVar, this.b, hxx.a);
        return zy11.a;
    }
}
