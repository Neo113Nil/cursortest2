package xsna;

/* compiled from: BackHandler.kt */
/* loaded from: classes11.dex */
public final class av5 extends ny50 {
    public final Object a;
    public final long b;

    public av5(Object obj, long j) {
        this.a = obj;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof av5)) {
            return false;
        }
        av5 av5Var = (av5) obj;
        return epx.f(this.a, av5Var.a) && this.b == av5Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackHandlerInfo(owner=");
        sb.append(this.a);
        sb.append(", compositeKey=");
        return vu5.a(')', this.b, sb);
    }
}
