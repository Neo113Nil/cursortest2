package defpackage;

import android.view.View;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.core.view.b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.fragment.app.m;
import com.yandex.plus.pay.ui.common.api.ui.view.ProgressView;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class crx0 implements ra50 {
    public final TarifficatorScenarioActivity a;
    public final int b;
    public final FragmentManager c;
    public final m d;
    public final ArrayList e;

    public crx0(TarifficatorScenarioActivity tarifficatorScenarioActivity) {
        int i = aah0.fragment_container;
        FragmentManager supportFragmentManager = tarifficatorScenarioActivity.getSupportFragmentManager();
        m M = supportFragmentManager.M();
        this.a = tarifficatorScenarioActivity;
        this.b = i;
        this.c = supportFragmentManager;
        this.d = M;
        this.e = new ArrayList();
    }

    @Override // defpackage.ra50
    public final void a(alc[] alcVarArr) {
        FragmentManager fragmentManager = this.c;
        fragmentManager.C();
        ArrayList arrayList = this.e;
        arrayList.clear();
        int K = fragmentManager.K();
        if (K > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                arrayList.add(((a) fragmentManager.J(i)).i);
                if (i2 >= K) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        int length = alcVarArr.length;
        int i3 = 0;
        while (i3 < length) {
            alc alcVar = alcVarArr[i3];
            i3++;
            if (alcVar instanceof y0j0) {
                tis0 tis0Var = ((y0j0) alcVar).a;
                if (arrayList.isEmpty()) {
                    b(tis0Var, false);
                } else {
                    fragmentManager.V();
                    arrayList.remove(scc.f(arrayList));
                    b(tis0Var, true);
                }
            } else if (alcVar instanceof ff4) {
                arrayList.clear();
                fragmentManager.W(1, null);
            } else if (alcVar instanceof zd4) {
                if (arrayList.isEmpty()) {
                    this.a.finish();
                } else {
                    fragmentManager.V();
                    arrayList.remove(scc.f(arrayList));
                }
            }
        }
    }

    public final void b(tis0 tis0Var, boolean z) {
        View view;
        String str = (String) tis0Var.c;
        Fragment fragment = (Fragment) ((a9f) tis0Var.w).l(this.d);
        FragmentManager fragmentManager = this.c;
        a h = g8e.h(fragmentManager, fragmentManager);
        h.p = true;
        int i = this.b;
        Fragment E = fragmentManager.E(i);
        ProgressView progressView = (E == null || (view = E.getView()) == null) ? null : (ProgressView) view.findViewWithTag(ProgressView.VIEW_TAG);
        if (progressView == null || progressView.getTransitionName() == null) {
            h.i(lmg0.pay_sdk_fade_in, lmg0.pay_sdk_hold, 0, 0);
        } else {
            String transitionName = progressView.getTransitionName();
            if (ees.e()) {
                WeakHashMap weakHashMap = b.a;
                String g = ViewCompat$Api21Impl.g(progressView);
                if (g == null) {
                    ny61.g("Unique transitionNames are required for all sharedElements");
                    return;
                }
                if (h.n == null) {
                    h.n = new ArrayList();
                    h.o = new ArrayList();
                } else if (h.o.contains(transitionName)) {
                    ny61.g(oyr.p("A shared element with the target name '", transitionName, "' has already been added to the transaction."));
                    return;
                } else if (h.n.contains(g)) {
                    ny61.g(oyr.p("A shared element with the source name '", g, "' has already been added to the transaction."));
                    return;
                }
                h.n.add(g);
                h.o.add(transitionName);
            }
            fragment.setSharedElementEnterTransition(new ekf0());
        }
        if (tis0Var.b) {
            h.h(i, fragment, str);
        } else {
            h.f(i, fragment, str, 1);
        }
        if (z) {
            h.c(str);
            this.e.add(str);
        }
        h.d();
    }
}
