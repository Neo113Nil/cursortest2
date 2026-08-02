package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class j201 implements l201 {
    public final String a;
    public final List b;

    public /* synthetic */ j201(String str, int i) {
        this((i & 1) != 0 ? null : str, (List) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j201)) {
            return false;
        }
        j201 j201Var = (j201) obj;
        return jl40.l(this.a, j201Var.a) && jl40.l(this.b, j201Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return nnm.h("Previous(id=", this.a, ", points=", Extension.C_BRAKE, this.b);
    }

    public j201() {
        this((String) null, 3);
    }

    public j201(String str, List list) {
        this.a = str;
        this.b = list;
    }
}
