package com.yandex.go.feedsdk.lifecycle;

import defpackage.h55;
import defpackage.jl40;
import defpackage.u45;
import defpackage.w0j;

/* loaded from: classes.dex */
public abstract class a {
    public static final w0j a(u45 u45Var, h55 h55Var) {
        DelayedDestroyEventLifecycleExtensionsKt$attachDetachEventLifecycle$1 delayedDestroyEventLifecycleExtensionsKt$attachDetachEventLifecycle$1 = new DelayedDestroyEventLifecycleExtensionsKt$attachDetachEventLifecycle$1(1, u45Var, u45.class, "addOnDetachAction", "addOnDetachAction(Ljava/lang/Runnable;)Lru/yandex/taxi/utils/Cancellable;", 0);
        jl40.l(u45Var.getModalScreenName(), "#none#");
        w0j w0jVar = new w0j(h55Var, delayedDestroyEventLifecycleExtensionsKt$attachDetachEventLifecycle$1);
        u45Var.setLifecycleOwner(w0jVar);
        return w0jVar;
    }
}
