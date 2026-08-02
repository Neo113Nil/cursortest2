package xsna;

/* compiled from: DonutLevel.kt */
/* loaded from: classes2.dex */
public final class e0o {
    public final int a;
    public final String b;
    public final int c;
    public final boolean d;

    public e0o(int i, String str, int i2, boolean z) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0o)) {
            return false;
        }
        e0o e0oVar = (e0o) obj;
        return this.a == e0oVar.a && epx.f(this.b, e0oVar.b) && this.c == e0oVar.c && this.d == e0oVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + shy.a(this.c, urd0.a(Integer.hashCode(this.a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonutLevel(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", price=");
        sb.append(this.c);
        sb.append(", isHigherAvailable=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
