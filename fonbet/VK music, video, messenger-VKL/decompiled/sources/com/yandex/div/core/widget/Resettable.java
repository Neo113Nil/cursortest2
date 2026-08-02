package com.yandex.div.core.widget;

import java.util.ConcurrentModificationException;
import xsna.gzs;

/* compiled from: GridContainer.kt */
/* loaded from: classes7.dex */
final class Resettable<T> {
    private final gzs<T> initializer;
    private T value;

    /* JADX WARN: Multi-variable type inference failed */
    public Resettable(gzs<? extends T> gzsVar) {
        this.initializer = gzsVar;
    }

    public final T get() {
        if (this.value == null) {
            this.value = this.initializer.invoke();
        }
        T t = this.value;
        if (t != null) {
            return t;
        }
        throw new ConcurrentModificationException("Set to null by another thread");
    }

    public final boolean getInitialized() {
        return this.value != null;
    }

    public final void reset() {
        this.value = null;
    }
}
