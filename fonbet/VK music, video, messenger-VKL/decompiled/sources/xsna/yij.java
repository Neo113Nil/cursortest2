package xsna;

/* compiled from: ContentProductsAction.kt */
/* loaded from: classes18.dex */
public final class yij implements xij {
    public final hpd0 b;

    public yij(hpd0 hpd0Var) {
        this.b = hpd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yij) && epx.f(this.b, ((yij) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ChangeFave(productItem=" + this.b + ')';
    }
}
