package xsna;

import android.app.Dialog;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.log.L;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeNavgo;
import java.lang.ref.WeakReference;
import kotlin.NoWhenBranchMatchedException;
import xsna.uzp0;

/* compiled from: UiTrackingListener.kt */
/* loaded from: classes.dex */
public final class l1q0 {
    public final uzp0 a;
    public boolean b;
    public boolean c;
    public boolean d;

    public l1q0(uzp0 uzp0Var) {
        this.a = uzp0Var;
    }

    public static UiTrackingScreen a(boolean z) {
        m0q0 m0q0Var;
        UiTrackingScreen uiTrackingScreen = UiTracker.j.b;
        if (uiTrackingScreen == null) {
            return UiTrackingScreen.Companion.b(UiTrackingScreen.j);
        }
        if (uiTrackingScreen.d()) {
            uiTrackingScreen = UiTrackingScreen.b(uiTrackingScreen, null, UiTrackingScreen.Companion.DialogType.DIALOG_MODAL_SOURCE, 7);
        }
        UiTrackingScreen b = z ? UiTrackingScreen.b(uiTrackingScreen, null, null, 11) : UiTrackingScreen.b(uiTrackingScreen, null, null, 15);
        WeakReference<m0q0> weakReference = b.c;
        if (weakReference != null && (m0q0Var = weakReference.get()) != null) {
            m0q0Var.y(b);
        }
        return b;
    }

