package com.yandex.go.shortcuts.impl.interactors;

import defpackage.jaf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.uaf0;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.shortcuts.impl.interactors.ProductsInteractorImpl$fetchProducts$$inlined$flatMapLatest$1", f = "ProductsInteractorImpl.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class ProductsInteractorImpl$fetchProducts$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ List $fields$inlined;
    final /* synthetic */ zzs $srcPoint$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductsInteractorImpl$fetchProducts$$inlined$flatMapLatest$1(Continuation continuation, m mVar, zzs zzsVar, List list) {
        super(3, continuation);
        this.this$0 = mVar;
        this.$srcPoint$inlined = zzsVar;
        this.$fields$inlined = list;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ProductsInteractorImpl$fetchProducts$$inlined$flatMapLatest$1 productsInteractorImpl$fetchProducts$$inlined$flatMapLatest$1 = new ProductsInteractorImpl$fetchProducts$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0, this.$srcPoint$inlined, this.$fields$inlined);
        productsInteractorImpl$fetchProducts$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        productsInteractorImpl$fetchProducts$$inlined$flatMapLatest$1.L$1 = obj2;
        return productsInteractorImpl$fetchProducts$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            uaf0 uaf0Var = (uaf0) obj2;
            jaf0 jaf0Var = (jaf0) this.this$0.a.get();
            zzs zzsVar = this.$srcPoint$inlined;
            tpr a = jaf0Var.a.a(this.$fields$inlined, uaf0Var, null, new com.yandex.go.shortcuts.impl.repository.t(zzsVar, jaf0Var, uaf0Var));
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(a, vprVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
