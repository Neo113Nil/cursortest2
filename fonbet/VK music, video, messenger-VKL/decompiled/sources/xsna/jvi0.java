package xsna;

/* compiled from: SessionRoomIdData.kt */
/* loaded from: classes7.dex */
public final class jvi0 {
    public final boolean a;
    public final int b;

    public jvi0(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jvi0)) {
            return false;
        }
        jvi0 jvi0Var = (jvi0) obj;
        return this.a == jvi0Var.a && this.b == jvi0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionRoomIdData(isMainCall=");
        sb.append(this.a);
        sb.append(", id=");
        return vu5.b(sb, this.b, ')');
    }
}
