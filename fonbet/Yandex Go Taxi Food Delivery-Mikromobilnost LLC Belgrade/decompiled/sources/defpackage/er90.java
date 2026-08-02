package defpackage;

/* loaded from: classes10.dex */
public final class er90 extends tr90 {
    public final float c;
    public final float d;

    public er90(float f, float f2) {
        super(3);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er90)) {
            return false;
        }
        er90 er90Var = (er90) obj;
        return Float.compare(this.c, er90Var.c) == 0 && Float.compare(this.d, er90Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineTo(x=");
        sb.append(this.c);
        sb.append(", y=");
        return n.n(sb, this.d, ')');
    }
}
