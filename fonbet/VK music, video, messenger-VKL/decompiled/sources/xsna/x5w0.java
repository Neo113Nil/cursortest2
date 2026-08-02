package xsna;

/* compiled from: VmojiAvatarDto.kt */
/* loaded from: classes7.dex */
public final class x5w0 {
    public final String a;
    public final int b;
    public final int c;

    public x5w0(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5w0)) {
            return false;
        }
        x5w0 x5w0Var = (x5w0) obj;
        return epx.f(this.a, x5w0Var.a) && this.b == x5w0Var.b && this.c == x5w0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + shy.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VmojiAvatarDto(url=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        return vu5.b(sb, this.c, ')');
    }
}
