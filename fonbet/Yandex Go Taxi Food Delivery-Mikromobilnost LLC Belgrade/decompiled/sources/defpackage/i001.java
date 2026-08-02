package defpackage;

import java.util.Date;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class i001 implements j001 {
    public final zzs a;
    public final double b;
    public final Date c;

    public i001(zzs zzsVar, double d, Date date) {
        this.a = zzsVar;
        this.b = d;
        this.c = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i001)) {
            return false;
        }
        i001 i001Var = (i001) obj;
        return jl40.l(this.a, i001Var.a) && Double.compare(this.b, i001Var.b) == 0 && jl40.l(this.c, i001Var.c);
    }

    @Override // defpackage.j001
    public final zzs getCoordinates() {
        return this.a;
    }

    @Override // defpackage.j001
    public final double getDirection() {
        return this.b;
    }

    @Override // defpackage.j001
    public final Date getTimestamp() {
        return this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "Synthetic(coordinates=" + this.a + ", direction=" + this.b + ", timestamp=" + this.c + Extension.C_BRAKE;
    }
}
