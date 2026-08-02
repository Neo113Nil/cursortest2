package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class a3p {
    public final List a;
    public final int b;
    public final String c;

    public a3p(List list, int i, String str) {
        this.a = list;
        this.b = i;
        this.c = str;
    }

    public final int a() {
        return this.b;
    }

    public final List b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3p)) {
            return false;
        }
        a3p a3pVar = (a3p) obj;
        return jl40.l(this.a, a3pVar.a) && this.b == a3pVar.b && jl40.l(this.c, a3pVar.c);
    }

    public final int hashCode() {
        int b = oyr.b(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Timeline(items=");
        sb.append(this.a);
        sb.append(", currentItem=");
        sb.append(this.b);
        sb.append(", accessibilityText=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
