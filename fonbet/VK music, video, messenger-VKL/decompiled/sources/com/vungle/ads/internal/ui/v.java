package com.vungle.ads.internal.ui;

import android.webkit.WebView;
import com.vungle.ads.EvaluateJsError;
import com.vungle.ads.internal.model.h0;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.s3q0;

/* loaded from: classes7.dex */
public final class v extends Lambda implements gzs {
    public final /* synthetic */ z a;
    public final /* synthetic */ WebView b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(z zVar, WebView webView, String str) {
        super(0);
        this.a = zVar;
        this.b = webView;
        this.c = str;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Object failure;
        h0 h0Var;
        WebView webView = this.b;
        String str = this.c;
        s3q0 s3q0Var = null;
        if (webView != null) {
            try {
                webView.evaluateJavascript(str, null);
                s3q0Var = s3q0.a;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
        }
        failure = s3q0Var;
        z zVar = this.a;
        Throwable a = Result.a(failure);
        if (a != null) {
            StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("Evaluate js failed ");
            a2.append(a.getLocalizedMessage());
            EvaluateJsError evaluateJsError = new EvaluateJsError(a2.toString());
            h0Var = zVar.a;
            evaluateJsError.setLogEntry$vungle_ads_release(h0Var.q()).logErrorNoReturnValue$vungle_ads_release();
        }
        return s3q0.a;
    }
}
