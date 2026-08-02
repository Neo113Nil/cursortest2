package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class b9b0 {
    public final List a;
    public final boolean b;

    public b9b0(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final ArrayList a() {
        List list = this.a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((n9b0) it.next()).b());
        }
        return arrayList;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b9b0)) {
            return false;
        }
        b9b0 b9b0Var = (b9b0) obj;
        return this.a.equals(b9b0Var.a) && this.b == b9b0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.o(this.a, "State(items=", ", isRootLevel=", Extension.C_BRAKE, this.b);
    }
}
