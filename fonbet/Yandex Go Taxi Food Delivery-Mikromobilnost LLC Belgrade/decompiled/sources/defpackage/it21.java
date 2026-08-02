package defpackage;

import com.yandex.messaging.domain.statuses.StatusAvailability;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class it21 {
    public final String a;
    public final long b;
    public final StatusAvailability c;
    public final boolean d;
    public final long e;
    public final clf f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public it21(long j, StatusAvailability statusAvailability, boolean z, int i) {
        this("", r2, r4, z, 0L, null);
        long j2 = (i & 2) != 0 ? 0L : j;
        StatusAvailability statusAvailability2 = (i & 4) != 0 ? StatusAvailability.Default : statusAvailability;
        z = (i & 8) != 0 ? false : z;
        o430 o430Var = e3n.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof it21)) {
            return false;
        }
        it21 it21Var = (it21) obj;
        return jl40.l(this.a, it21Var.a) && this.b == it21Var.b && this.c == it21Var.c && this.d == it21Var.d && e3n.d(this.e, it21Var.e) && jl40.l(this.f, it21Var.f);
    }

    public final int hashCode() {
        int e = unr0.e((this.c.hashCode() + qv10.c(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
        o430 o430Var = e3n.b;
        int c = qv10.c(e, 31, this.e);
        clf clfVar = this.f;
        return c + (clfVar == null ? 0 : clfVar.hashCode());
    }

    public final String toString() {
        String p = e3n.p(this.e);
        StringBuilder l = x4e.l("UserStatus(guid=", this.a, ", timestamp=", this.b);
        l.append(", availability=");
        l.append(this.c);
        l.append(", muteNotifications=");
        l.append(this.d);
        l.append(", duration=");
        l.append(p);
        l.append(", customStatus=");
        l.append(this.f);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }

    public it21(String str, long j, StatusAvailability statusAvailability, boolean z, long j2, clf clfVar) {
        this.a = str;
        this.b = j;
        this.c = statusAvailability;
        this.d = z;
        this.e = j2;
        this.f = clfVar;
    }
}
