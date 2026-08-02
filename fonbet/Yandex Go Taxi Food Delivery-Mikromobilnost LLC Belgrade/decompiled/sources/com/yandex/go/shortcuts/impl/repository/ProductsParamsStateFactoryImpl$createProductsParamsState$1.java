package com.yandex.go.shortcuts.impl.repository;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.shortcuts.impl.repository.ProductsParamsStateFactoryImpl", f = "ProductsParamsStateFactoryImpl.kt", l = {164, 165, 173, 183}, m = "createProductsParamsState", v = 2)
/* loaded from: classes8.dex */
final class ProductsParamsStateFactoryImpl$createProductsParamsState$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ s this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductsParamsStateFactoryImpl$createProductsParamsState$1(s sVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, null, null, null, null, false, null, this);
    }
}
