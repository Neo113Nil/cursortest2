package xsna;

/* compiled from: ContentProductsEvent.kt */
/* loaded from: classes18.dex */
public final class wjj implements ckj {
    public final hpd0 a;
    public final boolean b;
    public final int c;

    public wjj(hpd0 hpd0Var, boolean z, int i) {
        this.a = hpd0Var;
        this.b = z;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wjj)) {
            return false;
        }
        wjj wjjVar = (wjj) obj;
        return epx.f(this.a, wjjVar.a) && this.b == wjjVar.b && this.c == wjjVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + qoy.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChangeFave(productItem=");
        sb.append(this.a);
        sb.append(", isFave=");
        sb.append(this.b);
        sb.append(", position=");
        return vu5.b(sb, this.c, ')');
    }
}
