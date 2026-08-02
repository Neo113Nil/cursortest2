package xsna;

import android.os.Bundle;
import com.vk.auth.init.choose.ChooseProfileData;
import com.vk.auth.main.AuthStatSender;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.superapp.api.dto.auth.UserItem;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ChooseProfilePresenter.kt */
/* loaded from: classes15.dex */
public final class rbc extends al6<Object> {
    public final SchemeStatSak$EventScreen A;
    public final ArrayList B;

    public rbc(Bundle bundle, ChooseProfileData chooseProfileData, SchemeStatSak$EventScreen schemeStatSak$EventScreen) {
        super(bundle);
        this.A = schemeStatSak$EventScreen;
        List<UserItem> list = chooseProfileData.b;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (UserItem userItem : list) {
            arrayList.add(new UserItem(userItem.b, userItem.c, userItem.d, null, null, null, userItem.h, userItem.i, userItem.j, 0L, 568, null));
        }
        this.B = arrayList;
    }

    @Override // xsna.al6
    public final void C0() {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.m(this.A, false);
    }

    @Override // xsna.oud0
    public final void N() {
        B0(this.B);
    }

    @Override // xsna.z55
    public final AuthStatSender.Screen g0() {
        return AuthStatSender.Screen.EXCHANGE_LOGIN;
    }

    @Override // xsna.oud0
    public final void V(int i, List list) {
    }
}
