package ru.ok.android.commons.util;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes9.dex */
public final class Either<L, R> {
    private static final Either LEFT_NULL = new Either(false, null);
    private static final Either RIGHT_NULL = new Either(true, null);
    private final boolean right;
    private final Object value;

    private Either(boolean z, Object obj) {
        this.right = z;
        this.value = obj;
    }

    @NonNull
    public static <L, R> Either<L, R> left(L l) {
        return l == null ? LEFT_NULL : new Either<>(false, l);
    }

    @NonNull
    public static <L, R> Either<L, R> right(R r) {
        return r == null ? RIGHT_NULL : new Either<>(true, r);
    }

    public static <L extends Throwable, R> R unwrapRight(@NonNull Either<L, R> either) throws Throwable {
        if (((Either) either).right) {
            return (R) ((Either) either).value;
        }
        throw ((Throwable) ((Either) either).value);
    }

    public boolean equals(Object obj) {
        return (obj instanceof Either) && equals((Either) obj);
    }

    public L getLeft() {
        if (this.right) {
            throw new IllegalStateException("Either is right");
        }
        return (L) this.value;
    }

    public R getRight() {
        if (this.right) {
            return (R) this.value;
        }
        throw new IllegalStateException("Either is left");
    }

    public int hashCode() {
        return Objects.hashCode(this.value);
    }

    public boolean isLeft() {
        return !this.right;
    }

    public boolean isRight() {
        return this.right;
    }

    @NonNull
    public String toString() {
        return String.format(this.right ? "Either.right[%s]" : "Either.left[%s]", this.value);
    }

    public boolean equals(Either either) {
        if (either != this) {
            return either != null && this.right == either.right && Objects.equals(this.value, either.value);
        }
        return true;
    }
}
