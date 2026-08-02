package com.yandex.fintechsdk.adapters.flex.sdk.impl.di;

import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexDependencies;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/di/FlexComponentStore;", "", "Lcom/yandex/fintechsdk/adapters/flex/sdk/api/FlexDependencies;", "dependencies", "<init>", "(Lcom/yandex/fintechsdk/adapters/flex/sdk/api/FlexDependencies;)V", "Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/di/FlexComponent;", "component", "Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/di/FlexComponent;", "getComponent", "()Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/di/FlexComponent;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlexComponentStore {
    private final FlexComponent component;

    public FlexComponentStore(FlexDependencies flexDependencies) {
        this.component = DaggerFlexComponent.factory().create(flexDependencies);
    }

    /* renamed from: getComponent, reason: from getter and merged with bridge method [inline-methods] */
    public FlexComponent m144getComponent() {
        return this.component;
    }
}
