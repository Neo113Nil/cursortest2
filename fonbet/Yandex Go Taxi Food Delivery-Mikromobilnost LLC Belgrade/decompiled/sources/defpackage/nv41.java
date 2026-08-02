package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.webview.api.WebViewScreenParams;
import com.ybsdk.feature.webview.internal.domain.a;
import com.ybsdk.feature.webview.internal.domain.b;
import com.ybsdk.feature.webview.internal.presentation.c;

/* loaded from: classes3.dex */
public final class nv41 implements mv41 {
    public final jv41 a;

    public nv41(jv41 jv41Var) {
        this.a = jv41Var;
    }

    public final c a(String str, WebViewScreenParams webViewScreenParams) {
        jv41 jv41Var = this.a;
        tfl0 tfl0Var = (tfl0) jv41Var.a.get();
        a aVar = (a) jv41Var.b.get();
        b bVar = (b) jv41Var.c.get();
        mj31 mj31Var = (mj31) jv41Var.d.get();
        j3h j3hVar = (j3h) jv41Var.e.get();
        eg01 eg01Var = (eg01) jv41Var.f.get();
        um41 um41Var = (um41) jv41Var.g.get();
        com.ybsdk.feature.webview.internal.utils.b bVar2 = (com.ybsdk.feature.webview.internal.utils.b) jv41Var.h.get();
        rp41 rp41Var = (rp41) jv41Var.i.get();
        AppAnalyticsReporter appAnalyticsReporter = (AppAnalyticsReporter) jv41Var.j.get();
        return new c(j3hVar, (hay) jv41Var.l.get(), tfl0Var, eg01Var, (ku01) jv41Var.k.get(), mj31Var, um41Var, rp41Var, (mr41) jv41Var.m.get(), appAnalyticsReporter, webViewScreenParams, aVar, bVar, bVar2, str);
    }
}
