package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.taxi.messenger.analytics.WebMessengerAnalytics$Reason;
import ru.yandex.taxi.messenger.analytics.WebMessengerAnalytics$Service;
import ru.yandex.taxi.messenger.domain.WebMessengerAnalyticsFacade$Reason;
import ru.yandex.taxi.messenger.domain.WebMessengerAnalyticsFacade$Service;

/* loaded from: classes6.dex */
public final class nh41 {
    public final ih01 a;

    public nh41(ih01 ih01Var) {
        this.a = ih01Var;
    }

    public static WebMessengerAnalytics$Service a(WebMessengerAnalyticsFacade$Service webMessengerAnalyticsFacade$Service) {
        int i = mh41.a[webMessengerAnalyticsFacade$Service.ordinal()];
        if (i == 1) {
            return WebMessengerAnalytics$Service.Taxi;
        }
        if (i == 2) {
            return WebMessengerAnalytics$Service.Marketplace;
        }
        w511.b();
        return null;
    }

    public final void b(WebMessengerAnalyticsFacade$Service webMessengerAnalyticsFacade$Service, String str, WebMessengerAnalyticsFacade$Reason webMessengerAnalyticsFacade$Reason) {
        WebMessengerAnalytics$Reason webMessengerAnalytics$Reason;
        WebMessengerAnalytics$Service a = a(webMessengerAnalyticsFacade$Service);
        int i = mh41.b[webMessengerAnalyticsFacade$Reason.ordinal()];
        if (i == 1) {
            webMessengerAnalytics$Reason = WebMessengerAnalytics$Reason.CloseTapped;
        } else if (i == 2) {
            webMessengerAnalytics$Reason = WebMessengerAnalytics$Reason.StatusChanged;
        } else if (i == 3) {
            webMessengerAnalytics$Reason = WebMessengerAnalytics$Reason.OtherChatOpened;
        } else if (i == 4) {
            webMessengerAnalytics$Reason = WebMessengerAnalytics$Reason.BackPressed;
        } else {
            if (i != 5) {
                w511.b();
                return;
            }
            webMessengerAnalytics$Reason = WebMessengerAnalytics$Reason.Unknown;
        }
        ih01 ih01Var = this.a;
        ih01Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(Constants.KEY_SERVICE, a.getEventValue());
        hashMap.put("chat_id", str);
        hashMap.put(CRLReasonCodeExtension.REASON, webMessengerAnalytics$Reason.getEventValue());
        ih01Var.a.a("WebMessenger.Closed", hashMap, 1, new HashMap());
    }
}
