package ru.ok.android.commons.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.Serializable;
import java.util.concurrent.Callable;
import java.util.function.Supplier;
import xsna.e9e0;

/* loaded from: classes9.dex */
public final class Lazy<T> implements Serializable {
    private static final Lazy OF_NULL = new Lazy(null);
    private volatile Object value;

    public static final class ToCallableAdapter<T> implements Serializable, Callable<T> {
        private final Lazy<T> delegate;

        public /* synthetic */ ToCallableAdapter(Lazy lazy, int i) {
            this(lazy);
        }

        @Override // java.util.concurrent.Callable
        public T call() {
            return this.delegate.get();
        }

        private ToCallableAdapter(@NonNull Lazy<T> lazy) {
            this.delegate = lazy;
        }
    }

    public static final class ToSupplierAdapter<T> implements Serializable, Supplier<T>, e9e0<T> {
        private final Lazy<T> delegate;

        public ToSupplierAdapter(@NonNull Lazy<T> lazy) {
            this.delegate = lazy;
        }

        @Override // java.util.function.Supplier, xsna.e9e0
        public T get() {
            return this.delegate.get();
        }
    }

    public static final class Wrapped implements Serializable {
        final Object value;

        public Wrapped(Object obj) {
            this.value = obj;
        }
    }

    private Lazy(Object obj) {
        this.value = obj;
    }

    @NonNull
    public static <T> Callable<T> callable(Callable<? extends T> callable) {
        return fromCallable(callable).toCallable();
    }

    @NonNull
    public static <T> Lazy<T> fromCallable(Callable<? extends T> callable) {
        return callable == null ? OF_NULL : new Lazy<>(new FromCallableAdapter(callable));
    }

    @NonNull
    public static <T> Lazy<T> fromProvider(e9e0<? extends T> e9e0Var) {
        return new Lazy<>(e9e0Var);
    }

    @NonNull
    public static <T> Lazy<T> fromSupplier(Supplier<? extends T> supplier) {
        return new Lazy<>(supplier);
    }

    @Nullable
    public static <T> T nullableGet(@Nullable Lazy<T> lazy) {
        if (lazy == null) {
            return null;
        }
        return lazy.get();
    }

    @Nullable
    public static <T> Lazy<T> nullableOf(@Nullable T t) {
        if (t == null) {
            return null;
        }
        return new Lazy<>(wrapResult(t));
    }

    @NonNull
    public static <T> Lazy<T> of(T t) {
        return t == null ? OF_NULL : new Lazy<>(wrapResult(t));
    }

    @NonNull
    public static <T> e9e0<T> provider(e9e0<? extends T> e9e0Var) {
        return fromProvider(e9e0Var).toProvider();
    }

    @NonNull
    public static <T> Supplier<T> supplier(Supplier<? extends T> supplier) {
        return fromSupplier(supplier).toSupplier();
    }

    private static Object unwrapResult(Object obj) {
        if (obj instanceof Throwable) {
            throw new LazyException((Throwable) obj);
        }
        return obj instanceof Wrapped ? ((Wrapped) obj).value : obj;
    }

    private static Object wrapResult(Object obj) {
        return ((obj instanceof Supplier) || (obj instanceof e9e0) || (obj instanceof Throwable)) ? new Wrapped(obj) : obj;
    }

    public T get() {
        Object obj = this.value;
        if (!(obj instanceof Supplier) && !(obj instanceof e9e0)) {
            return (T) unwrapResult(obj);
        }
        synchronized (this) {
            try {
                Object obj2 = this.value;
                if (obj2 != obj) {
                    return (T) unwrapResult(obj2);
                }
                try {
                    T t = obj2 instanceof Supplier ? (T) ((Supplier) obj2).get() : (T) ((e9e0) obj2).get();
                    this.value = wrapResult(t);
                    return t;
                } catch (Throwable th) {
                    this.value = th;
                    throw new LazyException(th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public Callable<T> toCallable() {
        return new ToCallableAdapter(this, 0);
    }

    @NonNull
    public e9e0<T> toProvider() {
        return new ToSupplierAdapter(this);
    }

    public String toString() {
        Object obj = this.value;
        return ((obj instanceof Supplier) || (obj instanceof e9e0)) ? String.format("Lazy.yet[%s]", obj) : obj instanceof Throwable ? String.format("Lazy.failure[%s]", obj) : obj instanceof Wrapped ? String.format("Lazy.ok[%s]", ((Wrapped) obj).value) : String.format("Lazy.ok[%s]", obj);
    }

    @NonNull
    public Supplier<T> toSupplier() {
        return new ToSupplierAdapter(this);
    }

    public static final class FromCallableAdapter<T> implements Serializable, Supplier<T> {
        private final Callable<T> delegate;

        public FromCallableAdapter(@NonNull Callable<T> callable) {
            this.delegate = callable;
        }

        @Override // java.util.function.Supplier
        public T get() {
            try {
                return this.delegate.call();
            } catch (Exception e) {
                throw sneaky(e);
            }
        }

        private static <E extends Throwable> Error sneaky(Throwable th) throws Throwable {
            throw th;
        }
    }
}
