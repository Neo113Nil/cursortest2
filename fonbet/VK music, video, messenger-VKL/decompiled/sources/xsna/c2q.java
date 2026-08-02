package xsna;

import android.os.Bundle;
import com.vk.auth.main.AuthStatSender;
import com.vk.auth.main.b;
import com.vk.dto.common.id.UserId;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.superapp.api.analytics.RegistrationStatFlowType;
import com.vk.superapp.api.analytics.RegistrationStatParamsFactory;
import com.vk.superapp.api.dto.auth.UserItem;
import com.vk.superapp.multiaccount.api.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ExchangeLoginPresenter2.kt */
/* loaded from: classes15.dex */
public final class c2q extends d2q {
    public final List<UserId> B;
    public final com.vk.superapp.multiaccount.api.a C;
    public final bpn0 D;
    public final SchemeStatSak$EventScreen E;
    public final boolean F;

    public c2q(Bundle bundle, List<UserId> list, com.vk.superapp.multiaccount.api.a aVar) {
        super(list, bundle);
        this.B = list;
        this.C = aVar;
        this.D = new bpn0(new e20(12));
        this.E = SchemeStatSak$EventScreen.MULTI_ACC_ADD_ACCOUNT;
        this.F = true;
    }

    public static void F0(c2q c2qVar, SchemeStatSak$TypeRegistrationItem.EventType eventType) {
        c2qVar.C.e(new a.f(c2qVar.E, eventType, (UserId) c2qVar.D.getValue(), e43.m(null), null));
    }

    @Override // xsna.al6
    public final boolean A0() {
        return this.F;
    }

    @Override // xsna.al6
    public final void B0(ArrayList arrayList) {
        super.B0(arrayList);
        com.vk.registration.funnels.b.z(com.vk.registration.funnels.b.a, SchemeStatSak$EventScreen.MULTI_ACC_ADD_ACCOUNT, com.vk.registration.funnels.a.f(new SchemeStatSak$RegistrationFieldItem(SchemeStatSak$RegistrationFieldItem.Name.ACCOUNTS_CNT, new String(), new String(), String.valueOf(arrayList.size()))), null, null, 28);
    }

    @Override // xsna.d2q
    public final void E0() {
        F0(this, SchemeStatSak$TypeRegistrationItem.EventType.MULTIACC_ADD_ANOTHER_ACCOUNT_TAP);
        this.e.c(AuthStatSender.Screen.EXCHANGE_LOGIN, AuthStatSender.Status.EXCHANGE_LOGIN, AuthStatSender.Element.LOGIN_BUTTON);
        RegistrationStatParamsFactory.a = RegistrationStatFlowType.AUTH_WITHOUT_PASSWORD;
        com.vk.auth.main.b bVar = this.d;
        if (bVar == null) {
            bVar = null;
        }
        b.a.a(bVar, false, false, null, 6);
    }

    @Override // xsna.p66, xsna.z55
    public final void e() {
        super.e();
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.g(SchemeStatSak$EventScreen.MULTI_ACC_ADD_ACCOUNT, null, null, null, 8);
    }

    @Override // xsna.al6
    public final void z0(UserItem userItem, AuthStatSender.Element element) {
        F0(this, SchemeStatSak$TypeRegistrationItem.EventType.MULTI_ACC_ADD_ACCOUNT_TAP);
        super.z0(userItem, element);
    }
}
