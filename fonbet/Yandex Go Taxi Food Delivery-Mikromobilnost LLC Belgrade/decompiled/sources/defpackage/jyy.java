package defpackage;

/* loaded from: classes2.dex */
public final class jyy implements iyy {
    public final Object a;

    public jyy(Object obj) {
        this.a = obj;
    }

    public final Object a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jyy) && jl40.l(this.a, ((jyy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return qv10.r(new StringBuilder("Success(value="), this.a, ')');
    }
}
