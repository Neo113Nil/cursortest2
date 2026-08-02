package com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.presentation.bottomsheet;

import java.util.UUID;
import java.util.WeakHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/presentation/bottomsheet/ProviderStorage;", "T", "", "<init>", "()V", "obj", "", "persist", "(Ljava/lang/Object;)Ljava/lang/String;", "key", "obtain", "(Ljava/lang/String;)Ljava/lang/Object;", "Lzy11;", "clear", "(Ljava/lang/String;)V", "Ljava/util/WeakHashMap;", "storage", "Ljava/util/WeakHashMap;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public class ProviderStorage<T> {
    private final WeakHashMap<String, T> storage = new WeakHashMap<>();

    public final void clear(String key) {
        this.storage.remove(key);
    }

    public final T obtain(String key) {
        return this.storage.get(key);
    }

    public final String persist(T obj) {
        String uuid = UUID.randomUUID().toString();
        this.storage.put(uuid, obj);
        return uuid;
    }
}
