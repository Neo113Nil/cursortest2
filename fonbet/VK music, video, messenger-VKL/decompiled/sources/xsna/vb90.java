package xsna;

/* compiled from: AuthorHeaderPicturePager.kt */
/* loaded from: classes5.dex */
public final class vb90 {
    public final int a;
    public final int b;
    public final boolean c;

    public vb90(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vb90)) {
            return false;
        }
        vb90 vb90Var = (vb90) obj;
        return this.a == vb90Var.a && this.b == vb90Var.b && this.c == vb90Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagerPageSnapshot(mediaCurrentPageIndex=");
        sb.append(this.a);
        sb.append(", mediaSettledPageIndex=");
        sb.append(this.b);
        sb.append(", isScrollInProgress=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
