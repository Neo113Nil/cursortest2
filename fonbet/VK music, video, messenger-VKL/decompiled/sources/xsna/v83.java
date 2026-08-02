package xsna;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.vk.im.mediascope.MediaScopeCommand;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import xsna.vhp0;

/* compiled from: AppSectionMediaScopeTracker.kt */
/* loaded from: classes2.dex */
public final class v83 {
    public final Application a;
    public final zx10 b;
    public boolean c;
    public final Set<vhp0.a> d;
    public final Set<vhp0.c> e;

    /* compiled from: AppSectionMediaScopeTracker.kt */
    public static final class a {
        public final FragmentActivity a;
        public final rvu0 b;

        public a(FragmentActivity fragmentActivity, rvu0 rvu0Var) {
            this.a = fragmentActivity;
            this.b = rvu0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "TrackerWithFragment(activity=" + this.a + ", tracker=" + this.b + ')';
        }
    }

    public v83(Application application, wy2 wy2Var, vx10 vx10Var, Set<? extends vhp0> set) {
        this.a = application;
        this.b = new zx10(wy2Var, vx10Var);
        Set<? extends vhp0> set2 = set;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set2) {
            if (obj instanceof vhp0.a) {
                arrayList.add(obj);
            }
        }
        this.d = j5g.S0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : set2) {
            if (obj2 instanceof vhp0.c) {
                arrayList2.add(obj2);
            }
        }
        this.e = j5g.S0(arrayList2);
    }

    public static final boolean a(v83 v83Var, Activity activity) {
        Set<vhp0.a> set = v83Var.d;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            if (((vhp0.a) it.next()).a(activity)) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.registerActivityLifecycleCallbacks(new b());
    }

    /* compiled from: AppSectionMediaScopeTracker.kt */
    public static final class b implements Application.ActivityLifecycleCallbacks {
        public final LinkedHashSet b = new LinkedHashSet();

        public b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            v83 v83Var = v83.this;
            if (!v83.a(v83Var, activity) && (activity instanceof FragmentActivity)) {
                rvu0 rvu0Var = new rvu0(v83Var.b, v83Var.e);
                FragmentActivity fragmentActivity = (FragmentActivity) activity;
                this.b.add(new a(fragmentActivity, rvu0Var));
                fragmentActivity.getSupportFragmentManager().c0(rvu0Var, true);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            if (activity instanceof FragmentActivity) {
                ArrayList arrayList = new ArrayList();
                LinkedHashSet linkedHashSet = this.b;
                for (Object obj : linkedHashSet) {
                    if (epx.f(((a) obj).a, activity)) {
                        arrayList.add(obj);
                    }
                }
                linkedHashSet.removeAll(j5g.S0(arrayList));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((FragmentActivity) activity).getSupportFragmentManager().r0(((a) it.next()).b);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            v83 v83Var = v83.this;
            if (v83.a(v83Var, activity)) {
                v83Var.b.b();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            v83 v83Var = v83.this;
            if (v83.a(v83Var, activity)) {
                zx10 zx10Var = v83Var.b;
                zx10Var.d++;
                if (zx10Var.e) {
                    return;
                }
                zx10Var.h.dispose();
                zx10Var.h = zx10Var.a(MediaScopeCommand.START);
                zx10Var.c.postDelayed(zx10Var.j, 10000L);
                zx10Var.e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
