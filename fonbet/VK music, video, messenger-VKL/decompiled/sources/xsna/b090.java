package xsna;

import java.util.List;

/* compiled from: OtherGoodsHolder.kt */
/* loaded from: classes18.dex */
public final class b090 {
    public final List<a090> a;
    public final int b;
    public final e090 c;
    public final String d;
    public final String e;

    public b090(List<a090> list, int i, e090 e090Var, String str, String str2) {
        this.a = list;
        this.b = i;
        this.c = e090Var;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b090)) {
            return false;
        }
        b090 b090Var = (b090) obj;
        return epx.f(this.a, b090Var.a) && this.b == b090Var.b && epx.f(this.c, b090Var.c) && epx.f(this.d, b090Var.d) && epx.f(this.e, b090Var.e);
    }

    public final int hashCode() {
        List<a090> list = this.a;
        return this.e.hashCode() + urd0.a((this.c.hashCode() + shy.a(this.b, (list == null ? 0 : list.hashCode()) * 31, 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OtherGoodsDataHolder(goods=");
        sb.append(this.a);
        sb.append(", viewType=");
        sb.append(this.b);
        sb.append(", statArgs=");
        sb.append(this.c);
        sb.append(", rootRefScreen=");
        sb.append(this.d);
        sb.append(", refPostId=");
        return ho8.a(sb, this.e, ')');
    }
}
