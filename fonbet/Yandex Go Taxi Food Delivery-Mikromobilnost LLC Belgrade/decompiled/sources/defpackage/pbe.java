package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class pbe {
    public final String a;
    public final ArrayList b;

    public pbe(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pbe)) {
            return false;
        }
        pbe pbeVar = (pbe) obj;
        return jl40.l(this.a, pbeVar.a) && this.b.equals(pbeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return n.k("ContactSection(letter=", this.a, ", items=", Extension.C_BRAKE, this.b);
    }
}
