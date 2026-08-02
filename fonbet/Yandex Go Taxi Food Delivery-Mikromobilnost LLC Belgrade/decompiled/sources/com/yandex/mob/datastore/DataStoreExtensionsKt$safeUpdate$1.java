package com.yandex.mob.datastore;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.mob.datastore.DataStoreExtensionsKt", f = "DataStoreExtensions.kt", l = {17}, m = "safeUpdate")
/* loaded from: classes8.dex */
final class DataStoreExtensionsKt$safeUpdate$1<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.c(null, null, this);
    }
}
