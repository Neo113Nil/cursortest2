package defpackage;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes11.dex */
public class nxs0 extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ AbstractMap b;

    public /* synthetic */ nxs0(AbstractMap abstractMap, int i) {
        this.a = i;
        this.b = abstractMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i = this.a;
        AbstractMap abstractMap = this.b;
        switch (i) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    ((axs0) abstractMap).put((Comparable) entry.getKey(), entry.getValue());
                    break;
                }
                break;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    ((bxs0) abstractMap).put((Comparable) entry2.getKey(), entry2.getValue());
                    break;
                }
                break;
            case 2:
                Map.Entry entry3 = (Map.Entry) obj;
                if (!contains(entry3)) {
                    ((cxs0) abstractMap).put((Comparable) entry3.getKey(), entry3.getValue());
                    break;
                }
                break;
            case 3:
                Map.Entry entry4 = (Map.Entry) obj;
                if (!contains(entry4)) {
                    ((jga1) abstractMap).put((Comparable) entry4.getKey(), entry4.getValue());
                    break;
                }
                break;
            default:
                Map.Entry entry5 = (Map.Entry) obj;
                if (!contains(entry5)) {
                    ((g8b1) abstractMap).put((Comparable) entry5.getKey(), entry5.getValue());
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.a;
        AbstractMap abstractMap = this.b;
        switch (i) {
            case 0:
                ((axs0) abstractMap).clear();
                break;
            case 1:
                ((bxs0) abstractMap).clear();
                break;
            case 2:
                ((cxs0) abstractMap).clear();
                break;
            case 3:
                ((jga1) abstractMap).clear();
                break;
            default:
                ((g8b1) abstractMap).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.a;
        AbstractMap abstractMap = this.b;
        switch (i) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((axs0) abstractMap).get(entry.getKey());
                Object value = entry.getValue();
                if (obj2 != value) {
                    if (obj2 == null || !obj2.equals(value)) {
                        break;
                    }
                }
                break;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj3 = ((bxs0) abstractMap).get(entry2.getKey());
                Object value2 = entry2.getValue();
                if (obj3 != value2) {
                    if (obj3 == null || !obj3.equals(value2)) {
                        break;
                    }
                }
                break;
            case 2:
                Map.Entry entry3 = (Map.Entry) obj;
                Object obj4 = ((cxs0) abstractMap).get(entry3.getKey());
                Object value3 = entry3.getValue();
                if (obj4 != value3) {
                    if (obj4 == null || !obj4.equals(value3)) {
                        break;
                    }
                }
                break;
            case 3:
                Map.Entry entry4 = (Map.Entry) obj;
                Object obj5 = ((jga1) abstractMap).get(entry4.getKey());
                Object value4 = entry4.getValue();
                if (obj5 != value4) {
                    if (obj5 == null || !obj5.equals(value4)) {
                        break;
                    }
                }
                break;
            default:
                Map.Entry entry5 = (Map.Entry) obj;
                Object obj6 = ((g8b1) abstractMap).get(entry5.getKey());
                Object value5 = entry5.getValue();
                if (obj6 != value5) {
                    if (obj6 == null || !obj6.equals(value5)) {
                        break;
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        int i = this.a;
        AbstractMap abstractMap = this.b;
        switch (i) {
            case 0:
                return new mxs0((axs0) abstractMap, 0);
            case 1:
                return new mxs0((bxs0) abstractMap, 1);
            case 2:
                return new mxs0((cxs0) abstractMap, 2);
            case 3:
                return new mxs0((jga1) abstractMap, 3);
            default:
                return new mxs0((g8b1) abstractMap);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.a;
        AbstractMap abstractMap = this.b;
        switch (i) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    ((axs0) abstractMap).remove(entry.getKey());
                    break;
                }
                break;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    ((bxs0) abstractMap).remove(entry2.getKey());
                    break;
                }
                break;
            case 2:
                Map.Entry entry3 = (Map.Entry) obj;
                if (contains(entry3)) {
                    ((cxs0) abstractMap).remove(entry3.getKey());
                    break;
                }
                break;
            case 3:
                Map.Entry entry4 = (Map.Entry) obj;
                if (contains(entry4)) {
                    ((jga1) abstractMap).remove(entry4.getKey());
                    break;
                }
                break;
            default:
                Map.Entry entry5 = (Map.Entry) obj;
                if (contains(entry5)) {
                    ((g8b1) abstractMap).remove(entry5.getKey());
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.a;
        AbstractMap abstractMap = this.b;
        switch (i) {
            case 0:
                return ((axs0) abstractMap).size();
            case 1:
                return ((bxs0) abstractMap).size();
            case 2:
                return ((cxs0) abstractMap).size();
            case 3:
                return ((jga1) abstractMap).size();
            default:
                return ((g8b1) abstractMap).size();
        }
    }
}
