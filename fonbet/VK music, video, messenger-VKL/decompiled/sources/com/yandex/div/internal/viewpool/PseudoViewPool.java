package com.yandex.div.internal.viewpool;

import android.view.View;
import com.yandex.div.internal.util.UtilsKt;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: PseudoViewPool.kt */
/* loaded from: classes7.dex */
public final class PseudoViewPool implements ViewPool {
    private final ConcurrentHashMap<String, ViewFactory<? extends View>> factoryMap = new ConcurrentHashMap<>();

    @Override // com.yandex.div.internal.viewpool.ViewPool
    public <T extends View> T obtain(String str) {
        return (T) ((ViewFactory) UtilsKt.getOrThrow$default(this.factoryMap, str, null, 2, null)).createView();
    }

    @Override // com.yandex.div.internal.viewpool.ViewPool
    public <T extends View> void register(String str, ViewFactory<T> viewFactory, int i) {
        this.factoryMap.put(str, viewFactory);
    }
}
