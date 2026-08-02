package xsna;

/* compiled from: AdProgress.kt */
/* loaded from: classes8.dex */
public final class rh0 {
    public final int a;
    public final Integer b;
    public final int c;

    public rh0(int i, int i2, Integer num) {
        this.a = i;
        this.b = num;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rh0)) {
            return false;
        }
        rh0 rh0Var = (rh0) obj;
        return this.a == rh0Var.a && epx.f(this.b, rh0Var.b) && this.c == rh0Var.c;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return Integer.hashCode(this.c) + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdProgress(currentMs=");
        sb.append(this.a);
        sb.append(", timeUntilCloseAdMs=");
        sb.append(this.b);
        sb.append(", leftTimeMs=");
        return h5s.c(this.c, ")", sb);
    }
}
