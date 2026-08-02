package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class myc {
    public final String a;
    public final az6 b;
    public final long c;
    public final long d;
    public final lzr e;
    public final boolean f;

    public myc(String str, az6 az6Var, long j, long j2, lzr lzrVar, boolean z) {
        this.a = str;
        this.b = az6Var;
        this.c = j;
        this.d = j2;
        this.e = lzrVar;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof myc)) {
            return false;
        }
        myc mycVar = (myc) obj;
        return jl40.l(this.a, mycVar.a) && jl40.l(this.b, mycVar.b) && ldc.c(this.c, mycVar.c) && ldc.c(this.d, mycVar.d) && jl40.l(this.e, mycVar.e) && this.f == mycVar.f;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = ldc.n;
        return Boolean.hashCode(this.f) + ((qv10.c(qv10.c(hashCode, 31, this.c), 31, this.d) + this.e.a) * 31);
    }

    public final String toString() {
        String i = ldc.i(this.c);
        String i2 = ldc.i(this.d);
        StringBuilder sb = new StringBuilder("CompleteButtonModel(title=");
        sb.append(this.a);
        sb.append(", action=");
        sb.append(this.b);
        sb.append(", color=");
        g8e.D(sb, i, ", textColor=", i2, ", fontWeight=");
        sb.append(this.e);
        sb.append(", isShimmering=");
        sb.append(this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
