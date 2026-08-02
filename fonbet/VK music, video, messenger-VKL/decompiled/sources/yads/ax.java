package yads;

import kotlin.NoWhenBranchMatchedException;
import xsna.epx;

/* loaded from: classes10.dex */
public final class ax implements x93 {
    public static ix b(sh1 sh1Var, sw swVar) {
        int ordinal;
        String str = swVar.b;
        if (str == null) {
            return null;
        }
        try {
            ordinal = swVar.ordinal();
        } catch (ClassCastException unused) {
        }
        if (ordinal == 0) {
            return new ex(((uh1) sh1Var).c(str));
        }
        if (ordinal == 1) {
            return new fx(((uh1) sh1Var).c(str));
        }
        if (ordinal == 2) {
            return new dx(((uh1) sh1Var).a(str, false));
        }
        if (ordinal == 3) {
            return new gx(((uh1) sh1Var).c(str));
        }
        if (ordinal == 4) {
            return new hx(((uh1) sh1Var).c(str));
        }
        if (ordinal == 5) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
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
                if (epx.f(swVar.b, str)) {
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
        String str = swVar.b;
        if (str == null || !((uh1) sh1Var).a(str)) {
            swVar = null;
        }
        if (swVar != null) {
            return b(sh1Var, swVar);
        }
        return null;
    }
}
