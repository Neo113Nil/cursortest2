package yads;

import java.util.Iterator;
import java.util.List;
import xsna.j5g;

/* loaded from: classes10.dex */
public final class mv {
    public final w5 a = new w5();
    public final nd2 b = new nd2();
    public final v5 c = v5.A;

    public final Long a() {
        List O0;
        Object obj;
        w5 w5Var = this.a;
        synchronized (w5Var.a) {
            O0 = j5g.O0(w5Var.d);
        }
        Iterator it = O0.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((u5) obj).a == this.c) {
                break;
            }
        }
        u5 u5Var = (u5) obj;
        if (u5Var == null) {
            return null;
        }
        Object obj2 = u5Var.b.get("duration");
        if (obj2 instanceof Long) {
            return (Long) obj2;
        }
        return null;
    }
}
