package com.yandex.runtime.init.internal;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.init.MiidListener;
import com.yandex.runtime.init.MiidManager;

/* loaded from: classes7.dex */
public class MiidManagerBinding implements MiidManager {
    private final NativeObject nativeObject;

    public MiidManagerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.runtime.init.MiidManager
    public native boolean isValid();

    @Override // com.yandex.runtime.init.MiidManager
    public native void submit(MiidListener miidListener);
}
