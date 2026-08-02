package org.chromium.base;

import java.util.Objects;

/* loaded from: classes8.dex */
public class ValueChangedCallback<T> implements Callback<T> {
    private T mLastValue;
    private final ValueChangedObserver<T> mValueChangedObserver;

    @FunctionalInterface
    public interface ValueChangedObserver<T> {
        void onValueChanged(T t, T t2);
    }

    public ValueChangedCallback(ValueChangedObserver<T> valueChangedObserver) {
        this.mValueChangedObserver = valueChangedObserver;
    }

    @Override // org.chromium.base.Callback
    /* renamed from: onResult */
    public void lambda$bind$0(T t) {
        if (Objects.equals(t, this.mLastValue)) {
            return;
        }
        T t2 = this.mLastValue;
        this.mLastValue = t;
        this.mValueChangedObserver.onValueChanged(t, t2);
    }
}
