package xsna;

/* compiled from: PagingWithOffsetMvi.kt */
/* loaded from: classes4.dex */
public final class gf90 {
    public final Integer a;
    public final Integer b;

    public gf90() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf90)) {
            return false;
        }
        gf90 gf90Var = (gf90) obj;
        return epx.f(this.a, gf90Var.a) && epx.f(this.b, gf90Var.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingParams(pageSize=");
        sb.append(this.a);
        sb.append(", maxPageSize=");
        return uqi.b(sb, this.b, ')');
    }

    public gf90(Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
    }
}
