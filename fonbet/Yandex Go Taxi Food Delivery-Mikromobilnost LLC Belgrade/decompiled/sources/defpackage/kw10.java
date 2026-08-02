package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class kw10 {
    public final String a;
    public final List b;

    public kw10(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw10)) {
            return false;
        }
        kw10 kw10Var = (kw10) obj;
        return jl40.l(this.a, kw10Var.a) && jl40.l(this.b, kw10Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return nnm.h("MessageTextData(text=", this.a, ", textSpans=", Extension.C_BRAKE, this.b);
    }
}
