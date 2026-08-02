package yads;

import com.ironsource.B5;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes10.dex */
public abstract class v51 implements Map, Serializable {
    public transient vn2 b;
    public transient wn2 c;
    public transient xn2 d;

    public static v51 a(HashMap hashMap) {
        Set<Map.Entry> entrySet = hashMap.entrySet();
        boolean z = entrySet instanceof Collection;
        t51 t51Var = new t51(z ? entrySet.size() : 4);
        if (z) {
            t51Var.a(entrySet.size());
        }
        for (Map.Entry entry : entrySet) {
            t51Var.a(entry.getKey(), entry.getValue());
        }
        return yn2.a(t51Var.b, t51Var.a);
    }

    @Override // java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final x51 entrySet() {
        vn2 vn2Var = this.b;
        if (vn2Var != null) {
            return vn2Var;
        }
        yn2 yn2Var = (yn2) this;
        vn2 vn2Var2 = new vn2(yn2Var, yn2Var.f, yn2Var.g);
        this.b = vn2Var2;
        return vn2Var2;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        xn2 xn2Var = this.d;
        if (xn2Var == null) {
            yn2 yn2Var = (yn2) this;
            xn2 xn2Var2 = new xn2(yn2Var.f, 1, yn2Var.g);
            this.d = xn2Var2;
            xn2Var = xn2Var2;
        }
        return xn2Var.contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return ((x51) entrySet()).equals(((Map) obj).entrySet());
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return pz2.a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((yn2) this).size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        wn2 wn2Var = this.c;
        if (wn2Var != null) {
            return wn2Var;
        }
        yn2 yn2Var = (yn2) this;
        wn2 wn2Var2 = new wn2(yn2Var, new xn2(yn2Var.f, 0, yn2Var.g));
        this.c = wn2Var2;
        return wn2Var2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = ((yn2) this).size();
        kx.a(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append(B5.U);
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        xn2 xn2Var = this.d;
        if (xn2Var != null) {
            return xn2Var;
        }
        yn2 yn2Var = (yn2) this;
        xn2 xn2Var2 = new xn2(yn2Var.f, 1, yn2Var.g);
        this.d = xn2Var2;
        return xn2Var2;
    }

    public Object writeReplace() {
        return new u51(this);
    }

    public static t51 a() {
        return new t51(4);
    }
}
