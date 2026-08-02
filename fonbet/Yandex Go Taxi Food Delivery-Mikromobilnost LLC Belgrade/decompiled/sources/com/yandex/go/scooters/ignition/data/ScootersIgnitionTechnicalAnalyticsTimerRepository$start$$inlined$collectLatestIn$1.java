package com.yandex.go.scooters.ignition.data;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.osn0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.ignition.data.ScootersIgnitionTechnicalAnalyticsTimerRepository$start$$inlined$collectLatestIn$1", f = "ScootersIgnitionTechnicalAnalyticsTimerRepository.kt", l = {54}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class ScootersIgnitionTechnicalAnalyticsTimerRepository$start$$inlined$collectLatestIn$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $this_collectLatestIn;
    int label;
    final /* synthetic */ i this$0;

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n"}, d2 = {"T", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.scooters.ignition.data.ScootersIgnitionTechnicalAnalyticsTimerRepository$start$$inlined$collectLatestIn$1$1", f = "ScootersIgnitionTechnicalAnalyticsTimerRepository.kt", l = {60, 61}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.scooters.ignition.data.ScootersIgnitionTechnicalAnalyticsTimerRepository$start$$inlined$collectLatestIn$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        final /* synthetic */ i this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Continuation continuation, i iVar) {
            super(2, continuation);
            this.this$0 = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation, this.this$0);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create(obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0079, code lost:
        
            if (com.yandex.go.scooters.ignition.analytics.a.e(r9, "timer", new defpackage.vkn0(14), r8, 2) != r1) goto L7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
        
            if (r9 != false) goto L13;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0079 -> B:6:0x001c). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            boolean booleanValue;
            boolean z;
            Object obj2 = this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                booleanValue = ((Boolean) obj2).booleanValue();
            } else {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = this.Z$0;
                    kotlin.b.b(obj);
                    booleanValue = z;
                    if (kotlinx.coroutines.a.p(get_context())) {
                        long j = osn0.a;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.Z$0 = booleanValue;
                        this.label = 1;
                        if (kotlinx.coroutines.a.i(j, this) != coroutineSingletons) {
                            z = booleanValue;
                            com.yandex.go.scooters.ignition.analytics.a aVar = this.this$0.a;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.Z$0 = z;
                            this.label = 2;
                            aVar.getClass();
                        }
                        return coroutineSingletons;
                    }
                    return zy11.a;
                }
                z = this.Z$0;
                kotlin.b.b(obj);
                com.yandex.go.scooters.ignition.analytics.a aVar2 = this.this$0.a;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.Z$0 = z;
                this.label = 2;
                aVar2.getClass();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersIgnitionTechnicalAnalyticsTimerRepository$start$$inlined$collectLatestIn$1(tpr tprVar, Continuation continuation, i iVar) {
        super(2, continuation);
        this.$this_collectLatestIn = tprVar;
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersIgnitionTechnicalAnalyticsTimerRepository$start$$inlined$collectLatestIn$1(this.$this_collectLatestIn, continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersIgnitionTechnicalAnalyticsTimerRepository$start$$inlined$collectLatestIn$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr tprVar = this.$this_collectLatestIn;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, this.this$0);
            this.label = 1;
            if (kotlinx.coroutines.flow.e.k(tprVar, anonymousClass1, this) == coroutineSingletons) {
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
