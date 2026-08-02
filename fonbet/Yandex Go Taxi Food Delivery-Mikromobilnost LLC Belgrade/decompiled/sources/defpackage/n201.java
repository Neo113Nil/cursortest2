package defpackage;

import java.util.Date;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class n201 {
    public final String a;
    public final List b;
    public final Date c;

    public n201(List list, String str, Date date) {
        this.a = str;
        this.b = list;
        this.c = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n201)) {
            return false;
        }
        n201 n201Var = (n201) obj;
        return this.a.equals(n201Var.a) && this.b.equals(n201Var.b) && jl40.l(this.c, n201Var.c);
    }

    public final int hashCode() {
        int c = unr0.c(this.a.hashCode() * 31, 31, this.b);
        Date date = this.c;
        return c + (date == null ? 0 : date.hashCode());
    }

    public final String toString() {
        StringBuilder r = xvz.r("TrackerRemoteActiveRoute(uri=", this.a, ", points=", this.b, ", activationDate=");
        r.append(this.c);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
