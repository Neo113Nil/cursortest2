package defpackage;

/* loaded from: classes11.dex */
public final class evc implements a6c {
    public final Comparable a;
    public final Comparable b;

    public evc(Comparable comparable, Comparable comparable2) {
        this.a = comparable;
        this.b = comparable2;
    }

    @Override // defpackage.a6c
    public final boolean b(Comparable comparable) {
        return comparable.compareTo(this.a) >= 0 && comparable.compareTo(this.b) <= 0;
    }

    @Override // defpackage.a6c
    public final Comparable d() {
        return this.b;
    }

    @Override // defpackage.a6c
    public final Comparable e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof evc)) {
            return false;
        }
        if (isEmpty() && ((evc) obj).isEmpty()) {
            return true;
        }
        evc evcVar = (evc) obj;
        return jl40.l(this.a, evcVar.a) && jl40.l(this.b, evcVar.b);
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.a6c
    public final boolean isEmpty() {
        return e().compareTo(d()) > 0;
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
