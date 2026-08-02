package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class pla implements qla {
    public final CharSequence a;
    public final List b;
    public final List c;
    public final boolean d;

    public pla(CharSequence charSequence, List list, List list2, boolean z) {
        this.a = charSequence;
        this.b = list;
        this.c = list2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pla)) {
            return false;
        }
        pla plaVar = (pla) obj;
        return jl40.l(this.a, plaVar.a) && jl40.l(this.b, plaVar.b) && jl40.l(this.c, plaVar.c) && this.d == plaVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.c(unr0.c(this.a.hashCode() * 31, 31, this.b), 961, this.c);
    }

    public final String toString() {
        return "PurchasedPasses(title=" + ((Object) this.a) + ", passes=" + this.b + ", bottomButtons=" + this.c + ", notification=null, isShimmered=" + this.d + Extension.C_BRAKE;
    }
}
