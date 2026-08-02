package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class emc {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;

    public emc(String str, String str2, String str3, String str4, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof emc)) {
            return false;
        }
        emc emcVar = (emc) obj;
        return jl40.l(this.a, emcVar.a) && jl40.l(this.b, emcVar.b) && jl40.l(this.c, emcVar.c) && jl40.l(this.d, emcVar.d) && jl40.l(this.e, emcVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("CommentField(id=", this.a, ", analyticsId=", this.b, ", placeholder=");
        g8e.D(v, this.c, ", backgroundColor=", this.d, ", visibleOnRatings=");
        return ly3.s(v, this.e, Extension.C_BRAKE);
    }
}
