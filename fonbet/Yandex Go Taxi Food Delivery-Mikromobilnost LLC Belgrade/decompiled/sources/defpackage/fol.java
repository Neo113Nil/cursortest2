package defpackage;

/* loaded from: classes11.dex */
public final class fol {
    public final int a;
    public final int b;

    public fol(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fol)) {
            return false;
        }
        fol folVar = (fol) obj;
        return this.a == folVar.a && this.b == folVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DivVideoResolution(width=");
        sb.append(this.a);
        sb.append(", height=");
        return oyr.s(sb, this.b, ')');
    }
}
