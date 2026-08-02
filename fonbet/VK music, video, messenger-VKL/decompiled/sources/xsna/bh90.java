package xsna;

/* compiled from: MultiParagraphIntrinsics.kt */
/* loaded from: classes11.dex */
public final class bh90 {
    public final bb2 a;
    public final int b;
    public final int c;

    public bh90(bb2 bb2Var, int i, int i2) {
        this.a = bb2Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bh90)) {
            return false;
        }
        bh90 bh90Var = (bh90) obj;
        return this.a.equals(bh90Var.a) && this.b == bh90Var.b && this.c == bh90Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + shy.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        return vu5.b(sb, this.c, ')');
    }
}
