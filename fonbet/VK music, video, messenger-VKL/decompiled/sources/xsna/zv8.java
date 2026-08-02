package xsna;

/* compiled from: CacheData.kt */
/* loaded from: classes17.dex */
public final class zv8 {
    public final int a;
    public final int b;

    public zv8(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv8)) {
            return false;
        }
        zv8 zv8Var = (zv8) obj;
        return this.a == zv8Var.a && this.b == zv8Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CacheData(sessionId=");
        sb.append(this.a);
        sb.append(", itemsCount=");
        return vu5.b(sb, this.b, ')');
    }
}
