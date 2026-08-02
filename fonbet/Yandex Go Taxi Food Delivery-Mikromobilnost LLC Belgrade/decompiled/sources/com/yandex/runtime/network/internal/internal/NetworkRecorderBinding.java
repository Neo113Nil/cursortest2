package com.yandex.runtime.network.internal.internal;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.network.internal.FileOperationsListener;
import com.yandex.runtime.network.internal.NetworkRecorder;

/* loaded from: classes2.dex */
public class NetworkRecorderBinding implements NetworkRecorder {
    private final NativeObject nativeObject;

    public NetworkRecorderBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.runtime.network.internal.NetworkRecorder
    public native void dump(String str, FileOperationsListener fileOperationsListener);

    @Override // com.yandex.runtime.network.internal.NetworkRecorder
    public native boolean isValid();

    @Override // com.yandex.runtime.network.internal.NetworkRecorder
    public native void start();

    @Override // com.yandex.runtime.network.internal.NetworkRecorder
    public native void stop();
}
