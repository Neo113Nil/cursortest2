package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module;

import defpackage.k6x;
import defpackage.q5z;
import defpackage.v7p;

/* loaded from: classes10.dex */
public final class FlexModule_ProvideJasonStateStoreFactory implements v7p {
    private final FlexModule module;

    private FlexModule_ProvideJasonStateStoreFactory(FlexModule flexModule) {
        this.module = flexModule;
    }

    public static FlexModule_ProvideJasonStateStoreFactory create(FlexModule flexModule) {
        return new FlexModule_ProvideJasonStateStoreFactory(flexModule);
    }

    public static k6x provideJasonStateStore(FlexModule flexModule) {
        k6x provideJasonStateStore = flexModule.provideJasonStateStore();
        q5z.i(provideJasonStateStore);
        return provideJasonStateStore;
    }

    @Override // defpackage.yvf0
    public k6x get() {
        return provideJasonStateStore(this.module);
    }
}
