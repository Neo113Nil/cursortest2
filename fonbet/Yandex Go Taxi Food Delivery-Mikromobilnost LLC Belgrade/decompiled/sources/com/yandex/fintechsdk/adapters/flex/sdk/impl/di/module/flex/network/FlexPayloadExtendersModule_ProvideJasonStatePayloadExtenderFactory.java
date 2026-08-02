package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network;

import defpackage.hv90;
import defpackage.k6x;
import defpackage.q5z;
import defpackage.v7p;
import defpackage.xvf0;

/* loaded from: classes10.dex */
public final class FlexPayloadExtendersModule_ProvideJasonStatePayloadExtenderFactory implements v7p {
    private final xvf0 jasonStateStoreProvider;
    private final FlexPayloadExtendersModule module;

    private FlexPayloadExtendersModule_ProvideJasonStatePayloadExtenderFactory(FlexPayloadExtendersModule flexPayloadExtendersModule, xvf0 xvf0Var) {
        this.module = flexPayloadExtendersModule;
        this.jasonStateStoreProvider = xvf0Var;
    }

    public static FlexPayloadExtendersModule_ProvideJasonStatePayloadExtenderFactory create(FlexPayloadExtendersModule flexPayloadExtendersModule, xvf0 xvf0Var) {
        return new FlexPayloadExtendersModule_ProvideJasonStatePayloadExtenderFactory(flexPayloadExtendersModule, xvf0Var);
    }

    public static hv90 provideJasonStatePayloadExtender(FlexPayloadExtendersModule flexPayloadExtendersModule, k6x k6xVar) {
        hv90 provideJasonStatePayloadExtender = flexPayloadExtendersModule.provideJasonStatePayloadExtender(k6xVar);
        q5z.i(provideJasonStatePayloadExtender);
        return provideJasonStatePayloadExtender;
    }

    @Override // defpackage.yvf0
    public hv90 get() {
        return provideJasonStatePayloadExtender(this.module, (k6x) this.jasonStateStoreProvider.get());
    }
}
