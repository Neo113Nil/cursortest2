package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class oh10 {
    public final long a;
    public final String b;
    public final long c;

    public oh10(long j, long j2, String str) {
        this.a = j;
        this.b = str;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oh10)) {
            return false;
        }
        oh10 oh10Var = (oh10) obj;
        return this.a == oh10Var.a && jl40.l(this.b, oh10Var.b) && this.c == oh10Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + unr0.b(qv10.c(Long.hashCode(0L) * 31, 31, this.a), 31, this.b);
    }

    public final String toString() {
        return g8e.l(this.c, ", flags=", Extension.C_BRAKE, x4e.k("MemberEntity(sortOrder=0, internalChatId=", this.a, ", userId=", this.b));
    }
}
