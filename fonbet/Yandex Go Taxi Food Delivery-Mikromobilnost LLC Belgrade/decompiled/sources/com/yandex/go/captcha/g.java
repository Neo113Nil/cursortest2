package com.yandex.go.captcha;

import defpackage.pzt0;
import defpackage.tje;
import defpackage.tls;
import defpackage.zy11;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements tls {
    public final /* synthetic */ i a;

    public /* synthetic */ g(i iVar) {
        this.a = iVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        i iVar = this.a;
        iVar.getClass();
        CoreWebViewConfig.a aVar = new CoreWebViewConfig.a();
        aVar.j((String) obj);
        aVar.c();
        aVar.g();
        aVar.f();
        aVar.h();
        UiWebViewConfig uiWebViewConfig = new UiWebViewConfig(aVar.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
        if (!iVar.h) {
            iVar.h = true;
            pzt0 pzt0Var = iVar.i;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            iVar.i = tje.N(iVar.f, null, null, new WebCaptchaActivityListener$onFirstContentfulPaint$1$1$1(iVar, uiWebViewConfig, null), 3);
        }
        return zy11.a;
    }
}
