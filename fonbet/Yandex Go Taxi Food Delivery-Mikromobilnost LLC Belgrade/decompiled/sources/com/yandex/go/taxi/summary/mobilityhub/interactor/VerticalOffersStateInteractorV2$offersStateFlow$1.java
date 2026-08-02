package com.yandex.go.taxi.summary.mobilityhub.interactor;

import defpackage.au60;
import defpackage.ems;
import defpackage.h2v;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.scc;
import defpackage.vbl0;
import defpackage.zy11;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0007H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lvbl0;", "routeStatsState", "Lh2v;", ConfigConstants.CONFIG, "", "<unused var>", "", "Lzy11;", "Lau60;", "<anonymous>", "(Lcom/yandex/go/taxi/summary/mobilityhub/interactor/RouteStatsStateV2;Lcom/yandex/go/taxi/summary/mobilityhub/model/HubVerticalConfig;Ljava/lang/String;Ljava/util/Set;V)Lcom/yandex/go/taxi/summary/mobilityhub/interactor/OffersDataV2;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.interactor.VerticalOffersStateInteractorV2$offersStateFlow$1", f = "VerticalOffersStateInteractorV2.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class VerticalOffersStateInteractorV2$offersStateFlow$1 extends SuspendLambda implements ems {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ i0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalOffersStateInteractorV2$offersStateFlow$1(i0 i0Var, Continuation continuation) {
        super(6, continuation);
        this.this$0 = i0Var;
    }

    @Override // defpackage.ems
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        VerticalOffersStateInteractorV2$offersStateFlow$1 verticalOffersStateInteractorV2$offersStateFlow$1 = new VerticalOffersStateInteractorV2$offersStateFlow$1(this.this$0, (Continuation) obj6);
        verticalOffersStateInteractorV2$offersStateFlow$1.L$0 = (vbl0) obj;
        verticalOffersStateInteractorV2$offersStateFlow$1.L$1 = (h2v) obj2;
        return verticalOffersStateInteractorV2$offersStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vbl0 vbl0Var = (vbl0) this.L$0;
        h2v h2vVar = (h2v) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        String a = this.this$0.c.a();
        Set b = this.this$0.c.b();
        return new au60(vbl0Var.b, vbl0Var.a, h2vVar, vbl0Var.c, scc.h(a), !b.isEmpty() ? b : null);
    }
}
