package ru.ok.android.commons.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

/* loaded from: classes9.dex */
public final class Promise<T> implements Serializable {
    private volatile T value;

    public static final class Keeper<T> {

        @NonNull
        public final Promise<T> promise = new Promise<>();

        public void set(T t) {
            ((Promise) this.promise).value = t;
        }
    }

    public static final class ToLazyAdapter<T> implements Serializable, Supplier<T> {
        private final Promise<T> delegate;

        public /* synthetic */ ToLazyAdapter(Promise promise, int i) {
            this(promise);
        }

        @Override // java.util.function.Supplier
        public T get() {
            return this.delegate.get();
        }

        private ToLazyAdapter(@NonNull Promise<T> promise) {
            this.delegate = promise;
        }
    }

    public static final class ToLazyListAdapter<T> implements Serializable, Supplier<List<T>> {
        private final List<Promise<T>> delegates;

        public ToLazyListAdapter(@NonNull List<Promise<T>> list) {
            this.delegates = list;
        }

        @Override // java.util.function.Supplier
        public List<T> get() {
            ArrayList arrayList = new ArrayList(this.delegates.size());
            Iterator<Promise<T>> it = this.delegates.iterator();
            while (it.hasNext()) {
                arrayList.add(Promise.nullableGet(it.next()));
            }
            return arrayList;
        }
    }

    public /* synthetic */ Promise() {
        this(null);
    }

    @NonNull
    public static <T> Lazy<List<T>> listToLazyList(List<Promise<T>> list) {
        return list == null ? Lazy.of(null) : Lazy.fromSupplier(new ToLazyListAdapter(list));
    }

    @Nullable
    public static <T> T nullableGet(@Nullable Promise<T> promise) {
        if (promise == null) {
            return null;
        }
        return promise.get();
    }

    @Nullable
    public static <T> Lazy<List<T>> nullableListToLazyList(@Nullable List<Promise<T>> list) {
        if (list == null) {
            return null;
        }
        return Lazy.fromSupplier(new ToLazyListAdapter(list));
    }

    @Nullable
    public static <T> Promise<T> nullableOf(@Nullable T t) {
        if (t == null) {
            return null;
        }
        return new Promise<>(t);
    }

    @NonNull
    public static <T> Promise<T> of(T t) {
        return new Promise<>(t);
    }

    public T get() {
        return this.value;
    }

    @NonNull
    public Lazy<T> toLazy() {
        return Lazy.fromSupplier(new ToLazyAdapter(this, 0));
    }

    @NonNull
    public String toString() {
        return String.format("Promise[%s]", this.value);
    }

    private Promise(T t) {
        this.value = t;
    }
}
