package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class fsx {
    public final int a;
    public final String b;
    public final List c;

    public fsx(int i, String str, List list) {
        this.a = i;
        this.b = str;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fsx)) {
            return false;
        }
        fsx fsxVar = (fsx) obj;
        return this.a == fsxVar.a && jl40.l(this.b, fsxVar.b) && jl40.l(this.c, fsxVar.c);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.c;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return ly3.s(unr0.v(this.a, "LastFeedback(score=", ", comment=", this.b, ", reasonIds="), this.c, Extension.C_BRAKE);
    }
}
