package xsna;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: AsrRecordStartConfig.kt */
/* loaded from: classes7.dex */
public final class hw3 implements t100 {
    public final Object a;
    public final Object b;

    public /* synthetic */ hw3(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public pcp a(ry40 ry40Var) {
        Object obj;
        Iterator it = ((LinkedHashSet) this.b).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            ry40 ry40Var2 = ((pcp) obj).a;
            if (ry40Var2.b == ry40Var.b && ry40Var2.c.hashCode() == ry40Var.c.hashCode()) {
                break;
            }
        }
        return (pcp) obj;
    }

    public Set b() {
        return (Set) ((bpn0) this.b).getValue();
    }

    @Override // xsna.t100
    public h100 build() {
        return (rjh0) ((u9i) this.b).b((String) this.a, null, null, jk3.e);
    }

    public void c(ry40 ry40Var, int i) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.b;
        if (!linkedHashSet.isEmpty() && ((pcp) j5g.X(linkedHashSet)).a.c.hashCode() != ry40Var.c.hashCode()) {
            linkedHashSet.clear();
        }
        pcp a = a(ry40Var);
        if (a == null) {
            linkedHashSet.add(new pcp(ry40Var, i));
        } else {
            a.b |= i;
        }
    }

    public hw3(rx40 rx40Var) {
        this.a = rx40Var;
        this.b = new LinkedHashSet();
    }

    public hw3(a1w a1wVar) {
        this.a = a1wVar;
        this.b = new bpn0(new tsk0(this, 7));
    }

    public hw3(u9i u9iVar, String str) {
        this.b = u9iVar;
        this.a = str;
    }
}
