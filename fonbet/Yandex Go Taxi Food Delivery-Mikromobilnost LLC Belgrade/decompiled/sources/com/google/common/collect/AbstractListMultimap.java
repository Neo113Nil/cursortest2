package com.google.common.collect;

import defpackage.ny61;
import defpackage.zsy;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes11.dex */
abstract class AbstractListMultimap<K, V> extends AbstractMapBasedMultimap<K, V> implements zsy {
    private static final long serialVersionUID = 6588350623831699109L;

    @Override // defpackage.kr40
    public Map a() {
        Map map = this.c;
        if (map != null) {
            return map;
        }
        Map c = c();
        this.c = c;
        return c;
    }

    @Override // defpackage.kr40
    public boolean put(Object obj, Object obj2) {
        Collection collection = (Collection) this.w.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.x++;
            return true;
        }
        Collection f = f();
        if (!f.add(obj2)) {
            ny61.f("New Collection violated the Collection spec");
            return false;
        }
        this.x++;
        this.w.put(obj, f);
        return true;
    }
}
