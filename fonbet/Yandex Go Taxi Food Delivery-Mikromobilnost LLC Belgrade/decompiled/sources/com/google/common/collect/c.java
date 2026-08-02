package com.google.common.collect;

import defpackage.ffx;
import defpackage.ny61;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* loaded from: classes11.dex */
public class c implements Iterator {
    public final /* synthetic */ int a = 0;
    public final Iterator b;
    public Object c;
    public final /* synthetic */ Object w;

    public c(l lVar) {
        this.w = lVar;
        Collection collection = lVar.b;
        this.c = collection;
        this.b = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public void a() {
        l lVar = (l) this.w;
        lVar.b();
        if (lVar.b == ((Collection) this.c)) {
            return;
        }
        ny61.y();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            default:
                a();
                break;
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Iterator it = this.b;
        switch (i) {
            case 0:
                Map.Entry entry = (Map.Entry) it.next();
                this.c = (Collection) entry.getValue();
                return ((d) this.w).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) it.next();
                this.c = entry2;
                return entry2.getKey();
            default:
                a();
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.a;
        Object obj = this.w;
        Iterator it = this.b;
        switch (i) {
            case 0:
                ffx.r("no calls to next() since the last call to remove()", ((Collection) this.c) != null);
                it.remove();
                ((d) obj).w.x -= ((Collection) this.c).size();
                ((Collection) this.c).clear();
                this.c = null;
                break;
            case 1:
                ffx.r("no calls to next() since the last call to remove()", ((Map.Entry) this.c) != null);
                Collection collection = (Collection) ((Map.Entry) this.c).getValue();
                it.remove();
                ((f) obj).c.x -= collection.size();
                collection.clear();
                this.c = null;
                break;
            default:
                it.remove();
                l lVar = (l) obj;
                lVar.x.x--;
                lVar.d();
                break;
        }
    }

    public c(l lVar, ListIterator listIterator) {
        this.w = lVar;
        this.c = lVar.b;
        this.b = listIterator;
    }

    public c(f fVar, Iterator it) {
        this.b = it;
        this.w = fVar;
    }

    public c(d dVar) {
        this.w = dVar;
        this.b = dVar.c.entrySet().iterator();
    }
}
