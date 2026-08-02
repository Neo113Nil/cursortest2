package defpackage;

/* loaded from: classes10.dex */
public final class nr90 extends tr90 {
    public final float c;
    public final float d;

    public nr90(float f, float f2) {
        super(3);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nr90)) {
            return false;
        }
        nr90 nr90Var = (nr90) obj;
        return Float.compare(this.c, nr90Var.c) == 0 && Float.compare(this.d, nr90Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeMoveTo(dx=");
        sb.append(this.c);
        sb.append(", dy=");
        return n.n(sb, this.d, ')');
    }
}
