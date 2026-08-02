package xsna;

/* compiled from: CommunityProfileHeaderItemsFactoryParams.kt */
/* loaded from: classes5.dex */
public final class aph {
    public final bph a;
    public final zoh b;

    public aph(bph bphVar, zoh zohVar) {
        this.a = bphVar;
        this.b = zohVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aph)) {
            return false;
        }
        aph aphVar = (aph) obj;
        return epx.f(this.a, aphVar.a) && epx.f(this.b, aphVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Legacy(shared=" + this.a + ", legacy=" + this.b + ')';
    }
}
