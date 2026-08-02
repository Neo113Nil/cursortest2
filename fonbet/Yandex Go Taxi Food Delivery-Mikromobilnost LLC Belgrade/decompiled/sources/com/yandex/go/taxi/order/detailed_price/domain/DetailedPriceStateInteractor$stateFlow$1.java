package com.yandex.go.taxi.order.detailed_price.domain;

import defpackage.fef;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r9;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lm3j;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.detailed_price.domain.DetailedPriceStateInteractor$stateFlow$1", f = "DetailedPriceStateInteractor.kt", l = {25, 26, 35}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DetailedPriceStateInteractor$stateFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $buttonTitle;
    final /* synthetic */ fef $currencyRules;
    final /* synthetic */ String $orderId;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailedPriceStateInteractor$stateFlow$1(c cVar, String str, fef fefVar, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$orderId = str;
        this.$currencyRules = fefVar;
        this.$buttonTitle = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DetailedPriceStateInteractor$stateFlow$1 detailedPriceStateInteractor$stateFlow$1 = new DetailedPriceStateInteractor$stateFlow$1(this.this$0, this.$orderId, this.$currencyRules, this.$buttonTitle, continuation);
        detailedPriceStateInteractor$stateFlow$1.L$0 = obj;
        return detailedPriceStateInteractor$stateFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DetailedPriceStateInteractor$stateFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0071, code lost:
    
        if (r5.collect(r12, r11) == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0073, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r12 == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
    
        if (r0.emit(defpackage.k3j.a, r11) == r1) goto L20;
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
            this.L$0 = vprVar;
            this.label = 1;
        } else if (i == 1) {
            kotlin.b.b(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
            b bVar = new b(this.this$0.c.a(), this.this$0, (List) obj, this.$currencyRules, this.$buttonTitle);
            r9 r9Var = new r9(vprVar, 5);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
        }
        com.yandex.go.taxi.order.detailed_price.data.a aVar = this.this$0.a;
        String str = this.$orderId;
        this.L$0 = vprVar;
        this.label = 2;
        obj = aVar.a(str, this);
    }
}
