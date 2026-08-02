package xsna;

/* compiled from: RelativeScrollPosition.kt */
/* loaded from: classes16.dex */
public final class btf0 {
    public static final btf0 c = new btf0(0, 0);
    public final int a;
    public final int b;

    public btf0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btf0)) {
            return false;
        }
        btf0 btf0Var = (btf0) obj;
        return this.a == btf0Var.a && this.b == btf0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeScrollPosition(position=");
        sb.append(this.a);
        sb.append(", offset=");
        return vu5.b(sb, this.b, ')');
    }
}
