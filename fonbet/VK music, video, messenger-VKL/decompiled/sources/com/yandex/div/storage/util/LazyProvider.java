package com.yandex.div.storage.util;

import kotlin.Lazy;
import xsna.bpn0;
import xsna.e9e0;
import xsna.gzs;

/* compiled from: LazyProvider.kt */
/* loaded from: classes7.dex */
public final class LazyProvider<T> implements e9e0<T> {
    private final Lazy value$delegate;

    public LazyProvider(gzs<? extends T> gzsVar) {
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
