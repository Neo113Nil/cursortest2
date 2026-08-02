package defpackage;

import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import com.ybsdk.feature.webview.api.WebViewAppearanceOption;
import com.ybsdk.feature.webview.api.WebViewScreenParams;
import com.ybsdk.rconfig.YbCommonUrlsImpl;
import com.ybsdk.rconfig.YbSupportConfig;
import com.ybsdk.rconfig.a;
import com.ybsdk.rconfig.b;
import com.ybsdk.rconfig.configs.YbCreditLimitDashboardConfig;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class m1h implements k3h {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;
    public final /* synthetic */ yvf0 c;
    public final /* synthetic */ np41 d;

    public /* synthetic */ m1h(b bVar, xvf0 xvf0Var, np41 np41Var, int i) {
        this.a = i;
        this.b = bVar;
        this.c = xvf0Var;
        this.d = np41Var;
    }

    @Override // defpackage.k3h
    public final y0h a(BaseDeeplinkAction baseDeeplinkAction) {
        int i = this.a;
        x0h x0hVar = x0h.a;
        np41 np41Var = this.d;
        yvf0 yvf0Var = this.c;
        b bVar = this.b;
        switch (i) {
            case 0:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.AboutDocuments)) {
                    return x0hVar;
                }
                a aVar = bVar.i;
                YbCommonUrlsImpl ybCommonUrlsImpl = (YbCommonUrlsImpl) bVar.d(aVar.e).getData();
                YbCommonUrlsImpl ybCommonUrlsImpl2 = (YbCommonUrlsImpl) aVar.e.c.getData();
                String documentsUrl = ybCommonUrlsImpl.getDocumentsUrl();
                if (documentsUrl.length() == 0) {
                    documentsUrl = ybCommonUrlsImpl2.getDocumentsUrl();
                }
                List c = ((l3h) ((j3h) yvf0Var.get())).c(documentsUrl);
                if (c == null) {
                    c = Collections.singletonList(((com.ybsdk.feature.webview.internal.a) np41Var).f(documentsUrl));
                }
                return new v0h(c, null, 6);
            case 1:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.AboutUs)) {
                    return x0hVar;
                }
                a aVar2 = bVar.i;
                YbCommonUrlsImpl ybCommonUrlsImpl3 = (YbCommonUrlsImpl) bVar.d(aVar2.e).getData();
                YbCommonUrlsImpl ybCommonUrlsImpl4 = (YbCommonUrlsImpl) aVar2.e.c.getData();
                String ybUrl = ybCommonUrlsImpl3.getYbUrl();
                if (ybUrl.length() == 0) {
                    ybUrl = ybCommonUrlsImpl4.getYbUrl();
                }
                List c2 = ((l3h) ((j3h) yvf0Var.get())).c(ybUrl);
                if (c2 == null) {
                    c2 = Collections.singletonList(((com.ybsdk.feature.webview.internal.a) np41Var).f(ybUrl));
                }
                return new v0h(c2, null, 6);
            case 2:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.AccountTariff)) {
                    return x0hVar;
                }
                a aVar3 = bVar.i;
                YbCommonUrlsImpl ybCommonUrlsImpl5 = (YbCommonUrlsImpl) bVar.d(aVar3.e).getData();
                YbCommonUrlsImpl ybCommonUrlsImpl6 = (YbCommonUrlsImpl) aVar3.e.c.getData();
                String accountTariffUrl = ybCommonUrlsImpl5.getAccountTariffUrl();
                if (accountTariffUrl.length() == 0) {
                    accountTariffUrl = ybCommonUrlsImpl6.getAccountTariffUrl();
                }
                List c3 = ((l3h) ((j3h) yvf0Var.get())).c(accountTariffUrl);
                if (c3 == null) {
                    c3 = Collections.singletonList(((com.ybsdk.feature.webview.internal.a) np41Var).f(accountTariffUrl));
                }
                return new v0h(c3, null, 6);
            case 3:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.CreditLimit)) {
                    return x0hVar;
                }
                String url = ((YbCreditLimitDashboardConfig) bVar.d(bVar.i.r).getData()).getUrl();
                List c4 = ((l3h) ((j3h) yvf0Var.get())).c(url);
                if (c4 == null) {
                    c4 = Collections.singletonList(((com.ybsdk.feature.webview.internal.a) np41Var).f(url));
                }
                return new v0h(c4, null, 6);
            case 4:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.Faq)) {
                    return x0hVar;
                }
                a aVar4 = bVar.i;
                YbCommonUrlsImpl ybCommonUrlsImpl7 = (YbCommonUrlsImpl) bVar.d(aVar4.e).getData();
                YbCommonUrlsImpl ybCommonUrlsImpl8 = (YbCommonUrlsImpl) aVar4.e.c.getData();
                String faqUrl = ybCommonUrlsImpl7.getFaqUrl();
                if (faqUrl.length() == 0) {
                    faqUrl = ybCommonUrlsImpl8.getFaqUrl();
                }
                String str = faqUrl;
                List c5 = ((l3h) ((j3h) yvf0Var.get())).c(str);
                if (c5 == null) {
                    c5 = Collections.singletonList(((com.ybsdk.feature.webview.internal.a) np41Var).e(new WebViewScreenParams(str, false, null, new WebViewAppearanceOption.NoToolbar(null, false, false, 6, null), null, null, null, null, false, 502, null)));
                }
                return new v0h(c5, null, 6);
            default:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.Support)) {
                    return x0hVar;
                }
                DeeplinkAction.Support support = (DeeplinkAction.Support) baseDeeplinkAction;
                String supportUrl = support.getSupportUrl();
                if (supportUrl == null) {
                    supportUrl = ((YbSupportConfig) bVar.d(bVar.i.d).getData()).getSupportUrl();
                }
                List c6 = ((l3h) ((j3h) yvf0Var.get())).c(supportUrl);
                if (c6 == null) {
                    c6 = Collections.singletonList(com.ybsdk.feature.webview.api.a.b(np41Var, supportUrl, support.getCloseCallback(), null, 4));
                }
                return new v0h(c6, null, 6);
        }
    }
}
