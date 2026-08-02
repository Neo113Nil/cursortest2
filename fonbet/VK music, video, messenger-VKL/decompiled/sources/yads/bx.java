package yads;

import kotlin.NoWhenBranchMatchedException;
import xsna.epx;

/* loaded from: classes10.dex */
public final class bx implements x93 {
    public static ix b(sh1 sh1Var, sw swVar) {
        String str = swVar.c;
        try {
            int ordinal = swVar.ordinal();
            if (ordinal == 0) {
                return new ex(((uh1) sh1Var).c(str));
            }
            boolean z = true;
            if (ordinal == 1) {
                int a = ((uh1) sh1Var).a(-1, str);
                Integer valueOf = Integer.valueOf(a);
                if (a == -1) {
                    valueOf = null;
                }
                return new fx(valueOf != null ? String.valueOf(valueOf.intValue()) : null);
            }
            if (ordinal == 2) {
                if (((uh1) sh1Var).a(-1, str) == -1) {
                    z = false;
                }
                return new dx(z);
            }
            if (ordinal == 3) {
                return new gx(((uh1) sh1Var).c(str));
            }
            if (ordinal == 4) {
                return new hx(((uh1) sh1Var).c(str));
            }
            if (ordinal == 5) {
                return new cx(((uh1) sh1Var).c(str));
            }
            throw new NoWhenBranchMatchedException();
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // yads.x93
    public final ix a(sh1 sh1Var, String str) {
        sw swVar;
        uh1 uh1Var = (uh1) sh1Var;
        if (!uh1Var.a(str)) {
            str = null;
        }
        if (str != null) {
            sw.d.getClass();
            sw[] values = sw.values();
            int length = values.length;
            for (int i = 0; i < length; i++) {
                swVar = values[i];
                if (epx.f(swVar.c, str)) {
                    break;
                }
            }
        }
        swVar = null;
        if (swVar != null) {
            return b(uh1Var, swVar);
        }
        return null;
    }

    @Override // yads.x93
    public final ix a(sh1 sh1Var, sw swVar) {
        uh1 uh1Var = (uh1) sh1Var;
        if (!uh1Var.a(swVar.c)) {
            swVar = null;
        }
        if (swVar != null) {
            return b(uh1Var, swVar);
        }
        return null;
    }
}
