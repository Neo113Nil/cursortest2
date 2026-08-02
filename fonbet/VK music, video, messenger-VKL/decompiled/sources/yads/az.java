package yads;

/* loaded from: classes10.dex */
public final class az {
    public static final Boolean a(sh1 sh1Var, String str) {
        uh1 uh1Var = (uh1) sh1Var;
        if (!uh1Var.a(str)) {
            uh1Var = null;
        }
        if (uh1Var != null) {
            return Boolean.valueOf(uh1Var.a(str, false));
        }
        return null;
    }

    public static final Integer b(sh1 sh1Var, String str) {
        uh1 uh1Var = (uh1) sh1Var;
        if (!uh1Var.a(str)) {
            uh1Var = null;
        }
        if (uh1Var != null) {
            return Integer.valueOf(uh1Var.a(0, str));
        }
        return null;
    }

    public static final void a(sh1 sh1Var, String str, Boolean bool) {
        if (bool == null) {
            ((uh1) sh1Var).d(str);
        } else {
            ((uh1) sh1Var).b(str, bool.booleanValue());
        }
    }

    public static final void a(sh1 sh1Var, String str, Integer num) {
        if (num != null) {
            ((uh1) sh1Var).b(num.intValue(), str);
        } else {
            ((uh1) sh1Var).d(str);
        }
    }
}
