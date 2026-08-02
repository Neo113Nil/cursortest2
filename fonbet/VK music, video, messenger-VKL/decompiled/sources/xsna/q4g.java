package xsna;

/* compiled from: SemanticsProperties.kt */
/* loaded from: classes11.dex */
public final class q4g {
    public final int a;
    public final int b;

    public q4g(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4g)) {
            return false;
        }
        q4g q4gVar = (q4g) obj;
        return this.a == q4gVar.a && this.b == q4gVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectionInfo(rowCount=");
        sb.append(this.a);
        sb.append(", columnCount=");
        return vu5.b(sb, this.b, ')');
    }
}
