package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class d421 {
    public final Integer a;
    public final int b;
    public final int c;
    public final int d;

    public d421(int i, int i2, int i3, Integer num) {
        this.a = num;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d421)) {
            return false;
        }
        d421 d421Var = (d421) obj;
        return jl40.l(this.a, d421Var.a) && this.b == d421Var.b && this.c == d421Var.c && this.d == d421Var.d;
    }

    public final int hashCode() {
        Integer num = this.a;
        return Integer.hashCode(this.d) + oyr.b(this.c, oyr.b(this.b, (num == null ? 0 : num.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnseenViewEntity(rowId=");
        sb.append(this.a);
        sb.append(", unseen=");
        sb.append(this.b);
        sb.append(", unseenShow=");
        return ly3.k(this.c, this.d, ", threadsUnseenShow=", Extension.C_BRAKE, sb);
    }
}
