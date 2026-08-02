package xsna;

/* compiled from: ContentProductsEvent.kt */
/* loaded from: classes18.dex */
public final class yjj implements ckj {
    public final hpd0 a;

    public yjj(hpd0 hpd0Var) {
        this.a = hpd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yjj) && epx.f(this.a, ((yjj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CallToOwner(productItem=" + this.a + ')';
    }
}
