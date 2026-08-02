package defpackage;

import yads.pf1;

/* loaded from: classes7.dex */
public final class lx71 {
    public static final Boolean a(pf1 pf1Var, String str) {
        if (!pf1Var.a(str)) {
            pf1Var = null;
        }
        if (pf1Var != null) {
            return Boolean.valueOf(pf1Var.a(str, false));
        }
        return null;
    }

    public static final void b(pf1 pf1Var, String str, Boolean bool) {
        if (bool != null) {
            pf1Var.b(str, bool.booleanValue());
        } else {
            pf1Var.d(str);
        }
    }

    public static final void c(pf1 pf1Var, String str, Integer num) {
        if (num != null) {
            pf1Var.b(num.intValue(), str);
        } else {
            pf1Var.d(str);
        }
    }

    public static final Integer d(pf1 pf1Var, String str) {
        if (!pf1Var.a(str)) {
            pf1Var = null;
        }
        if (pf1Var != null) {
            return Integer.valueOf(pf1Var.a(0, str));
        }
        return null;
    }
}
