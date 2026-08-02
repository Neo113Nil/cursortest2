package ru.ok.android.commons.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* loaded from: classes9.dex */
public class IterableUtil {

    public static abstract class FilterIterator<T> implements Iterator<T> {
        private boolean end = false;
        private boolean hasValue = false;
        private T peekedValue;
        private final Iterator<? extends T> sourceIterator;

        public FilterIterator(Iterator<? extends T> it) {
            this.sourceIterator = it;
        }

        private boolean trySieve() {
            while (this.sourceIterator.hasNext()) {
                T next = this.sourceIterator.next();
                if (keep(next)) {
                    this.hasValue = true;
                    this.peekedValue = next;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.hasValue) {
                return true;
            }
            if (this.end) {
                return false;
            }
            if (trySieve()) {
                return true;
            }
            this.end = true;
            return false;
        }

        public abstract boolean keep(T t);

        @Override // java.util.Iterator
        public T next() {
            if (this.hasValue) {
                this.hasValue = false;
                return this.peekedValue;
            }
            if (!trySieve()) {
                throw new NoSuchElementException("This FilterIterator has nothing to output");
            }
            this.hasValue = false;
            return this.peekedValue;
        }
    }

    public static final class IndexedValue<T> {
        public final int ix;
        public final T value;

        public IndexedValue(int i, T t) {
            this.ix = i;
            this.value = t;
        }
    }

    private IterableUtil() {
    }

    @SafeVarargs
    public static <T> Iterable<T> asIterable(final T... tArr) {
        return new Iterable<T>() { // from class: ru.ok.android.commons.util.IterableUtil.4
            @Override // java.lang.Iterable
            @NonNull
            public Iterator<T> iterator() {
                return new Iterator<T>() { // from class: ru.ok.android.commons.util.IterableUtil.4.1
                    int idx = 0;

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return this.idx != tArr.length;
                    }

                    @Override // java.util.Iterator
                    public T next() {
                        Object[] objArr = tArr;
                        int i = this.idx;
                        this.idx = i + 1;
                        return (T) objArr[i];
                    }
                };
            }
        };
    }

