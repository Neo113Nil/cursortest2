package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes12.dex */
public abstract class lia1 {
    public static long a(dl81 dl81Var, int i, int i2) {
        dl81Var.m(i);
        if (dl81Var.c - dl81Var.b < 5) {
            return -9223372036854775807L;
        }
        int a = dl81Var.a();
        if ((8388608 & a) != 0 || ((2096896 & a) >> 8) != i2 || (a & 32) == 0 || dl81Var.s() < 7 || dl81Var.c - dl81Var.b < 7 || (dl81Var.s() & 16) != 16) {
            return -9223372036854775807L;
        }
        dl81Var.d(0, 6, new byte[6]);
        return ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1) | ((r0[4] & 255) >> 7);
    }

    public static final AccessibilityManager b(Context context) {
        Object systemService = context.getSystemService("accessibility");
        if (systemService instanceof AccessibilityManager) {
            return (AccessibilityManager) systemService;
        }
        return null;
    }

    public static final String e(w201 w201Var) {
        if (w201Var instanceof pu6) {
            return ((pu6) w201Var).a;
        }
        if (w201Var instanceof xda) {
            return ((xda) w201Var).a;
        }
        if (w201Var instanceof jem) {
            return ((jem) w201Var).a;
        }
        if (w201Var instanceof d3p) {
            return ((d3p) w201Var).a;
        }
        if (w201Var instanceof bjz) {
            return ((bjz) w201Var).a;
        }
        if (w201Var instanceof qg50) {
            return ((qg50) w201Var).a;
        }
        if (w201Var instanceof q6o0) {
            return ((q6o0) w201Var).a;
        }
        if (w201Var instanceof y2y0) {
            return ((y2y0) w201Var).a;
        }
        if (w201Var instanceof z4y0) {
            return ((z4y0) w201Var).a.b().a;
        }
        if (w201Var instanceof q6y0) {
            return ((q6y0) w201Var).a();
        }
        if (w201Var instanceof v7y0) {
            return ((v7y0) w201Var).b.b().a;
        }
        w511.b();
        return null;
    }

    public static final boolean g(Context context) {
        AccessibilityManager b = b(context);
        boolean isEnabled = b != null ? b.isEnabled() : false;
        AccessibilityManager b2 = b(context);
        return isEnabled && (b2 != null ? b2.isTouchExplorationEnabled() : false);
    }

    public static final String i(List list) {
        return a.X(list, ". ", null, null, new p0(7), 30);
    }

    public abstract Method c(Class cls, Field field);

    public abstract Constructor d(Class cls);

    public abstract String[] f(Class cls);

    public abstract boolean h(Class cls);
}
