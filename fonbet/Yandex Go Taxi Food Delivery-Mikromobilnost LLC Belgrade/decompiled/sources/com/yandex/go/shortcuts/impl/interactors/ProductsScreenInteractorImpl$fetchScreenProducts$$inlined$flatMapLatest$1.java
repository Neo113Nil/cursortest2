package com.yandex.go.shortcuts.impl.interactors;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.qaf0;
import defpackage.saf0;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.uc4;
import defpackage.uyj;
import defpackage.vaf0;
import defpackage.vpr;
import defpackage.w511;
import defpackage.waf0;
import defpackage.zls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.shortcuts.impl.interactors.ProductsScreenInteractorImpl$fetchScreenProducts$$inlined$flatMapLatest$1", f = "ProductsScreenInteractorImpl.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class ProductsScreenInteractorImpl$fetchScreenProducts$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ uc4 $bbox$inlined;
    final /* synthetic */ kotlinx.serialization.json.b $discount$inlined;
    final /* synthetic */ List $fields$inlined;
    final /* synthetic */ kotlinx.serialization.json.b $paymentMethods$inlined;
    final /* synthetic */ qaf0 $screenInstance$inlined;
    final /* synthetic */ zzs $srcPoint$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ w this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductsScreenInteractorImpl$fetchScreenProducts$$inlined$flatMapLatest$1(Continuation continuation, w wVar, zzs zzsVar, List list, qaf0 qaf0Var, uc4 uc4Var, kotlinx.serialization.json.b bVar, kotlinx.serialization.json.b bVar2) {
        super(3, continuation);
        this.this$0 = wVar;
        this.$srcPoint$inlined = zzsVar;
        this.$fields$inlined = list;
        this.$screenInstance$inlined = qaf0Var;
        this.$bbox$inlined = uc4Var;
        this.$paymentMethods$inlined = bVar;
        this.$discount$inlined = bVar2;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ProductsScreenInteractorImpl$fetchScreenProducts$$inlined$flatMapLatest$1 productsScreenInteractorImpl$fetchScreenProducts$$inlined$flatMapLatest$1 = new ProductsScreenInteractorImpl$fetchScreenProducts$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0, this.$srcPoint$inlined, this.$fields$inlined, this.$screenInstance$inlined, this.$bbox$inlined, this.$paymentMethods$inlined, this.$discount$inlined);
        productsScreenInteractorImpl$fetchScreenProducts$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        productsScreenInteractorImpl$fetchScreenProducts$$inlined$flatMapLatest$1.L$1 = obj2;
        return productsScreenInteractorImpl$fetchScreenProducts$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            saf0 saf0Var = (saf0) this.this$0.b.get();
            zzs zzsVar = this.$srcPoint$inlined;
            List list = this.$fields$inlined;
            waf0 waf0Var = (waf0) this.$screenInstance$inlined.a;
            uc4 uc4Var = this.$bbox$inlined;
            Integer num = new Integer(this.this$0.e.b());
            kotlinx.serialization.json.b bVar = this.$paymentMethods$inlined;
            kotlinx.serialization.json.b bVar2 = this.$discount$inlined;
            if (!(waf0Var instanceof vaf0)) {
                saf0Var.getClass();
                w511.b();
                return null;
            }
            tpr a = saf0Var.a.a(list, waf0Var, uc4Var, new com.yandex.go.shortcuts.impl.repository.w(zzsVar, num, bVar, bVar2, saf0Var, ((vaf0) waf0Var).e));
            this.this$0.d.getClass();
            sjh sjhVar = uyj.a;
            kotlinx.coroutines.flow.q qVar = new kotlinx.coroutines.flow.q(kotlinx.coroutines.flow.e.F(a, o400.a), new ProductsScreenInteractorImpl$fetchScreenProducts$4$1(4, null));
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(qVar, vprVar, this) == coroutineSingletons) {
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
