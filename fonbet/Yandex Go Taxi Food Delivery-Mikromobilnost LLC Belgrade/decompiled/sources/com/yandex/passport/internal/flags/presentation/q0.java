package com.yandex.passport.internal.flags.presentation;

import android.os.Bundle;
import android.webkit.WebView;
import com.yandex.passport.common.logger.LogLevel;
import defpackage.jl40;
import defpackage.oz40;
import defpackage.sls;
import defpackage.tls;
import defpackage.w511;
import defpackage.zy11;

/* loaded from: classes15.dex */
public final /* synthetic */ class q0 implements tls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ oz40 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ q0(sls slsVar, sls slsVar2, sls slsVar3, oz40 oz40Var) {
        this.c = slsVar;
        this.w = slsVar2;
        this.x = slsVar3;
        this.b = oz40Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.x;
        Object obj3 = this.w;
        Object obj4 = this.c;
        oz40 oz40Var = this.b;
        switch (i) {
            case 0:
                sls slsVar = (sls) obj4;
                sls slsVar2 = (sls) obj3;
                sls slsVar3 = (sls) obj2;
                int i2 = x0.a[((ExperimentsMenuItem) obj).ordinal()];
                if (i2 == 1) {
                    slsVar.invoke();
                } else if (i2 == 2) {
                    slsVar2.invoke();
                } else if (i2 != 3) {
                    w511.b();
                    break;
                } else {
                    slsVar3.invoke();
                }
                oz40Var.setValue(Boolean.FALSE);
                break;
            default:
                Bundle bundle = (Bundle) obj4;
                String str = ((com.yandex.passport.internal.ui.challenge.webview.k) obj3).a;
                WebView webView = (WebView) obj2;
                if (((CharSequence) oz40Var.getValue()).length() == 0) {
                    if (bundle.isEmpty()) {
                        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Open url: " + ((Object) com.yandex.passport.common.url.b.l(str)), 8);
                        }
                        webView.loadUrl(str);
                    } else {
                        webView.restoreState(bundle);
                    }
                    oz40Var.setValue(str);
                }
                if (((CharSequence) oz40Var.getValue()).length() > 0 && !jl40.l(oz40Var.getValue(), str)) {
                    webView.loadUrl(str);
                    oz40Var.setValue(str);
                    break;
                }
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ q0(oz40 oz40Var, Bundle bundle, com.yandex.passport.internal.ui.challenge.webview.k kVar, WebView webView) {
        this.b = oz40Var;
        this.c = bundle;
        this.w = kVar;
        this.x = webView;
    }
}
