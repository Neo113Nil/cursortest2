package xsna;

/* compiled from: ColorParams.kt */
/* loaded from: classes14.dex */
public final class z6g {
    public final int a;
    public final int b;

    public z6g(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6g)) {
            return false;
        }
        z6g z6gVar = (z6g) obj;
        return this.a == z6gVar.a && this.b == z6gVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorParams(backgroundColor=");
        sb.append(this.a);
        sb.append(", textColor=");
        return vu5.b(sb, this.b, ')');
    }
}
