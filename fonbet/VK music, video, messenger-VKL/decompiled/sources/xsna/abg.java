package xsna;

/* compiled from: CommentDeletedItem.kt */
/* loaded from: classes16.dex */
public final class abg implements hfz {
    public final int b;
    public final boolean c;
    public final boolean d;
    public final int e;

    public abg(int i, int i2, boolean z, boolean z2) {
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abg)) {
            return false;
        }
        abg abgVar = (abg) obj;
        return this.b == abgVar.b && this.c == abgVar.c && this.d == abgVar.d && this.e == abgVar.e;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b);
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + qoy.b(qoy.b(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommentDeletedItem(id=");
        sb.append(this.b);
        sb.append(", isRestoreAvailable=");
        sb.append(this.c);
        sb.append(", isHighlighted=");
        sb.append(this.d);
        sb.append(", level=");
        return vu5.b(sb, this.e, ')');
    }
}
