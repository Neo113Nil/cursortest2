package defpackage;

/* loaded from: classes3.dex */
public final class d0u {
    public final Object a;
    public int b;

    public d0u(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !d0u.class.equals(obj.getClass())) {
            return false;
        }
        return jl40.l(this.a, ((d0u) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }
}
