package defpackage;

import com.google.android.gms.internal.mlkit_vision_face.c;
import com.google.android.gms.internal.mlkit_vision_subject_segmentation.g;
import com.google.common.collect.d;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import yads.nx;
import yads.uw1;

/* loaded from: classes11.dex */
public final class cw00 extends AbstractCollection {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ cw00(int i, Serializable serializable) {
        this.a = i;
        this.b = serializable;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((d) obj).clear();
                break;
            case 1:
                uw1 uw1Var = (uw1) obj;
                Iterator it = uw1Var.w.values().iterator();
                while (it.hasNext()) {
                    ((Collection) it.next()).clear();
                }
                uw1Var.w.clear();
                uw1Var.x = 0;
                break;
            case 2:
                ((kr71) ((tm71) obj)).clear();
                break;
            case 3:
                ((nx) obj).clear();
                break;
            case 4:
                ((g) obj).clear();
                break;
            case 5:
                ((c) obj).clear();
                break;
            case 6:
                ((com.google.android.gms.internal.mlkit_vision_text_common.c) obj).clear();
                break;
            default:
                ((com.google.android.gms.internal.mlkit_vision_barcode.c) obj).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        j221 j221Var;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return ((d) obj2).containsValue(obj);
            case 1:
                Iterator it = ((cw00) ((uw1) obj2).a().values()).iterator();
                do {
                    j221Var = (j221) it;
                    if (!j221Var.b.hasNext()) {
                        return false;
                    }
                } while (!((Collection) j221Var.next()).contains(obj));
                return true;
            case 2:
                return ((tm71) obj2).containsValue(obj);
            case 3:
            default:
                return super.contains(obj);
            case 4:
                return ((g) obj2).containsValue(obj);
            case 5:
                return ((c) obj2).containsValue(obj);
            case 6:
                return ((com.google.android.gms.internal.mlkit_vision_text_common.c) obj2).containsValue(obj);
            case 7:
                return ((com.google.android.gms.internal.mlkit_vision_barcode.c) obj2).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.a) {
            case 0:
                return ((d) this.b).isEmpty();
            case 1:
            case 3:
            default:
                return super.isEmpty();
            case 2:
                return ((tm71) this.b).isEmpty();
            case 4:
                return ((g) this.b).isEmpty();
            case 5:
                return ((c) this.b).isEmpty();
            case 6:
                return ((com.google.android.gms.internal.mlkit_vision_text_common.c) this.b).isEmpty();
            case 7:
                return ((com.google.android.gms.internal.mlkit_vision_barcode.c) this.b).isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new bw00(((d) obj).entrySet().iterator(), 1);
            case 1:
                return new gi71((uw1) obj);
            case 2:
                return new j221(((sl71) ((tm71) obj).entrySet()).iterator(), 1);
            case 3:
                nx nxVar = (nx) obj;
                Map f = nxVar.f();
                return f != null ? f.values().iterator() : new d871(nxVar, 2);
            case 4:
                return new j221(((g) obj).entrySet().iterator(), 2);
            case 5:
                return new j221(((c) obj).entrySet().iterator(), 3);
            case 6:
                return new hb91(((com.google.android.gms.internal.mlkit_vision_text_common.c) obj).entrySet().iterator(), 1);
            default:
                return new j221(((com.google.android.gms.internal.mlkit_vision_barcode.c) obj).entrySet().iterator(), 4);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                d dVar = (d) obj2;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    for (Map.Entry entry : dVar.entrySet()) {
                        if (Objects.equals(obj, entry.getValue())) {
                            dVar.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 1:
            case 3:
            default:
                return super.remove(obj);
            case 2:
                tm71 tm71Var = (tm71) obj2;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused2) {
                    Iterator it = ((sl71) tm71Var.entrySet()).iterator();
                    while (it.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) it.next();
                        if (tja1.a(obj, entry2.getValue())) {
                            ((kr71) tm71Var).remove(entry2.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 4:
                g gVar = (g) obj2;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused3) {
                    for (Map.Entry entry3 : gVar.entrySet()) {
                        if (hua1.i(obj, entry3.getValue())) {
                            gVar.remove(entry3.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 5:
                c cVar = (c) obj2;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused4) {
                    for (Map.Entry entry4 : cVar.entrySet()) {
                        if (cza1.c(obj, entry4.getValue())) {
                            cVar.remove(entry4.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 6:
                com.google.android.gms.internal.mlkit_vision_text_common.c cVar2 = (com.google.android.gms.internal.mlkit_vision_text_common.c) obj2;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused5) {
                    for (Map.Entry entry5 : cVar2.entrySet()) {
                        if (xya1.g(obj, entry5.getValue())) {
                            cVar2.remove(entry5.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 7:
                com.google.android.gms.internal.mlkit_vision_barcode.c cVar3 = (com.google.android.gms.internal.mlkit_vision_barcode.c) obj2;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused6) {
                    for (Map.Entry entry6 : cVar3.entrySet()) {
                        if (epa1.d(obj, entry6.getValue())) {
                            cVar3.remove(entry6.getKey());
                            return true;
                        }
                    }
                    return false;
                }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                d dVar = (d) obj;
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : dVar.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return dVar.keySet().removeAll(hashSet);
                }
            case 1:
            case 3:
            default:
                return super.removeAll(collection);
            case 2:
                tm71 tm71Var = (tm71) obj;
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    Iterator it = ((sl71) tm71Var.entrySet()).iterator();
                    while (it.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) it.next();
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return tm71Var.keySet().removeAll(hashSet2);
                }
            case 4:
                g gVar = (g) obj;
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused3) {
                    HashSet hashSet3 = new HashSet();
                    for (Map.Entry entry3 : gVar.entrySet()) {
                        if (collection.contains(entry3.getValue())) {
                            hashSet3.add(entry3.getKey());
                        }
                    }
                    return gVar.w.b().removeAll(hashSet3);
                }
            case 5:
                c cVar = (c) obj;
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused4) {
                    HashSet hashSet4 = new HashSet();
                    for (Map.Entry entry4 : cVar.entrySet()) {
                        if (collection.contains(entry4.getValue())) {
                            hashSet4.add(entry4.getKey());
                        }
                    }
                    return cVar.w.b().removeAll(hashSet4);
                }
            case 6:
                com.google.android.gms.internal.mlkit_vision_text_common.c cVar2 = (com.google.android.gms.internal.mlkit_vision_text_common.c) obj;
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused5) {
                    HashSet hashSet5 = new HashSet();
                    for (Map.Entry entry5 : cVar2.entrySet()) {
                        if (collection.contains(entry5.getValue())) {
                            hashSet5.add(entry5.getKey());
                        }
                    }
                    return cVar2.w.b().removeAll(hashSet5);
                }
            case 7:
                com.google.android.gms.internal.mlkit_vision_barcode.c cVar3 = (com.google.android.gms.internal.mlkit_vision_barcode.c) obj;
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused6) {
                    HashSet hashSet6 = new HashSet();
                    for (Map.Entry entry6 : cVar3.entrySet()) {
                        if (collection.contains(entry6.getValue())) {
                            hashSet6.add(entry6.getKey());
                        }
                    }
                    return cVar3.w.b().removeAll(hashSet6);
                }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                d dVar = (d) obj;
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : dVar.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return dVar.keySet().retainAll(hashSet);
                }
            case 1:
            case 3:
            default:
                return super.retainAll(collection);
            case 2:
                tm71 tm71Var = (tm71) obj;
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    Iterator it = ((sl71) tm71Var.entrySet()).iterator();
                    while (it.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) it.next();
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return tm71Var.keySet().retainAll(hashSet2);
                }
            case 4:
                g gVar = (g) obj;
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused3) {
                    HashSet hashSet3 = new HashSet();
                    for (Map.Entry entry3 : gVar.entrySet()) {
                        if (collection.contains(entry3.getValue())) {
                            hashSet3.add(entry3.getKey());
                        }
                    }
                    return gVar.w.b().retainAll(hashSet3);
                }
            case 5:
                c cVar = (c) obj;
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused4) {
                    HashSet hashSet4 = new HashSet();
                    for (Map.Entry entry4 : cVar.entrySet()) {
                        if (collection.contains(entry4.getValue())) {
                            hashSet4.add(entry4.getKey());
                        }
                    }
                    return cVar.w.b().retainAll(hashSet4);
                }
            case 6:
                com.google.android.gms.internal.mlkit_vision_text_common.c cVar2 = (com.google.android.gms.internal.mlkit_vision_text_common.c) obj;
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused5) {
                    HashSet hashSet5 = new HashSet();
                    for (Map.Entry entry5 : cVar2.entrySet()) {
                        if (collection.contains(entry5.getValue())) {
                            hashSet5.add(entry5.getKey());
                        }
                    }
                    return cVar2.w.b().retainAll(hashSet5);
                }
            case 7:
                com.google.android.gms.internal.mlkit_vision_barcode.c cVar3 = (com.google.android.gms.internal.mlkit_vision_barcode.c) obj;
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused6) {
                    HashSet hashSet6 = new HashSet();
                    for (Map.Entry entry6 : cVar3.entrySet()) {
                        if (collection.contains(entry6.getValue())) {
                            hashSet6.add(entry6.getKey());
                        }
                    }
                    return cVar3.w.b().retainAll(hashSet6);
                }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((d) obj).c.size();
            case 1:
                return ((uw1) obj).x;
            case 2:
                return ((kr71) ((tm71) obj)).c.size();
            case 3:
                return ((nx) obj).size();
            case 4:
                return ((g) obj).c.size();
            case 5:
                return ((c) obj).c.size();
            case 6:
                return ((com.google.android.gms.internal.mlkit_vision_text_common.c) obj).c.size();
            default:
                return ((com.google.android.gms.internal.mlkit_vision_barcode.c) obj).c.size();
        }
    }

    public /* synthetic */ cw00(AbstractMap abstractMap, int i) {
        this.a = i;
        this.b = abstractMap;
    }
}
