package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class cnr0 {
    public static final cnr0 b = new cnr0(b.f());
    public final Map a;

    public cnr0(Map map) {
        this.a = map;
    }

    public final cnr0 a(cnr0 cnr0Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.a);
        for (Map.Entry entry : cnr0Var.a.entrySet()) {
            lfx lfxVar = (lfx) entry.getKey();
            bnr0 bnr0Var = (bnr0) entry.getValue();
            bnr0 bnr0Var2 = (bnr0) linkedHashMap.get(lfxVar);
            if (bnr0Var2 != null) {
                linkedHashMap.put(lfxVar, bnr0Var2.a(bnr0Var));
            } else {
                linkedHashMap.put(lfxVar, bnr0Var);
            }
        }
        return new cnr0(linkedHashMap);
    }

    public final bnr0 b(g0c g0cVar) {
        Object obj = this.a.get(g0cVar);
        if (obj instanceof bnr0) {
            return (bnr0) obj;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return cnr0.class.equals(obj != null ? obj.getClass() : null) && this.a.equals(((cnr0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return nnm.j("SharedData(slices=", Extension.C_BRAKE, this.a);
    }
}
