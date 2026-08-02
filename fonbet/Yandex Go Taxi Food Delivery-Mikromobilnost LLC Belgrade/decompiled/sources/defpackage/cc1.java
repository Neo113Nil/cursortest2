package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class cc1 {
    public final long a;
    public final String b;

    public cc1(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cc1)) {
            return false;
        }
        cc1 cc1Var = (cc1) obj;
        return this.a == cc1Var.a && jl40.l(this.b, cc1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + qv10.c(Long.hashCode(0L) * 31, 31, this.a);
    }

    public final String toString() {
        StringBuilder k = x4e.k("AdminEntity(sortOrder=0, internalChatId=", this.a, ", userId=", this.b);
        k.append(Extension.C_BRAKE);
        return k.toString();
    }
}
