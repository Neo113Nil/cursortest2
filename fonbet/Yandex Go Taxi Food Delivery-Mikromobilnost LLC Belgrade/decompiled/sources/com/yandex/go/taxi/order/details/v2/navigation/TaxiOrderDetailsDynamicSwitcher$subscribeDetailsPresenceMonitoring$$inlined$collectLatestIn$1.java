package com.yandex.go.taxi.order.details.v2.navigation;

import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import defpackage.bck0;
import defpackage.cck0;
import defpackage.g6u;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.o400;
import defpackage.ra80;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.object.DriveState;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.navigation.TaxiOrderDetailsDynamicSwitcher$subscribeDetailsPresenceMonitoring$$inlined$collectLatestIn$1", f = "TaxiOrderDetailsDynamicSwitcher.kt", l = {54}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class TaxiOrderDetailsDynamicSwitcher$subscribeDetailsPresenceMonitoring$$inlined$collectLatestIn$1 extends SuspendLambda implements wls {
    final /* synthetic */ o2y0 $orderHolder$inlined;
    final /* synthetic */ ra80 $orderViewState$inlined;
    final /* synthetic */ OrderScreen $prevState$inlined;
    final /* synthetic */ tls $showDetails$inlined;
    final /* synthetic */ tpr $this_collectLatestIn;
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n"}, d2 = {"T", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.order.details.v2.navigation.TaxiOrderDetailsDynamicSwitcher$subscribeDetailsPresenceMonitoring$$inlined$collectLatestIn$1$1", f = "TaxiOrderDetailsDynamicSwitcher.kt", l = {65}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.details.v2.navigation.TaxiOrderDetailsDynamicSwitcher$subscribeDetailsPresenceMonitoring$$inlined$collectLatestIn$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ o2y0 $orderHolder$inlined;
        final /* synthetic */ ra80 $orderViewState$inlined;
        final /* synthetic */ OrderScreen $prevState$inlined;
        final /* synthetic */ tls $showDetails$inlined;
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Continuation continuation, o2y0 o2y0Var, c cVar, OrderScreen orderScreen, ra80 ra80Var, tls tlsVar) {
            super(2, continuation);
            this.$orderHolder$inlined = o2y0Var;
            this.this$0 = cVar;
            this.$prevState$inlined = orderScreen;
            this.$orderViewState$inlined = ra80Var;
            this.$showDetails$inlined = tlsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation, this.$orderHolder$inlined, this.this$0, this.$prevState$inlined, this.$orderViewState$inlined, this.$showDetails$inlined);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create(obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                cck0 cck0Var = (cck0) obj2;
                if (this.$orderHolder$inlined.b().h.b != DriveState.COMPLETE || !this.this$0.d.b(this.$orderHolder$inlined.b().a, this.$orderHolder$inlined.b().b.b)) {
                    if (cck0Var instanceof bck0) {
                        this.this$0.b.a(OrderScreen.ORDER_DETAILS, (bck0) cck0Var);
                    }
                    com.yandex.go.taxi.order.stack.a a = c.a(this.this$0, cck0Var.getMode(), this.$orderHolder$inlined, this.$prevState$inlined, this.$orderViewState$inlined);
                    this.this$0.c.getClass();
                    sjh sjhVar = uyj.a;
                    g6u g6uVar = o400.a;
                    TaxiOrderDetailsDynamicSwitcher$subscribeDetailsPresenceMonitoring$1$1 taxiOrderDetailsDynamicSwitcher$subscribeDetailsPresenceMonitoring$1$1 = new TaxiOrderDetailsDynamicSwitcher$subscribeDetailsPresenceMonitoring$1$1(this.this$0, this.$showDetails$inlined, a, cck0Var, null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 1;
                    if (tje.k0(g6uVar, taxiOrderDetailsDynamicSwitcher$subscribeDetailsPresenceMonitoring$1$1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderDetailsDynamicSwitcher$subscribeDetailsPresenceMonitoring$$inlined$collectLatestIn$1(tpr tprVar, Continuation continuation, o2y0 o2y0Var, c cVar, OrderScreen orderScreen, ra80 ra80Var, tls tlsVar) {
        super(2, continuation);
        this.$this_collectLatestIn = tprVar;
        this.$orderHolder$inlined = o2y0Var;
        this.this$0 = cVar;
        this.$prevState$inlined = orderScreen;
        this.$orderViewState$inlined = ra80Var;
        this.$showDetails$inlined = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiOrderDetailsDynamicSwitcher$subscribeDetailsPresenceMonitoring$$inlined$collectLatestIn$1(this.$this_collectLatestIn, continuation, this.$orderHolder$inlined, this.this$0, this.$prevState$inlined, this.$orderViewState$inlined, this.$showDetails$inlined);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiOrderDetailsDynamicSwitcher$subscribeDetailsPresenceMonitoring$$inlined$collectLatestIn$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr tprVar = this.$this_collectLatestIn;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, this.$orderHolder$inlined, this.this$0, this.$prevState$inlined, this.$orderViewState$inlined, this.$showDetails$inlined);
            this.label = 1;
            if (e.k(tprVar, anonymousClass1, this) == coroutineSingletons) {
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
