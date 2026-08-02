package xsna;

/* compiled from: MessageVisibilityInfo.kt */
/* loaded from: classes16.dex */
public final class id20 {
    public final float a;
    public final Float b;

    public id20(float f, Float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof id20)) {
            return false;
        }
        id20 id20Var = (id20) obj;
        return Float.compare(this.a, id20Var.a) == 0 && epx.f(this.b, id20Var.b);
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.a) * 31;
        Float f = this.b;
        return hashCode + (f == null ? 0 : f.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessageVisibilityInfo(heightRelativeScreen=");
        sb.append(this.a);
        sb.append(", heightRelativeBubble=");
        return so.b(sb, this.b, ')');
    }
}
