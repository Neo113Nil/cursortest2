package com.yandex.go.scooters.mosru;

import com.yandex.go.scooters.mosru.api.analytics.ScootersMosRuAnalyticsEvent$WebViewClosed$AuthStatus;
import defpackage.evu0;
import defpackage.tje;
import defpackage.v8p0;
import defpackage.xyn0;
import java.util.LinkedList;

/* loaded from: classes13.dex */
public final class b implements v8p0 {
    public final /* synthetic */ LinkedList b;
    public final /* synthetic */ c c;

    public b(LinkedList linkedList, c cVar) {
        this.b = linkedList;
        this.c = cVar;
    }

    @Override // defpackage.v8p0
    public final void onPageStarted(String str) {
        if (!evu0.y(str, "closewebview", false)) {
            LinkedList linkedList = this.b;
            if (!linkedList.contains(str)) {
                linkedList.add(str);
                return;
            }
        }
        boolean y = evu0.y(str, "#status=ok", false);
        c cVar = this.c;
        if (y) {
            cVar.G.b(new xyn0(ScootersMosRuAnalyticsEvent$WebViewClosed$AuthStatus.SUCCESS));
            tje.N(cVar.o(), null, null, new ScootersMosRuRouterImpl$prepareWebRouterPayload$2$handleWebViewClosingUrl$1(cVar, null), 3);
        } else if (evu0.y(str, "#status=failure", false)) {
            cVar.G.b(new xyn0(ScootersMosRuAnalyticsEvent$WebViewClosed$AuthStatus.FAILURE));
            tje.N(cVar.o(), null, null, new ScootersMosRuRouterImpl$prepareWebRouterPayload$2$handleWebViewClosingUrl$2(cVar, null), 3);
        } else {
            cVar.G.b(new xyn0(ScootersMosRuAnalyticsEvent$WebViewClosed$AuthStatus.CANCELED));
            tje.N(cVar.o(), null, null, new ScootersMosRuRouterImpl$prepareWebRouterPayload$2$handleWebViewClosingUrl$3(cVar, null), 3);
        }
    }
}
