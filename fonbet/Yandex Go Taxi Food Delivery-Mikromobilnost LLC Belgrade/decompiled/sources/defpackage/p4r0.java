package defpackage;

import com.google.common.collect.a0;
import com.google.common.collect.b0;
import com.google.common.collect.s;
import com.google.common.primitives.a;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes11.dex */
public final class p4r0 extends b0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Set b;
    public final /* synthetic */ Set c;

    public /* synthetic */ p4r0(Set set, Set set2, int i) {
        this.a = i;
        this.b = set;
        this.c = set2;
    }

    @Override // com.google.common.collect.b0
    /* renamed from: a */
    public final h221 iterator() {
        int i = this.a;
        Set set = this.c;
        Set set2 = this.b;
        switch (i) {
            case 0:
                return new a0(set2, set);
            default:
                return new s(set2, set);
        }
    }

    @Override // com.google.common.collect.b0
    public final int b() {
        int i = this.a;
        Set set = this.c;
        Set set2 = this.b;
        switch (i) {
            case 0:
                return a.d(b0.d(set2) + b0.d(set));
            default:
                return Math.min(b0.d(set2), b0.d(set));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.a;
        Set set = this.c;
        Set set2 = this.b;
        switch (i) {
            case 0:
                if (set2.contains(obj) || set.contains(obj)) {
                    break;
                }
                break;
            default:
                if (set2.contains(obj) && set.contains(obj)) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.a) {
            case 1:
                return this.b.containsAll(collection) && this.c.containsAll(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // com.google.common.collect.b0
    public final int e() {
        switch (this.a) {
            case 0:
                Set set = this.b;
                int e = set instanceof b0 ? ((b0) set).e() : set.size();
                Set set2 = this.c;
                return Math.max(e, set2 instanceof b0 ? ((b0) set2).e() : set2.size());
            default:
                return 0;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        int i = this.a;
        Set set = this.b;
        Set set2 = this.c;
        switch (i) {
            case 0:
                return set.isEmpty() && set2.isEmpty();
            default:
                return Collections.disjoint(set2, set);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.a;
        Set set = this.c;
        Set set2 = this.b;
        switch (i) {
            case 0:
                int size = set2.size();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (!set2.contains(it.next())) {
                        size++;
                    }
                }
                return size;
            default:
                Iterator it2 = set2.iterator();
                int i2 = 0;
                while (it2.hasNext()) {
                    if (set.contains(it2.next())) {
                        i2++;
                    }
                }
                return i2;
        }
    }
}
