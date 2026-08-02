package xsna;

import android.os.IInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.health.platform.client.permission.Permission;
import androidx.health.platform.client.request.RequestContext;
import androidx.preference.Preference;
import com.vk.log.L;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import xsna.h8z0;
import xsna.hjz0;
import xsna.r100;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class yqg0 implements b680, ivf0, Preference.b, io.reactivex.rxjava3.core.a0, h8z0.b {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yqg0(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        SettingsGeneralFragment settingsGeneralFragment = (SettingsGeneralFragment) this.b;
        v5k0 v5k0Var = (v5k0) this.c;
        FragmentActivity activity = settingsGeneralFragment.getActivity();
        if (activity == null) {
            return false;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        v5k0Var.a = true;
        b68.l("settings", booleanValue);
        b68.k(activity, false);
        return true;
    }

    @Override // xsna.h8z0.b
    public void a() {
        igz0 igz0Var = (igz0) this.b;
        tez0 tez0Var = (tez0) this.c;
        hjz0.a aVar = igz0Var.a;
        String str = tez0Var.F;
        yil0.d(aVar);
    }

    @Override // xsna.b680
    public void onFailure(Throwable th) {
        arg0 arg0Var = (arg0) this.b;
        io.reactivex.rxjava3.core.y yVar = (io.reactivex.rxjava3.core.y) this.c;
        L.l("InAppReview", fo8.a(arg0Var.f, ": Request review flow completed with error"), mnh0.A(new r100.a("InAppReviewException", th)));
        yVar.onError(th);
    }

    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(io.reactivex.rxjava3.core.y yVar) {
        e5y0 e5y0Var = (e5y0) this.b;
        e5y0Var.b((gv50) this.c, new qg(12, e5y0Var, yVar), new z4t0(yVar, 18));
    }

    @Override // xsna.ivf0
    public void a(IInterface iInterface, lzi0 lzi0Var) {
        ioi0 ioi0Var = (ioi0) this.b;
        Set set = (Set) this.c;
        gnv gnvVar = (gnv) iInterface;
        RequestContext c = ioi0Var.c();
        Set set2 = set;
        ArrayList arrayList = new ArrayList(c5g.u(set2, 10));
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            arrayList.add(new Permission((androidx.health.platform.client.proto.m0) it.next()));
        }
        gnvVar.s(c, j5g.O0(arrayList), new rcr(lzi0Var));
    }
}
