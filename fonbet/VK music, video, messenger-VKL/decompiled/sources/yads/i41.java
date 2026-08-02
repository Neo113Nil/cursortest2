package yads;

import java.util.Iterator;

/* loaded from: classes10.dex */
public final class i41 implements Runnable {
    public final /* synthetic */ n41 b;

    public i41(n41 n41Var) {
        this.b = n41Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (j41 j41Var : this.b.d.values()) {
            Iterator it = j41Var.d.iterator();
            while (it.hasNext()) {
                l41 l41Var = (l41) it.next();
                m41 m41Var = l41Var.b;
                if (m41Var != null) {
                    mn3 mn3Var = j41Var.c;
                    if (mn3Var == null) {
                        l41Var.a = j41Var.b;
                        m41Var.a(l41Var, false);
                    } else {
                        m41Var.a(mn3Var);
                    }
                }
            }
        }
        this.b.d.clear();
        this.b.f = null;
    }
}
