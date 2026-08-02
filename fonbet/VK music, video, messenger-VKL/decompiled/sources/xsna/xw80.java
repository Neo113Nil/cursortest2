package xsna;

import java.util.List;

/* compiled from: CheckoutOrderProduct.kt */
/* loaded from: classes18.dex */
public final class xw80 {
    public final long a;
    public final String b;
    public final String c;
    public final k6d0 d;
    public final int e;
    public final fpd0 f;
    public final List<jrd0> g;
    public final Float h;
    public final int i;

    public xw80(long j, String str, String str2, k6d0 k6d0Var, int i, fpd0 fpd0Var, List<jrd0> list, Float f, int i2) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = k6d0Var;
        this.e = i;
        this.f = fpd0Var;
        this.g = list;
        this.h = f;
        this.i = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xw80)) {
            return false;
        }
        xw80 xw80Var = (xw80) obj;
        return this.a == xw80Var.a && epx.f(this.b, xw80Var.b) && epx.f(this.c, xw80Var.c) && epx.f(this.d, xw80Var.d) && this.e == xw80Var.e && epx.f(this.f, xw80Var.f) && epx.f(this.g, xw80Var.g) && epx.f(this.h, xw80Var.h) && this.i == xw80Var.i;
    }

    public final int hashCode() {
        int a = fw3.a((this.f.hashCode() + shy.a(this.e, (this.d.hashCode() + urd0.a(urd0.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31, 31)) * 31, 31, this.g);
        Float f = this.h;
        return Integer.hashCode(this.i) + ((a + (f == null ? 0 : f.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrderProduct(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", price=");
        sb.append(this.d);
        sb.append(", amount=");
        sb.append(this.e);
        sb.append(", image=");
        sb.append(this.f);
        sb.append(", properties=");
        sb.append(this.g);
        sb.append(", rating=");
        sb.append(this.h);
        sb.append(", numOfReviews=");
        return vu5.b(sb, this.i, ')');
    }
}