    public static <T, U> Iterable<T> asIterableCoerce(final U... uArr) {
        return new Iterable<T>() { // from class: ru.ok.android.commons.util.IterableUtil.5
            @Override // java.lang.Iterable
            @NonNull
            public Iterator<T> iterator() {
                return new Iterator<T>() { // from class: ru.ok.android.commons.util.IterableUtil.5.1
                    int idx = 0;

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return this.idx != uArr.length;
                    }

                    @Override // java.util.Iterator
                    public T next() {
                        Object[] objArr = uArr;
                        int i = this.idx;
                        this.idx = i + 1;
                        return (T) objArr[i];
                    }
                };
            }
        };
    }

    public static <T> Iterable<T> concat(final Iterable<? extends T> iterable, final Iterable<? extends T> iterable2) {
        return new Iterable<T>() { // from class: ru.ok.android.commons.util.IterableUtil.2
            @Override // java.lang.Iterable
            @NonNull
            public Iterator<T> iterator() {
                return new Iterator<T>() { // from class: ru.ok.android.commons.util.IterableUtil.2.1
                    private Iterator<? extends T> firstIt;
                    private Iterator<? extends T> secondIt;

                    {
                        this.firstIt = iterable.iterator();
                        this.secondIt = iterable2.iterator();
                    }

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return this.firstIt.hasNext() || this.secondIt.hasNext();
                    }

                    @Override // java.util.Iterator
                    public T next() {
                        return (this.firstIt.hasNext() ? this.firstIt : this.secondIt).next();
                    }
                };
            }
        };
    }

    public static <T> Iterable<T> filter(final Iterable<T> iterable, final Predicate<? super T> predicate) {
        return new Iterable<T>() { // from class: ru.ok.android.commons.util.IterableUtil.6
            @Override // java.lang.Iterable
            @NonNull
            public Iterator<T> iterator() {
                return new FilterIterator<T>(iterable.iterator()) { // from class: ru.ok.android.commons.util.IterableUtil.6.1
                    @Override // ru.ok.android.commons.util.IterableUtil.FilterIterator
                    public boolean keep(T t) {
                        return predicate.test(t);
                    }
                };
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    @Nullable
    public static <T> T findFirst(@NonNull Iterable<? extends T> iterable, @NonNull Predicate<? super T> predicate) {
        for (T t : iterable) {
            if (predicate.test(t)) {
                return t;
            }
        }
        return null;
    }

    public static <T, R> R foldEager(Iterable<? extends T> iterable, R r, BiFunction<R, T, R> biFunction) {
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r = biFunction.apply(r, it.next());
        }
        return r;
    }

    public static <T, R> Iterable<R> foldWithIntermediate(final Iterable<? extends T> iterable, final R r, final BiFunction<R, T, R> biFunction) {
        return new Iterable<R>() { // from class: ru.ok.android.commons.util.IterableUtil.3
            @Override // java.lang.Iterable
            @NonNull
            public Iterator<R> iterator() {
                return new Iterator<R>() { // from class: ru.ok.android.commons.util.IterableUtil.3.1
                    private R accumulator;
                    private final Iterator<? extends T> iterator;

                    {
                        this.iterator = iterable.iterator();
                        this.accumulator = (R) r;
                    }

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return this.iterator.hasNext();
                    }

                    @Override // java.util.Iterator
                    public R next() {
                        R r2 = (R) biFunction.apply(this.accumulator, this.iterator.next());
                        this.accumulator = r2;
                        return r2;
                    }
                };
            }
        };
    }

    public static <T> Iterable<IndexedValue<T>> indexed(final Iterable<? extends T> iterable) {
        return new Iterable<IndexedValue<T>>() { // from class: ru.ok.android.commons.util.IterableUtil.8
            @Override // java.lang.Iterable
            @NonNull
            public Iterator<IndexedValue<T>> iterator() {
                return new Iterator<IndexedValue<T>>() { // from class: ru.ok.android.commons.util.IterableUtil.8.1
                    private int index = 0;
                    private final Iterator<? extends T> it;

                    {
                        this.it = iterable.iterator();
                    }

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return this.it.hasNext();
                    }

                    @Override // java.util.Iterator
                    public IndexedValue<T> next() {
                        int i = this.index;
                        this.index = i + 1;
                        return new IndexedValue<>(i, this.it.next());
                    }
                };
            }
        };
    }

    public static <V, R> Iterable<R> map(final Iterable<V> iterable, final Function<V, R> function) {
        return new Iterable<R>() { // from class: ru.ok.android.commons.util.IterableUtil.1
            @Override // java.lang.Iterable
            @NonNull
            public Iterator<R> iterator() {
                final Iterator it = iterable.iterator();
                return new Iterator<R>() { // from class: ru.ok.android.commons.util.IterableUtil.1.1
                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return it.hasNext();
                    }

                    @Override // java.util.Iterator
                    public R next() {
                        return (R) function.apply(it.next());
                    }
                };
            }
        };
    }

    public static <K, T> Map<K, List<T>> multimapMerge(Map<K, List<T>> map, Map<K, List<T>> map2) {
        HashMap hashMap = new HashMap(map2.size() + map.size());
        hashMap.putAll(map);
        multimapMergeIn(hashMap, map2, new Supplier<List<T>>() { // from class: ru.ok.android.commons.util.IterableUtil.9
            @Override // java.util.function.Supplier
            public List<T> get() {
                return new ArrayList();
            }
        });
        return hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, T, C extends Collection<T>, M extends Map<K, C>> void multimapMergeIn(M m, M m2, Supplier<C> supplier) {
        for (Map.Entry entry : m2.entrySet()) {
            C c = (C) m.get(entry.getKey());
            if (c == null) {
                c = supplier.get();
                m.put(entry.getKey(), c);
            }
            c.addAll((Collection) entry.getValue());
        }
    }

    public static <T> ArrayList<T> toList(@NonNull Iterable<T> iterable, int i) {
        ArrayList<T> arrayList = new ArrayList<>(i);
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static <T1, T2, T3> Iterable<T3> zip(final Iterable<? extends T1> iterable, final Iterable<? extends T2> iterable2, final BiFunction<T1, T2, T3> biFunction) {
        return new Iterable<T3>() { // from class: ru.ok.android.commons.util.IterableUtil.7
            @Override // java.lang.Iterable
            @NonNull
            public Iterator<T3> iterator() {
                return new Iterator<T3>() { // from class: ru.ok.android.commons.util.IterableUtil.7.1
                    private Iterator<? extends T1> firstIt;
                    private Iterator<? extends T2> secondIt;

                    {
                        this.firstIt = iterable.iterator();
                        this.secondIt = iterable2.iterator();
                    }

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return this.firstIt.hasNext() && this.secondIt.hasNext();
                    }

                    @Override // java.util.Iterator
                    public T3 next() {
                        return (T3) biFunction.apply(this.firstIt.next(), this.secondIt.next());
                    }
                };
            }
        };
    }

    public static <T1, T2> void zipImpure(Iterable<? extends T1> iterable, Iterable<? extends T2> iterable2, BiConsumer<T1, T2> biConsumer) {
        Iterator<? extends T1> it = iterable.iterator();
        Iterator<? extends T2> it2 = iterable2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            biConsumer.accept(it.next(), it2.next());
        }
    }
}
