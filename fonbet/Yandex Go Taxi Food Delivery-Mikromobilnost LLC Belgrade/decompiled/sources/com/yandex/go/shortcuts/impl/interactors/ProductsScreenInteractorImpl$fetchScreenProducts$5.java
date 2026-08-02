package com.yandex.go.shortcuts.impl.interactors;

import defpackage.e1z;
import defpackage.hzs;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.raf0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lcom/yandex/go/shortcuts/dto/response/ProductsScreenResponse;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.shortcuts.impl.interactors.ProductsScreenInteractorImpl$fetchScreenProducts$5", f = "ProductsScreenInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ProductsScreenInteractorImpl$fetchScreenProducts$5 extends SuspendLambda implements wls {
    final /* synthetic */ raf0 $session;
    int label;
    final /* synthetic */ w this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductsScreenInteractorImpl$fetchScreenProducts$5(w wVar, raf0 raf0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = wVar;
        this.$session = raf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductsScreenInteractorImpl$fetchScreenProducts$5(this.this$0, this.$session, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ProductsScreenInteractorImpl$fetchScreenProducts$5 productsScreenInteractorImpl$fetchScreenProducts$5 = (ProductsScreenInteractorImpl$fetchScreenProducts$5) create((vpr) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        productsScreenInteractorImpl$fetchScreenProducts$5.invokeSuspend(zy11Var);
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
        w wVar = this.this$0;
        raf0 raf0Var = this.$session;
        wVar.getClass();
        jst.e.getClass();
        r0 r0Var = raf0Var.b;
        r0 r0Var2 = raf0Var.b;
        hzs hzsVar = r0Var != null ? (hzs) r0Var.getValue() : null;
        if (hzsVar != null) {
            hzs hzsVar2 = new hzs(hzsVar.a, hzsVar.b, hzsVar.c, hzsVar.d, e1z.a);
            if (r0Var2 != null) {
                r0Var2.l(hzsVar2);
            }
        } else {
            hzs hzsVar3 = hzs.g;
            if (r0Var2 != null) {
                r0Var2.l(hzsVar3);
            }
        }
        return zy11.a;
    }
}
