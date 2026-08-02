package com.yandex.go.superapp.unified_polling;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.bms;
import defpackage.f85;
import defpackage.ha2;
import defpackage.m2e0;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rsn;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.flow.j0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.unified_polling.SwitchingUnifiedPollingManager$trackingJob$1", f = "SwitchingUnifiedPollingManager.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class SwitchingUnifiedPollingManager$trackingJob$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ d this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.superapp.unified_polling.SwitchingUnifiedPollingManager$trackingJob$1$1, reason: invalid class name */
    /* loaded from: classes14.dex */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements bms {
        public static final AnonymousClass1 a = new AnonymousClass1(4, 4, Triple.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V");

        @Override // defpackage.bms
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            Boolean bool = (Boolean) obj3;
            bool.booleanValue();
            return new Triple((m2e0) obj, (rsn) obj2, bool);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchingUnifiedPollingManager$trackingJob$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SwitchingUnifiedPollingManager$trackingJob$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SwitchingUnifiedPollingManager$trackingJob$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            ha2 n = kotlinx.coroutines.flow.e.n(dVar.d, new mth(new j0(null, new mth(dVar.e, 6), new SwitchingUnifiedPollingManager$trackingJob$1$invokeSuspend$$inlined$withPreviousEmit$1(3, null)), 6), this.this$0.b.i(), AnonymousClass1.a);
            f85 f85Var = f85.B;
            this.label = 1;
            if (n.collect(f85Var, this) == coroutineSingletons) {
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
