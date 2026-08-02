package xsna;

/* compiled from: ContentProductsAction.kt */
/* loaded from: classes18.dex */
public final class ajj implements xij {
    public final hpd0 b;

    public ajj(hpd0 hpd0Var) {
        this.b = hpd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ajj) && epx.f(this.b, ((ajj) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Product(productItem=" + this.b + ')';
    }
}
