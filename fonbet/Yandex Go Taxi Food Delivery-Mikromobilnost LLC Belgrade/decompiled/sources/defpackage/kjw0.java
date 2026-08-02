package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class kjw0 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;

    public kjw0(String str, String str2, String str3, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjw0)) {
            return false;
        }
        kjw0 kjw0Var = (kjw0) obj;
        return jl40.l(this.a, kjw0Var.a) && jl40.l(this.b, kjw0Var.b) && jl40.l(this.c, kjw0Var.c) && this.d.equals(kjw0Var.d);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return tse0.j(this.c, ", items=", Extension.C_BRAKE, b64.v("SupportItems(title=", this.a, ", subtitle=", this.b, ", iconTag="), this.d);
    }
}
