package defpackage;

import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class jc41 {
    public final String a;
    public final png b;
    public final Set c;

    public jc41(String str, png pngVar, Set set) {
        this.a = str;
        this.b = pngVar;
        this.c = set;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jc41)) {
            return false;
        }
        jc41 jc41Var = (jc41) obj;
        return this.a.equals(jc41Var.a) && jl40.l(this.b, jc41Var.b) && this.c.equals(jc41Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        String a = z28.a(this.a);
        StringBuilder sb = new StringBuilder("WebCapabilityInfo(id=");
        sb.append(a);
        sb.append(", currentState=");
        sb.append(this.b);
        sb.append(", supportedDirectives=");
        return vfc.q(sb, this.c, Extension.C_BRAKE);
    }
}
