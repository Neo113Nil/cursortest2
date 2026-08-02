package defpackage;

/* loaded from: classes14.dex */
public final class fhv0 extends khv0 {
    public final jhv0 a;

    public fhv0(int i) {
        this.a = jhv0.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fhv0) && jl40.l(this.a, ((fhv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public fhv0() {
        this(0);
    }
}
