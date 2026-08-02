package com.yandex.go.shortcuts.impl.interactors;

import com.yandex.go.address.models.Address;
import com.yandex.go.shortcuts.dto.response.ProductsResponse;
import defpackage.d1z;
import defpackage.ezs;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zaf0;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.shortcuts.impl.interactors.ProductsInteractorImpl$onFetchProducts$2", f = "ProductsInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ProductsInteractorImpl$onFetchProducts$2 extends SuspendLambda implements wls {
    final /* synthetic */ Address $address;
    final /* synthetic */ ProductsResponse $productsResponse;
    final /* synthetic */ zaf0 $session;
    final /* synthetic */ zzs $taxiSrcPoint;
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductsInteractorImpl$onFetchProducts$2(m mVar, ProductsResponse productsResponse, zaf0 zaf0Var, Address address, zzs zzsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mVar;
        this.$productsResponse = productsResponse;
        this.$session = zaf0Var;
        this.$address = address;
        this.$taxiSrcPoint = zzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductsInteractorImpl$onFetchProducts$2(this.this$0, this.$productsResponse, this.$session, this.$address, this.$taxiSrcPoint, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ProductsInteractorImpl$onFetchProducts$2 productsInteractorImpl$onFetchProducts$2 = (ProductsInteractorImpl$onFetchProducts$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        productsInteractorImpl$onFetchProducts$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.e.a = this.$productsResponse.b;
        zaf0 zaf0Var = this.$session;
        zaf0Var.b.l(new ezs(this.$address, this.$productsResponse, this.$session.a.a, this.$taxiSrcPoint, d1z.a));
        this.this$0.b.l(this.$productsResponse);
        return zy11.a;
    }
}
