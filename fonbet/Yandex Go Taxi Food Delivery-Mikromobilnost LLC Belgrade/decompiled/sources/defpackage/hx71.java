package defpackage;

import kotlin.NoWhenBranchMatchedException;
import yads.fw;
import yads.pf1;

/* loaded from: classes7.dex */
public final class hx71 {
    public static bk81 a(pf1 pf1Var, fw fwVar) {
        String str = fwVar.c;
        try {
            int ordinal = fwVar.ordinal();
            if (ordinal == 0) {
                return new r681(pf1Var.c(str));
            }
            boolean z = true;
            if (ordinal == 1) {
                int a = pf1Var.a(-1, str);
                Integer valueOf = Integer.valueOf(a);
                if (a == -1) {
                    valueOf = null;
                }
                return new ga81(valueOf != null ? String.valueOf(valueOf.intValue()) : null);
            }
            if (ordinal == 2) {
                if (pf1Var.a(-1, str) == -1) {
                    z = false;
                }
                return new t381(z);
            }
            if (ordinal == 3) {
                return new ud81(pf1Var.c(str));
            }
            if (ordinal == 4) {
                return new rg81(pf1Var.c(str));
            }
            if (ordinal == 5) {
                return new g081(pf1Var.c(str));
            }
            throw new NoWhenBranchMatchedException();
        } catch (ClassCastException unused) {
            return null;
        }
    }
}
