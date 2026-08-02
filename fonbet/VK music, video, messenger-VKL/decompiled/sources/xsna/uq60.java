package xsna;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.vk.ads.di.NewsfeedOptionalAdsComponent;
import com.vk.core.fragments.FragmentImpl;
import java.lang.ref.WeakReference;
import kotlin.Lazy;
import xsna.c63;
import xsna.ui90;
import xsna.xn60;

/* compiled from: NewsfeedListLifecycleController.kt */
/* loaded from: classes4.dex */
public final class uq60 {
    public final fo60 a;
    public final WeakReference<FragmentImpl> b;
    public final Lazy c;
    public final Lazy d;
    public boolean e;
    public boolean f;
    public final b g = new b(this);
    public xn60.c.InterfaceC4025c h;

    /* compiled from: NewsfeedListLifecycleController.kt */
    public static final class a extends c63.b {
        public final WeakReference<Activity> b;
        public final WeakReference<fo60> c;

        public a(FragmentActivity fragmentActivity, fo60 fo60Var) {
            this.b = new WeakReference<>(fragmentActivity);
            this.c = new WeakReference<>(fo60Var);
        }

        public final void D(Activity activity, xn60 xn60Var) {
            fo60 fo60Var;
            if (this.b.get() != activity || (fo60Var = this.c.get()) == null) {
                return;
            }
            fo60Var.a(xn60Var);
        }

        @Override // xsna.c63.b
        public final void n(Activity activity) {
            D(activity, co60.b);
        }

        @Override // xsna.c63.b
        public final void o(Activity activity) {
            if (!(activity instanceof y1r)) {
                D(activity, do60.b);
                return;
            }
            fo60 fo60Var = this.c.get();
            if (fo60Var != null) {
                fo60Var.a(xn60.c.b.a.b);
            }
        }

        @Override // xsna.c63.b
        public final void p(Activity activity) {
            if (!(activity instanceof y1r)) {
                D(activity, eo60.b);
                return;
            }
            fo60 fo60Var = this.c.get();
            if (fo60Var != null) {
                fo60Var.a(xn60.c.b.C4023b.b);
            }
        }
    }

    /* compiled from: NewsfeedListLifecycleController.kt */
    public static final class b implements ui90.a {
        public final WeakReference<uq60> a;

        public b(uq60 uq60Var) {
            this.a = new WeakReference<>(uq60Var);
        }

        @Override // xsna.ui90.a
        public final void b(FragmentImpl fragmentImpl, FragmentImpl fragmentImpl2) {
            uq60 uq60Var = this.a.get();
            if (uq60Var != null) {
                uq60Var.f();
            }
        }
    }

    public uq60(FragmentImpl fragmentImpl, fo60 fo60Var, Lazy<? extends NewsfeedOptionalAdsComponent> lazy, Lazy<hv50> lazy2) {
        mbs mbsVar;
        this.a = fo60Var;
        this.b = new WeakReference<>(fragmentImpl);
        this.c = lazy;
        this.d = lazy2;
        FragmentImpl a2 = a();
        if (a2 == null || (mbsVar = a2.D) == null) {
            return;
        }
        mbsVar.a(new c(this));
    }

    public final FragmentImpl a() {
        return this.b.get();
    }

    public final void b() {
        f();
        xn60.c.InterfaceC4025c interfaceC4025c = this.h;
        if (interfaceC4025c != null) {
            this.a.a(interfaceC4025c);
        }
    }

    public final void c() {
        vbs Ln;
        com.vk.core.fragments.a aVar;
        f();
        FragmentImpl a2 = a();
        if (a2 != null && (Ln = a2.Ln()) != null && (aVar = Ln.h) != null) {
            aVar.u(this.g);
        }
        ((NewsfeedOptionalAdsComponent) this.c.getValue()).la();
        ((NewsfeedOptionalAdsComponent) ((hv50) this.d.getValue()).c.getValue()).Sc();
        this.a.a(xn60.c.a.b.b);
    }

    public final void d() {
        f();
        this.a.a(xn60.c.a.C4022c.b);
    }

