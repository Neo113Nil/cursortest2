package com.yandex.fintechsdk.features.webview.payment.internal.presentation;

import defpackage.bpb1;
import defpackage.dnd0;
import defpackage.mkp;
import defpackage.sls;
import defpackage.tls;
import defpackage.yr31;

/* loaded from: classes12.dex */
public final class a implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ Object c;

    public a(mkp mkpVar) {
        this.a = 0;
        this.b = WebViewPaymentFragment$componentStore$2.b;
        this.c = mkpVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                return (yr31) this.b.invoke((mkp) obj);
            default:
                mkp resolveDependencies = bpb1.d((WebViewPaymentFragment) obj).resolveDependencies();
                WebViewPaymentFragment$componentStore$2 webViewPaymentFragment$componentStore$2 = WebViewPaymentFragment$componentStore$2.b;
                return new dnd0(1, new a(resolveDependencies));
        }
    }

    public a(WebViewPaymentFragment webViewPaymentFragment) {
        this.a = 1;
        WebViewPaymentFragment$componentStore$2 webViewPaymentFragment$componentStore$2 = WebViewPaymentFragment$componentStore$2.b;
        this.c = webViewPaymentFragment;
        this.b = webViewPaymentFragment$componentStore$2;
    }
}
