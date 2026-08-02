package xsna;

/* compiled from: PlaylistCountsResponse.kt */
/* loaded from: classes16.dex */
public final class e8b0 {
    public final int a;
    public final int b;

    public e8b0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8b0)) {
            return false;
        }
        e8b0 e8b0Var = (e8b0) obj;
        return this.a == e8b0Var.a && this.b == e8b0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaylistCountsResponse(maxCount=");
        sb.append(this.a);
        sb.append(", count=");
        return vu5.b(sb, this.b, ')');
    }
}
