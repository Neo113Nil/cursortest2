package com.yandex.go.shortcuts.impl.factory;

import defpackage.b2k;
import defpackage.gaf0;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Leaf0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.shortcuts.impl.factory.ProductsParamsChangesFactory$createChangesFlow$1", f = "ProductsParamsChangesFactory.kt", l = {30, 35}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ProductsParamsChangesFactory$createChangesFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $hasForceChanges;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductsParamsChangesFactory$createChangesFlow$1(e eVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$hasForceChanges = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ProductsParamsChangesFactory$createChangesFlow$1 productsParamsChangesFactory$createChangesFlow$1 = new ProductsParamsChangesFactory$createChangesFlow$1(this.this$0, this.$hasForceChanges, continuation);
        productsParamsChangesFactory$createChangesFlow$1.L$0 = obj;
        return productsParamsChangesFactory$createChangesFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductsParamsChangesFactory$createChangesFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x007e, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r2, r0, r9) == r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0080, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r10 == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.shortcuts.impl.experiments.f fVar = this.this$0.c;
            this.L$0 = vprVar;
            this.label = 1;
            obj = fVar.b(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        int intValue = ((Number) obj).intValue();
        e eVar = this.this$0;
        b2k s = kotlinx.coroutines.flow.e.s(kotlinx.coroutines.flow.e.X(((com.yandex.go.ultima_mode.domain.c) eVar.e).c(), new ProductsParamsChangesFactory$createProductsParamsChangesFlow$$inlined$flatMapLatest$1(new d(new mth(new b(eVar.a.k()), 7), eVar, this.$hasForceChanges), null)), new gaf0(this.this$0, intValue, 0));
        this.L$0 = null;
        this.L$1 = null;
        this.I$0 = intValue;
        this.label = 2;
    }
}
