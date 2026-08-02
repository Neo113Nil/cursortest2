package com.yandex.plus.home.plaque.plugin.internal.defaults;

import androidx.lifecycle.DefaultLifecycleObserver;
import defpackage.ltg;
import defpackage.pey;
import defpackage.s9h;

/* loaded from: classes2.dex */
public final class a implements DefaultLifecycleObserver {
    public final /* synthetic */ DefaultLifecycleVisibilityDetector a;

    public a(DefaultLifecycleVisibilityDetector defaultLifecycleVisibilityDetector) {
        this.a = defaultLifecycleVisibilityDetector;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(pey peyVar) {
        ltg ltgVar;
        DefaultLifecycleVisibilityDetector defaultLifecycleVisibilityDetector = this.a;
        ltgVar = defaultLifecycleVisibilityDetector.debouncer;
        ((s9h) ltgVar).b().removeMessages(1);
        defaultLifecycleVisibilityDetector.fireListeners(false);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(pey peyVar) {
        ltg ltgVar;
        DefaultLifecycleVisibilityDetector defaultLifecycleVisibilityDetector = this.a;
        ltgVar = defaultLifecycleVisibilityDetector.debouncer;
        ((s9h) ltgVar).c(new DefaultLifecycleVisibilityDetector$lifecycleObserver$1$onResume$1(0, defaultLifecycleVisibilityDetector, DefaultLifecycleVisibilityDetector.class, "checkVisibility", "checkVisibility()V", 0));
    }
}
