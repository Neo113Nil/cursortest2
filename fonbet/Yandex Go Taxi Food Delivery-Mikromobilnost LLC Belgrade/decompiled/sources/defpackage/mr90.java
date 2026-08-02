package defpackage;

/* loaded from: classes10.dex */
public final class mr90 extends tr90 {
    public final float c;
    public final float d;

    public mr90(float f, float f2) {
        super(3);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mr90)) {
            return false;
        }
        mr90 mr90Var = (mr90) obj;
        return Float.compare(this.c, mr90Var.c) == 0 && Float.compare(this.d, mr90Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeLineTo(dx=");
        sb.append(this.c);
        sb.append(", dy=");
        return n.n(sb, this.d, ')');
    }
}
