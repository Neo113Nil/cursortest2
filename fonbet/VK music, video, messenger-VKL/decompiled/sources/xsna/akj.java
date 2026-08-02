package xsna;

/* compiled from: ContentProductsEvent.kt */
/* loaded from: classes18.dex */
public final class akj implements ckj {
    public final hpd0 a;

    public akj(hpd0 hpd0Var) {
        this.a = hpd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof akj) && epx.f(this.a, ((akj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ToCartClick(productItem=" + this.a + ')';
    }
}
