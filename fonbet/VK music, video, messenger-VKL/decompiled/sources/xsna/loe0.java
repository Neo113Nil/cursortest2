package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.auth.DefaultAuthActivity;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vkontakte.android.MainActivity;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;
import xsna.eeu0;

/* compiled from: QrWebToAppHandlerImpl.kt */
/* loaded from: classes11.dex */
public final class loe0 implements koe0 {
    public boolean a;

    @Override // xsna.koe0
    public final void a(Context context, Uri uri, boolean z) {
        this.a = true;
        hoe0.a();
        msy.a(LazyThreadSafetyMode.NONE, new cy20(10));
        String a = m0g0.a(uri);
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        SchemeStatSak$TypeRegistrationItem.EventType eventType = SchemeStatSak$TypeRegistrationItem.EventType.ENTRY_LINK_OPEN;
        SchemeStatSak$EventScreen schemeStatSak$EventScreen = z ? SchemeStatSak$EventScreen.OTHER : SchemeStatSak$EventScreen.QR_SCANNER;
        String str = z ? "external_camera" : "internal_camera";
        ArrayList arrayList = new ArrayList();
        if (a != null) {
            com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
            SchemeStatSak$RegistrationFieldItem.Name name = SchemeStatSak$RegistrationFieldItem.Name.QR_CODE_ID;
            bVar.getClass();
            arrayList.add(com.vk.registration.funnels.b.d(name, a));
        }
        com.vk.registration.funnels.b bVar2 = com.vk.registration.funnels.b.a;
        SchemeStatSak$RegistrationFieldItem.Name name2 = SchemeStatSak$RegistrationFieldItem.Name.QR_CODE_SOURCE;
        bVar2.getClass();
        arrayList.add(com.vk.registration.funnels.b.d(name2, str));
        frf0.a(eventType, arrayList, null, schemeStatSak$EventScreen, null, null, null, 244);
        new qoe0(context).b(uri);
    }

    @Override // xsna.koe0
    public final void b() {
        this.a = false;
    }

    @Override // xsna.koe0
    public final boolean c() {
        return this.a;
    }

    @Override // xsna.koe0
    public final void d(DefaultAuthActivity defaultAuthActivity) {
        new qoe0(defaultAuthActivity).a();
    }

    @Override // xsna.koe0
    public final boolean e() {
        return true;
    }

    @Override // xsna.koe0
    public final void f(MainActivity mainActivity, String str) {
        com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
        bVar.getClass();
        SchemeStatSak$EventScreen schemeStatSak$EventScreen = SchemeStatSak$EventScreen.ALERT_ACCOUNTS_LIMIT_REACHED;
        com.vk.registration.funnels.b.z(bVar, schemeStatSak$EventScreen, com.vk.registration.funnels.b.e(str), null, SchemeStatSak$TypeRegistrationItem.Error.ACCOUNTS_LIMIT_REACHED_ERROR, 12);
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.l(schemeStatSak$EventScreen, com.vk.registration.funnels.b.e(str));
        eeu0.a aVar = new eeu0.a(mainActivity);
        aVar.a(true);
        aVar.setTitle(mainActivity.getString(R.string.vk_qr_web_to_app_accounts_limit_reached_error_title));
        aVar.d(mainActivity.getString(R.string.vk_qr_web_to_app_accounts_limit_reached_error_message));
        aVar.f(mainActivity.getString(R.string.vk_qr_web_to_app_error_dialog_close), new t48(1));
        aVar.m();
    }
}
