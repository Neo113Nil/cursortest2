package com.yandex.go.payments.shared.family.web;

import defpackage.ag41;
import defpackage.bi41;
import defpackage.cu41;
import defpackage.eap;
import defpackage.fap;
import defpackage.i790;
import defpackage.m790;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tse0;
import defpackage.y9p;
import java.util.HashMap;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes13.dex */
public final class b implements bi41 {
    public final /* synthetic */ c a;
    public final /* synthetic */ String b;

    public b(c cVar, String str) {
        this.a = cVar;
        this.b = str;
    }

    @Override // defpackage.bi41
    public final void onPageFinished(String str) {
        y9p y9pVar = this.a.O.c;
        y9pVar.a.a("FamilyAccount.WebView.DidLoad", tse0.n(y9pVar), 1, new HashMap());
    }

    @Override // defpackage.bi41
    public final void onPageLoadingError(m790 m790Var) {
        c cVar = this.a;
        ((ag41) cVar.Q()).b(true);
        if (m790Var instanceof i790) {
            fap fapVar = new fap(cVar, this.b, 1);
            eap eapVar = new eap(cVar, 5);
            ((ag41) cVar.Q()).c(cu41.b);
            pzt0 pzt0Var = cVar.S;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            cVar.S = tje.N(cVar.o(), null, null, new FamilyAccountWebViewRouterImpl$refreshToken$1(cVar, fapVar, eapVar, null), 3);
        }
    }

    @Override // defpackage.bi41
    public final void onPageStarted(String str) {
        c cVar = this.a;
        i d = ((j) cVar.O.a).d("FamilyAccount.WebView.DidStartLoading");
        d.d("url", str);
        d.m();
        cVar.T.onPageStarted(str);
    }
}
