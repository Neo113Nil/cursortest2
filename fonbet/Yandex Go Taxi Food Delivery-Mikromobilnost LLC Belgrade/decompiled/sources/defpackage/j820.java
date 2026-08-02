package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class j820 {
    public static final i820 Companion = new i820();
    public final Long a;
    public final Long b;
    public final long c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;

    public /* synthetic */ j820(int i, Long l, Long l2, long j, boolean z, boolean z2, boolean z3, String str) {
        if (55 != (i & 55)) {
            qje.Z(i, 55, h820.a.getDescriptor());
            throw null;
        }
        this.a = l;
        this.b = l2;
        this.c = j;
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
        this.e = z2;
        this.f = z3;
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j820)) {
            return false;
        }
        j820 j820Var = (j820) obj;
        return jl40.l(this.a, j820Var.a) && jl40.l(this.b, j820Var.b) && this.c == j820Var.c && this.d == j820Var.d && this.e == j820Var.e && this.f == j820Var.f && jl40.l(this.g, j820Var.g);
    }

    public final int hashCode() {
        Long l = this.a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int e = unr0.e(unr0.e(unr0.e(qv10.c((hashCode + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        return e + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MetaData(freshTimeInterval=");
        sb.append(this.a);
        sb.append(", staleTimeInterval=");
        sb.append(this.b);
        sb.append(", timestamp=");
        sb.append(this.c);
        sb.append(", staleIfError=");
        sb.append(this.d);
        n.z(", deleteAfterUse=", ", saveInMemory=", sb, this.e, this.f);
        return unr0.r(sb, ", cacheLabel=", this.g, Extension.C_BRAKE);
    }

    public j820(Long l, Long l2, long j, boolean z, boolean z2, boolean z3, String str) {
        this.a = l;
        this.b = l2;
        this.c = j;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = str;
    }
}
