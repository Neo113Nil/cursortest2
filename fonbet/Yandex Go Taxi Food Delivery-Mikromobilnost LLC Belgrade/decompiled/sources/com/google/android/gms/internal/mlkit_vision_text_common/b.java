package com.google.android.gms.internal.mlkit_vision_text_common;

import defpackage.j591;
import defpackage.ny61;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* loaded from: classes11.dex */
public final class b implements Iterator {
    public final Iterator a;
    public Collection b;
    public final /* synthetic */ c c;

    public b(c cVar) {
        this.c = cVar;
        this.a = cVar.c.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.a.next();
        this.b = (Collection) entry.getValue();
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        zzaa zzaaVar = (zzaa) this.c.w;
        zzaaVar.getClass();
        List list = (List) collection;
        return new zzbg(key, list instanceof RandomAccess ? new j591(zzaaVar, key, list, null) : new e(zzaaVar, key, list, null));
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!(this.b != null)) {
            ny61.r("no calls to next() since the last call to remove()");
            return;
        }
        this.a.remove();
        this.c.w.getClass();
        this.b.size();
        this.b.clear();
        this.b = null;
    }
}
