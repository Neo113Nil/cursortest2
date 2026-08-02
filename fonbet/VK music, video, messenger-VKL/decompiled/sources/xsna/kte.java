package xsna;

import com.vk.dto.common.id.UserId;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.collections.EmptyList;

/* compiled from: ClipsPlaylistsFoldersAvailableAuthors.kt */
/* loaded from: classes16.dex */
public final class kte {
    public final Object a;
    public final UserId b;

    /* compiled from: ClipsPlaylistsFoldersAvailableAuthors.kt */
    public static final class a {
        public final UserId a;
        public final String b;
        public final String c;

        public a(UserId userId, String str, String str2) {
            this.a = userId;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Author(id=");
            sb.append(this.a);
            sb.append(", name=");
            sb.append(this.b);
            sb.append(", avatar=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: ClipsPlaylistsFoldersAvailableAuthors.kt */
    public interface b {
    }

    /* compiled from: ClipsPlaylistsFoldersAvailableAuthors.kt */
    @vby
    public static final class c implements b, List<a>, gcy {
        public final List<a> b;

        public /* synthetic */ c(List list) {
            this.b = list;
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ void add(int i, a aVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection<? extends a> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ void addLast(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            return this.b.contains((a) obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            return this.b.containsAll(collection);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean equals(Object obj) {
            if (obj instanceof c) {
                return epx.f(this.b, ((c) obj).b);
            }
            return false;
        }

        @Override // java.util.List
        public final a get(int i) {
            return this.b.get(i);
        }

        @Override // java.util.List, java.util.Collection
        public final int hashCode() {
            return this.b.hashCode();
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            if (!(obj instanceof a)) {
                return -1;
            }
            return this.b.indexOf((a) obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.b.isEmpty();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<a> iterator() {
            return this.b.iterator();
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof a)) {
                return -1;
            }
            return this.b.lastIndexOf((a) obj);
        }

        @Override // java.util.List
        public final ListIterator<a> listIterator() {
            return this.b.listIterator();
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ a remove(int i) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ Object removeFirst() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ Object removeLast() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final void replaceAll(UnaryOperator<a> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ a set(int i, a aVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.b.size();
        }

        @Override // java.util.List
        public final void sort(Comparator<? super a> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final List<a> subList(int i, int i2) {
            return this.b.subList(i, i2);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return z4g.h(this);
        }

        public final String toString() {
            return "FullLoadedAuthors(value=" + this.b + ')';
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends a> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final ListIterator<a> listIterator(int i) {
            return this.b.listIterator(i);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) z4g.i(this, tArr);
        }
    }

    /* compiled from: ClipsPlaylistsFoldersAvailableAuthors.kt */
    @vby
    public static final class d implements b, List<UserId>, gcy {
        public final List<UserId> b;

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ void add(int i, UserId userId) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection<? extends UserId> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ void addLast(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            if (!(obj instanceof UserId)) {
                return false;
            }
            return this.b.contains((UserId) obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            return this.b.containsAll(collection);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean equals(Object obj) {
            if (obj instanceof d) {
                return epx.f(this.b, ((d) obj).b);
            }
            return false;
        }

        @Override // java.util.List
        public final UserId get(int i) {
            return this.b.get(i);
        }

        @Override // java.util.List, java.util.Collection
        public final int hashCode() {
            return this.b.hashCode();
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            if (!(obj instanceof UserId)) {
                return -1;
            }
            return this.b.indexOf((UserId) obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.b.isEmpty();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<UserId> iterator() {
            return this.b.iterator();
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof UserId)) {
                return -1;
            }
            return this.b.lastIndexOf((UserId) obj);
        }

        @Override // java.util.List
        public final ListIterator<UserId> listIterator() {
            return this.b.listIterator();
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ UserId remove(int i) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ Object removeFirst() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ Object removeLast() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final void replaceAll(UnaryOperator<UserId> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ UserId set(int i, UserId userId) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.b.size();
        }

        @Override // java.util.List
        public final void sort(Comparator<? super UserId> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final List<UserId> subList(int i, int i2) {
            return this.b.subList(i, i2);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return z4g.h(this);
        }

        public final String toString() {
            return "OnlyIdsAuthors(value=" + this.b + ')';
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends UserId> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final ListIterator<UserId> listIterator(int i) {
            return this.b.listIterator(i);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) z4g.i(this, tArr);
        }
    }

    static {
        EmptyList emptyList = EmptyList.b;
        UserId.b bVar = UserId.c;
    }

    public kte(b bVar, UserId userId) {
        this.a = bVar;
        this.b = userId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kte)) {
            return false;
        }
        kte kteVar = (kte) obj;
        return this.a.equals(kteVar.a) && epx.f(this.b, kteVar.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsPlaylistsFoldersAvailableAuthors(available=");
        sb.append(this.a);
        sb.append(", selected=");
        return gp.b(sb, this.b, ')');
    }
}