    public final void e() {
        f();
        this.a.a(xn60.c.a.d.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (r0 == true) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f() {
        boolean z;
        boolean z2;
        FragmentImpl a2;
        boolean z3;
        ww50 v;
        FragmentImpl a3 = a();
        boolean z4 = true;
        if (a3 != null) {
            FragmentActivity activity = a3.getActivity();
            if (activity == null || (v = s200.v(activity)) == null) {
                z3 = false;
            } else {
                Fragment parentFragment = a3.getParentFragment();
                FragmentImpl fragmentImpl = parentFragment instanceof FragmentImpl ? (FragmentImpl) parentFragment : null;
                z3 = fragmentImpl != null ? v.B(fragmentImpl) : v.B(a3);
            }
            if (z3) {
                z = true;
                z2 = this.e;
                fo60 fo60Var = this.a;
                if (z != z2) {
                    this.e = z;
                    fo60Var.a(new xn60.c.b.f(z));
                }
                a2 = a();
                if (a2 != null) {
                    boolean z5 = a2.getParentFragment() != null ? false : false;
                }
                z4 = false;
                if (z4 == this.f) {
                    this.f = z4;
                    fo60Var.a(new xn60.c.b.e(z4));
                    return;
                }
                return;
            }
        }
        z = false;
        z2 = this.e;
        fo60 fo60Var2 = this.a;
        if (z != z2) {
        }
        a2 = a();
        if (a2 != null) {
        }
        z4 = false;
        if (z4 == this.f) {
        }
    }

    public final void g() {
        FragmentImpl a2 = a();
        if (a2 == null || !a2.isAdded()) {
            this.h = xn60.c.InterfaceC4025c.a.b;
        } else {
            this.a.a(xn60.c.InterfaceC4025c.a.b);
            f();
        }
    }

    public final void h() {
        FragmentImpl a2 = a();
        if (a2 == null || !a2.isAdded()) {
            this.h = xn60.c.InterfaceC4025c.b.b;
        } else {
            this.a.a(xn60.c.InterfaceC4025c.b.b);
            f();
        }
    }

    public final void i() {
        vbs Ln;
        com.vk.core.fragments.a aVar;
        f();
        FragmentImpl a2 = a();
        if (a2 == null || (Ln = a2.Ln()) == null || (aVar = Ln.h) == null) {
            return;
        }
        aVar.z(this.g);
    }

    /* compiled from: NewsfeedListLifecycleController.kt */
    public static final class c implements obs {
        public final WeakReference<uq60> b;
        public a c;

        public c(uq60 uq60Var) {
            this.b = new WeakReference<>(uq60Var);
        }

        @Override // xsna.obs
        public final void onCreate(Bundle bundle) {
            FragmentActivity activity;
            uq60 uq60Var = this.b.get();
            if (uq60Var == null) {
                return;
            }
            fo60 fo60Var = uq60Var.a;
            FragmentImpl a = uq60Var.a();
            if (a == null || (activity = a.getActivity()) == null) {
                return;
            }
            a aVar = new a(activity, fo60Var);
            this.c = aVar;
            c63 c63Var = c63.a;
            c63.a(aVar);
            fo60Var.a(xn60.c.a.C4021a.b);
            uq60Var.f();
        }

        @Override // xsna.obs
        public final void onDestroy() {
            mbs mbsVar;
            uq60 uq60Var = this.b.get();
            if (uq60Var == null) {
                return;
            }
            FragmentImpl a = uq60Var.a();
            if (a != null && (mbsVar = a.D) != null) {
                mbsVar.d(this);
            }
            a aVar = this.c;
            if (aVar != null) {
                c63 c63Var = c63.a;
                c63.c(aVar);
            }
            this.c = null;
        }

        @Override // xsna.obs
        public final void b() {
        }

        @Override // xsna.obs
        public final void c() {
        }

        @Override // xsna.obs
        public final void onDestroyView() {
        }

        @Override // xsna.obs
        public final void onPause() {
        }

        @Override // xsna.obs
        public final void onResume() {
        }

        @Override // xsna.obs
        public final void onStop() {
        }

        @Override // xsna.obs
        public final void onConfigurationChanged(Configuration configuration) {
        }

        @Override // xsna.obs
        public final void onActivityResult(int i, int i2, Intent intent) {
        }
    }
}
