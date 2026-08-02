package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class dv3 {
    public final String a;
    public final List b;

    public dv3(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dv3)) {
            return false;
        }
        dv3 dv3Var = (dv3) obj;
        return jl40.l(this.a, dv3Var.a) && jl40.l(this.b, dv3Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return nnm.h("ButtonEntity(text=", this.a, ", actions=", Extension.C_BRAKE, this.b);
    }
}
