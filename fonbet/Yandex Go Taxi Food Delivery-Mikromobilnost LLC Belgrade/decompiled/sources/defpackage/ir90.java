package defpackage;

/* loaded from: classes10.dex */
public final class ir90 extends tr90 {
    public final float c;
    public final float d;

    public ir90(float f, float f2) {
        super(1);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ir90)) {
            return false;
        }
        ir90 ir90Var = (ir90) obj;
        return Float.compare(this.c, ir90Var.c) == 0 && Float.compare(this.d, ir90Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveQuadTo(x=");
        sb.append(this.c);
        sb.append(", y=");
        return n.n(sb, this.d, ')');
    }
}
