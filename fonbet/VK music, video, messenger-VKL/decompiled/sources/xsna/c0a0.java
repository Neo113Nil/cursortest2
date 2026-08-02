package xsna;

import java.util.Collection;

/* compiled from: ImmutableList.kt */
/* loaded from: classes11.dex */
public interface c0a0<E> extends vow<E>, Collection, gcy {
    @Override // java.util.List
    c0a0<E> add(int i, E e);

    @Override // java.util.List, java.util.Collection
    c0a0<E> add(E e);

    @Override // java.util.List, java.util.Collection
    c0a0<E> addAll(Collection<? extends E> collection);

    e1a0 builder();

    c0a0<E> g9(int i);

    c0a0 q2(dg dgVar);

    @Override // java.util.List, java.util.Collection
    c0a0<E> remove(E e);

    @Override // java.util.List, java.util.Collection
    c0a0<E> removeAll(Collection<? extends E> collection);

    @Override // java.util.List
    c0a0<E> set(int i, E e);
}
