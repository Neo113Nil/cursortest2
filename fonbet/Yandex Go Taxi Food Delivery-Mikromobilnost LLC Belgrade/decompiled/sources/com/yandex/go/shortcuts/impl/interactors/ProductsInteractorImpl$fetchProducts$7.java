package com.yandex.go.shortcuts.impl.interactors;

import defpackage.e1z;
import defpackage.ezs;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zaf0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvpr;", "Lfmt;", "Lcom/yandex/go/shortcuts/dto/response/ProductsResponse;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.shortcuts.impl.interactors.ProductsInteractorImpl$fetchProducts$7", f = "ProductsInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ProductsInteractorImpl$fetchProducts$7 extends SuspendLambda implements wls {
    final /* synthetic */ zaf0 $session;
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductsInteractorImpl$fetchProducts$7(m mVar, zaf0 zaf0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mVar;
        this.$session = zaf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductsInteractorImpl$fetchProducts$7(this.this$0, this.$session, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ProductsInteractorImpl$fetchProducts$7 productsInteractorImpl$fetchProducts$7 = (ProductsInteractorImpl$fetchProducts$7) create((vpr) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        productsInteractorImpl$fetchProducts$7.invokeSuspend(zy11Var);
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
        m mVar = this.this$0;
        zaf0 zaf0Var = this.$session;
        mVar.getClass();
        jst.e.getClass();
        r0 r0Var = zaf0Var.b;
        r0 r0Var2 = zaf0Var.b;
        ezs ezsVar = (ezs) r0Var.getValue();
        if (ezsVar != null) {
            r0Var2.l(new ezs(ezsVar.a, ezsVar.b, ezsVar.c, ezsVar.d, e1z.a));
        } else {
            r0Var2.l(ezs.g);
        }
        return zy11.a;
    }
}
