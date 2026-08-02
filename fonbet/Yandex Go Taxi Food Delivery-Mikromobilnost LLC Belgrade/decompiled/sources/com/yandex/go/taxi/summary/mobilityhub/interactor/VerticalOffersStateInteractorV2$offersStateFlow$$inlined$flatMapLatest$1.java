package com.yandex.go.taxi.summary.mobilityhub.interactor;

import com.yandex.go.taxi.summary.mobilityhub.model.OffersErrorReason;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubScreenResponseV2;
import defpackage.au60;
import defpackage.d0l0;
import defpackage.dbl0;
import defpackage.g92;
import defpackage.ip21;
import defpackage.khq0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pu60;
import defpackage.pz40;
import defpackage.rol0;
import defpackage.ru60;
import defpackage.su60;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.interactor.VerticalOffersStateInteractorV2$offersStateFlow$$inlined$flatMapLatest$1", f = "VerticalOffersStateInteractorV2.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class VerticalOffersStateInteractorV2$offersStateFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ pz40 $lastResponse$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ i0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalOffersStateInteractorV2$offersStateFlow$$inlined$flatMapLatest$1(Continuation continuation, i0 i0Var, pz40 pz40Var) {
        super(3, continuation);
        this.this$0 = i0Var;
        this.$lastResponse$inlined = pz40Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        VerticalOffersStateInteractorV2$offersStateFlow$$inlined$flatMapLatest$1 verticalOffersStateInteractorV2$offersStateFlow$$inlined$flatMapLatest$1 = new VerticalOffersStateInteractorV2$offersStateFlow$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0, this.$lastResponse$inlined);
        verticalOffersStateInteractorV2$offersStateFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        verticalOffersStateInteractorV2$offersStateFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return verticalOffersStateInteractorV2$offersStateFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        dbl0 dbl0Var;
        tpr g92Var;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        au60 au60Var = (au60) obj2;
        i0 i0Var = this.this$0;
        if (i0Var.q.c != null) {
            com.yandex.go.route.interactor.b bVar = i0Var.e;
            ip21 ip21Var = new ip21(bVar.c().h(), bVar.c().b(), au60Var.e, au60Var.f);
            ip21 ip21Var2 = i0Var.s;
            if (ip21Var2 == null) {
                i0Var.s = ip21Var;
            } else if (!ip21Var2.equals(ip21Var)) {
                i0Var.q.c = null;
            }
        }
        i0 i0Var2 = this.this$0;
        HubScreenResponseV2 hubScreenResponseV2 = (HubScreenResponseV2) ((r0) this.$lastResponse$inlined).getValue();
        khq0 a = i0Var2.j.a();
        if (au60Var.a) {
            g92Var = new g92(2, new ru60(hubScreenResponseV2 != null ? hubScreenResponseV2.c : null, a != null ? a.c : null));
        } else {
            d0l0 c = i0Var2.e.c();
            g92Var = c.b() == null ? new g92(2, pu60.a) : (au60Var.d || (dbl0Var = au60Var.b) == null) ? new g92(2, new su60(OffersErrorReason.RouteStatsLoadingError)) : new rol0(new VerticalOffersStateInteractorV2$offersResponse$1(hubScreenResponseV2, a, c, dbl0Var, i0Var2, au60Var, null));
        }
        VerticalOffersStateInteractorV2$offersStateFlow$2$2 verticalOffersStateInteractorV2$offersStateFlow$2$2 = new VerticalOffersStateInteractorV2$offersStateFlow$2$2(this.$lastResponse$inlined, null);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 1;
        kotlinx.coroutines.flow.e.w(vprVar);
        Object collect = g92Var.collect(new kotlinx.coroutines.flow.i0(vprVar, verticalOffersStateInteractorV2$offersStateFlow$2$2), this);
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        return collect == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
