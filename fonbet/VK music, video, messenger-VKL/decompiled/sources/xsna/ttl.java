package xsna;

import android.os.Parcelable;
import com.vk.fave.entities.FaveEntry;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vkontakte.android.attachments.NarrativeAttachment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: DelegateMutableList.kt */
/* loaded from: classes17.dex */
public final class ttl<E> implements List<E>, jcy {
    public final List<E> b;
    public final FaveEntry.b c;

    public ttl(ArrayList arrayList, FaveEntry.b bVar) {
        this.b = arrayList;
        this.c = bVar;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(E e) {
        return this.b.add(e);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        return this.b.addAll(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.b.clear();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.b.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return this.b.containsAll(collection);
    }

    @Override // java.util.List
    public final E get(int i) {
        return this.b.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.b.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return this.b.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.b.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator<E> listIterator() {
        return this.b.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.b.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        return this.b.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        return this.b.retainAll(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List
    public final E set(int i, E e) {
        E e2 = this.b.set(i, e);
        EntryAttachment entryAttachment = (EntryAttachment) e;
        if (i == 0) {
            gnq gnqVar = gnq.a;
            Parcelable parcelable = entryAttachment.b;
            gnqVar.getClass();
            gmq gmqVar = parcelable instanceof gmq ? (gmq) parcelable : parcelable instanceof NarrativeAttachment ? ((NarrativeAttachment) parcelable).f : null;
            if (gmqVar != null) {
                FaveEntry.this.i.f = gmqVar;
            }
        }
        return e2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.b.size();
    }

    @Override // java.util.List
    public final List<E> subList(int i, int i2) {
        return this.b.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return z4g.h(this);
    }

    @Override // java.util.List
    public final void add(int i, E e) {
        this.b.add(i, e);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        return this.b.addAll(collection);
    }

    @Override // java.util.List
    public final ListIterator<E> listIterator(int i) {
        return this.b.listIterator(i);
    }

    @Override // java.util.List
    public final E remove(int i) {
        return this.b.remove(i);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) z4g.i(this, tArr);
    }
}
