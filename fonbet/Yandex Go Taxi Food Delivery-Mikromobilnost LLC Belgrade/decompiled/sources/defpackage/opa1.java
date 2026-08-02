package defpackage;

import java.util.Iterator;

/* loaded from: classes11.dex */
public abstract class opa1 {
    public static final w53 a = new w53();

    public static synchronized void a() {
        synchronized (opa1.class) {
            w53 w53Var = a;
            Iterator it = ((u53) w53Var.values()).iterator();
            if (it.hasNext()) {
                ((opa1) it.next()).getClass();
                throw null;
            }
            w53Var.clear();
        }
    }
}
