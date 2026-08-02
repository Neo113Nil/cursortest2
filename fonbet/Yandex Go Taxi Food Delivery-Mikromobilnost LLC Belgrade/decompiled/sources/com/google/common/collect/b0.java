package com.google.common.collect;

import defpackage.h221;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes11.dex */
public abstract class b0 extends AbstractSet {
    public static int d(Set set) {
        return set instanceof b0 ? ((b0) set).b() : set.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public abstract h221 iterator();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public abstract int b();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract int e();

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Set set;
        int d;
        if (obj != this) {
            if ((obj instanceof Set) && e() <= (d = d((set = (Set) obj)))) {
                int e = set instanceof b0 ? ((b0) set).e() : set.size();
                if (b() >= e) {
                    h221 it = iterator();
                    int i = 0;
                    while (true) {
                        a aVar = (a) it;
                        if (aVar.hasNext()) {
                            try {
                                if (!set.contains(aVar.next())) {
                                    break;
                                }
                                i++;
                            } catch (ClassCastException | NullPointerException unused) {
                            }
                        } else if (i != d) {
                            if (i >= e) {
                                Iterator it2 = set.iterator();
                                int i2 = 0;
                                while (it2.hasNext()) {
                                    it2.next();
                                    i2++;
                                    if (i2 > i) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }
}
