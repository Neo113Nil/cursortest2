package xsna;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.vk.core.view.FitSystemWindowsFrameLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.collections.EmptyList;
import xsna.iut0;

/* compiled from: KeyboardAnimator.kt */
/* loaded from: classes2.dex */
public interface wey {

    /* compiled from: KeyboardAnimator.kt */
    public static final class b implements wey {
        public boolean a;
        public boolean b;
        public boolean c;

        public static FitSystemWindowsFrameLayout h(View view) {
            ViewParent parent = view.getParent();
            while (parent != null && !(parent instanceof FitSystemWindowsFrameLayout)) {
                parent = parent.getParent();
            }
            if (parent instanceof FitSystemWindowsFrameLayout) {
                return (FitSystemWindowsFrameLayout) parent;
            }
            return null;
        }

        @Override // xsna.wey
        public final void a(View view) {
            FitSystemWindowsFrameLayout i = i(view);
            boolean z = this.a;
            if (i != null) {
                z = i.getFitsSystemWindows();
            }
            this.a = z;
            FitSystemWindowsFrameLayout h = h(view);
            boolean z2 = this.b;
            if (h != null) {
                z2 = h.getFitsSystemWindows();
            }
            this.b = z2;
            FitSystemWindowsFrameLayout e = e(view);
            boolean z3 = this.c;
            if (e != null) {
                z3 = e.getFitsSystemWindows();
            }
            this.c = z3;
        }

        @Override // xsna.wey
        public final void b(View view) {
            FitSystemWindowsFrameLayout h = h(view);
            if (h != null) {
                this.b = h.getFitsSystemWindows();
            }
            Iterator<T> it = g(view).iterator();
            while (it.hasNext()) {
                ((FitSystemWindowsFrameLayout) it.next()).a(true);
            }
            FitSystemWindowsFrameLayout e = e(view);
            boolean z = this.c;
            if (e != null) {
                e.setFitsSystemWindows(z);
            }
        }

        @Override // xsna.wey
        public final void c(View view) {
            f4m.u(view, 0, 0, 0, 0);
        }

        @Override // xsna.wey
        public final void d(View view) {
            f4m.u(view, 0, 0, 0, 0);
            for (FitSystemWindowsFrameLayout fitSystemWindowsFrameLayout : g(view)) {
                fitSystemWindowsFrameLayout.setFitsSystemWindows(false);
                WeakReference<FitSystemWindowsFrameLayout> weakReference = FitSystemWindowsFrameLayout.a.a;
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                iut0.d.c(fitSystemWindowsFrameLayout, null);
                fitSystemWindowsFrameLayout.setSystemUiVisibility(0);
            }
        }

        @Override // xsna.wey
        public final FitSystemWindowsFrameLayout e(View view) {
            FitSystemWindowsFrameLayout h = h(view);
            ViewParent parent = h != null ? h.getParent() : null;
            if (parent instanceof FitSystemWindowsFrameLayout) {
                return (FitSystemWindowsFrameLayout) parent;
            }
            return null;
        }

        @Override // xsna.wey
        public final void f(View view) {
            FitSystemWindowsFrameLayout h = h(view);
            boolean z = this.b;
            if (h != null) {
                h.setFitsSystemWindows(z);
            }
            FitSystemWindowsFrameLayout i = i(view);
            boolean z2 = this.a;
            if (i != null) {
                i.setFitsSystemWindows(z2);
            }
            FitSystemWindowsFrameLayout e = e(view);
            boolean z3 = this.c;
            if (e != null) {
                e.setFitsSystemWindows(z3);
            }
        }

        public final List<FitSystemWindowsFrameLayout> g(View view) {
            FitSystemWindowsFrameLayout e = e(view);
            if (e != null) {
                ArrayList o = e43.o(e);
                int childCount = e.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = e.getChildAt(i);
                    if (childAt instanceof FitSystemWindowsFrameLayout) {
                        o.add(childAt);
                    }
                }
                List<FitSystemWindowsFrameLayout> O0 = j5g.O0(o);
                if (O0 != null) {
                    return O0;
                }
            }
            return EmptyList.b;
        }

        public final FitSystemWindowsFrameLayout i(View view) {
            View view2;
            FitSystemWindowsFrameLayout e = e(view);
            if (e != null) {
                kxt0 kxt0Var = new kxt0(e);
                View view3 = null;
                while (kxt0Var.hasNext()) {
                    View next = kxt0Var.next();
                    if (next instanceof FitSystemWindowsFrameLayout) {
                        view3 = next;
                    }
                }
                view2 = view3;
            } else {
                view2 = null;
            }
            if (view2 instanceof FitSystemWindowsFrameLayout) {
                return (FitSystemWindowsFrameLayout) view2;
            }
            return null;
        }

        public final String toString() {
            return "fragmentWrapper = " + this.a + "; fragmentContainer = " + this.b + "; animContainer = " + this.c;
        }
    }

    void b(View view);

    void c(View view);

    default void d(View view) {
        c(view);
    }

    FitSystemWindowsFrameLayout e(View view);

    /* compiled from: KeyboardAnimator.kt */
    public static final class a implements wey {
        public static final a a = new a();

        @Override // xsna.wey
        public final FitSystemWindowsFrameLayout e(View view) {
            return null;
        }

        @Override // xsna.wey
        public final void a(View view) {
        }

        @Override // xsna.wey
        public final void b(View view) {
        }

        @Override // xsna.wey
        public final void c(View view) {
        }

        @Override // xsna.wey
        public final void d(View view) {
        }

        @Override // xsna.wey
        public final void f(View view) {
        }
    }

    /* compiled from: KeyboardAnimator.kt */
    public static final class c implements wey {
        @Override // xsna.wey
        public final void b(View view) {
            FitSystemWindowsFrameLayout e = e(view);
            if (e != null) {
                e.a(true);
            }
        }

        @Override // xsna.wey
        public final void c(View view) {
            ViewParent parent = view.getParent();
            FrameLayout frameLayout = parent instanceof FrameLayout ? (FrameLayout) parent : null;
            if (frameLayout != null) {
                f4m.u(frameLayout, 0, 0, 0, 0);
            }
        }

        @Override // xsna.wey
        public final void d(View view) {
            c(view);
            FitSystemWindowsFrameLayout e = e(view);
            if (e != null) {
                e.setFitsSystemWindows(false);
                WeakReference<FitSystemWindowsFrameLayout> weakReference = FitSystemWindowsFrameLayout.a.a;
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                iut0.d.c(e, null);
                e.setSystemUiVisibility(0);
            }
        }

        @Override // xsna.wey
        public final FitSystemWindowsFrameLayout e(View view) {
            ViewParent parent = view.getParent();
            while (parent != null && !(parent instanceof FitSystemWindowsFrameLayout)) {
                parent = parent.getParent();
            }
            if (parent instanceof FitSystemWindowsFrameLayout) {
                return (FitSystemWindowsFrameLayout) parent;
            }
            return null;
        }

        @Override // xsna.wey
        public final void a(View view) {
        }

        @Override // xsna.wey
        public final void f(View view) {
        }
    }

    default void a(View view) {
    }

    default void f(View view) {
    }
}
