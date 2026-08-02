package com.yandex.go.dynamic.impl;

import defpackage.h7n;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.dynamic.impl.DynamicFeatureLoaderImpl", f = "DynamicFeatureLoaderImpl.kt", l = {326}, m = "downloadFeature", v = 2)
/* loaded from: classes12.dex */
final class DynamicFeatureLoaderImpl$downloadFeature$1<T extends h7n> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicFeatureLoaderImpl$downloadFeature$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return b.d(this.this$0, null, null, this);
    }
}
