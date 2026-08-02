package xsna;

/* compiled from: ContentProductsAction.kt */
/* loaded from: classes18.dex */
public final class zij implements xij {
    public final hpd0 b;

    public zij(hpd0 hpd0Var) {
        this.b = hpd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zij) && epx.f(this.b, ((zij) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Cta(productItem=" + this.b + ')';
    }
}
