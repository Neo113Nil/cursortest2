package com.yandex.go.shortcuts.impl.repository;

import android.location.Location;
import defpackage.j1;
import defpackage.k7d0;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.uc4;
import defpackage.uyj;
import defpackage.uzs;
import defpackage.vpr;
import defpackage.yaf0;
import defpackage.zls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.shortcuts.impl.repository.ProductsParamsStateFactoryImpl$observeParamForKnownOrders$$inlined$flatMapLatest$1", f = "ProductsParamsStateFactoryImpl.kt", l = {215, 189}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class ProductsParamsStateFactoryImpl$observeParamForKnownOrders$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ uc4 $bbox$inlined;
    final /* synthetic */ List $fields$inlined;
    final /* synthetic */ yaf0 $screenType$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ s this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductsParamsStateFactoryImpl$observeParamForKnownOrders$$inlined$flatMapLatest$1(Continuation continuation, s sVar, List list, yaf0 yaf0Var, uc4 uc4Var) {
        super(3, continuation);
        this.this$0 = sVar;
        this.$fields$inlined = list;
        this.$screenType$inlined = yaf0Var;
        this.$bbox$inlined = uc4Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ProductsParamsStateFactoryImpl$observeParamForKnownOrders$$inlined$flatMapLatest$1 productsParamsStateFactoryImpl$observeParamForKnownOrders$$inlined$flatMapLatest$1 = new ProductsParamsStateFactoryImpl$observeParamForKnownOrders$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0, this.$fields$inlined, this.$screenType$inlined, this.$bbox$inlined);
        productsParamsStateFactoryImpl$observeParamForKnownOrders$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        productsParamsStateFactoryImpl$observeParamForKnownOrders$$inlined$flatMapLatest$1.L$1 = obj2;
        return productsParamsStateFactoryImpl$observeParamForKnownOrders$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00b4, code lost:
    
        if (kotlinx.coroutines.flow.e.u((defpackage.tpr) r2, r1, r16) == r3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b6, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009f, code lost:
    
        if (r2 == r3) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzs zzsVar;
        Object F;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            List list = (List) obj2;
            s sVar = this.this$0;
            List list2 = this.$fields$inlined;
            yaf0 yaf0Var = this.$screenType$inlined;
            uc4 uc4Var = this.$bbox$inlined;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = vprVar;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 1;
            Location a = sVar.b.a();
            if (a != null) {
                zzs.Companion.getClass();
                zzsVar = uzs.b(a);
            } else {
                zzsVar = zzs.f;
            }
            zzs zzsVar2 = zzsVar;
            r rVar = new r(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.r(new p(new n(new l(((com.yandex.go.taxi.tariffs.internal.repository.k) sVar.k).g()), sVar), sVar), new k7d0(28, new j1()))), sVar, list2, yaf0Var, list, zzsVar2, uc4Var);
            sVar.i.getClass();
            sjh sjhVar = uyj.a;
            F = kotlinx.coroutines.flow.e.F(rVar, mdh.b);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$2;
            kotlin.b.b(obj);
            F = obj;
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.label = 2;
    }
}
