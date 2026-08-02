package xsna;

import android.content.Context;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.superapp.analytics.MaxMessengerAnalytics;
import java.util.ArrayList;

/* compiled from: MaxMessengerAnalyticsImpl.kt */
/* loaded from: classes5.dex */
public final class go10 implements MaxMessengerAnalytics {
    public static ArrayList r() {
        SchemeStatSak$RegistrationFieldItem schemeStatSak$RegistrationFieldItem = new SchemeStatSak$RegistrationFieldItem(SchemeStatSak$RegistrationFieldItem.Name.APP_MARKET_NAME, "", "", MaxMessengerAnalytics.MarketName.RUSTORE_SEAMLESS.h());
        ArrayList arrayList = new ArrayList();
        arrayList.add(schemeStatSak$RegistrationFieldItem);
        return arrayList;
    }

    @Override // com.vk.superapp.analytics.MaxMessengerAnalytics
    public final void a() {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.ALERT_VERIFICATION_BY_MAX_MESSENGER_TIMEOUT, null, null, null, null, null, null, 254);
    }

    @Override // com.vk.superapp.analytics.MaxMessengerAnalytics
    public final void b() {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.RUSTORE_SEAMLESS_INSTALL_AVAILABLE, r(), null, null, null, null, null, 252);
    }

    @Override // com.vk.superapp.analytics.MaxMessengerAnalytics
    public final void c() {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.RUSTORE_SEAMLESS_INSTALL_STARTED, r(), null, null, null, null, null, 252);
    }

    @Override // com.vk.superapp.analytics.MaxMessengerAnalytics
    public final void d(boolean z) {
        frf0.a(!z ? SchemeStatSak$TypeRegistrationItem.EventType.GO_TO_MAX_TAP : SchemeStatSak$TypeRegistrationItem.EventType.GO_TO_MAX_CHAT_TAP, null, null, null, null, null, null, 254);
    }

    @Override // com.vk.superapp.analytics.MaxMessengerAnalytics
    public final void e() {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.RETURN_FROM_MAX_APP, null, null, null, null, null, null, 254);
    }

    @Override // com.vk.superapp.analytics.MaxMessengerAnalytics
    public final void f() {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.OPEN_MARKET_FAILED, null, null, null, null, null, null, 254);
    }

    @Override // com.vk.superapp.analytics.MaxMessengerAnalytics
    public final void g() {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.RUSTORE_SEAMLESS_INSTALL_UNKNOWN_ERROR, r(), null, null, null, null, null, 252);
    }

    @Override // com.vk.superapp.analytics.MaxMessengerAnalytics
    public final void h() {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.MAX_APP_OPENED, null, null, null, null, null, null, 254);
    }

    @Override // com.vk.superapp.analytics.MaxMessengerAnalytics
    public final void i() {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.RUSTORE_SEAMLESS_INSTALL_SERVICE_CONNECTION_ERROR, r(), null, null, null, null, null, 252);
    }

    @Override // com.vk.superapp.analytics.MaxMessengerAnalytics
    public final void j() {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.RUSTORE_SEAMLESS_INSTALL_SUCCESS, r(), null, null, null, null, null, 252);
    }

    @Override // com.vk.superapp.analytics.MaxMessengerAnalytics
    public final String k(Context context) {
        boolean b = xhr0.b(context, "ru.vk.store");
        boolean b2 = xhr0.b(context, "ru.oneme.app");
        ArrayList arrayList = new ArrayList();
        if (b) {
            arrayList.add("ru.vk.store");
        }
        if (b2) {
            arrayList.add("ru.oneme.app");
        }
        return j5g.g0(arrayList, ", ", null, null, 0, null, 62);
    }

    @Override // com.vk.superapp.analytics.MaxMessengerAnalytics
    public final void l(MaxMessengerAnalytics.MarketName marketName) {
        SchemeStatSak$RegistrationFieldItem schemeStatSak$RegistrationFieldItem = new SchemeStatSak$RegistrationFieldItem(SchemeStatSak$RegistrationFieldItem.Name.APP_MARKET_NAME, "", "", marketName.h());
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        SchemeStatSak$TypeRegistrationItem.EventType eventType = SchemeStatSak$TypeRegistrationItem.EventType.APP_MARKET_OPENED;
        ArrayList arrayList = new ArrayList();
        arrayList.add(schemeStatSak$RegistrationFieldItem);
        s3q0 s3q0Var = s3q0.a;
        frf0.a(eventType, arrayList, null, null, null, null, null, 252);
    }

    @Override // com.vk.superapp.analytics.MaxMessengerAnalytics
    public final void m(int i) {
        ArrayList r = r();
        r.add(new SchemeStatSak$RegistrationFieldItem(SchemeStatSak$RegistrationFieldItem.Name.ERROR_CODE, "", "", String.valueOf(i)));
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.RUSTORE_SEAMLESS_INSTALL_ERROR, r, null, null, null, null, null, 252);
    }

    @Override // com.vk.superapp.analytics.MaxMessengerAnalytics
    public final void n() {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.VERIFICATION_BY_MAX_MESSENGER_CANCEL, null, null, null, null, null, null, 254);
    }

    @Override // com.vk.superapp.analytics.MaxMessengerAnalytics
    public final void o() {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.RUSTORE_SEAMLESS_INSTALL_CANCEL, r(), null, null, null, null, null, 252);
    }

    @Override // com.vk.superapp.analytics.MaxMessengerAnalytics
    public final void p() {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.RUSTORE_SEAMLESS_INSTALL_DEFAULT_CLIENT_NOT_DOWNLOADED_ERROR, r(), null, null, null, null, null, 252);
    }

    @Override // com.vk.superapp.analytics.MaxMessengerAnalytics
    public final void q() {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.RUSTORE_SEAMLESS_INSTALL_SERVICE_CONNECTION, r(), null, null, null, null, null, 252);
    }
}
