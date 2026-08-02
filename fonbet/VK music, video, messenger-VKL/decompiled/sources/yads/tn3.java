package yads;

import xsna.emb;
import xsna.tgw;

/* loaded from: classes10.dex */
public abstract class tn3 {
    public static ff3 a(mn3 mn3Var) {
        if (mn3Var instanceof am0) {
            return ef3.a((am0) mn3Var);
        }
        if (mn3Var instanceof mc2) {
            return ef3.a();
        }
        g92 g92Var = mn3Var.b;
        if (g92Var == null) {
            return ef3.a(mn3Var.getMessage());
        }
        int i = g92Var.a;
        if (i >= 500) {
            return ef3.b();
        }
        return ef3.b(tgw.b(i, "Network Error.  Code: ", ".") + " Data: \n" + new String(g92Var.b, emb.b));
    }
}
