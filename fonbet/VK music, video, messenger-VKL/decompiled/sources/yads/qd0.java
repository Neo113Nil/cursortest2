package yads;

import java.util.List;
import java.util.Map;
import java.util.Set;
import xsna.maz0;
import xsna.naz0;
import xsna.w9s;

/* loaded from: classes10.dex */
public final class qd0 extends w9s {
    public final Map b;

    public qd0(Map map) {
        this.b = map;
    }

    public static /* synthetic */ boolean a(String str) {
        return str != null;
    }

    @Override // xsna.w9s, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // xsna.w9s, java.util.Map
    public final boolean containsValue(Object obj) {
        return standardContainsValue(obj);
    }

    @Override // xsna.x9s
    public final Object delegate() {
        return this.b;
    }

    @Override // xsna.w9s, java.util.Map
    public final Set entrySet() {
        return com.google.common.collect.l.b(super.entrySet(), new maz0());
    }

    @Override // xsna.w9s, java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && standardEquals(obj);
    }

    @Override // xsna.w9s, java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) super.get(obj);
    }

    @Override // xsna.w9s, java.util.Map
    public final int hashCode() {
        return standardHashCode();
    }

    @Override // xsna.w9s, java.util.Map
    public final boolean isEmpty() {
        return super.isEmpty() || (super.size() == 1 && super.containsKey(null));
    }

    @Override // xsna.w9s, java.util.Map
    public final Set keySet() {
        return com.google.common.collect.l.b(super.keySet(), new naz0());
    }

    @Override // xsna.w9s, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }

    public static /* synthetic */ boolean a(Map.Entry entry) {
        return entry.getKey() != null;
    }

    @Override // xsna.w9s, xsna.x9s
    public final Map delegate() {
        return this.b;
    }
}
