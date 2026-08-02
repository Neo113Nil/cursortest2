package xsna;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.vk.music.informer.mvi.d;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: VkAppMusicScreenController.kt */
/* loaded from: classes3.dex */
public final class kau0 implements c550 {
    public boolean b;
    public boolean c;
    public boolean d;
    public FragmentManager e;
    public FragmentManager f;
    public Fragment g;
    public final LinkedHashSet a = new LinkedHashSet();
    public final a h = new a();

    /* compiled from: VkAppMusicScreenController.kt */
    public static final class a extends FragmentManager.m {
        public a() {
        }

        @Override // androidx.fragment.app.FragmentManager.m
        public final void b(FragmentManager fragmentManager, Fragment fragment) {
            if (fragment instanceof kjn0) {
                kau0 kau0Var = kau0.this;
                kau0Var.g = fragment;
                kau0Var.f = fragmentManager;
                if (kau0Var.d) {
                    return;
                }
                kau0Var.d = true;
                Iterator it = kau0Var.a.iterator();
                while (it.hasNext()) {
                    ((d550) it.next()).a();
                }
            }
        }

        @Override // androidx.fragment.app.FragmentManager.m
        public final void c(FragmentManager fragmentManager, Fragment fragment) {
            kau0 kau0Var = kau0.this;
            if (fragment == kau0Var.g) {
                kau0Var.g = null;
                kau0Var.f = null;
                if (kau0Var.d) {
                    kau0Var.d = false;
                    Iterator it = kau0Var.a.iterator();
                    while (it.hasNext()) {
                        ((d550) it.next()).c();
                    }
                    kau0Var.f();
                }
            }
        }
    }

    @Override // xsna.c550
    public final void a(FragmentManager fragmentManager) {
        FragmentManager fragmentManager2;
        List<Fragment> f;
        FragmentManager fragmentManager3 = this.e;
        a aVar = this.h;
        if (fragmentManager3 != null && fragmentManager3 != fragmentManager) {
            if (this.d && (fragmentManager2 = this.f) != null && (f = fragmentManager2.c.f()) != null) {
                List<Fragment> list = f;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (((Fragment) it.next()) instanceof kjn0) {
                            break;
                        }
                    }
                }
            }
            FragmentManager fragmentManager4 = this.e;
            if (fragmentManager4 != null) {
                fragmentManager4.r0(aVar);
            }
            e();
            this.c = false;
            f();
        }
        this.e = fragmentManager;
        fragmentManager.c0(aVar, false);
    }

    @Override // xsna.c550
    public final void b(boolean z) {
        FragmentManager fragmentManager;
        this.c = z;
        if (z && this.d && (fragmentManager = this.f) != null) {
            List<Fragment> f = fragmentManager.c.f();
            if (!(f instanceof Collection) || !f.isEmpty()) {
                Iterator<T> it = f.iterator();
                while (it.hasNext()) {
                    if (((Fragment) it.next()) instanceof kjn0) {
                        break;
                    }
                }
            }
            e();
        }
        f();
    }

    @Override // xsna.c550
    public final void c(d.C1325d c1325d) {
        LinkedHashSet linkedHashSet = this.a;
        if (linkedHashSet.isEmpty()) {
            f();
        }
        linkedHashSet.add(c1325d);
        c1325d.b(this.c);
    }

    @Override // xsna.c550
    public final void d(d550 d550Var) {
        this.a.remove(d550Var);
    }

    public final void e() {
        if (this.d) {
            this.d = false;
            this.f = null;
            this.g = null;
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((d550) it.next()).c();
            }
        }
    }

    public final void f() {
        boolean z = this.b;
        boolean z2 = this.c;
        if (z != z2) {
            this.b = z2;
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((d550) it.next()).b(this.c);
            }
        }
    }
}
