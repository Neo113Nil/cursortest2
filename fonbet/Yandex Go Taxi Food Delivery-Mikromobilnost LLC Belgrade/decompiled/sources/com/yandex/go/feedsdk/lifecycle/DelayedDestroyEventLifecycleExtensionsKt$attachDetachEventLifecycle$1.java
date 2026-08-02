package com.yandex.go.feedsdk.lifecycle;

import defpackage.tls;
import defpackage.u45;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class DelayedDestroyEventLifecycleExtensionsKt$attachDetachEventLifecycle$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((u45) this.receiver).addOnDetachAction((Runnable) obj);
    }
}
