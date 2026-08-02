package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class gkn implements pi5 {
    public final long a;
    public final int b;
    public final w26 c;

    public gkn(long j, int i, w26 w26Var) {
        this.a = j;
        this.b = i;
        this.c = w26Var;
    }

    @Override // defpackage.pi5
    public final v26 a() {
        return this.c;
    }

    @Override // defpackage.pi5
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gkn)) {
            return false;
        }
        gkn gknVar = (gkn) obj;
        return this.a == gknVar.a && this.b == gknVar.b && this.c.equals(gknVar.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + oyr.b(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "EddystoneBeaconInfo(lastSeen=" + this.a + ", smoothedRssi=" + this.b + ", beacon=" + this.c + Extension.C_BRAKE;
    }
}
