package defpackage;

import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class l991 extends n791 {
    @Override // defpackage.n791
    public final r691 a(String str, cr71 cr71Var, ArrayList arrayList) {
        if (str == null || str.isEmpty() || !cr71Var.l(str)) {
            ny61.g(g8e.o("Command not found: ", str));
            return null;
        }
        r691 q = cr71Var.q(str);
        if (q instanceof s591) {
            return ((s591) q).c(cr71Var, arrayList);
        }
        ny61.g(oyr.p("Function ", str, " is not defined"));
        return null;
    }
}
