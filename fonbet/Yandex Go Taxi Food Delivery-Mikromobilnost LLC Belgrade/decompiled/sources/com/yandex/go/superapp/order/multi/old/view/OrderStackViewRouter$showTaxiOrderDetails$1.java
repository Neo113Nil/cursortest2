package com.yandex.go.superapp.order.multi.old.view;

import com.yandex.go.taxi.order.analytics.DetailsOpenReason;
import com.yandex.go.taxi.order.api.details.TaxiCardNavigationAction;
import defpackage.a3y0;
import defpackage.b780;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.order.multi.old.view.OrderStackViewRouter$showTaxiOrderDetails$1", f = "OrderStackViewRouter.kt", l = {90, HProv.PP_HASHOID}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderStackViewRouter$showTaxiOrderDetails$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ DetailsOpenReason $openReason;
    final /* synthetic */ String $orderId;
    final /* synthetic */ TaxiCardNavigationAction $taxiCardNavigationAction;
    Object L$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderStackViewRouter$showTaxiOrderDetails$1(g gVar, String str, boolean z, DetailsOpenReason detailsOpenReason, TaxiCardNavigationAction taxiCardNavigationAction, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$orderId = str;
        this.$expanded = z;
        this.$openReason = detailsOpenReason;
        this.$taxiCardNavigationAction = taxiCardNavigationAction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderStackViewRouter$showTaxiOrderDetails$1(this.this$0, this.$orderId, this.$expanded, this.$openReason, this.$taxiCardNavigationAction, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderStackViewRouter$showTaxiOrderDetails$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (com.yandex.go.superapp.order.multi.old.view.g.a(r4, r5, r6, r7, r8, r10) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
    
        if (r11 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.taxi.order.provider.a aVar = this.this$0.c;
            String str = this.$orderId;
            this.label = 1;
            obj = aVar.m(str, this);
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
        o2y0 o2y0Var = (o2y0) obj;
        g gVar = this.this$0;
        if (o2y0Var != null) {
            boolean z = this.$expanded;
            DetailsOpenReason detailsOpenReason = this.$openReason;
            TaxiCardNavigationAction taxiCardNavigationAction = this.$taxiCardNavigationAction;
            this.L$0 = null;
            this.label = 2;
        } else {
            a3y0.d(gVar.k, "showTaxiOrderDetails", null, new b780(this.$openReason, 0), 2);
        }
        return zy11.a;
    }
}
