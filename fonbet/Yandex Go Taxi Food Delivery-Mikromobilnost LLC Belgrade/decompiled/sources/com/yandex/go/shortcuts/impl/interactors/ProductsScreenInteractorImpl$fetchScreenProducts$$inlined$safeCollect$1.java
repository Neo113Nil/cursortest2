package com.yandex.go.shortcuts.impl.interactors;

import defpackage.hzs;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.paf0;
import defpackage.raf0;
import defpackage.waf0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lvpr;", "", "cause", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.shortcuts.impl.interactors.ProductsScreenInteractorImpl$fetchScreenProducts$$inlined$safeCollect$1", f = "ProductsScreenInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class ProductsScreenInteractorImpl$fetchScreenProducts$$inlined$safeCollect$1 extends SuspendLambda implements zls {
    final /* synthetic */ waf0 $screensType$inlined;
    final /* synthetic */ raf0 $session$inlined;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ w this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductsScreenInteractorImpl$fetchScreenProducts$$inlined$safeCollect$1(Continuation continuation, w wVar, raf0 raf0Var, waf0 waf0Var) {
        super(3, continuation);
        this.this$0 = wVar;
        this.$session$inlined = raf0Var;
        this.$screensType$inlined = waf0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ProductsScreenInteractorImpl$fetchScreenProducts$$inlined$safeCollect$1 productsScreenInteractorImpl$fetchScreenProducts$$inlined$safeCollect$1 = new ProductsScreenInteractorImpl$fetchScreenProducts$$inlined$safeCollect$1((Continuation) obj3, this.this$0, this.$session$inlined, this.$screensType$inlined);
        productsScreenInteractorImpl$fetchScreenProducts$$inlined$safeCollect$1.L$0 = (Throwable) obj2;
        zy11 zy11Var = zy11.a;
        productsScreenInteractorImpl$fetchScreenProducts$$inlined$safeCollect$1.invokeSuspend(zy11Var);
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
        w wVar = this.this$0;
        raf0 raf0Var = this.$session$inlined;
        waf0 waf0Var = this.$screensType$inlined;
        wVar.getClass();
        jst.e.k(th, "SC: error");
        hzs hzsVar = hzs.h;
        r0 r0Var = raf0Var.b;
        if (r0Var != null) {
            r0Var.l(hzsVar);
        }
        wVar.g.g(new paf0(waf0Var, th));
        return zy11.a;
    }
}
