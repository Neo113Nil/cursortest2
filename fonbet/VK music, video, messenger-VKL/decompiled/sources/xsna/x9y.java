package xsna;

import com.google.gson.internal.LinkedTreeMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: JsonObject.java */
/* loaded from: classes.dex */
public final class x9y extends b9y {
    public final LinkedTreeMap<String, b9y> b = new LinkedTreeMap<>();

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof x9y) && ((x9y) obj).b.equals(this.b);
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final void l(b9y b9yVar, String str) {
        if (b9yVar == null) {
            b9yVar = u9y.b;
        }
        this.b.put(str, b9yVar);
    }

    public final void m(Boolean bool, String str) {
        l(bool == null ? u9y.b : new hay(bool), str);
    }

    public final void n(String str, Number number) {
        l(number == null ? u9y.b : new hay(number), str);
    }

    public final void o(String str, String str2) {
        l(str2 == null ? u9y.b : new hay(str2), str);
    }

    @Override // xsna.b9y
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final x9y c() {
        x9y x9yVar = new x9y();
        Iterator it = ((LinkedTreeMap.b) this.b.entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            x9yVar.l(((b9y) entry.getValue()).c(), (String) entry.getKey());
        }
        return x9yVar;
    }

    public final b9y q(String str) {
        return this.b.get(str);
    }

    public final void r(String str) {
        this.b.remove(str);
    }
}
