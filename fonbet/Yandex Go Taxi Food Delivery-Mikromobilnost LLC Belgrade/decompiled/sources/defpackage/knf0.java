package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class knf0 {
    public final long a;
    public final List b;

    public knf0(long j, List list) {
        this.a = j;
        this.b = list;
    }

    public final lnf0 a(long j, String str, List list) {
        Object obj = null;
        if (j != this.a) {
            return null;
        }
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            lnf0 lnf0Var = (lnf0) next;
            if (jl40.l(str, lnf0Var.a) && jl40.l(list, lnf0Var.b)) {
                obj = next;
                break;
            }
        }
        return (lnf0) obj;
    }
}
