package com.yandex.fintechsdk.adapters.flex.sdk.impl.flex;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\u0003R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/DocumentEngineCreatorRegistry;", "", "<init>", "()V", "Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/DocumentEngineCreator;", "creator", "Lzy11;", "register", "(Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/DocumentEngineCreator;)V", "get", "()Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/DocumentEngineCreator;", "clear", "currentCreator", "Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/DocumentEngineCreator;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DocumentEngineCreatorRegistry {
    public static final DocumentEngineCreatorRegistry INSTANCE = new DocumentEngineCreatorRegistry();
    private static DocumentEngineCreator currentCreator;

    private DocumentEngineCreatorRegistry() {
    }

    public final void clear() {
        currentCreator = null;
    }

    public final DocumentEngineCreator get() {
        return currentCreator;
    }

    public final void register(DocumentEngineCreator creator) {
        currentCreator = creator;
    }
}
