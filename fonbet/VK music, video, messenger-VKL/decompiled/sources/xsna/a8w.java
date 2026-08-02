package xsna;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: ImItemWeightsGetCmd.kt */
/* loaded from: classes2.dex */
public final class a8w extends le6<Map<b5w, ? extends x7w>> {
    public final Collection<b5w> b;

    public a8w(Collection<b5w> collection) {
        this.b = collection;
    }

    @Override // xsna.le6
    public final Map<b5w, ? extends x7w> e(w2w w2wVar) {
        Map<b5w, sew> c = w2wVar.I0().j().c(this.b);
        LinkedHashMap linkedHashMap = new LinkedHashMap(on00.e(c.size()));
        Iterator<T> it = c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((sew) entry.getValue()).b);
        }
        return linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a8w) && epx.f(this.b, ((a8w) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return l4.h(new StringBuilder("ImItemWeightsGetCmd(ids="), this.b, ')');
    }
}
