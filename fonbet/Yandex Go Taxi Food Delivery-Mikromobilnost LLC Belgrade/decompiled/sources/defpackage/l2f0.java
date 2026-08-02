package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class l2f0 {
    public final HashMap a;
    public final HashMap b;

    public l2f0(n2f0 n2f0Var) {
        this.a = new HashMap(n2f0Var.a);
        this.b = new HashMap(n2f0Var.b);
    }

    public final void a(r2f0 r2f0Var) {
        if (r2f0Var == null) {
            ny61.t("wrapper must be non-null");
            return;
        }
        Class b = r2f0Var.b();
        HashMap hashMap = this.b;
        if (!hashMap.containsKey(b)) {
            hashMap.put(b, r2f0Var);
            return;
        }
        r2f0 r2f0Var2 = (r2f0) hashMap.get(b);
        if (!r2f0Var2.equals(r2f0Var) || !r2f0Var.equals(r2f0Var2)) {
            throw new GeneralSecurityException(qv10.l(b, "Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type"));
        }
    }

    public l2f0() {
        this.a = new HashMap();
        this.b = new HashMap();
    }
}
