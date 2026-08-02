package xsna;

/* compiled from: ReviewCardModel.kt */
/* loaded from: classes18.dex */
public final class wgg0 {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;

    public wgg0(long j, String str, String str2, String str3, int i) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wgg0)) {
            return false;
        }
        wgg0 wgg0Var = (wgg0) obj;
        return this.a == wgg0Var.a && epx.f(this.b, wgg0Var.b) && epx.f(this.c, wgg0Var.c) && epx.f(this.d, wgg0Var.d) && this.e == wgg0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + urd0.a(urd0.a(urd0.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReviewCardModel(itemId=");
        sb.append(this.a);
        sb.append(", productImageUrl=");
        sb.append(this.b);
        sb.append(", productName=");
        sb.append(this.c);
        sb.append(", productDescription=");
        sb.append(this.d);
        sb.append(", rating=");
        return vu5.b(sb, this.e, ')');
    }
}
