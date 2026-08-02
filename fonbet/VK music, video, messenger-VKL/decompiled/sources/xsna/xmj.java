package xsna;

/* compiled from: Context.kt */
/* loaded from: classes2.dex */
public final class xmj {
    public final int a;
    public final int b;
    public final znk0 c;
    public final lfi0 d;

    public xmj(znk0 znk0Var, lfi0 lfi0Var) {
        int a = an10.a(4 * 0.4d);
        this.a = 4;
        this.b = a;
        this.c = znk0Var;
        this.d = lfi0Var;
        if (a < 1) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xmj)) {
            return false;
        }
        xmj xmjVar = (xmj) obj;
        return this.a == xmjVar.a && this.b == xmjVar.b && epx.f(this.c, xmjVar.c) && epx.f(this.d, xmjVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + shy.a(this.b, Integer.hashCode(this.a) * 31, 31)) * 31);
    }

    public final String toString() {
        return "Context(maxChildren=" + this.a + ", minChildren=" + this.b + ", splitter=" + this.c + ", selector=" + this.d + ')';
    }
}
