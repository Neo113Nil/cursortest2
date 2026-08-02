package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class o {
    public final FragmentManager a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();

    public o(FragmentManager fragmentManager) {
        this.a = fragmentManager;
    }

    public final void a(Fragment fragment, Bundle bundle, boolean z) {
        FragmentManager fragmentManager = this.a;
        Fragment fragment2 = fragmentManager.z;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().p.a(fragment, bundle, true);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            if (!z || nVar.b()) {
                nVar.a().onFragmentActivityCreated(fragmentManager, fragment, bundle);
            }
        }
    }

    public final void b(Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.a;
        FragmentActivity fragmentActivity = fragmentManager.x.b;
        Fragment fragment2 = fragmentManager.z;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().p.b(fragment, true);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            if (!z || nVar.b()) {
                nVar.a().onFragmentAttached(fragmentManager, fragment, fragmentActivity);
            }
        }
    }

    public final void c(Fragment fragment, Bundle bundle, boolean z) {
        FragmentManager fragmentManager = this.a;
        Fragment fragment2 = fragmentManager.z;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().p.c(fragment, bundle, true);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            if (!z || nVar.b()) {
                nVar.a().onFragmentCreated(fragmentManager, fragment, bundle);
            }
        }
    }

    public final void d(Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.a;
        Fragment fragment2 = fragmentManager.z;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().p.d(fragment, true);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            if (!z || nVar.b()) {
                nVar.a().onFragmentDestroyed(fragmentManager, fragment);
            }
        }
    }

    public final void e(Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.a;
        Fragment fragment2 = fragmentManager.z;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().p.e(fragment, true);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            if (!z || nVar.b()) {
                nVar.a().onFragmentDetached(fragmentManager, fragment);
            }
        }
    }

    public final void f(Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.a;
        Fragment fragment2 = fragmentManager.z;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().p.f(fragment, true);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            if (!z || nVar.b()) {
                nVar.a().onFragmentPaused(fragmentManager, fragment);
            }
        }
    }

    public final void g(Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.a;
        FragmentActivity fragmentActivity = fragmentManager.x.b;
        Fragment fragment2 = fragmentManager.z;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().p.g(fragment, true);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            if (!z || nVar.b()) {
                nVar.a().onFragmentPreAttached(fragmentManager, fragment, fragmentActivity);
            }
        }
    }

    public final void h(Fragment fragment, Bundle bundle, boolean z) {
        FragmentManager fragmentManager = this.a;
        Fragment fragment2 = fragmentManager.z;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().p.h(fragment, bundle, true);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            if (!z || nVar.b()) {
                nVar.a().onFragmentPreCreated(fragmentManager, fragment, bundle);
            }
        }
    }

    public final void i(Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.a;
        Fragment fragment2 = fragmentManager.z;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().p.i(fragment, true);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            if (!z || nVar.b()) {
                nVar.a().onFragmentResumed(fragmentManager, fragment);
            }
        }
    }

    public final void j(Fragment fragment, Bundle bundle, boolean z) {
        FragmentManager fragmentManager = this.a;
        Fragment fragment2 = fragmentManager.z;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().p.j(fragment, bundle, true);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            if (!z || nVar.b()) {
                nVar.a().onFragmentSaveInstanceState(fragmentManager, fragment, bundle);
            }
        }
    }

    public final void k(Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.a;
        Fragment fragment2 = fragmentManager.z;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().p.k(fragment, true);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            if (!z || nVar.b()) {
                nVar.a().onFragmentStarted(fragmentManager, fragment);
            }
        }
    }

    public final void l(Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.a;
        Fragment fragment2 = fragmentManager.z;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().p.l(fragment, true);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            if (!z || nVar.b()) {
                nVar.a().onFragmentStopped(fragmentManager, fragment);
            }
        }
    }

    public final void m(Fragment fragment, View view, Bundle bundle, boolean z) {
        FragmentManager fragmentManager = this.a;
        Fragment fragment2 = fragmentManager.z;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().p.m(fragment, view, bundle, true);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            if (!z || nVar.b()) {
                nVar.a().onFragmentViewCreated(fragmentManager, fragment, view, bundle);
            }
        }
    }

    public final void n(Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.a;
        Fragment fragment2 = fragmentManager.z;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().p.n(fragment, true);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            if (!z || nVar.b()) {
                nVar.a().onFragmentViewDestroyed(fragmentManager, fragment);
            }
        }
    }
}
