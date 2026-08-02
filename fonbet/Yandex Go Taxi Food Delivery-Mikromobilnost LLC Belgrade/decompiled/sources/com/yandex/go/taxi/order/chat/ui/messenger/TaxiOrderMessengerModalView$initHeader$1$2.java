package com.yandex.go.taxi.order.chat.ui.messenger;

import com.yandex.go.messenger_native.analytics.NativeMessengerAnalytics$Action;
import com.yandex.go.messenger_native.analytics.NativeMessengerAnalytics$Service;
import com.yandex.go.messenger_native.api.NativeMessengerAnalyticsFacade$Action;
import com.yandex.go.messenger_native.api.NativeMessengerAnalyticsFacade$Service;
import defpackage.co40;
import defpackage.ih01;
import defpackage.k3y0;
import defpackage.l3y0;
import defpackage.m3y0;
import defpackage.mh41;
import defpackage.n3y0;
import defpackage.nh41;
import defpackage.q350;
import defpackage.r350;
import defpackage.sls;
import defpackage.w511;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.messenger.analytics.WebMessengerAnalytics$Action;
import ru.yandex.taxi.messenger.analytics.WebMessengerAnalytics$Service;
import ru.yandex.taxi.messenger.domain.WebMessengerAnalyticsFacade$Action;
import ru.yandex.taxi.messenger.domain.WebMessengerAnalyticsFacade$Service;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* synthetic */ class TaxiOrderMessengerModalView$initHeader$1$2 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        m3y0 m3y0Var = (m3y0) this.receiver;
        n3y0 n3y0Var = m3y0Var.D;
        int i = l3y0.b[m3y0Var.F.ordinal()];
        if (i == 1) {
            r350 r350Var = m3y0Var.B;
            NativeMessengerAnalyticsFacade$Service nativeMessengerAnalyticsFacade$Service = NativeMessengerAnalyticsFacade$Service.TAXI;
            String str = n3y0Var.b;
            NativeMessengerAnalyticsFacade$Action nativeMessengerAnalyticsFacade$Action = NativeMessengerAnalyticsFacade$Action.CALL;
            co40 co40Var = r350Var.a;
            NativeMessengerAnalytics$Service b = r350.b(nativeMessengerAnalyticsFacade$Service);
            if (q350.c[nativeMessengerAnalyticsFacade$Action.ordinal()] != 1) {
                w511.b();
                return null;
            }
            NativeMessengerAnalytics$Action nativeMessengerAnalytics$Action = NativeMessengerAnalytics$Action.Call;
            co40Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put(Constants.KEY_SERVICE, b.getEventValue());
            hashMap.put("chat_id", str);
            hashMap.put("action", nativeMessengerAnalytics$Action.getEventValue());
            co40Var.a.a("NativeMessenger.InnerAction.Received", hashMap, 1, new HashMap());
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            nh41 nh41Var = m3y0Var.C;
            WebMessengerAnalyticsFacade$Service webMessengerAnalyticsFacade$Service = WebMessengerAnalyticsFacade$Service.TAXI;
            String str2 = n3y0Var.b;
            WebMessengerAnalyticsFacade$Action webMessengerAnalyticsFacade$Action = WebMessengerAnalyticsFacade$Action.CALL;
            ih01 ih01Var = nh41Var.a;
            WebMessengerAnalytics$Service a = nh41.a(webMessengerAnalyticsFacade$Service);
            if (mh41.c[webMessengerAnalyticsFacade$Action.ordinal()] != 1) {
                w511.b();
                return null;
            }
            WebMessengerAnalytics$Action webMessengerAnalytics$Action = WebMessengerAnalytics$Action.Call;
            ih01Var.getClass();
            HashMap hashMap2 = new HashMap();
            hashMap2.put(Constants.KEY_SERVICE, a.getEventValue());
            hashMap2.put("chat_id", str2);
            hashMap2.put("action", webMessengerAnalytics$Action.getEventValue());
            ih01Var.a.a("WebMessenger.InnerAction.Received", hashMap2, 1, new HashMap());
        }
        ((k3y0) m3y0Var.Dg()).closeKeyboard();
        ((com.yandex.go.taxi.order.delegates.a) m3y0Var.x).c(n3y0Var.a.b(), null);
        return zy11.a;
    }
}
