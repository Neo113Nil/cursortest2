package defpackage;

import android.graphics.PointF;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class pgp {
    public final String a;
    public final zzs b;
    public final String c;
    public final String d;
    public final PointF e;

    public pgp(String str, zzs zzsVar, String str2, String str3, PointF pointF) {
        this.a = str;
        this.b = zzsVar;
        this.c = str2;
        this.d = str3;
        this.e = pointF;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pgp)) {
            return false;
        }
        pgp pgpVar = (pgp) obj;
        return jl40.l(this.a, pgpVar.a) && jl40.l(this.b, pgpVar.b) && this.c.equals(pgpVar.c) && this.d.equals(pgpVar.d) && this.e.equals(pgpVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(unr0.b(nnm.b(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FavoriteOrganizationPin(id=");
        sb.append(this.a);
        sb.append(", geoPoint=");
        sb.append(this.b);
        sb.append(", title=");
        g8e.D(sb, this.c, ", pinIconUrl=", this.d, ", pinAnchor=");
        sb.append(this.e);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
