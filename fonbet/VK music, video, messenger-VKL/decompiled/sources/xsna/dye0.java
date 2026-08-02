package xsna;

/* compiled from: RatingMarksStatisticModel.kt */
/* loaded from: classes18.dex */
public final class dye0 {
    public final int a;
    public final int b;
    public final int c;

    public dye0(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dye0)) {
            return false;
        }
        dye0 dye0Var = (dye0) obj;
        return this.a == dye0Var.a && this.b == dye0Var.b && this.c == dye0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RatingMarksStatisticModel(mark=");
        sb.append(this.a);
        sb.append(", marksCount=");
        sb.append(this.b);
        sb.append(", percentage=");
        return vu5.b(sb, this.c, ')');
    }
}
