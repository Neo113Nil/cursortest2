package xsna;

/* compiled from: EntityValue.kt */
/* loaded from: classes2.dex */
public class xpp<V> {
    public boolean a;
    public V b;

    public xpp() {
        this(null, false);
    }

    public V a() {
        return this.b;
    }

    public final boolean b() {
        return !d();
    }

    public final boolean c() {
        return a() == null;
    }

    public final boolean d() {
        return c() || this.a;
    }

    public void e(V v) {
        this.b = v;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        xpp xppVar = (xpp) obj;
        return this.a == xppVar.a && epx.f(a(), xppVar.a());
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        V a = a();
        return hashCode + (a != null ? a.hashCode() : 0);
    }

    public final String toString() {
        return "EntityValue{isExpired=" + this.a + ", cached=" + a() + '}';
    }

    public xpp(V v, boolean z) {
        this.a = z;
        e(v);
    }
}
