package com.yandex.go.delivery.tracking.map_overlay;

import defpackage.jel0;
import defpackage.jl40;
import defpackage.lxa0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llxa0;", "routeParams", "Lzy11;", "<anonymous>", "(Llxa0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.delivery.tracking.map_overlay.DeliveryRoutePresenter$onCreate$1", f = "DeliveryRoutePresenter.kt", l = {HProv.ALG_SID_KECCAK_224}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryRoutePresenter$onCreate$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryRoutePresenter$onCreate$1(q qVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DeliveryRoutePresenter$onCreate$1 deliveryRoutePresenter$onCreate$1 = new DeliveryRoutePresenter$onCreate$1(this.this$0, continuation);
        deliveryRoutePresenter$onCreate$1.L$0 = obj;
        return deliveryRoutePresenter$onCreate$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeliveryRoutePresenter$onCreate$1) create((lxa0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        lxa0 lxa0Var = (lxa0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            jel0 jel0Var = this.this$0.d;
            List list = lxa0Var.c;
            if (!jl40.l(list, jel0Var.e)) {
                Objects.toString(list);
                jel0Var.a();
                jel0Var.e = list;
                jel0Var.c();
            }
            this.this$0.d.b(lxa0Var.d);
            this.L$0 = lxa0Var;
            this.label = 1;
            if (kotlinx.coroutines.a.i(50L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.this$0.d.b(lxa0Var.d);
        return zy11.a;
    }
}
