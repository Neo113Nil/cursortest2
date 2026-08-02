package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class j4 {
    public final String a;
    public final long b;

    public j4(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4)) {
            return false;
        }
        j4 j4Var = (j4) obj;
        return jl40.l(this.a, j4Var.a) && this.b == j4Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder l = x4e.l("AbandonedCartDeliveredNotification(id=", this.a, ", deliveredTimeMillis=", this.b);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
