package ru.ok.android.commons.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* loaded from: classes9.dex */
public final class Optional<T> {
    private static final Optional<?> EMPTY = new Optional<>(null);

    @Nullable
    private final T value;

    public Optional(@Nullable T t) {
        this.value = t;
    }

    @NonNull
    public static <T> Optional<T> empty() {
        return (Optional<T>) EMPTY;
    }

    @NonNull
    public static <T> Optional<T> of(@NonNull T t) {
        Objects.requireNonNull(t);
        return new Optional<>(t);
    }

    @NonNull
    public static <T> Optional<T> ofNullable(@Nullable T t) {
        return t == null ? (Optional<T>) EMPTY : new Optional<>(t);
    }

    @NonNull
    public <U> Optional<U> cast(@NonNull Class<U> cls) {
        return cls.isInstance(this.value) ? of(cls.cast(this.value)) : empty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Optional) && equals((Optional<?>) obj);
    }

    public Optional<T> filter(@NonNull Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate);
        return (isPresent() && !predicate.test(this.value)) ? empty() : this;
    }

    @NonNull
    public <U> Optional<U> flatMap(@NonNull Function<? super T, Optional<U>> function) {
        T t = this.value;
        return t == null ? empty() : function.apply(t);
    }

    @NonNull
    public T get() {
        T t = this.value;
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException();
    }

    public int hashCode() {
        return Objects.hashCode(this.value);
    }

    public void ifPresent(@NonNull Consumer<? super T> consumer) {
        T t = this.value;
        if (t != null) {
            consumer.accept(t);
        }
    }

    public boolean isPresent() {
        return this.value != null;
    }

    @NonNull
    public <U> Optional<U> map(@NonNull Function<? super T, ? extends U> function) {
        T t = this.value;
        return t == null ? empty() : ofNullable(function.apply(t));
    }

    public T orElse(T t) {
        T t2 = this.value;
        return t2 != null ? t2 : t;
    }

    public T orElseGet(@NonNull Supplier<? extends T> supplier) {
        T t = this.value;
        return t != null ? t : supplier.get();
    }

    public <X extends Throwable> T orElseThrow(@NonNull Supplier<? extends X> supplier) throws Throwable {
        T t = this.value;
        if (t != null) {
            return t;
        }
        throw supplier.get();
    }

    public String toString() {
        T t = this.value;
        return t != null ? String.format("Optional[%s]", t) : "Optional.empty";
    }

    public boolean equals(Optional<?> optional) {
        if (optional != this) {
            return optional != null && Objects.equals(this.value, optional.value);
        }
        return true;
    }
}
