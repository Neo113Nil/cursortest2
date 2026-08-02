package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class l5b0 {
    public final long a;
    public final String b;
    public final long c;
    public final boolean d;

    public l5b0(long j, String str, long j2, boolean z) {
        this.a = j;
        this.b = str;
        this.c = j2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l5b0)) {
            return false;
        }
        l5b0 l5b0Var = (l5b0) obj;
        return this.a == l5b0Var.a && jl40.l(this.b, l5b0Var.b) && this.c == l5b0Var.c && this.d == l5b0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qv10.c(unr0.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder k = x4e.k("PersonalMentionsEntity(rowId=", this.a, ", chatId=", this.b);
        x4e.A(this.c, ", messageTimestamp=", ", isThread=", k);
        return x4e.i(k, this.d, Extension.C_BRAKE);
    }
}
