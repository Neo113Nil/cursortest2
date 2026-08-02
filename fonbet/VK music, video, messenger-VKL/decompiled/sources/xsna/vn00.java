package xsna;

/* compiled from: Margins.kt */
/* loaded from: classes16.dex */
public final class vn00 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public vn00(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vn00)) {
            return false;
        }
        vn00 vn00Var = (vn00) obj;
        return Float.compare(this.a, vn00Var.a) == 0 && Float.compare(this.b, vn00Var.b) == 0 && Float.compare(this.c, vn00Var.c) == 0 && Float.compare(this.d, vn00Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Margins(bottom=");
        sb.append(this.a);
        sb.append(", left=");
        sb.append(this.b);
        sb.append(", top=");
        sb.append(this.c);
        sb.append(", right=");
        return xq.c(')', this.d, sb);
    }
}
