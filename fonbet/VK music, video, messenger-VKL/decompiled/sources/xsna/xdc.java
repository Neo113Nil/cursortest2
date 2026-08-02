package xsna;

import java.util.LinkedList;

/* compiled from: TopVideoBottomSheetCallback.kt */
/* loaded from: classes2.dex */
public final class xdc<E> extends LinkedList<E> {
    private final int capacity = 5;

    @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
    public final boolean add(E e) {
        if (super.size() >= this.capacity) {
            removeFirst();
        }
        return super.add(e);
    }

    public final int i() {
        return this.capacity;
    }
}
