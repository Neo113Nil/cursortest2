package defpackage;

import com.google.android.gms.internal.mlkit_vision_subject_segmentation.h;
import com.google.android.gms.internal.mlkit_vision_subject_segmentation.l;
import com.google.android.gms.internal.mlkit_vision_text_common.d;
import com.google.android.gms.internal.mlkit_vision_text_common.e;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* loaded from: classes7.dex */
public class po71 implements Iterator {
    public final /* synthetic */ int a;
    public final Iterator b;
    public Object c;
    public final /* synthetic */ Object w;

    public po71(l lVar) {
        this.a = 8;
        this.w = lVar;
        Collection collection = lVar.b;
        this.c = collection;
        this.b = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public void a() {
        int i = this.a;
        Object obj = this.w;
        switch (i) {
            case 4:
                e eVar = (e) obj;
                eVar.zzb();
                if (eVar.b != ((Collection) this.c)) {
                    ny61.y();
                    break;
                }
                break;
            case 5:
            default:
                l lVar = (l) obj;
                lVar.zzb();
                if (lVar.b != ((Collection) this.c)) {
                    ny61.y();
                    break;
                }
                break;
            case 6:
                com.google.android.gms.internal.mlkit_vision_barcode.e eVar2 = (com.google.android.gms.internal.mlkit_vision_barcode.e) obj;
                eVar2.zzb();
                if (eVar2.b != ((Collection) this.c)) {
                    ny61.y();
                    break;
                }
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        Iterator it = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                er81 er81Var = (er81) this.w;
                er81Var.b();
                if (er81Var.b != ((Collection) this.c)) {
                    ny61.y();
                    break;
                } else {
                    break;
                }
            case 3:
                break;
            case 4:
                a();
                break;
            case 5:
                break;
            case 6:
                a();
                break;
            case 7:
                break;
            default:
                a();
                break;
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Object obj = this.w;
        Iterator it = this.b;
        switch (i) {
            case 0:
                Map.Entry entry = (Map.Entry) it.next();
                this.c = (Collection) entry.getValue();
                return ((kr71) obj).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) it.next();
                this.c = entry2;
                return entry2.getKey();
            case 2:
                er81 er81Var = (er81) obj;
                er81Var.b();
                if (er81Var.b == ((Collection) this.c)) {
                    return it.next();
                }
                ny61.y();
                return null;
            case 3:
                Map.Entry entry3 = (Map.Entry) it.next();
                this.c = entry3;
                return entry3.getKey();
            case 4:
                a();
                return it.next();
            case 5:
                Map.Entry entry4 = (Map.Entry) it.next();
                this.c = entry4;
                return entry4.getKey();
            case 6:
                a();
                return it.next();
            case 7:
                Map.Entry entry5 = (Map.Entry) it.next();
                this.c = entry5;
                return entry5.getKey();
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
                    ((kr71) obj).w.x -= ((Collection) this.c).size();
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
                    ((y081) obj).b.x -= collection.size();
                    collection.clear();
                    this.c = null;
                    break;
                }
            case 2:
                it.remove();
                er81 er81Var = (er81) obj;
                er81Var.x.x--;
                er81Var.d();
                break;
            case 3:
                Map.Entry entry2 = (Map.Entry) this.c;
                if (!(entry2 != null)) {
                    ny61.r("no calls to next() since the last call to remove()");
                    break;
                } else {
                    Collection collection2 = (Collection) entry2.getValue();
                    it.remove();
                    ((d) obj).c.getClass();
                    collection2.size();
                    collection2.clear();
                    this.c = null;
                    break;
                }
            case 4:
                it.remove();
                ((e) obj).b();
                break;
            case 5:
                qke.H("no calls to next() since the last call to remove()", ((Map.Entry) this.c) != null);
                Collection collection3 = (Collection) ((Map.Entry) this.c).getValue();
                it.remove();
                ((com.google.android.gms.internal.mlkit_vision_barcode.d) obj).c.getClass();
                collection3.size();
                collection3.clear();
                this.c = null;
                break;
            case 6:
                it.remove();
                ((com.google.android.gms.internal.mlkit_vision_barcode.e) obj).b();
                break;
            case 7:
                Map.Entry entry3 = (Map.Entry) this.c;
                if (!(entry3 != null)) {
                    ny61.r("no calls to next() since the last call to remove()");
                    break;
                } else {
                    Collection collection4 = (Collection) entry3.getValue();
                    it.remove();
                    ((h) obj).c.getClass();
                    collection4.size();
                    collection4.clear();
                    this.c = null;
                    break;
                }
            default:
                it.remove();
                ((l) obj).b();
                break;
        }
    }

    public po71(l lVar, ListIterator listIterator) {
        this.a = 8;
        this.w = lVar;
        this.c = lVar.b;
        this.b = listIterator;
    }

    public po71(e eVar, ListIterator listIterator) {
        this.a = 4;
        this.w = eVar;
        this.c = eVar.b;
        this.b = listIterator;
    }

    public /* synthetic */ po71(AbstractSet abstractSet, Iterator it, int i) {
        this.a = i;
        this.w = abstractSet;
        this.b = it;
    }

    public po71(com.google.android.gms.internal.mlkit_vision_barcode.e eVar) {
        Iterator it;
        this.a = 6;
        this.w = eVar;
        Collection collection = eVar.b;
        this.c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.b = it;
    }

    public po71(com.google.android.gms.internal.mlkit_vision_barcode.e eVar, ListIterator listIterator) {
        this.a = 6;
        this.w = eVar;
        this.c = eVar.b;
        this.b = listIterator;
    }

    public po71(e eVar) {
        Iterator it;
        this.a = 4;
        this.w = eVar;
        Collection collection = eVar.b;
        this.c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.b = it;
    }

    public po71(kr71 kr71Var) {
        this.a = 0;
        this.w = kr71Var;
        this.b = kr71Var.c.entrySet().iterator();
    }

    public po71(er81 er81Var) {
        Iterator it;
        this.a = 2;
        this.w = er81Var;
        Collection collection = er81Var.b;
        this.c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.b = it;
    }

    public po71(er81 er81Var, ListIterator listIterator) {
        this.a = 2;
        this.w = er81Var;
        this.c = er81Var.b;
        this.b = listIterator;
    }
}
