package ru.ok.android.api.common;

/* compiled from: RefApiValue.kt */
/* loaded from: classes9.dex */
public abstract class RefApiValue<T> extends BoxedApiValue {
    private final T value;

    public RefApiValue(T t) {
        this.value = t;
    }

    public final T getValue() {
        return this.value;
    }

    @Override // ru.ok.android.api.common.BoxedApiValue
    public boolean shouldSkipParam() {
        return this.value == null;
    }

    public String toString() {
        return String.valueOf(this.value);
    }
}
