package com.yandex.go.logistics.cargo_flow;

import defpackage.mud0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.logistics.cargo_flow.DeliveryCargoFlowRouterImpl$resolvePoints$1$1", f = "DeliveryCargoFlowRouterImpl.kt", l = {269, 273}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DeliveryCargoFlowRouterImpl$resolvePoints$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<mud0> $pickupRoutePoints;
    final /* synthetic */ List<mud0> $routePoints;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryCargoFlowRouterImpl$resolvePoints$1$1(List list, List list2, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$routePoints = list;
        this.$pickupRoutePoints = list2;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeliveryCargoFlowRouterImpl$resolvePoints$1$1(this.$routePoints, this.$pickupRoutePoints, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeliveryCargoFlowRouterImpl$resolvePoints$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x007d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar;
        Iterator it;
        a aVar2;
        Iterator it2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            List<mud0> list = this.$routePoints;
            aVar = this.this$0;
            it = list.iterator();
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it2 = (Iterator) this.L$2;
                aVar2 = (a) this.L$1;
                b.b(obj);
                while (it2.hasNext()) {
                    mud0 mud0Var = (mud0) it2.next();
                    com.yandex.go.logistics.cargo_flow.interactor.a aVar3 = aVar2.f0;
                    this.L$0 = null;
                    this.L$1 = aVar2;
                    this.L$2 = it2;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 2;
                    if (aVar3.d(mud0Var, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                r0 r0Var = this.this$0.P.g;
                Boolean bool = Boolean.FALSE;
                r0Var.getClass();
                r0Var.m(null, bool);
                return zy11.a;
            }
            it = (Iterator) this.L$2;
            aVar = (a) this.L$1;
            b.b(obj);
        }
        while (it.hasNext()) {
            mud0 mud0Var2 = (mud0) it.next();
            com.yandex.go.logistics.cargo_flow.interactor.a aVar4 = aVar.f0;
            this.L$0 = null;
            this.L$1 = aVar;
            this.L$2 = it;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 1;
            if (aVar4.c(mud0Var2, this) == coroutineSingletons) {
                break;
            }
        }
        List<mud0> list2 = this.$pickupRoutePoints;
        aVar2 = this.this$0;
        it2 = list2.iterator();
        while (it2.hasNext()) {
        }
        r0 r0Var2 = this.this$0.P.g;
        Boolean bool2 = Boolean.FALSE;
        r0Var2.getClass();
        r0Var2.m(null, bool2);
        return zy11.a;
    }
}
