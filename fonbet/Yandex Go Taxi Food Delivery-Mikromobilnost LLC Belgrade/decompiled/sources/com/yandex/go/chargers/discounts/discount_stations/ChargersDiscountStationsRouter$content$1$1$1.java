package com.yandex.go.chargers.discounts.discount_stations;

import com.yandex.go.chargers.discounts.discount_stations.ui.c;
import defpackage.agd;
import defpackage.bt9;
import defpackage.ir9;
import defpackage.ls9;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rs9;
import defpackage.tse;
import defpackage.wls;
import defpackage.yfd;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.discounts.discount_stations.ChargersDiscountStationsRouter$content$1$1$1", f = "ChargersDiscountStationsRouter.kt", l = {46}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersDiscountStationsRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ bt9 $action;
    final /* synthetic */ c $actionInteractor;
    final /* synthetic */ rs9 $navigator;
    final /* synthetic */ yfd $this_buildContent;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersDiscountStationsRouter$content$1$1$1(c cVar, yfd yfdVar, bt9 bt9Var, rs9 rs9Var, Continuation continuation) {
        super(2, continuation);
        this.$actionInteractor = cVar;
        this.$this_buildContent = yfdVar;
        this.$action = bt9Var;
        this.$navigator = rs9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersDiscountStationsRouter$content$1$1$1(this.$actionInteractor, this.$this_buildContent, this.$action, this.$navigator, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersDiscountStationsRouter$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            c cVar = this.$actionInteractor;
            ir9 ir9Var = ((ls9) ((agd) this.$this_buildContent).a).a;
            bt9 bt9Var = this.$action;
            rs9 rs9Var = this.$navigator;
            this.label = 1;
            if (cVar.a(ir9Var, bt9Var, rs9Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
