package com.yandex.go.payments.sbp.navigation;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.cda0;
import defpackage.eg3;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qu;
import defpackage.sy60;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.veb;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.sbp.navigation.CheckAddSbpTokenAvailabilityRouter$onLaunch$1", f = "CheckAddSbpTokenAvailabilityRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class CheckAddSbpTokenAvailabilityRouter$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ veb $payload;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.payments.sbp.navigation.CheckAddSbpTokenAvailabilityRouter$onLaunch$1$1", f = "CheckAddSbpTokenAvailabilityRouter.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.payments.sbp.navigation.CheckAddSbpTokenAvailabilityRouter$onLaunch$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements tls {
        final /* synthetic */ veb $payload;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, veb vebVar, Continuation continuation) {
            super(1, continuation);
            this.this$0 = aVar;
            this.$payload = vebVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$payload, continuation);
        }

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                a aVar = this.this$0;
                veb vebVar = this.$payload;
                this.label = 1;
                aVar.getClass();
                obj = vebVar.a.equals(TariffOrderFlow.ORDER_FLOW_TAXI_KEY) ? ((com.yandex.go.payments.paymentlist.data.c) ((cda0) aVar.H.get())).j(this) : aVar.P(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            a aVar2 = this.this$0;
            if (booleanValue) {
                aVar2.z(eg3.g(aVar2.J.a, this.$payload.a, aVar2.K).e(), sy60.Q2);
            } else {
                aVar2.r(new qu(9));
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckAddSbpTokenAvailabilityRouter$onLaunch$1(a aVar, veb vebVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$payload = vebVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CheckAddSbpTokenAvailabilityRouter$onLaunch$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        CheckAddSbpTokenAvailabilityRouter$onLaunch$1 checkAddSbpTokenAvailabilityRouter$onLaunch$1 = (CheckAddSbpTokenAvailabilityRouter$onLaunch$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        checkAddSbpTokenAvailabilityRouter$onLaunch$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        a aVar = this.this$0;
        tje.N(aVar.o(), null, null, new CheckAddSbpTokenAvailabilityRouter$safeTryWithSpinner$1(aVar, new AnonymousClass1(aVar, this.$payload, null), null), 3);
        return zy11.a;
    }
}
