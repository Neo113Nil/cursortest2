package xsna;

/* compiled from: ContentProductsEvent.kt */
/* loaded from: classes18.dex */
public final class xjj implements ckj {
    public final hpd0 a;
    public final int b;

    public xjj(hpd0 hpd0Var, int i) {
        this.a = hpd0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xjj)) {
            return false;
        }
        xjj xjjVar = (xjj) obj;
        return epx.f(this.a, xjjVar.a) && this.b == xjjVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Show(productItem=");
        sb.append(this.a);
        sb.append(", position=");
        return vu5.b(sb, this.b, ')');
    }
}
