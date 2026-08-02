package com.google.android.gms.internal.mlkit_vision_face;

import defpackage.c691;
import defpackage.ny61;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;

/* loaded from: classes11.dex */
public class b implements Iterator {
    public final /* synthetic */ int a = 0;
    public final Iterator b;
    public Object c;
    public final /* synthetic */ Object w;

    public b(f fVar) {
        this.w = fVar;
        Collection collection = fVar.b;
        this.c = collection;
        this.b = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public void a() {
        f fVar = (f) this.w;
        fVar.zzb();
        if (fVar.b == ((Collection) this.c)) {
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
                c cVar = (c) this.w;
                Object key = entry.getKey();
                zzap zzapVar = cVar.w;
                Collection collection = (Collection) entry.getValue();
                zzae zzaeVar = (zzae) zzapVar;
                zzaeVar.getClass();
                List list = (List) collection;
                return new zzbj(key, list instanceof RandomAccess ? new c691(zzaeVar, key, list, null) : new f(zzaeVar, key, list, null));
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
                if (!(((Collection) this.c) != null)) {
                    ny61.r("no calls to next() since the last call to remove()");
                    break;
                } else {
                    it.remove();
                    ((c) obj).w.w -= ((Collection) this.c).size();
                    ((Collection) this.c).clear();
                    this.c = null;
                    break;
                }
            case 1:
                Map.Entry entry = (Map.Entry) this.c;
                if (!(entry != null)) {
                    ny61.r("no calls to next() since the last call to remove()");
                    break;
                } else {
                    Collection collection = (Collection) entry.getValue();
                    it.remove();
                    ((d) obj).c.w -= collection.size();
                    collection.clear();
                    this.c = null;
                    break;
                }
            default:
                it.remove();
                f fVar = (f) obj;
                zzap zzapVar = fVar.x;
                zzapVar.w--;
                fVar.b();
                break;
        }
    }

    public b(f fVar, ListIterator listIterator) {
        this.w = fVar;
        this.c = fVar.b;
        this.b = listIterator;
    }

    public b(c cVar) {
        this.w = cVar;
        this.b = cVar.c.entrySet().iterator();
    }

    public b(d dVar, Iterator it) {
        this.w = dVar;
        this.b = it;
    }
}
