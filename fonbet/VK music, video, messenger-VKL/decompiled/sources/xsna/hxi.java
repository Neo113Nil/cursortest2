package xsna;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.vk.auth.logout_menu.LogoutItem;
import com.vk.auth.logout_menu.b;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeVkConnectNavigationItem;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import com.vkontakte.android.fragments.SettingsListFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Result;
import xsna.qn60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class hxi implements SuccessContinuation, io.reactivex.rxjava3.core.a0, LogoutItem.a {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hxi(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // com.vk.auth.logout_menu.LogoutItem.a
    public void invoke() {
        ArrayList arrayList = (ArrayList) this.b;
        SettingsListFragment settingsListFragment = (SettingsListFragment) this.c;
        int i = SettingsListFragment.X0;
        SchemeStatSak$EventScreen schemeStatSak$EventScreen = SchemeStatSak$EventScreen.SETTINGS_LOGOUT;
        SchemeStatSak$TypeVkConnectNavigationItem.EventType eventType = SchemeStatSak$TypeVkConnectNavigationItem.EventType.ADD_ACCOUNT;
        SchemeStatSak$EventScreen schemeStatSak$EventScreen2 = SchemeStatSak$EventScreen.MULTI_ACC_ADD_ACCOUNT;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((x200) it.next()).a());
        }
        new vmu0(schemeStatSak$EventScreen, eventType, schemeStatSak$EventScreen2, arrayList2).q();
        int i2 = com.vk.auth.logout_menu.b.f1;
        b.C0401b.a(settingsListFragment.getParentFragmentManager());
        settingsListFragment.No().e(settingsListFragment, MultiAccountEntryPoint.SettingsLogout.d);
    }

    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(io.reactivex.rxjava3.core.y yVar) {
        qn60 qn60Var = (qn60) this.b;
        qn60.b[] bVarArr = (qn60.b[]) this.c;
        Object f = qn60Var.f((qn60.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        if (!(f instanceof Result.Failure)) {
            yVar.onSuccess((qn60.c) f);
        }
        Throwable a = Result.a(f);
        if (a != null) {
            yVar.onError(a);
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        ixi ixiVar = (ixi) this.b;
        com.google.firebase.remoteconfig.internal.a aVar = (com.google.firebase.remoteconfig.internal.a) this.c;
        synchronized (ixiVar) {
            ixiVar.c = Tasks.forResult(aVar);
        }
        return Tasks.forResult(aVar);
    }
}
