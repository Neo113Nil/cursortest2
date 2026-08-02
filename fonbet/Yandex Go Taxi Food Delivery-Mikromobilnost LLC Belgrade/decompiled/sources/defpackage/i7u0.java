package defpackage;

/* loaded from: classes.dex */
public final class i7u0 implements j131 {
    public final Object a;

    public i7u0(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.j131
    public final Object a(r1b0 r1b0Var) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i7u0) && jl40.l(this.a, ((i7u0) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return qv10.r(new StringBuilder("StaticValueHolder(value="), this.a, ')');
    }
}
