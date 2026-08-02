package com.yandex.go.taxi.order.details.v2.navigation;

import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import defpackage.hxx;
import defpackage.ifk0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.pep0;
import defpackage.q9y0;
import defpackage.tse;
import defpackage.u9y0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.navigation.TaxiRideCardRouterFacadeImpl$launchCompactViewOnTracking$1", f = "TaxiRideCardRouterFacadeImpl.kt", l = {90, 99}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TaxiRideCardRouterFacadeImpl$launchCompactViewOnTracking$1 extends SuspendLambda implements wls {
    final /* synthetic */ q9y0 $payload;
    Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiRideCardRouterFacadeImpl$launchCompactViewOnTracking$1(d dVar, q9y0 q9y0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$payload = q9y0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiRideCardRouterFacadeImpl$launchCompactViewOnTracking$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiRideCardRouterFacadeImpl$launchCompactViewOnTracking$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if (com.yandex.go.navigation.base.a.d(r7, r6) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r7 == r0) goto L15;
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
            d dVar = this.this$0;
            q9y0 q9y0Var = this.$payload;
            o2y0 o2y0Var = q9y0Var.a;
            OrderScreen orderScreen = q9y0Var.b;
            this.label = 1;
            obj = dVar.a(o2y0Var, orderScreen, null, null, new u9y0(), this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                this.this$0.f = null;
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        ifk0 ifk0Var = (ifk0) ((Pair) obj).getFirst();
        this.this$0.f = ifk0Var;
        ((pep0) this.this$0.d).f(ifk0Var, this.$payload, hxx.a);
        this.L$0 = null;
        this.label = 2;
    }
}
