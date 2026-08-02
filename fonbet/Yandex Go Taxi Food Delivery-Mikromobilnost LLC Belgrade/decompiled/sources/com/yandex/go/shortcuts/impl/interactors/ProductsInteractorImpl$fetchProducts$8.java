package com.yandex.go.shortcuts.impl.interactors;

import defpackage.ezs;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zaf0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lvpr;", "Lfmt;", "Lcom/yandex/go/shortcuts/dto/response/ProductsResponse;", "", "throwable", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.shortcuts.impl.interactors.ProductsInteractorImpl$fetchProducts$8", f = "ProductsInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ProductsInteractorImpl$fetchProducts$8 extends SuspendLambda implements zls {
    final /* synthetic */ zaf0 $session;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductsInteractorImpl$fetchProducts$8(m mVar, zaf0 zaf0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = mVar;
        this.$session = zaf0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ProductsInteractorImpl$fetchProducts$8 productsInteractorImpl$fetchProducts$8 = new ProductsInteractorImpl$fetchProducts$8(this.this$0, this.$session, (Continuation) obj3);
        productsInteractorImpl$fetchProducts$8.L$0 = (Throwable) obj2;
        zy11 zy11Var = zy11.a;
        productsInteractorImpl$fetchProducts$8.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th = (Throwable) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        m mVar = this.this$0;
        zaf0 zaf0Var = this.$session;
        mVar.getClass();
        jst.e.k(th, "SC: error");
        zaf0Var.b.l(ezs.h);
        mVar.h.a.g(new Result(new Result.Failure(th)));
        return zy11.a;
    }
}
