package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class hq60 implements eya0 {
    public final ord a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();

    public hq60(ord ordVar) {
        this.a = ordVar;
    }

    @Override // defpackage.eya0
    public final mya0 a(cya0 cya0Var) {
        return qh91.b(this, cya0Var);
    }

    @Override // defpackage.eya0
    public final List c(List list) {
        List<mya0> c = this.a.c(list);
        for (mya0 mya0Var : c) {
            Iterator it = this.b.iterator();
            if (it.hasNext()) {
                b64.D(it.next());
                throw null;
            }
            Iterator it2 = this.c.iterator();
            if (it2.hasNext()) {
                b64.D(it2.next());
                throw null;
            }
        }
        return c;
    }
}
