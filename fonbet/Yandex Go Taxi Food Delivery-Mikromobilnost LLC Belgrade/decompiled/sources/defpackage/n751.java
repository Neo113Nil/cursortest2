package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.view.b;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class n751 {
    public static final n751 b;
    public final k751 a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            b = j751.s;
        } else if (i >= 30) {
            b = h751.r;
        } else {
            b = k751.b;
        }
    }

    public n751(n751 n751Var) {
        if (n751Var == null) {
            this.a = new k751(this);
            return;
        }
        k751 k751Var = n751Var.a;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34 && (k751Var instanceof j751)) {
            this.a = new j751(this, (j751) k751Var);
        } else if (i >= 31 && (k751Var instanceof i751)) {
            this.a = new i751(this, (i751) k751Var);
        } else if (i >= 30 && (k751Var instanceof h751)) {
            this.a = new h751(this, (h751) k751Var);
        } else if (k751Var instanceof g751) {
            this.a = new g751(this, (g751) k751Var);
        } else if (k751Var instanceof f751) {
            this.a = new f751(this, (f751) k751Var);
        } else if (k751Var instanceof e751) {
            this.a = new e751(this, (e751) k751Var);
        } else if (k751Var instanceof d751) {
            this.a = new d751(this, (d751) k751Var);
        } else {
            this.a = new k751(this);
        }
        k751Var.e(this);
    }

    public static u1w e(u1w u1wVar, int i, int i2, int i3, int i4) {
        int max = Math.max(0, u1wVar.a - i);
        int max2 = Math.max(0, u1wVar.b - i2);
        int max3 = Math.max(0, u1wVar.c - i3);
        int max4 = Math.max(0, u1wVar.d - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? u1wVar : u1w.c(max, max2, max3, max4);
    }

    public static n751 h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        n751 n751Var = new n751(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = b.a;
            n751 a = op31.a(view);
            k751 k751Var = n751Var.a;
            k751Var.t(a);
            k751Var.d(view.getRootView());
            k751Var.u(view.getWindowSystemUiVisibility());
        }
        return n751Var;
    }

    public final int a() {
        return this.a.l().d;
    }

    public final int b() {
        return this.a.l().a;
    }

    public final int c() {
        return this.a.l().c;
    }

    public final int d() {
        return this.a.l().b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n751) {
            return Objects.equals(this.a, ((n751) obj).a);
        }
        return false;
    }

    public final n751 f(int i, int i2, int i3, int i4) {
        x651 x651Var = new x651(this);
        u1w c = u1w.c(i, i2, i3, i4);
        y651 y651Var = x651Var.a;
        y651Var.f(c);
        return y651Var.h();
    }

    public final WindowInsets g() {
        k751 k751Var = this.a;
        if (k751Var instanceof d751) {
            return ((d751) k751Var).c;
        }
        return null;
    }

    public final int hashCode() {
        k751 k751Var = this.a;
        if (k751Var == null) {
            return 0;
        }
        return k751Var.hashCode();
    }

    public n751(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            this.a = new j751(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.a = new i751(this, windowInsets);
        } else if (i >= 30) {
            this.a = new h751(this, windowInsets);
        } else {
            this.a = new g751(this, windowInsets);
        }
    }
}
