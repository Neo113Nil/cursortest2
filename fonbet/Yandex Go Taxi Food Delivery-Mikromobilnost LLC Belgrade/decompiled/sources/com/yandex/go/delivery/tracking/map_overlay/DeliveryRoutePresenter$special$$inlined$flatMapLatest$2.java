package com.yandex.go.delivery.tracking.map_overlay;

import defpackage.bvf0;
import defpackage.g92;
import defpackage.kdi;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.soi;
import defpackage.sth;
import defpackage.tpr;
import defpackage.uth;
import defpackage.vpr;
import defpackage.xli;
import defpackage.z501;
import defpackage.zgf;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.delivery.tracking.map_overlay.DeliveryRoutePresenter$special$$inlined$flatMapLatest$2", f = "DeliveryRoutePresenter.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class DeliveryRoutePresenter$special$$inlined$flatMapLatest$2 extends SuspendLambda implements zls {
    final /* synthetic */ kdi $deliveryMapAnimationSource$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryRoutePresenter$special$$inlined$flatMapLatest$2(Continuation continuation, q qVar, kdi kdiVar) {
        super(3, continuation);
        this.this$0 = qVar;
        this.$deliveryMapAnimationSource$inlined = kdiVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DeliveryRoutePresenter$special$$inlined$flatMapLatest$2 deliveryRoutePresenter$special$$inlined$flatMapLatest$2 = new DeliveryRoutePresenter$special$$inlined$flatMapLatest$2((Continuation) obj3, this.this$0, this.$deliveryMapAnimationSource$inlined);
        deliveryRoutePresenter$special$$inlined$flatMapLatest$2.L$0 = (vpr) obj;
        deliveryRoutePresenter$special$$inlined$flatMapLatest$2.L$1 = obj2;
        return deliveryRoutePresenter$special$$inlined$flatMapLatest$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr g92Var;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            uth uthVar = (uth) obj2;
            if ((uthVar instanceof sth) && ((sth) uthVar).a.contains(new xli(this.this$0.c))) {
                kdi kdiVar = this.$deliveryMapAnimationSource$inlined;
                String str = this.this$0.c;
                ((l) ((zgf) kdiVar).b).getClass();
                g92Var = new e(new c(((z501) bvf0.u().G0.get()).a(str).b().e));
            } else {
                g92Var = new g92(2, soi.a);
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(g92Var, vprVar, this) == coroutineSingletons) {
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
