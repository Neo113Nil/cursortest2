package com.yandex.go.shortcuts.impl.repository;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.shortcuts.impl.repository.ProductsScreenRepository$getScreenProducts$1", f = "ProductsScreenRepository.kt", l = {91}, m = "get", v = 2)
/* loaded from: classes13.dex */
final class ProductsScreenRepository$getScreenProducts$1$get$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ w this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductsScreenRepository$getScreenProducts$1$get$1(w wVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = wVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, null, this);
    }
}
