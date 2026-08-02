package com.yandex.div.internal.util;

import java.lang.ref.WeakReference;
import xsna.p7f0;
import xsna.qcy;

/* compiled from: Utils.kt */
/* loaded from: classes7.dex */
final class WeakRef<T> implements p7f0<Object, T> {
    private WeakReference<T> weakReference;

    public WeakRef(T t) {
        this.weakReference = t != null ? new WeakReference<>(t) : null;
    }

    @Override // xsna.i7f0
    public T getValue(Object obj, qcy<?> qcyVar) {
        WeakReference<T> weakReference = this.weakReference;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // xsna.p7f0
    public void setValue(Object obj, qcy<?> qcyVar, T t) {
        this.weakReference = t != null ? new WeakReference<>(t) : null;
    }
}
