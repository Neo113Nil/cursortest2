package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class nla {
    public final CharSequence a;
    public final List b;

    public nla(CharSequence charSequence, List list) {
        this.a = charSequence;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nla)) {
            return false;
        }
        nla nlaVar = (nla) obj;
        return jl40.l(this.a, nlaVar.a) && jl40.l(this.b, nlaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "HowItWorksGroup(title=" + ((Object) this.a) + ", items=" + this.b + Extension.C_BRAKE;
    }
}
