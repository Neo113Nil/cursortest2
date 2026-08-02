package defpackage;

/* loaded from: classes10.dex */
public final class hcc {
    public final int a;
    public final int b;

    public hcc(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hcc)) {
            return false;
        }
        hcc hccVar = (hcc) obj;
        return this.a == hccVar.a && this.b == hccVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectionInfo(rowCount=");
        sb.append(this.a);
        sb.append(", columnCount=");
        return oyr.s(sb, this.b, ')');
    }
}
