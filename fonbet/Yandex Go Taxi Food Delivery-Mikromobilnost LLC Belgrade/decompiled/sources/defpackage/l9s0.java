package defpackage;

import java.util.HashSet;

/* loaded from: classes6.dex */
public final class l9s0 {
    public final as21 a;
    public final HashSet b = new HashSet();

    public l9s0(as21 as21Var) {
        this.a = as21Var;
    }

    public final boolean a(String str, vfy vfyVar) {
        if (this.b.contains(str)) {
            return false;
        }
        return as21.b(this.a, "FIELD_TARIFF_NOTIFICATION_SHOWN_".concat(str)) < vfyVar.getB();
    }

    public final void b(String str) {
        this.b.add(str);
        String concat = "FIELD_TARIFF_NOTIFICATION_SHOWN_".concat(str);
        as21 as21Var = this.a;
        as21Var.f(as21.b(as21Var, concat) + 1, concat);
    }
}
