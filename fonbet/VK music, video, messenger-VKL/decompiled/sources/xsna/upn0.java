package xsna;

/* compiled from: SystemBarsConfig.kt */
/* loaded from: classes6.dex */
public final class upn0 {
    public final Integer a;
    public final boolean b;
    public final Integer c;

    public upn0(boolean z, Integer num, Integer num2) {
        this.a = num;
        this.b = z;
        this.c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof upn0)) {
            return false;
        }
        upn0 upn0Var = (upn0) obj;
        return epx.f(this.a, upn0Var.a) && this.b == upn0Var.b && epx.f(this.c, upn0Var.c);
    }

    public final int hashCode() {
        Integer num = this.a;
        int b = qoy.b((num == null ? 0 : num.hashCode()) * 31, 31, this.b);
        Integer num2 = this.c;
        return b + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SystemBarsConfig(statusColor=");
        sb.append(this.a);
        sb.append(", useLightIcons=");
        sb.append(this.b);
        sb.append(", navColor=");
        return uqi.b(sb, this.c, ')');
    }
}
