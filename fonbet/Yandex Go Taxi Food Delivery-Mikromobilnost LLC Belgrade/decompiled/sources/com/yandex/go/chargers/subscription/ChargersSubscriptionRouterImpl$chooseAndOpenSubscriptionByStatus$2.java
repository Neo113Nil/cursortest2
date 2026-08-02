package com.yandex.go.chargers.subscription;

import com.yandex.go.chargers.subscription.domain.c;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.cva;
import defpackage.dpb;
import defpackage.dva;
import defpackage.eva;
import defpackage.fva;
import defpackage.gma;
import defpackage.gva;
import defpackage.jl40;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qu;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.yua;
import defpackage.zua;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.subscription.ChargersSubscriptionRouterImpl$chooseAndOpenSubscriptionByStatus$2", f = "ChargersSubscriptionRouterImpl.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersSubscriptionRouterImpl$chooseAndOpenSubscriptionByStatus$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersSubscriptionRouterImpl$chooseAndOpenSubscriptionByStatus$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersSubscriptionRouterImpl$chooseAndOpenSubscriptionByStatus$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersSubscriptionRouterImpl$chooseAndOpenSubscriptionByStatus$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            c cVar = this.this$0.G;
            this.label = 1;
            obj = cVar.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        gva gvaVar = (gva) obj;
        this.this$0.j(dpb.a);
        if (jl40.l(gvaVar, fva.a)) {
            a aVar = this.this$0;
            aVar.z((m950) aVar.H.get(), new zua(aVar));
        } else if (gvaVar instanceof eva) {
            a aVar2 = this.this$0;
            aVar2.A((m950) aVar2.F.get(), new gma(((eva) gvaVar).a), new yua(aVar2, 0));
        } else if (jl40.l(gvaVar, dva.a)) {
            this.this$0.r(new qu(9));
        } else {
            if (!(gvaVar instanceof cva)) {
                w511.b();
                return null;
            }
            this.this$0.r(new qu(9));
        }
        return zy11.a;
    }
}
