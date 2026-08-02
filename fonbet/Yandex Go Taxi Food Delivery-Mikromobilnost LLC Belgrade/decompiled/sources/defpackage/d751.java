package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public class d751 extends k751 {
    public static boolean i;
    public static Method j;
    public static Class k;
    public static Field l;
    public static Field m;
    public final WindowInsets c;
    public u1w[] d;
    public u1w e;
    public n751 f;
    public u1w g;
    public int h;

    public d751(n751 n751Var, d751 d751Var) {
        this(n751Var, new WindowInsets(d751Var.c));
    }

    private static void A() {
        try {
            j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            k = cls;
            l = cls.getDeclaredField("mVisibleInsets");
            m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            l.setAccessible(true);
            m.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        i = true;
    }

    public static boolean B(int i2, int i3) {
        return (i2 & 6) == (i3 & 6);
    }

    private u1w v(int i2, boolean z) {
        u1w u1wVar = u1w.e;
        for (int i3 = 1; i3 <= 512; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                u1wVar = u1w.a(u1wVar, w(i3, z));
            }
        }
        return u1wVar;
    }

    private u1w x() {
        n751 n751Var = this.f;
        return n751Var != null ? n751Var.a.j() : u1w.e;
    }

    private u1w y(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            w511.x("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            return null;
        }
        if (!i) {
            A();
        }
        Method method = j;
        if (method != null && k != null && l != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    return null;
                }
                Rect rect = (Rect) l.get(m.get(invoke));
                if (rect != null) {
                    return u1w.c(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    @Override // defpackage.k751
    public void d(View view) {
        u1w y = y(view);
        if (y == null) {
            y = u1w.e;
        }
        s(y);
    }

    @Override // defpackage.k751
    public void e(n751 n751Var) {
        n751Var.a.t(this.f);
        u1w u1wVar = this.g;
        k751 k751Var = n751Var.a;
        k751Var.s(u1wVar);
        k751Var.u(this.h);
    }

    @Override // defpackage.k751
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        d751 d751Var = (d751) obj;
        return Objects.equals(this.g, d751Var.g) && B(this.h, d751Var.h);
    }

    @Override // defpackage.k751
    public u1w g(int i2) {
        return v(i2, false);
    }

    @Override // defpackage.k751
    public u1w h(int i2) {
        return v(i2, true);
    }

    @Override // defpackage.k751
    public final u1w l() {
        if (this.e == null) {
            WindowInsets windowInsets = this.c;
            this.e = u1w.c(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override // defpackage.k751
    public n751 n(int i2, int i3, int i4, int i5) {
        x651 x651Var = new x651(n751.h(null, this.c));
        u1w e = n751.e(l(), i2, i3, i4, i5);
        y651 y651Var = x651Var.a;
        y651Var.f(e);
        y651Var.j(n751.e(j(), i2, i3, i4, i5));
        return y651Var.h();
    }

    @Override // defpackage.k751
    public boolean p() {
        return this.c.isRound();
    }

    @Override // defpackage.k751
    public boolean q(int i2) {
        for (int i3 = 1; i3 <= 512; i3 <<= 1) {
            if ((i2 & i3) != 0 && !z(i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.k751
    public void r(u1w[] u1wVarArr) {
        this.d = u1wVarArr;
    }

    @Override // defpackage.k751
    public void s(u1w u1wVar) {
        this.g = u1wVar;
    }

    @Override // defpackage.k751
    public void t(n751 n751Var) {
        this.f = n751Var;
    }

    @Override // defpackage.k751
    public void u(int i2) {
        this.h = i2;
    }

    public u1w w(int i2, boolean z) {
        u1w j2;
        int i3;
        u1w u1wVar = u1w.e;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 8) {
                    u1w[] u1wVarArr = this.d;
                    j2 = u1wVarArr != null ? u1wVarArr[kp50.z(8)] : null;
                    if (j2 != null) {
                        return j2;
                    }
                    u1w l2 = l();
                    u1w x = x();
                    int i4 = l2.d;
                    if (i4 > x.d) {
                        return u1w.c(0, 0, 0, i4);
                    }
                    u1w u1wVar2 = this.g;
                    if (u1wVar2 != null && !u1wVar2.equals(u1wVar) && (i3 = this.g.d) > x.d) {
                        return u1w.c(0, 0, 0, i3);
                    }
                } else {
                    if (i2 == 16) {
                        return k();
                    }
                    if (i2 == 32) {
                        return i();
                    }
                    if (i2 == 64) {
                        return m();
                    }
                    if (i2 == 128) {
                        n751 n751Var = this.f;
                        bzj f = n751Var != null ? n751Var.a.f() : f();
                        if (f != null) {
                            DisplayCutout displayCutout = f.a;
                            return u1w.c(bi91.c(displayCutout), bi91.e(displayCutout), bi91.d(displayCutout), bi91.b(displayCutout));
                        }
                    }
                }
            } else {
                if (z) {
                    u1w x2 = x();
                    u1w j3 = j();
                    return u1w.c(Math.max(x2.a, j3.a), 0, Math.max(x2.c, j3.c), Math.max(x2.d, j3.d));
                }
                if ((this.h & 2) == 0) {
                    u1w l3 = l();
                    n751 n751Var2 = this.f;
                    j2 = n751Var2 != null ? n751Var2.a.j() : null;
                    int i5 = l3.d;
                    if (j2 != null) {
                        i5 = Math.min(i5, j2.d);
                    }
                    return u1w.c(l3.a, 0, l3.c, i5);
                }
            }
        } else {
            if (z) {
                return u1w.c(0, Math.max(x().b, l().b), 0, 0);
            }
            if ((this.h & 4) == 0) {
                return u1w.c(0, l().b, 0, 0);
            }
        }
        return u1wVar;
    }

    public boolean z(int i2) {
        if (i2 != 1 && i2 != 2) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 8 && i2 != 128) {
                return true;
            }
        }
        return !w(i2, false).equals(u1w.e);
    }

    public d751(n751 n751Var, WindowInsets windowInsets) {
        super(n751Var);
        this.e = null;
        this.c = windowInsets;
    }
}
