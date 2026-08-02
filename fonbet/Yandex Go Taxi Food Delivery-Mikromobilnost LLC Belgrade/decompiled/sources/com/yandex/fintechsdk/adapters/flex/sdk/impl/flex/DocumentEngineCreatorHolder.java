package com.yandex.fintechsdk.adapters.flex.sdk.impl.flex;

import defpackage.ny61;
import defpackage.yvf0;
import flex.engine.a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/DocumentEngineCreatorHolder;", "Lyvf0;", "Lflex/engine/a;", "<init>", "()V", "get", "()Lflex/engine/a;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DocumentEngineCreatorHolder implements yvf0 {
    @Override // defpackage.yvf0
    public a get() {
        DocumentEngineCreator documentEngineCreator = DocumentEngineCreatorRegistry.INSTANCE.get();
        if (documentEngineCreator != null) {
            return documentEngineCreator.get();
        }
        ny61.r("DocumentEngineCreator not found in registry. FlexComponent may be destroyed or not initialized yet.");
        return null;
    }
}
