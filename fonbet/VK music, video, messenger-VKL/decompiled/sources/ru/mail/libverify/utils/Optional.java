package ru.mail.libverify.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import java.util.NoSuchElementException;
import java.util.Objects;
import xsna.tk5;

/* loaded from: classes9.dex */
public final class Optional<T> {
    private static final Optional<?> EMPTY = new Optional<>();

    @Nullable
    private final T value;

    @FunctionalInterface
    public interface Action<T> {
        void accept(@NonNull T t);
    }

    private Optional() {
        this.value = null;
    }

    @NonNull
    public static <T> Optional<T> empty() {
        return (Optional<T>) EMPTY;
    }

    @NonNull
    public static <T> Optional<T> of(T t) {
        return new Optional<>(t);
    }

    @NonNull
    public static <T> Optional<T> ofNullable(@Nullable T t) {
        return t == null ? empty() : of(t);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Optional) {
            return Objects.equals(this.value, ((Optional) obj).value);
        }
        return false;
    }

    @NonNull
    public T get() {
        T t = this.value;
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException("No value present");
    }

    public int hashCode() {
        return Objects.hashCode(this.value);
    }

    public void ifPresent(@NonNull Action<T> action) {
        T t = this.value;
        if (t != null) {
            action.accept(t);
        }
    }

    public boolean isPresent() {
        return this.value != null;
    }

    public T orElse(T t) {
        T t2 = this.value;
        return t2 != null ? t2 : t;
    }

    @NonNull
    public String toString() {
        return this.value != null ? tk5.c(new StringBuilder("Optional["), this.value, X3.j.e) : "Optional.empty";
    }

    private Optional(T t) {
        Objects.requireNonNull(t);
        this.value = t;
    }
}
