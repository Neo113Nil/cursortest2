package defpackage;

import com.yandex.plus.pay.ui.webview.paymentwidget.ui.a;
import com.yandex.plus.webview.api.contract.message.WebViewMessagesHandler;

/* loaded from: classes2.dex */
public final class ki41 {
    public final sls a;
    public final wi41 b;
    public final nmm0 c;
    public final pgz d;
    public final jse e;
    public final jse f;

    public ki41(sls slsVar, wi41 wi41Var, nmm0 nmm0Var, pgz pgzVar, jse jseVar, jse jseVar2) {
        this.a = slsVar;
        this.b = wi41Var;
        this.c = nmm0Var;
        this.d = pgzVar;
        this.e = jseVar;
        this.f = jseVar2;
    }

    public final a a(String str, long j, long j2, ii41 ii41Var) {
        fu90 fu90Var = this.c.a;
        ajo ajoVar = new ajo(str, fu90Var);
        ajo ajoVar2 = new ajo(str, fu90Var);
        qtd qtdVar = new qtd(2, ajoVar);
        WebViewMessagesHandler webViewMessagesHandler = new WebViewMessagesHandler(new ji41(0, this), this.f);
        return new a(this.a, j, j2, this.d, ii41Var, ajoVar2, qtdVar, new gcj(1, ajoVar), j73.d0(ur6.a), webViewMessagesHandler, this.e);
    }
}
