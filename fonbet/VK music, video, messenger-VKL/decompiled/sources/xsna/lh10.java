package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.auth.logout_menu.LogoutItem;
import com.vk.auth.logout_menu.b;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.dto.masks.Mask;
import com.vk.masks.MasksController;
import com.vk.masks.MasksEffectNotAvailableException;
import com.vk.push.common.Logger;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeVkConnectNavigationItem;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.SettingsListFragment;
import io.reactivex.rxjava3.internal.functions.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.text.Regex;
import xsna.dug0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class lh10 implements io.reactivex.rxjava3.functions.l, b680, LogoutItem.a {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lh10(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        io.reactivex.rxjava3.internal.operators.observable.j1 U;
        final MasksController masksController = (MasksController) this.b;
        final Mask mask = (Mask) this.c;
        PrivateFiles privateFiles = masksController.f;
        final String Db = mask.Db();
        final File n = f9t.n(Db);
        if (masksController.i((Mask) obj)) {
            return io.reactivex.rxjava3.core.q.T(dug0.c.a(n));
        }
        Regex regex = com.vk.core.files.a.a;
        vhk0.d(n);
        String str = mask.k;
        if (str == null) {
            return io.reactivex.rxjava3.core.q.H(new MasksEffectNotAvailableException());
        }
        if (mask.v) {
            privateFiles.getClass();
            U = dug0.a(PrivateFiles.e(privateFiles, PrivateSubdir.MASKS, Db + ".jpg", null, 28), str).U(new lh3(n, 24));
        } else {
            privateFiles.getClass();
            U = dug0.a(PrivateFiles.e(privateFiles, PrivateSubdir.MASKS, Db + ".zip", null, 28), str).U(new cfz(n, 2));
        }
        ch10 ch10Var = new ch10(0, masksController, mask);
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        io.reactivex.rxjava3.internal.operators.observable.b0 D = new io.reactivex.rxjava3.internal.operators.observable.c0(U, ch10Var, kVar).D(new io.reactivex.rxjava3.functions.f() { // from class: xsna.dh10
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj2) {
                MasksController.this.d.remove(mask);
            }
        });
        l6r l6rVar = new l6r(1, masksController, mask);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        return new io.reactivex.rxjava3.internal.operators.observable.c0(D, lVar, l6rVar).U(MasksController.r).E(new io.reactivex.rxjava3.functions.f() { // from class: xsna.eh10
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj2) {
                MasksController masksController2 = MasksController.this;
                Mask mask2 = mask;
                String str2 = Db;
                if (((dug0.c) obj2).c()) {
                    hi10 hi10Var = masksController2.c;
                    int o = f9t.o(str2);
                    synchronized (hi10Var) {
                        try {
                            int d = hi10Var.d(mask2);
                            String Db2 = mask2.Db();
                            if (d >= 0) {
                                if (mask2.u) {
                                    hi10Var.a.set(d, mask2.Ab());
                                }
                                hi10Var.c.put(Db2, Integer.valueOf(o));
                                hi10Var.b.put(Db2, Long.valueOf(System.currentTimeMillis()));
                            } else {
                                hi10Var.a.add(0, mask2.Ab());
                                hi10Var.c.put(Db2, Integer.valueOf(o));
                                hi10Var.b.put(Db2, Long.valueOf(System.currentTimeMillis()));
                                if (hi10Var.a.size() > 6) {
                                    hi10Var.b((Mask) hi10Var.a.get(r0.size() - 1));
                                }
                            }
                            hi10Var.c();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        }, lVar, kVar, kVar).F(new io.reactivex.rxjava3.functions.f() { // from class: xsna.gh10
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj2) {
                hi10 hi10Var = MasksController.this.c;
                hi10Var.b(mask);
                hi10Var.c();
                Regex regex2 = com.vk.core.files.a.a;
                vhk0.d(n);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.auth.logout_menu.LogoutItem.a
    public void invoke() {
        ArrayList arrayList = (ArrayList) this.b;
        SettingsListFragment settingsListFragment = (SettingsListFragment) this.c;
        int i = SettingsListFragment.X0;
        SchemeStatSak$EventScreen schemeStatSak$EventScreen = SchemeStatSak$EventScreen.SETTINGS_LOGOUT;
        SchemeStatSak$TypeVkConnectNavigationItem.EventType eventType = SchemeStatSak$TypeVkConnectNavigationItem.EventType.SETTINGS_LOGOUT_SUCCESS;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((x200) it.next()).a());
        }
        new vmu0(schemeStatSak$EventScreen, eventType, null, arrayList2).q();
        int i2 = com.vk.auth.logout_menu.b.f1;
        b.C0401b.a(settingsListFragment.getParentFragmentManager());
        FragmentActivity activity = settingsListFragment.getActivity();
        if (activity == null) {
            return;
        }
        com.vk.core.view.components.spinner.c cVar = new com.vk.core.view.components.spinner.c(activity);
        cVar.n(activity.getResources().getString(R.string.loading));
        cVar.setCancelable(false);
        cVar.show();
        io.reactivex.rxjava3.internal.operators.observable.s0 s0Var = new io.reactivex.rxjava3.internal.operators.observable.s0(new SettingsListFragment.d((mui0) settingsListFragment.O0.getValue()));
        asu0.a.getClass();
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = s0Var.r0(asu0.w()).a0(io.reactivex.rxjava3.android.schedulers.a.b());
        SettingsListFragment.e eVar = new SettingsListFragment.e(activity, cVar);
        int i3 = kwg0.a;
        itg0.a(activity, a0.subscribe(eVar, new hwg0()));
    }

    @Override // xsna.b680
    public void onFailure(Throwable th) {
        jrg0 jrg0Var = (jrg0) this.b;
        y310 y310Var = (y310) this.c;
        Logger.DefaultImpls.debug$default(jrg0Var.b, ms9.b("Error pushes ", th), null, 2, null);
        y310Var.invoke(Boolean.FALSE);
    }
}
