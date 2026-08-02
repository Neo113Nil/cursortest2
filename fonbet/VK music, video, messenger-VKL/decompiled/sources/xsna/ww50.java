package xsna;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.fragments.impl.support.ParentSupportFragment;
import com.vk.core.preference.Preference;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.navigation.NavigationDelegateActivity;
import com.vkontakte.android.FragmentWrapperActivity;
import com.vkontakte.android.MainActivity;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.oz50;
import xsna.xbs;

/* compiled from: NavigationDelegate.kt */
/* loaded from: classes.dex */
public abstract class ww50<T extends Activity & xbs> {
    public final NavigationDelegateActivity b;
    public final boolean c;
    public final CopyOnWriteArrayList<WeakReference<fcn>> d = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<bkm> e = new CopyOnWriteArrayList<>();
    public final UiTracker.a f;
    public final SharedPreferences g;
    public final String h;
    public final String i;
    public final String j;

    public ww50(NavigationDelegateActivity navigationDelegateActivity, boolean z) {
        this.b = navigationDelegateActivity;
        this.c = z;
        UiTracker uiTracker = UiTracker.a;
        this.f = UiTracker.f(navigationDelegateActivity);
        this.g = Preference.i();
        this.h = qjg.a(navigationDelegateActivity).concat("_opened_fragment_ids");
        this.i = qjg.a(navigationDelegateActivity).concat("_last_opened_root_id");
        this.j = qjg.a(navigationDelegateActivity).concat("_should_open_previous_root");
    }

