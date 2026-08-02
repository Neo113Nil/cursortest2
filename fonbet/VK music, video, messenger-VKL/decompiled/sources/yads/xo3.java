package yads;

/* loaded from: classes10.dex */
public final class xo3 {
    public final zo3 a;

    public /* synthetic */ xo3() {
        this(zo3.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xo3) && this.a == ((xo3) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "WebViewAdSettings(cacheMode=" + this.a + ")";
    }

    public xo3(zo3 zo3Var) {
        this.a = zo3Var;
    }
}
