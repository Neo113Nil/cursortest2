package xsna;

/* compiled from: PagingWithOffsetMvi.kt */
/* loaded from: classes18.dex */
public final class ff90 {
    public final String a;
    public final Integer b;
    public final Integer c;

    public ff90() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ff90)) {
            return false;
        }
        ff90 ff90Var = (ff90) obj;
        return epx.f(this.a, ff90Var.a) && epx.f(this.b, ff90Var.b) && epx.f(this.c, ff90Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingParams(emptyMessage=");
        sb.append(this.a);
        sb.append(", pageSize=");
        sb.append(this.b);
        sb.append(", maxPageSize=");
        return uqi.b(sb, this.c, ')');
    }

    public ff90(String str, Integer num, Integer num2) {
        this.a = str;
        this.b = num;
        this.c = num2;
    }
}
