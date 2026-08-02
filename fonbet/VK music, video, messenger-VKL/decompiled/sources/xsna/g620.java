package xsna;

import android.view.View;
import com.vk.core.apps.BuildInfo;
import com.vkontakte.android.R;
import com.vkontakte.android.data.FriendsUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: MenuCountersState.java */
/* loaded from: classes11.dex */
public final class g620 implements wsj {
    public static volatile ca70 A;
    public static volatile lxw B;
    public static volatile mxw C;
    public static final Object D = new Object();
    public static bpn0 E;
    public static volatile int b;
    public static volatile int c;
    public static volatile int d;
    public static volatile int e;
    public static volatile int f;
    public static volatile int g;
    public static volatile int h;
    public static volatile int i;
    public static volatile int j;
    public static volatile int k;
    public static volatile int l;
    public static volatile int m;
    public static volatile int n;
    public static volatile int o;
    public static volatile int p;
    public static volatile int q;
    public static volatile int r;
    public static volatile int s;
    public static volatile int t;
    public static volatile int u;
    public static volatile int v;
    public static volatile int w;
    public static volatile int x;
    public static volatile int y;
    public static volatile int z;

    public static void A(int i2) {
        boolean z2 = false;
        int max = Math.max(0, i2);
        synchronized (D) {
            try {
                if (n != max) {
                    n = max;
                    z2 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            j();
        }
    }

    public static void B(int i2) {
        boolean z2 = false;
        int max = Math.max(0, i2);
        synchronized (D) {
            try {
                if (y != max) {
                    y = max;
                    z2 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            j();
        }
    }

    public static void D() {
        int max;
        if (BuildInfo.q()) {
            max = Math.max(0, y);
        } else {
            max = Math.max(0, o) + Math.max(0, g()) + Math.max(0, h()) + Math.max(0, t);
        }
        A.i(max, e43.a);
    }

    public static final void c(View view) {
        Iterator<Object> it = hyt0.b(view).iterator();
        while (true) {
            vki0 vki0Var = (vki0) it;
            if (!vki0Var.hasNext()) {
                return;
            } else {
                i((View) vki0Var.next()).b();
            }
        }
    }

    public static String d(Throwable th) {
        return "internal:" + fpf0.a(th.getClass()).l() + ':' + th.getMessage();
    }

    public static final r180 e(View view) {
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
            r180 r180Var = tag instanceof r180 ? (r180) tag : null;
            if (r180Var != null) {
                return r180Var;
            }
            Object m2 = fvr.m(view);
            view = m2 instanceof View ? (View) m2 : null;
        }
        return null;
    }

    public static final pkd f() {
        bpn0 bpn0Var = E;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        return (pkd) bpn0Var.getValue();
    }

    public static int g() {
        if (((Boolean) B.get()).booleanValue()) {
            return b + (((Boolean) C.get()).booleanValue() ? d : 0);
        }
        return c + (((Boolean) C.get()).booleanValue() ? e : 0);
    }

    public static int h() {
        return k + g;
    }

    public static final rvb0 i(View view) {
        rvb0 rvb0Var = (rvb0) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (rvb0Var != null) {
            return rvb0Var;
        }
        rvb0 rvb0Var2 = new rvb0();
        view.setTag(R.id.pooling_container_listener_holder_tag, rvb0Var2);
        return rvb0Var2;
    }

    public static void j() {
        hf8.b("com.vkontakte.android.COUNTERS_UPDATED");
        D();
    }

    public static void k(int i2) {
        boolean z2 = false;
        int max = Math.max(0, i2);
        synchronized (D) {
            try {
                if (x != max) {
                    x = max;
                    z2 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            j();
        }
    }

    public static void l(int i2) {
        boolean z2 = false;
        int max = Math.max(0, i2);
        synchronized (D) {
            try {
                if (z != max) {
                    z = max;
                    z2 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            j();
        }
    }

    public static void m(int i2) {
        boolean z2 = false;
        int max = Math.max(0, i2);
        synchronized (D) {
            try {
                if (j != max) {
                    j = max;
                    z2 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            j();
        }
    }

    public static void n(int i2) {
        boolean z2;
        synchronized (D) {
            try {
                if (p != i2) {
                    p = i2;
                    z2 = true;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            j();
        }
    }

    public static void o(int i2) {
        boolean z2;
        synchronized (D) {
            try {
                if (o != i2) {
                    o = i2;
                    z2 = true;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            j();
        }
    }

    public static void p(int i2) {
        boolean z2 = false;
        int max = Math.max(0, i2);
        synchronized (D) {
            try {
                if (r != max) {
                    r = max;
                    z2 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            j();
        }
    }

    public static void q(int i2) {
        boolean z2 = false;
        int max = Math.max(0, i2);
        synchronized (D) {
            try {
                if (q != max) {
                    q = max;
                    z2 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            j();
        }
    }

    public static void r(int i2) {
        boolean z2 = false;
        int max = Math.max(0, i2);
        synchronized (D) {
            try {
                if (f != max) {
                    f = max;
                    z2 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            A.getClass();
            FriendsUtils.e(max);
            j();
        }
    }

    public static void s(int i2) {
        boolean z2 = false;
        int max = Math.max(0, i2);
        synchronized (D) {
            try {
                if (g != max) {
                    g = max;
                    z2 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            A.getClass();
            FriendsUtils.e(max);
            j();
        }
    }

    public static void t(int i2) {
        boolean z2 = false;
        int max = Math.max(0, i2);
        synchronized (D) {
            try {
                if (l != max) {
                    l = max;
                    z2 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            j();
        }
    }

    public static void u(int i2) {
        boolean z2 = false;
        int max = Math.max(0, i2);
        synchronized (D) {
            try {
                if (v != max) {
                    v = max;
                    z2 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            j();
        }
    }

    public static void v(int i2) {
        boolean z2 = false;
        int max = Math.max(0, i2);
        synchronized (D) {
            try {
                if (s != max) {
                    s = max;
                    z2 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            j();
        }
    }

    public static void w(int i2) {
        boolean z2 = false;
        int max = Math.max(0, i2);
        synchronized (D) {
            try {
                if (k != max) {
                    k = max;
                    z2 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            j();
        }
    }

    public static void x(int i2) {
        boolean z2 = false;
        int max = Math.max(0, i2);
        synchronized (D) {
            try {
                if (h != max) {
                    h = max;
                    z2 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            j();
        }
    }

    public static void y(int i2) {
        boolean z2;
        synchronized (D) {
            try {
                if (t != i2) {
                    t = i2;
                    z2 = true;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            j();
        }
    }

    public static void z(int i2) {
        boolean z2 = false;
        int max = Math.max(0, i2);
        synchronized (D) {
            try {
                if (m != max) {
                    m = max;
                    z2 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            j();
        }
    }

    public void C() {
        wjy.a.getClass();
        wjy.b().c();
    }

    @Override // xsna.wsj
    public List b(okhttp3.l lVar) {
        return EmptyList.b;
    }

    @Override // xsna.wsj
    public void a(List list) {
    }
}
