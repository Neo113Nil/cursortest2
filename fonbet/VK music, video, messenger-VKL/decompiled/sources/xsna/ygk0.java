package xsna;

/* compiled from: SpaceItem.kt */
/* loaded from: classes18.dex */
public final class ygk0 implements hfz {
    public final int b;
    public final int c;

    public ygk0(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ygk0)) {
            return false;
        }
        ygk0 ygk0Var = (ygk0) obj;
        return this.b == ygk0Var.b && this.c == ygk0Var.c;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.c);
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpaceItem(spaceInDp=");
        sb.append(this.b);
        sb.append(", id=");
        return vu5.b(sb, this.c, ')');
    }
}
