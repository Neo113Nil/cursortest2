package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class d43 {
    public final zzs a;
    public final zzs b;
    public final zzs c;

    public d43(zzs zzsVar, zzs zzsVar2, zzs zzsVar3) {
        this.a = zzsVar;
        this.b = zzsVar2;
        this.c = zzsVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d43)) {
            return false;
        }
        d43 d43Var = (d43) obj;
        return this.a.equals(d43Var.a) && this.b.equals(d43Var.b) && this.c.equals(d43Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + nnm.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AreaAnalyticsData(center=" + this.a + ", topLeft=" + this.b + ", bottomRight=" + this.c + Extension.C_BRAKE;
    }
}
