package com.yandex.go.scooters.utils;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.utils.WebExtensionsKt", f = "WebExtensions.kt", l = {14}, m = "awaitInvoke", v = 2)
/* loaded from: classes13.dex */
final class WebExtensionsKt$awaitInvoke$1<P> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return b.a(null, null, this);
    }
}
