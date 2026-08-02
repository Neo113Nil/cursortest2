package xsna;

/* compiled from: AdLayoutProgress.kt */
/* loaded from: classes2.dex */
public final class gg0 {
    public final float a;
    public final Integer b;
    public final float c;

    public gg0(float f, Integer num, float f2) {
        this.a = f;
        this.b = num;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gg0)) {
            return false;
        }
        gg0 gg0Var = (gg0) obj;
        return Float.compare(this.a, gg0Var.a) == 0 && epx.f(this.b, gg0Var.b) && Float.compare(this.c, gg0Var.c) == 0;
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
