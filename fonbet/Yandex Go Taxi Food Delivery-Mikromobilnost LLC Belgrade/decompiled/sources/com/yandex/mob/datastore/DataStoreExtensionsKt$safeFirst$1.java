package com.yandex.mob.datastore;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.mob.datastore.DataStoreExtensionsKt", f = "DataStoreExtensions.kt", l = {10}, m = "safeFirst")
/* loaded from: classes8.dex */
final class DataStoreExtensionsKt$safeFirst$1<T> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.a(null, this);
    }
}
