package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module;

import defpackage.i3m;
import defpackage.q5z;
import defpackage.uyi0;
import defpackage.v7p;
import defpackage.xg5;
import defpackage.xvf0;

/* loaded from: classes10.dex */
public final class FlexModule_ProvideDocumentTrackerFactory implements v7p {
    private final xvf0 bduiEventHandlerProvider;
    private final FlexModule module;
    private final xvf0 renderingEventsListenerProvider;

    private FlexModule_ProvideDocumentTrackerFactory(FlexModule flexModule, xvf0 xvf0Var, xvf0 xvf0Var2) {
        this.module = flexModule;
        this.bduiEventHandlerProvider = xvf0Var;
        this.renderingEventsListenerProvider = xvf0Var2;
    }

    public static FlexModule_ProvideDocumentTrackerFactory create(FlexModule flexModule, xvf0 xvf0Var, xvf0 xvf0Var2) {
        return new FlexModule_ProvideDocumentTrackerFactory(flexModule, xvf0Var, xvf0Var2);
    }

    public static i3m provideDocumentTracker(FlexModule flexModule, xg5 xg5Var, uyi0 uyi0Var) {
        i3m provideDocumentTracker = flexModule.provideDocumentTracker(xg5Var, uyi0Var);
        q5z.i(provideDocumentTracker);
        return provideDocumentTracker;
    }

    @Override // defpackage.yvf0
    public i3m get() {
        return provideDocumentTracker(this.module, (xg5) this.bduiEventHandlerProvider.get(), (uyi0) this.renderingEventsListenerProvider.get());
    }
}
