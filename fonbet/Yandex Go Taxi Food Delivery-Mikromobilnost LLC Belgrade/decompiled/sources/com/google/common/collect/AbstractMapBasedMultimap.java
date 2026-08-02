package com.google.common.collect;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes11.dex */
abstract class AbstractMapBasedMultimap<K, V> extends n implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    public transient Map w;
    public transient int x;

    public abstract Map c();

    @Override // defpackage.kr40
    public void clear() {
        Iterator<V> it = this.w.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.w.clear();
        this.x = 0;
    }

    public abstract Collection f();

    public abstract Set g();

    @Override // defpackage.kr40
    public int size() {
        return this.x;
    }

    @Override // defpackage.kr40
    public Collection values() {
        Collection collection = this.b;
        if (collection != null) {
            return collection;
        }
        m mVar = new m(0, this);
        this.b = mVar;
        return mVar;
    }
}
