package defpackage;

/* loaded from: classes8.dex */
public final class j5d0 implements l5d0 {
    public final Object a;

    public j5d0(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j5d0) && jl40.l(this.a, ((j5d0) obj).a);
    }

    @Override // defpackage.l5d0
    public final Object getValue() {
        return this.a;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return qv10.r(new StringBuilder("Loaded(value="), this.a, ')');
    }
}
