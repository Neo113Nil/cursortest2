package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.auth.main.AuthModel;
import com.vk.auth.main.AuthStatSender;
import com.vk.auth.main.b;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.id.UserId;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.superapp.api.analytics.RegistrationStatFlowType;
import com.vk.superapp.api.analytics.RegistrationStatParamsFactory;
import com.vk.superapp.api.dto.auth.UserItem;
import java.util.Collections;
import java.util.List;

/* compiled from: ExchangeLoginPresenter.kt */
/* loaded from: classes15.dex */
public class d2q extends al6<e2q> implements nao0 {
    public final List<UserId> A;

    public d2q(List list, Bundle bundle) {
        super(bundle);
        this.A = list;
    }

    public static void D0(String str) {
        List singletonList = Collections.singletonList(str);
        ufx ufxVar = new ufx("auth.invalidateExchangeTokenMulti", new sn(9), new nr(5));
        ufxVar.h("exchange_tokens", singletonList);
        bx2 e = e370.e(ufxVar);
        e.d = true;
        e.h = true;
        bug0.c(rdx0.p(e).subscribe(new qf(new pf(29), 3), new lp5(new x8m(5), 1)));
    }

    public void E0() {
        this.e.c(AuthStatSender.Screen.EXCHANGE_LOGIN, AuthStatSender.Status.EXCHANGE_LOGIN, AuthStatSender.Element.LOGIN_BUTTON);
        RegistrationStatParamsFactory.a = RegistrationStatFlowType.AUTH_WITHOUT_PASSWORD;
        com.vk.auth.main.b bVar = this.d;
        if (bVar == null) {
            bVar = null;
        }
        b.a.a(bVar, false, false, null, 6);
    }

    @Override // xsna.oud0
    public final void N() {
        h0(this.f.c(this.b, true).m(io.reactivex.rxjava3.android.schedulers.a.b()).q(io.reactivex.rxjava3.schedulers.a.b()).subscribe(new j50(new i50(this, 29), 22)));
    }

    @Override // xsna.nao0
    public final void U() {
        rex0 rex0Var = e370.j;
        if (rex0Var == null) {
            rex0Var = null;
        }
        rex0Var.b(this.b, jeq0.g(AuthModel.a.b(this.c)));
    }

    @Override // xsna.oud0
    public final void V(int i, List list) {
        e2q e2qVar;
        if (BuildInfo.s()) {
            RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
            frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.DROP_ACCOUNT_FROM_SAVED, null, null, null, null, null, null, 254);
        }
        UserItem userItem = (UserItem) list.get(i);
        String str = userItem.c;
        UserId userId = userItem.b;
        D0(str);
        c2r0 c2r0Var = this.f;
        Context context = this.b;
        c2r0Var.b(context, userId);
        this.g.b(context, userId);
        N();
        if (list.size() <= 1 || (e2qVar = (e2q) this.a) == null) {
            return;
        }
        e2qVar.U7(0, list);
    }

    @Override // xsna.z55
    public final AuthStatSender.Screen g0() {
        return AuthStatSender.Screen.EXCHANGE_LOGIN;
    }

    @Override // xsna.nao0
    public final void j() {
        rex0 rex0Var = e370.j;
        if (rex0Var == null) {
            rex0Var = null;
        }
        rex0Var.b(this.b, jeq0.g(AuthModel.a.a(this.c)));
    }

    @Override // xsna.al6
    public final void C0() {
    }
}
