package defpackage;

/* loaded from: classes10.dex */
public final class e94 {
    public static final e94 d = new e94(0, 0, 0);
    public static final e94 e = new e94(1, 3, 2);
    public static final e94 f = new e94(1, 3, 1);
    public static final e94 g = new e94(6, 7, 1);
    public static final e94 h = new e94(6, 6, 1);
    public final int a;
    public final int b;
    public final int c;

    public e94(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e94)) {
            return false;
        }
        e94 e94Var = (e94) obj;
        return this.a == e94Var.a && this.b == e94Var.b && this.c == e94Var.c;
    }

    public final int hashCode() {
        return this.c ^ ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEncoderDataSpace{standard=");
        sb.append(this.a);
        sb.append(", transfer=");
        sb.append(this.b);
        sb.append(", range=");
        return oyr.m(this.c, "}", sb);
    }
}
