package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class d9j {
    public final String a;
    public final ArrayList b;

    public d9j(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d9j)) {
            return false;
        }
        d9j d9jVar = (d9j) obj;
        return jl40.l(this.a, d9jVar.a) && this.b.equals(d9jVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return n.k("DetailsSection(title=", this.a, ", items=", Extension.C_BRAKE, this.b);
    }
}
