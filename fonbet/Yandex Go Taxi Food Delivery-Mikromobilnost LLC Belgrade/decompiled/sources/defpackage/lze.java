package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class lze {
    public final String a;
    public final String b;
    public final List c;

    public lze(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lze)) {
            return false;
        }
        lze lzeVar = (lze) obj;
        return this.a.equals(lzeVar.a) && jl40.l(this.b, lzeVar.b) && this.c.equals(lzeVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return ly3.s(b64.v("CounterModel(title=", this.a, ", trailText=", this.b, ", values="), this.c, Extension.C_BRAKE);
    }
}
