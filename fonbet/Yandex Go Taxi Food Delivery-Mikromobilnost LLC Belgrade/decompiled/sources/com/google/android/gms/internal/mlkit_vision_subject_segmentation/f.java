package com.google.android.gms.internal.mlkit_vision_subject_segmentation;

import defpackage.ny61;
import defpackage.ujb1;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* loaded from: classes11.dex */
public final class f implements Iterator {
    public final Iterator a;
    public Collection b;
    public final /* synthetic */ g c;

    public f(g gVar) {
        this.c = gVar;
        this.a = gVar.c.entrySet().iterator();
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
        zzl zzlVar = (zzl) this.c.w;
        zzlVar.getClass();
        List list = (List) collection;
        return new zzar(key, list instanceof RandomAccess ? new ujb1(zzlVar, key, list, null) : new l(zzlVar, key, list, null));
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
