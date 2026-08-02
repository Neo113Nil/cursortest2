package com.yandex.mapkit.search.internal;

import com.yandex.mapkit.search.GoodsRegisterSession;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class GoodsRegisterSessionBinding implements GoodsRegisterSession {
    private final NativeObject nativeObject;

    public GoodsRegisterSessionBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.search.GoodsRegisterSession
    public native void cancel();

    @Override // com.yandex.mapkit.search.GoodsRegisterSession
    public native void retry(GoodsRegisterSession.GoodsRegisterListener goodsRegisterListener);
}
