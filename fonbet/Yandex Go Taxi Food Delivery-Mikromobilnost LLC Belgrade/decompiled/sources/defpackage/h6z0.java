package defpackage;

import java.time.ZonedDateTime;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class h6z0 {
    public final String a;
    public final ZonedDateTime b;
    public final String c;

    public h6z0(String str, ZonedDateTime zonedDateTime, String str2) {
        this.a = str;
        this.b = zonedDateTime;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6z0)) {
            return false;
        }
        h6z0 h6z0Var = (h6z0) obj;
        return jl40.l(this.a, h6z0Var.a) && this.b.equals(h6z0Var.b) && jl40.l(this.c, h6z0Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimeInterval(interval=");
        sb.append(this.a);
        sb.append(", dateTime=");
        sb.append(this.b);
        sb.append(", price=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
