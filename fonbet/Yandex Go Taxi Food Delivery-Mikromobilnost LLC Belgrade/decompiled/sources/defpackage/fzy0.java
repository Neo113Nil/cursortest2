package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class fzy0 {
    public final long a;
    public final String b;
    public final int c;
    public final Integer d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final long h;
    public final long i;

    public fzy0(long j, String str, int i, Integer num, boolean z, boolean z2, long j2, long j3, long j4) {
        this.a = j;
        this.b = str;
        this.c = i;
        this.d = num;
        this.e = z;
        this.f = z2;
        this.g = j2;
        this.h = j3;
        this.i = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fzy0)) {
            return false;
        }
        fzy0 fzy0Var = (fzy0) obj;
        return this.a == fzy0Var.a && jl40.l(this.b, fzy0Var.b) && this.c == fzy0Var.c && jl40.l(this.d, fzy0Var.d) && this.e == fzy0Var.e && this.f == fzy0Var.f && this.g == fzy0Var.g && this.h == fzy0Var.h && this.i == fzy0Var.i;
    }

    public final int hashCode() {
        int b = oyr.b(this.c, unr0.b(Long.hashCode(this.a) * 31, 31, this.b), 31);
        Integer num = this.d;
        return Long.hashCode(this.i) + qv10.c(qv10.c(unr0.e(unr0.e((b + (num == null ? 0 : num.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder k = x4e.k("ThreadViewEntity(threadInternalId=", this.a, ", threadId=", this.b);
        k.append(", unseenCount=");
        k.append(this.c);
        k.append(", firstUnseenRow=");
        k.append(this.d);
        n.z(", isHidden=", ", isMember=", k, this.e, this.f);
        x4e.A(this.g, ", sortTime=", ", parentInternalId=", k);
        k.append(this.h);
        return g8e.l(this.i, ", parentMessageTimestamp=", Extension.C_BRAKE, k);
    }
}
