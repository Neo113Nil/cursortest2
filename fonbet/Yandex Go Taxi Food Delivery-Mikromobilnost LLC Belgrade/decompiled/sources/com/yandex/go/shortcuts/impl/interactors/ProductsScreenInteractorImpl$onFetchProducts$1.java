package com.yandex.go.shortcuts.impl.interactors;

import defpackage.mvg;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.shortcuts.impl.interactors.ProductsScreenInteractorImpl", f = "ProductsScreenInteractorImpl.kt", l = {217}, m = "onFetchProducts", v = 2)
/* loaded from: classes13.dex */
final class ProductsScreenInteractorImpl$onFetchProducts$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ w this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductsScreenInteractorImpl$onFetchProducts$1(w wVar, Continuation continuation) {
        super(continuation);
        this.this$0 = wVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        w.a(this.this$0, null, null, null, null, this);
        return zy11.a;
    }
}
