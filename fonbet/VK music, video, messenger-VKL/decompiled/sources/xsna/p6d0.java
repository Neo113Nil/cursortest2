package xsna;

/* compiled from: FilterItems.kt */
/* loaded from: classes18.dex */
public final class p6d0 {
    public final Integer a;
    public final Integer b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p6d0() {
        this(3, r0, r0);
        Integer num = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6d0)) {
            return false;
        }
        p6d0 p6d0Var = (p6d0) obj;
        return epx.f(this.a, p6d0Var.a) && epx.f(this.b, p6d0Var.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PriceRange(from=");
        sb.append(this.a);
        sb.append(", to=");
        return uqi.b(sb, this.b, ')');
    }

    public /* synthetic */ p6d0(int i, Integer num, Integer num2) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }

    public p6d0(Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
    }
}
