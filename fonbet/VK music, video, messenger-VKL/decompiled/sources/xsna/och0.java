package xsna;

/* compiled from: ScreenNormalizedPosition.kt */
/* loaded from: classes4.dex */
public final class och0 {
    public final float a;
    public final float b;

    public och0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof och0)) {
            return false;
        }
        och0 och0Var = (och0) obj;
        return Float.compare(this.a, och0Var.a) == 0 && Float.compare(this.b, och0Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScreenNormalizedPosition(x=");
        sb.append(this.a);
        sb.append(", y=");
        return xq.c(')', this.b, sb);
    }
}
