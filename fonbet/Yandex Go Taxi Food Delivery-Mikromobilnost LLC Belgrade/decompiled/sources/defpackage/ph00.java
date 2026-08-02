package defpackage;

import java.util.Map;

/* loaded from: classes15.dex */
public final class ph00 implements Map.Entry, xfx {
    public final Object a;
    public final Object b;

    public ph00(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ph00)) {
            return false;
        }
        ph00 ph00Var = (ph00) obj;
        return jl40.l(this.a, ph00Var.a) && jl40.l(this.b, ph00Var.b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MapEntry(key=");
        sb.append(this.a);
        sb.append(", value=");
        return qv10.r(sb, this.b, ')');
    }
}
