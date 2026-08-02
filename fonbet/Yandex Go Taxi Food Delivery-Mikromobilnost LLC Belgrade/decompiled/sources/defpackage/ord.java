package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.EmptyList;

/* loaded from: classes8.dex */
public final class ord implements eya0 {
    public final /* synthetic */ int a;
    public final eya0 b;
    public final Object c;

    public ord(eya0 eya0Var) {
        this.a = 0;
        this.b = eya0Var;
        this.c = new CopyOnWriteArrayList(EmptyList.a);
    }

    @Override // defpackage.eya0
    public final mya0 a(cya0 cya0Var) {
        switch (this.a) {
        }
        return qh91.b(this, cya0Var);
    }

    @Override // defpackage.eya0
    public final List c(List list) {
        int i = this.a;
        Object obj = this.c;
        eya0 eya0Var = this.b;
        switch (i) {
            case 0:
                List<mya0> c = eya0Var.c(list);
                ArrayList arrayList = new ArrayList(tcc.n(c, 10));
                for (mya0 mya0Var : c) {
                    Iterator it = ((CopyOnWriteArrayList) obj).iterator();
                    if (it.hasNext()) {
                        b64.D(it.next());
                        throw null;
                    }
                    arrayList.add(mya0Var);
                }
                return arrayList;
            default:
                List<mya0> c2 = ((ord) eya0Var).c(list);
                for (mya0 mya0Var2 : c2) {
                    ((x8o) obj).c("Permissions", "Checked permission " + mya0Var2.a().a() + ", granted: " + mya0Var2.b());
                }
                return c2;
        }
    }

    public ord(ord ordVar, x8o x8oVar) {
        this.a = 1;
        this.b = ordVar;
        this.c = x8oVar;
    }
}
