package xsna;

/* compiled from: DiscoverMediaPreviewSizeResolver.kt */
/* loaded from: classes4.dex */
public final class o4n {
    public final int a;
    public final int b;

    public o4n(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4n)) {
            return false;
        }
        o4n o4nVar = (o4n) obj;
        return this.a == o4nVar.a && this.b == o4nVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoverMediaPreviewSize(width=");
        sb.append(this.a);
        sb.append(", height=");
        return vu5.b(sb, this.b, ')');
    }
}
