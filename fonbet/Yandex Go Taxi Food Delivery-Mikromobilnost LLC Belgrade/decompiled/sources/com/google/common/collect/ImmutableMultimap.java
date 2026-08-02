package com.google.common.collect;

import defpackage.n25;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract class ImmutableMultimap<K, V> extends n25 implements Serializable {
    private static final long serialVersionUID = 0;
    public final transient ImmutableMap w;
    public final transient int x;

    public static class a {
        public Map a;

        public final Map a() {
            Map map = this.a;
            if (map != null) {
                return map;
            }
            CompactHashMap a = CompactHashMap.a();
            this.a = a;
            return a;
        }
    }

    public ImmutableMultimap(ImmutableMap immutableMap, int i) {
        this.w = immutableMap;
        this.x = i;
    }

    @Override // com.google.common.collect.n
    public final boolean b(Object obj) {
        return obj != null && super.b(obj);
    }

    @Override // defpackage.kr40
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ImmutableMap a() {
        return this.w;
    }

    @Override // defpackage.kr40
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.kr40
    public final int size() {
        return this.x;
    }
}
