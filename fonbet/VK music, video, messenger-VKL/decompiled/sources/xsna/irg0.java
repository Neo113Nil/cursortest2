package xsna;

import android.os.Bundle;
import com.vk.auth.logout_menu.LogoutItem;
import com.vk.auth.logout_menu.b;
import com.vk.push.common.Logger;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeVkConnectNavigationItem;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import com.vkontakte.android.fragments.SettingsListFragment;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.auq;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class irg0 implements bc80, LogoutItem.a {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ irg0(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // com.vk.auth.logout_menu.LogoutItem.a
    public void invoke() {
        ArrayList arrayList = (ArrayList) this.b;
        SettingsListFragment settingsListFragment = (SettingsListFragment) this.c;
        int i = SettingsListFragment.X0;
        SchemeStatSak$EventScreen schemeStatSak$EventScreen = SchemeStatSak$EventScreen.SETTINGS_LOGOUT;
        SchemeStatSak$TypeVkConnectNavigationItem.EventType eventType = SchemeStatSak$TypeVkConnectNavigationItem.EventType.CLEAR_CACHE;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((x200) it.next()).a());
        }
        new vmu0(schemeStatSak$EventScreen, eventType, null, arrayList2).q();
        int i2 = com.vk.auth.logout_menu.b.f1;
        b.C0401b.a(settingsListFragment.getParentFragmentManager());
        SettingsGeneralFragment.a aVar = new SettingsGeneralFragment.a();
        Bundle bundle = aVar.j;
        bundle.putString("pref_to_highlight", "clearCache");
        bundle.putBoolean("hightlight_preference_click", true);
        aVar.l(settingsListFragment);
    }

    @Override // xsna.bc80
    public void onSuccess(Object obj) {
        k100 k100Var = ((jrg0) this.b).b;
        y310 y310Var = (y310) this.c;
        auq auqVar = (auq) obj;
        if (auqVar.equals(auq.a.a)) {
            Logger.DefaultImpls.debug$default(k100Var, "Available pushes ", null, 2, null);
            y310Var.invoke(Boolean.TRUE);
        } else {
            if (!(auqVar instanceof auq.b)) {
                throw new NoWhenBranchMatchedException();
            }
            Logger.DefaultImpls.debug$default(k100Var, "Unavailable pushes", null, 2, null);
            y310Var.invoke(Boolean.FALSE);
        }
    }
}
