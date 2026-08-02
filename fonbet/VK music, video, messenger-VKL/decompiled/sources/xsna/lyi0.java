package xsna;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: SetCookieCache.kt */
/* loaded from: classes.dex */
public final class lyi0 implements Iterable, icy {
    public final Set<suv> b = Collections.synchronizedSet(new HashSet());

    /* compiled from: SetCookieCache.kt */
    public static final class a implements Iterator<usj>, gcy {
        public final Iterator<suv> b;

        public a(Set<suv> set) {
            set.iterator();
            this.b = set.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.b.hasNext();
        }

        @Override // java.util.Iterator
        public final usj next() {
            return this.b.next().a;
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.b.remove();
        }
    }

    public final void a(Collection<usj> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<usj> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new suv(it.next()));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            suv suvVar = (suv) it2.next();
            Set<suv> set = this.b;
            set.remove(suvVar);
            set.add(suvVar);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<usj> iterator() {
        return new a(this.b);
    }
}
