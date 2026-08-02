package com.yandex.go.chargers.order.domain;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qu;
import defpackage.tls;
import defpackage.tse;
import defpackage.vng;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.order.domain.ChargersActiveOrdersSessionPollingInteractor$startPolling$1", f = "ChargersActiveOrdersSessionPollingInteractor.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersActiveOrdersSessionPollingInteractor$startPolling$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ f this$0;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.chargers.order.domain.ChargersActiveOrdersSessionPollingInteractor$startPolling$1$1", f = "ChargersActiveOrdersSessionPollingInteractor.kt", l = {53}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.chargers.order.domain.ChargersActiveOrdersSessionPollingInteractor$startPolling$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements tls {
        int label;
        final /* synthetic */ f this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(f fVar, Continuation continuation) {
            super(1, continuation);
            this.this$0 = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                r0 r0Var = this.this$0.f.a;
                do {
                    value = r0Var.getValue();
                    ((Boolean) value).getClass();
                } while (!r0Var.k(value, Boolean.FALSE));
                f fVar = this.this$0;
                this.label = 1;
                fVar.getClass();
                if (kotlinx.coroutines.flow.e.k(vng.l(ru.yandex.taxi.experiments.d.b(fVar.b), ChargersActiveOrdersSessionPollingInteractor$onChargersAvailable$2.b, vng.c), new ChargersActiveOrdersSessionPollingInteractor$onChargersAvailable$3(new ChargersActiveOrdersSessionPollingInteractor$startActiveOrdersPolling$2(fVar, null), null), this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersActiveOrdersSessionPollingInteractor$startPolling$1(f fVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersActiveOrdersSessionPollingInteractor$startPolling$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersActiveOrdersSessionPollingInteractor$startPolling$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            f fVar = this.this$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(fVar, null);
            this.label = 1;
            if (kotlinx.coroutines.flow.e.k(vng.l(fVar.e.a, new qu(13), vng.c), new ChargersActiveOrdersSessionPollingInteractor$onSuperAppPollingAvailable$3(anonymousClass1, null), this) == coroutineSingletons) {
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
