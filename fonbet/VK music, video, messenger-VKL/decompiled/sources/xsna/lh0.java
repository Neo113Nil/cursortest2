package xsna;

/* compiled from: AdProductMapper.kt */
/* loaded from: classes18.dex */
public final class lh0 {
    public final String a;
    public final Integer b;

    public lh0(String str, Integer num) {
        this.a = str;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lh0)) {
            return false;
        }
        lh0 lh0Var = (lh0) obj;
        return epx.f(this.a, lh0Var.a) && epx.f(this.b, lh0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Label(title=");
        sb.append(this.a);
        sb.append(", labelColorRes=");
        return uqi.b(sb, this.b, ')');
    }
}
