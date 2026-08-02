package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.input.InputSecureExtensionHandler;
import defpackage.q5z;
import defpackage.v7p;

/* loaded from: classes10.dex */
public final class DivkitModule_ProvideInputSecureExtensionHandlerFactory implements v7p {
    private final DivkitModule module;

    private DivkitModule_ProvideInputSecureExtensionHandlerFactory(DivkitModule divkitModule) {
        this.module = divkitModule;
    }

    public static DivkitModule_ProvideInputSecureExtensionHandlerFactory create(DivkitModule divkitModule) {
        return new DivkitModule_ProvideInputSecureExtensionHandlerFactory(divkitModule);
    }

    public static InputSecureExtensionHandler provideInputSecureExtensionHandler(DivkitModule divkitModule) {
        InputSecureExtensionHandler provideInputSecureExtensionHandler = divkitModule.provideInputSecureExtensionHandler();
        q5z.i(provideInputSecureExtensionHandler);
        return provideInputSecureExtensionHandler;
    }

    @Override // defpackage.yvf0
    public InputSecureExtensionHandler get() {
        return provideInputSecureExtensionHandler(this.module);
    }
}
