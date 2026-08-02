package xsna;

/* compiled from: ContentProductsEvent.kt */
/* loaded from: classes18.dex */
public final class bkj implements ckj {
    public final hpd0 a;

    public bkj(hpd0 hpd0Var) {
        this.a = hpd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bkj) && epx.f(this.a, ((bkj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "WriteToOwner(productItem=" + this.a + ')';
    }
}
