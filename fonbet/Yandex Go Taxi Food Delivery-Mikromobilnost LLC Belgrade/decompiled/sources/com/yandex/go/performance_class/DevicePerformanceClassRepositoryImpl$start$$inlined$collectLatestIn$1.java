package com.yandex.go.performance_class;

import com.yandex.go.performance_class.experiment.DevicePerformanceClassExperiment;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.performance_class.DevicePerformanceClassRepositoryImpl$start$$inlined$collectLatestIn$1", f = "DevicePerformanceClassRepositoryImpl.kt", l = {54}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
public final class DevicePerformanceClassRepositoryImpl$start$$inlined$collectLatestIn$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $this_collectLatestIn;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n"}, d2 = {"T", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.performance_class.DevicePerformanceClassRepositoryImpl$start$$inlined$collectLatestIn$1$1", f = "DevicePerformanceClassRepositoryImpl.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE, 56}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.performance_class.DevicePerformanceClassRepositoryImpl$start$$inlined$collectLatestIn$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Continuation continuation, a aVar) {
            super(2, continuation);
            this.this$0 = aVar;
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

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
        
            if (com.yandex.go.performance_class.a.b(r7, r0, r6) == r1) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
        
            if (com.yandex.go.performance_class.a.a(r7, r0, r6) == r1) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            DevicePerformanceClassExperiment devicePerformanceClassExperiment;
            Object obj2 = this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                devicePerformanceClassExperiment = (DevicePerformanceClassExperiment) obj2;
                a aVar = this.this$0;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = devicePerformanceClassExperiment;
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return zy11.a;
                }
                devicePerformanceClassExperiment = (DevicePerformanceClassExperiment) this.L$2;
                b.b(obj);
            }
            a aVar2 = this.this$0;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DevicePerformanceClassRepositoryImpl$start$$inlined$collectLatestIn$1(tpr tprVar, Continuation continuation, a aVar) {
        super(2, continuation);
        this.$this_collectLatestIn = tprVar;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DevicePerformanceClassRepositoryImpl$start$$inlined$collectLatestIn$1(this.$this_collectLatestIn, continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DevicePerformanceClassRepositoryImpl$start$$inlined$collectLatestIn$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            tpr tprVar = this.$this_collectLatestIn;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, this.this$0);
            this.label = 1;
            if (e.k(tprVar, anonymousClass1, this) == coroutineSingletons) {
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
