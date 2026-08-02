package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class nki0 extends z3b1 {
    public final String a;

    public nki0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nki0) && jl40.l(this.a, ((nki0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("RedBadgeModel(text=", this.a, Extension.C_BRAKE);
    }
}
