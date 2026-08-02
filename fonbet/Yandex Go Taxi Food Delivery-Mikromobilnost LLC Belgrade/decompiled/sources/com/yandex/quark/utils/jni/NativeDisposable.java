package com.yandex.quark.utils.jni;

import com.yandex.quark.utils.Disposable;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class NativeDisposable implements Disposable {
    private final AtomicReference<NativeSharedPtr> pointer;

    public NativeDisposable(NativeSharedPtr nativeSharedPtr) {
        this.pointer = new AtomicReference<>(nativeSharedPtr);
    }

    private static native void dispose(long j);

    @Override // com.yandex.quark.utils.Disposable
    public void dispose() {
        NativeSharedPtr andSet = this.pointer.getAndSet(null);
        if (andSet != null) {
            dispose(andSet.address);
        }
    }
}
