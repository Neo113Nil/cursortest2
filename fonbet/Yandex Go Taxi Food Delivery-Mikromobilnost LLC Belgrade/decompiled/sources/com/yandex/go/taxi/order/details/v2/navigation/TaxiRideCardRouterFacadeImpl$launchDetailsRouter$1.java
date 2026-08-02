package com.yandex.go.taxi.order.details.v2.navigation;

import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import defpackage.gx60;
import defpackage.hxx;
import defpackage.ifk0;
import defpackage.k030;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o230;
import defpackage.o2y0;
import defpackage.pep0;
import defpackage.r9y0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.navigation.TaxiRideCardRouterFacadeImpl$launchDetailsRouter$1", f = "TaxiRideCardRouterFacadeImpl.kt", l = {71, 82}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TaxiRideCardRouterFacadeImpl$launchDetailsRouter$1 extends SuspendLambda implements wls {
    final /* synthetic */ k030 $modalViewAppearCallback;
    final /* synthetic */ o230 $modalViewFocusRectChangeConsumer;
    final /* synthetic */ gx60 $onBackInStackViewCallback;
    final /* synthetic */ r9y0 $payload;
    Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiRideCardRouterFacadeImpl$launchDetailsRouter$1(d dVar, r9y0 r9y0Var, k030 k030Var, o230 o230Var, gx60 gx60Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$payload = r9y0Var;
        this.$modalViewAppearCallback = k030Var;
        this.$modalViewFocusRectChangeConsumer = o230Var;
        this.$onBackInStackViewCallback = gx60Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiRideCardRouterFacadeImpl$launchDetailsRouter$1(this.this$0, this.$payload, this.$modalViewAppearCallback, this.$modalViewFocusRectChangeConsumer, this.$onBackInStackViewCallback, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiRideCardRouterFacadeImpl$launchDetailsRouter$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0061, code lost:
    
        if (com.yandex.go.navigation.base.a.d(r12, r11) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if (r13 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        TaxiRideCardRouterFacadeImpl$launchDetailsRouter$1 taxiRideCardRouterFacadeImpl$launchDetailsRouter$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            o2y0 o2y0Var = this.$payload.a;
            OrderScreen orderScreen = OrderScreen.ORDER_DETAILS;
            k030 k030Var = this.$modalViewAppearCallback;
            o230 o230Var = this.$modalViewFocusRectChangeConsumer;
            gx60 gx60Var = this.$onBackInStackViewCallback;
            this.label = 1;
            taxiRideCardRouterFacadeImpl$launchDetailsRouter$1 = this;
            obj = dVar.a(o2y0Var, orderScreen, k030Var, o230Var, gx60Var, taxiRideCardRouterFacadeImpl$launchDetailsRouter$1);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                taxiRideCardRouterFacadeImpl$launchDetailsRouter$1 = this;
                taxiRideCardRouterFacadeImpl$launchDetailsRouter$1.this$0.e = null;
                taxiRideCardRouterFacadeImpl$launchDetailsRouter$1.this$0.g = null;
                return zy11.a;
            }
            kotlin.b.b(obj);
            taxiRideCardRouterFacadeImpl$launchDetailsRouter$1 = this;
        }
        ifk0 ifk0Var = (ifk0) ((Pair) obj).getFirst();
        taxiRideCardRouterFacadeImpl$launchDetailsRouter$1.this$0.e = ifk0Var;
        taxiRideCardRouterFacadeImpl$launchDetailsRouter$1.this$0.g = taxiRideCardRouterFacadeImpl$launchDetailsRouter$1.$payload.a;
        ((pep0) taxiRideCardRouterFacadeImpl$launchDetailsRouter$1.this$0.d).f(ifk0Var, taxiRideCardRouterFacadeImpl$launchDetailsRouter$1.$payload, hxx.a);
        taxiRideCardRouterFacadeImpl$launchDetailsRouter$1.L$0 = null;
        taxiRideCardRouterFacadeImpl$launchDetailsRouter$1.label = 2;
    }
}
