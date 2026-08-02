package xsna;

/* compiled from: GoodPreviewContent.kt */
/* loaded from: classes18.dex */
public final class f7u {
    public final int a;
    public final int b;

    public f7u(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7u)) {
            return false;
        }
        f7u f7uVar = (f7u) obj;
        return this.a == f7uVar.a && this.b == f7uVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GoodPreviewToolbarBadges(bookmarksCount=");
        sb.append(this.a);
        sb.append(", cartGoodsCount=");
        return vu5.b(sb, this.b, ')');
    }
}
