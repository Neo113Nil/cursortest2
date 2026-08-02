package xsna;

/* compiled from: AdProgress.kt */
/* loaded from: classes2.dex */
public final class qh0 {
    public final float a;
    public final Integer b;
    public final float c;

    public qh0(float f, Integer num, float f2) {
        this.a = f;
        this.b = num;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qh0)) {
            return false;
        }
        qh0 qh0Var = (qh0) obj;
        return Float.compare(this.a, qh0Var.a) == 0 && epx.f(this.b, qh0Var.b) && Float.compare(this.c, qh0Var.c) == 0;
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.a) * 31;
        Integer num = this.b;
        return Float.hashCode(this.c) + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Old(progress=");
        sb.append(this.a);
        sb.append(", untilCloseAble=");
        sb.append(this.b);
        sb.append(", timeLeft=");
        return xq.c(')', this.c, sb);
    }
}
