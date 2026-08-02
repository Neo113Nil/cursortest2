package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: FontVariation.kt */
/* loaded from: classes11.dex */
public final class a6s {
    public final List<x5s> a;

    public a6s(x5s... x5sVarArr) {
        boolean z = false;
        for (x5s x5sVar : x5sVarArr) {
            String b = x5sVar.b();
            int i = 0;
            for (x5s x5sVar2 : x5sVarArr) {
                if (epx.f(x5sVar2.b(), b)) {
                    i++;
                }
            }
            if (i != 1) {
                StringBuilder a = t33.a("'", b, "' must be unique. Actual [");
                ArrayList arrayList = new ArrayList();
                for (x5s x5sVar3 : x5sVarArr) {
                    if (epx.f(x5sVar3.b(), b)) {
                        arrayList.add(x5sVar3);
                    }
                }
                a.append(arrayList);
                a.append(']');
                vzw.a(a.toString());
            }
            z = z || x5sVar.a();
        }
        this.a = rl3.u0(x5sVarArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a6s) {
            return epx.f(this.a, ((a6s) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