    public static boolean b() {
        return UiTracker.j.b != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean d(Fragment fragment) {
        if (!(fragment instanceof o0q0)) {
            UiTracker uiTracker = UiTracker.a;
            return UiTracker.e().k(fragment);
        }
        o0q0 o0q0Var = (o0q0) fragment;
        Fragment uiTrackingFragment = o0q0Var.getUiTrackingFragment();
        if (epx.f(fragment, uiTrackingFragment)) {
            return o0q0Var.getUiTrackingFragment() == null;
        }
        if (uiTrackingFragment != null) {
            return d(uiTrackingFragment);
        }
        return true;
    }

    public final boolean c() {
        if (!this.a.a.f()) {
            return false;
        }
        UiTracker uiTracker = UiTracker.a;
        return UiTracker.e().m() > 0;
    }

    public final void e(UiTrackingScreen uiTrackingScreen, UiTrackingScreen uiTrackingScreen2, boolean z) {
        com.vk.core.ui.tracking.b e;
        w0q0 w0q0Var;
        l0q0 l0q0Var;
        UiTracker uiTracker = UiTracker.a;
        t1q0 t1q0Var = UiTracker.j;
        UiTrackingScreen uiTrackingScreen3 = t1q0Var.b;
        if (!epx.f(uiTrackingScreen3, uiTrackingScreen)) {
            L.p("Replace current=" + uiTrackingScreen3 + " screen to " + uiTrackingScreen + ". Look on it!");
        }
        if (uiTrackingScreen.c(uiTrackingScreen2)) {
            return;
        }
        t1q0Var.d(uiTrackingScreen2, z);
        boolean z2 = this.d;
        uzp0 uzp0Var = this.a;
        n1q0 n1q0Var = uzp0Var.g;
        n1q0Var.getClass();
        if (uiTrackingScreen.e() || uiTrackingScreen2.e()) {
            L.G("UiTracker: (missed screen): " + uiTrackingScreen + " -> " + uiTrackingScreen2 + ", forward=" + z);
            if (uiTrackingScreen2.e() && n1q0Var.a != null && (e = UiTracker.e()) != null) {
                e.b(uiTrackingScreen, uiTrackingScreen2);
            }
        } else {
            L.e("UiTracker: " + uiTrackingScreen + " -> " + uiTrackingScreen2 + ", forward=" + z);
        }
        hy6 hy6Var = uzp0Var.i;
        if (hy6Var != null && (l0q0Var = (l0q0) hy6Var.c) != null) {
            l0q0Var.a(uiTrackingScreen, uiTrackingScreen2);
        }
        uzp0Var.e = null;
        if (!uzp0Var.c(uiTrackingScreen2) && (((w0q0Var = UiTracker.f) == null || !w0q0Var.a.b) && (uzp0Var.d || !uiTrackingScreen2.e()))) {
            if (uzp0Var.c != uzp0.b.WAIT_FOR_VALID_SCREEN) {
                iy50 iy50Var = new iy50(uzp0Var.a);
                iy50Var.K(uiTrackingScreen.f());
                iy50Var.E(uiTrackingScreen2.f());
                if (z2) {
                    iy50Var.G();
                }
                SchemeStat$TypeNavgo.Cause cause = uiTrackingScreen.i;
                if (cause != null) {
                    iy50Var.H(cause);
                }
                int i = uzp0.c.$EnumSwitchMapping$0[uzp0Var.b.ordinal()];
                if (i == 1) {
                    iy50Var.C();
                } else if (i == 2) {
                    iy50Var.D();
                } else if (i == 3) {
                    iy50Var.B();
                } else if (i == 4) {
                    L.G("UiTracker", "Can't handle GO event, app is not started");
                } else {
                    if (i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iy50Var.y(z);
                }
                iy50Var.q();
                uzp0Var.b(uiTrackingScreen, uiTrackingScreen2);
                uzp0Var.d = true;
                uzp0Var.b = uzp0.a.APP_START;
            } else if (uzp0Var.d(uiTrackingScreen2)) {
                uzp0Var.c = uzp0.b.SHOWN;
                uzp0Var.d = true;
                uzp0Var.b = uzp0.a.APP_START;
            }
        }
        this.d = false;
    }

    public final void f(UiTrackingScreen uiTrackingScreen, boolean z) {
        if (b()) {
            e(a(false), uiTrackingScreen, z);
        }
    }

    public final void g() {
        UiTrackingScreen c;
        if (c() && b() && (c = UiTracker.j.c()) != null) {
            f(c, false);
        }
    }

    public final void h(Dialog dialog, boolean z) {
        if (c()) {
            UiTracker uiTracker = UiTracker.a;
            if (UiTracker.e().i(dialog) && z) {
                return;
            }
            if (!z) {
                g();
            } else {
                a2q0.a.getClass();
                f(UiTracker.e().d(dialog), true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(Fragment fragment, Fragment fragment2, boolean z) {
        if (c()) {
            boolean z2 = this.b;
            boolean z3 = false;
            this.b = false;
            if (z2) {
                return;
            }
            if (d(fragment2)) {
                if (fragment == 0) {
                    L.G("UiTrackingListener", "from screen is null, investigate it");
                    return;
                }
                a2q0.a.getClass();
                UiTrackingScreen c = a2q0.c(fragment);
                t1q0 t1q0Var = UiTracker.j;
                UiTrackingScreen uiTrackingScreen = t1q0Var.b;
                if (uiTrackingScreen != null) {
                    if (a2q0.c(fragment2).c(uiTrackingScreen) && z) {
                        z3 = true;
                    }
                    boolean d = uiTrackingScreen.d();
                    if (c.c(uiTrackingScreen) || d || z3) {
                        return;
                    }
                    t1q0Var.e(c);
                    return;
                }
                return;
            }
            if ((fragment instanceof p0q0) || this.c) {
                a2q0.a.getClass();
                f(a2q0.c(fragment2), z);
                this.c = false;
                return;
            }
            if (fragment == 0 && !b()) {
                a2q0.a.getClass();
                e(UiTrackingScreen.Companion.b(UiTrackingScreen.j), a2q0.c(fragment2), true);
                return;
            }
            a2q0.a.getClass();
            UiTrackingScreen c2 = a2q0.c(fragment2);
            UiTrackingScreen uiTrackingScreen2 = null;
            o0q0 o0q0Var = fragment instanceof o0q0 ? (o0q0) fragment : null;
            Fragment uiTrackingFragment = o0q0Var != null ? o0q0Var.getUiTrackingFragment() : null;
            t1q0 t1q0Var2 = UiTracker.j;
            UiTrackingScreen uiTrackingScreen3 = t1q0Var2.b;
            if (uiTrackingScreen3 != null && (uiTrackingScreen3.d == UiTrackingScreen.Companion.DialogType.DIALOG_ALERT || uiTrackingScreen3.d())) {
                uiTrackingScreen2 = a(false);
            } else if (fragment != 0 && !d(fragment)) {
                uiTrackingScreen2 = a2q0.c(fragment);
            } else if (uiTrackingFragment != null && !d(uiTrackingFragment)) {
                uiTrackingScreen2 = a2q0.c(uiTrackingFragment);
            } else if (b()) {
                Fragment parentFragment = fragment2.getParentFragment();
                UiTrackingScreen uiTrackingScreen4 = t1q0Var2.b;
                if (fragment == 0 && uiTrackingScreen4 != null && !uiTrackingScreen4.e() && parentFragment != null && d(parentFragment)) {
                    z3 = true;
                }
                uiTrackingScreen2 = a(z3);
            }
            if (uiTrackingScreen2 != null) {
                if (uiTrackingScreen2.h) {
                    t1q0Var2.e(uiTrackingScreen2);
                }
                if (c2.h && uiTrackingScreen2.h) {
                    e(uiTrackingScreen2, c2, z);
                }
            }
        }
    }

    public final void j(UiTrackingScreen uiTrackingScreen, boolean z) {
        if (c()) {
            f(uiTrackingScreen, z);
        }
    }

    public final void k(m0q0 m0q0Var, m0q0 m0q0Var2, boolean z) {
        if (c()) {
            boolean z2 = this.b;
            this.b = false;
            if (z2) {
                return;
            }
            a2q0.a.getClass();
            UiTrackingScreen d = a2q0.d(m0q0Var2);
            UiTrackingScreen d2 = m0q0Var != null ? a2q0.d(m0q0Var) : b() ? a(false) : null;
            if (d.h) {
                if ((d2 == null || d2.h) && d2 != null) {
                    e(d2, d, z);
                }
            }
        }
    }

    public final void l(View view, View view2, boolean z) {
        if (c()) {
            UiTracker uiTracker = UiTracker.a;
            if (UiTracker.e().j(view2)) {
                return;
            }
            boolean z2 = this.b;
            this.b = false;
            if (z2) {
                return;
            }
            a2q0.a.getClass();
            Fragment a = a2q0.a(view2);
            if (a == null || !d(a)) {
                UiTrackingScreen b = view != null ? a2q0.b(view) : b() ? UiTracker.j.b : null;
                UiTrackingScreen b2 = a2q0.b(view2);
                if (b == null || b2.a == MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE) {
                    return;
                }
                e(b, b2, z);
            }
        }
    }
}