    public final boolean A() {
        Object obj;
        Iterator<T> it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((WeakReference) obj).get() != null) {
                break;
            }
        }
        return obj != null;
    }

    public boolean B(FragmentImpl fragmentImpl) {
        return false;
    }

    public boolean C() {
        return false;
    }

    public boolean D(FragmentImpl fragmentImpl, boolean z) {
        return false;
    }

    public void H(fcn fcnVar) {
        fju fjuVar = new fju(fcnVar, 13);
        CopyOnWriteArrayList<WeakReference<fcn>> copyOnWriteArrayList = this.d;
        g5g.D(copyOnWriteArrayList, true, fjuVar);
        Iterator<bkm> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().bb(copyOnWriteArrayList.size());
        }
    }

    public boolean I() {
        return false;
    }

    public boolean L(FragmentImpl fragmentImpl) {
        return false;
    }

    public void M(Intent intent) {
        androidx.lifecycle.f u;
        if (this.c || (u = u()) == null || !(u instanceof y760)) {
            return;
        }
        ((y760) u).h9(intent);
    }

    public void S(fcn fcnVar) {
        WeakReference<fcn> weakReference = new WeakReference<>(fcnVar);
        CopyOnWriteArrayList<WeakReference<fcn>> copyOnWriteArrayList = this.d;
        copyOnWriteArrayList.add(weakReference);
        Iterator<T> it = this.e.iterator();
        while (it.hasNext()) {
            ((bkm) it.next()).bb(copyOnWriteArrayList.size());
        }
    }

    public final void Z() {
        fcn z = z();
        if (z == null || !z.v6() || z.N8()) {
            return;
        }
        z.dismiss();
    }

    public boolean a0() {
        return false;
    }

    public final void c0(bkm bkmVar) {
        this.e.remove(bkmVar);
    }

    public final void j(bkm bkmVar) {
        this.e.add(bkmVar);
    }

    public boolean k(FragmentImpl fragmentImpl) {
        return false;
    }

    public void k0(View view) {
        this.b.setContentView(view);
    }

    public final void l0(boolean z) {
        qaj0.c(this.g, this.j, Boolean.valueOf(z));
    }

    public boolean m(boolean z) {
        return false;
    }

    public final void n() {
        CopyOnWriteArrayList<WeakReference<fcn>> copyOnWriteArrayList = this.d;
        Iterator<T> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            fcn fcnVar = (fcn) ((WeakReference) it.next()).get();
            if (fcnVar != null) {
                fcnVar.b(true);
            }
        }
        copyOnWriteArrayList.clear();
        Iterator<T> it2 = this.e.iterator();
        while (it2.hasNext()) {
            ((bkm) it2.next()).bb(0);
        }
    }

    public boolean o(KeyEvent keyEvent) {
        return false;
    }

    public abstract FragmentImpl p(Class<? extends FragmentImpl> cls);

    public boolean q(int i, Intent intent, FragmentImpl fragmentImpl) {
        return false;
    }

    public boolean r(Intent intent) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s(Intent intent) {
        boolean z;
        ComponentName component = intent.getComponent();
        NavigationDelegateActivity navigationDelegateActivity = this.b;
        if (!(navigationDelegateActivity instanceof fuj0)) {
            if (A()) {
                fcn z2 = z();
                if (z2 != null ? z2.M4() : true) {
                    z = true;
                    if (!z) {
                        if (component == null) {
                            Class<?> cls = navigationDelegateActivity.getClass();
                            rsr rsrVar = oz50.k;
                            oz50.b.d();
                            return cls.equals(MainActivity.class);
                        }
                        if (epx.f(component.getPackageName(), navigationDelegateActivity.getPackageName())) {
                            String className = component.getClassName();
                            rsr rsrVar2 = oz50.k;
                            rsr rsrVar3 = oz50.k;
                            if (rsrVar3 == null) {
                                rsrVar3 = null;
                            }
                            rsrVar3.getClass();
                            if (!epx.f(className, FragmentWrapperActivity.class.getCanonicalName())) {
                                String className2 = component.getClassName();
                                oz50.b.d();
                                if (epx.f(className2, MainActivity.class.getCanonicalName())) {
                                }
                            }
                            return true;
                        }
                    }
                }
            }
            z = false;
            if (!z) {
            }
        }
        return false;
    }

    public abstract void t(Class<? extends FragmentImpl> cls, Bundle bundle, boolean z);

    public FragmentImpl u() {
        return (FragmentImpl) ((ParentSupportFragment) this.b.n().a.H("fragment_default_tag"));
    }

    public final fcn v(fcn fcnVar) {
        int i;
        CopyOnWriteArrayList<WeakReference<fcn>> copyOnWriteArrayList = this.d;
        ListIterator<WeakReference<fcn>> listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i = -1;
                break;
            }
            if (epx.f(listIterator.previous().get(), fcnVar)) {
                i = listIterator.nextIndex();
                break;
            }
        }
        if (i > 0) {
            return copyOnWriteArrayList.get(i - 1).get();
        }
        return null;
    }

    public final Integer w() {
        Integer valueOf = Integer.valueOf(this.g.getInt(this.i, -1));
        if (valueOf.intValue() != -1) {
            return valueOf;
        }
        return null;
    }

    public Class<? extends FragmentImpl> x(FragmentImpl fragmentImpl) {
        return null;
    }

    public final int y() {
        int i = 0;
        CopyOnWriteArrayList<WeakReference<fcn>> copyOnWriteArrayList = this.d;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.isEmpty()) {
            return 0;
        }
        Iterator<T> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() != null && (i = i + 1) < 0) {
                e43.s();
                throw null;
            }
        }
        return i;
    }

    public final fcn z() {
        WeakReference<fcn> weakReference;
        CopyOnWriteArrayList<WeakReference<fcn>> copyOnWriteArrayList = this.d;
        ListIterator<WeakReference<fcn>> listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                weakReference = null;
                break;
            }
            weakReference = listIterator.previous();
            if (weakReference.get() != null) {
                break;
            }
        }
        WeakReference<fcn> weakReference2 = weakReference;
        if (weakReference2 != null) {
            return weakReference2.get();
        }
        return null;
    }

    public void G() {
    }

    public void J() {
    }

    public void N() {
    }

    public void Q() {
    }

    public void T() {
    }

    public void U() {
    }

    public void W() {
    }

    public void j0() {
    }

    public void F(Configuration configuration) {
    }

    public void K(Bundle bundle) {
    }

    public void O(Menu menu) {
    }

    public void P(Bundle bundle) {
    }

    public void R(Bundle bundle) {
    }

    public void V(Bundle bundle) {
    }

    public void X(Bundle bundle) {
    }

    public void Y(Bundle bundle) {
    }

    public void b0(Intent intent) {
    }

    public void l(boolean z) {
    }

    public void E(int i, int i2, Intent intent) {
    }
}
