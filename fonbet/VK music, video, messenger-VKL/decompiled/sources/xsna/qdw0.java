package xsna;

/* compiled from: VoipAnimatedAvatar.kt */
/* loaded from: classes7.dex */
public final class qdw0 {
    public final String a;
    public final int b;
    public final int c;

    public qdw0(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qdw0)) {
            return false;
        }
        qdw0 qdw0Var = (qdw0) obj;
        return epx.f(this.a, qdw0Var.a) && this.b == qdw0Var.b && this.c == qdw0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + shy.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VoipAnimatedAvatar(url=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        return vu5.b(sb, this.c, ')');
    }
}
