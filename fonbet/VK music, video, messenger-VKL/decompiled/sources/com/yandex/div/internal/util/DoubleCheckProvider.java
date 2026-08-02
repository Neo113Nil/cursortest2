package com.yandex.div.internal.util;

import kotlin.Lazy;
import xsna.bpn0;
import xsna.e9e0;
import xsna.gzs;

/* compiled from: DoubleCheckProvider.kt */
/* loaded from: classes7.dex */
public final class DoubleCheckProvider<T> implements e9e0<T> {
    private final Lazy value$delegate;

    public DoubleCheckProvider(gzs<? extends T> gzsVar) {
        this.value$delegate = new bpn0(gzsVar);
    }

    private final T getValue() {
        return (T) this.value$delegate.getValue();
    }

    @Override // xsna.e9e0
    public T get() {
        return getValue();
    }
}
