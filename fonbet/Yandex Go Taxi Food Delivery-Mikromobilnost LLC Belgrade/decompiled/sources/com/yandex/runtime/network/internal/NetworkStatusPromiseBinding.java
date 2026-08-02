package com.yandex.runtime.network.internal;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.network.NetworkStatusPromise;

/* loaded from: classes2.dex */
public class NetworkStatusPromiseBinding implements NetworkStatusPromise {
    private final NativeObject nativeObject;

    public NetworkStatusPromiseBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.runtime.network.NetworkStatusPromise
    public native void onFail(long j, String str);

    @Override // com.yandex.runtime.network.NetworkStatusPromise
    public native void onSuccess(long j);
}
