package yads;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class fa2 implements kx0 {
    public final ga2 a;

    public fa2(ux1 ux1Var) {
        this.a = ux1Var;
    }

    @Override // yads.kx0
    public final void a() {
        ux1 ux1Var = (ux1) this.a;
        synchronized (ux1Var) {
            try {
                ux1Var.m.size();
                ux1Var.b();
                ArrayList arrayList = new ArrayList();
                Iterator it = ux1Var.m.iterator();
                while (it.hasNext()) {
                    g93 g93Var = (g93) it.next();
                    xc3 a = ux1Var.a(g93Var);
                    if (a instanceof vc3) {
                        it.remove();
                        ux1Var.a(g93Var, (vc3) a);
                    } else if (a instanceof uc3) {
                        uc3 uc3Var = (uc3) a;
                        ux1Var.b.a(g93Var.d, uc3Var);
                        arrayList.add(new ia2(g93Var, uc3Var));
                    }
                }
                ux1Var.b.a(arrayList);
                ux1Var.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
