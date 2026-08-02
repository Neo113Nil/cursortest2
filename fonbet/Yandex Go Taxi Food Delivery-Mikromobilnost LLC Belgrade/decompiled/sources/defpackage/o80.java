package defpackage;

/* loaded from: classes11.dex */
public final class o80 {
    public final int a;
    public final int b;

    public o80(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o80)) {
            return false;
        }
        o80 o80Var = (o80) obj;
        return this.a == o80Var.a && this.b == o80Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(maxLines=");
        sb.append(this.a);
        sb.append(", minHiddenLines=");
        return oyr.s(sb, this.b, ')');
    }
}
