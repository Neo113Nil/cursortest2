package xsna;

/* compiled from: ProductCategory.kt */
/* loaded from: classes18.dex */
public final class rnd0 {
    public final int a;
    public final String b;
    public final boolean c;

    public rnd0(int i, String str, boolean z) {
        this.a = i;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rnd0)) {
            return false;
        }
        rnd0 rnd0Var = (rnd0) obj;
        return this.a == rnd0Var.a && epx.f(this.b, rnd0Var.b) && this.c == rnd0Var.c;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductCategory(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", isPriceListService=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
