package com.yandex.runtime.network.internal.internal;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.network.internal.FileOperationsListener;
import com.yandex.runtime.network.internal.NetworkPlayer;

/* loaded from: classes2.dex */
public class NetworkPlayerBinding implements NetworkPlayer {
    private final NativeObject nativeObject;

    public NetworkPlayerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.runtime.network.internal.NetworkPlayer
    public native boolean isValid();

    @Override // com.yandex.runtime.network.internal.NetworkPlayer
    public native void play(String str, FileOperationsListener fileOperationsListener);

    @Override // com.yandex.runtime.network.internal.NetworkPlayer
    public native void stop();
}
