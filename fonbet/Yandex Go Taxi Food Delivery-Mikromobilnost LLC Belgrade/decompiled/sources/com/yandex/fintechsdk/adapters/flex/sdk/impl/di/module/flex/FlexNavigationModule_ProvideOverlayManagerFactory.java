package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex;

import defpackage.l190;
import defpackage.q5z;
import defpackage.v7p;

/* loaded from: classes10.dex */
public final class FlexNavigationModule_ProvideOverlayManagerFactory implements v7p {
    private final FlexNavigationModule module;

    private FlexNavigationModule_ProvideOverlayManagerFactory(FlexNavigationModule flexNavigationModule) {
        this.module = flexNavigationModule;
    }

    public static FlexNavigationModule_ProvideOverlayManagerFactory create(FlexNavigationModule flexNavigationModule) {
        return new FlexNavigationModule_ProvideOverlayManagerFactory(flexNavigationModule);
    }

    public static l190 provideOverlayManager(FlexNavigationModule flexNavigationModule) {
        l190 provideOverlayManager = flexNavigationModule.provideOverlayManager();
        q5z.i(provideOverlayManager);
        return provideOverlayManager;
    }

    @Override // defpackage.yvf0
    public l190 get() {
        return provideOverlayManager(this.module);
    }
}
