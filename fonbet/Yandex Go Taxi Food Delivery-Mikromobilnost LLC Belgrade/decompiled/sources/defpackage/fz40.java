package defpackage;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class fz40 {
    public static final fz40 b = new fz40();
    public final AtomicReference a = new AtomicReference(new n2f0(new l2f0()));

    public final synchronized void a(e2f0 e2f0Var) {
        l2f0 l2f0Var = new l2f0((n2f0) this.a.get());
        HashMap hashMap = l2f0Var.a;
        m2f0 m2f0Var = new m2f0(e2f0Var.a, zsb.class);
        if (hashMap.containsKey(m2f0Var)) {
            e2f0 e2f0Var2 = (e2f0) hashMap.get(m2f0Var);
            if (!e2f0Var2.equals(e2f0Var) || e2f0Var != e2f0Var2) {
                yhl.g(m2f0Var, "Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ");
            }
        } else {
            hashMap.put(m2f0Var, e2f0Var);
        }
        this.a.set(new n2f0(l2f0Var));
    }
}
