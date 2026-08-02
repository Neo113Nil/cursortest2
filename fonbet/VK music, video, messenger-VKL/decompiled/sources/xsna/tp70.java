package xsna;

/* compiled from: ComposeStackTraceBuilder.kt */
/* loaded from: classes11.dex */
public final class tp70 {
    public final int a;
    public final Integer b;

    public tp70(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp70)) {
            return false;
        }
        tp70 tp70Var = (tp70) obj;
        return this.a == tp70Var.a && epx.f(this.b, tp70Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ObjectLocation(group=");
        sb.append(this.a);
        sb.append(", dataOffset=");
        return uqi.b(sb, this.b, ')');
    }
}
