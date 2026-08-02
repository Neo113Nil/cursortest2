package com.yandex.go.performance_class;

import com.yandex.go.performance_class.experiment.DevicePerformanceClassExperiment;
import defpackage.bvf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.obj;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.performance_class.DevicePerformanceClassRepositoryImpl$monitorDynamicPerformanceClass$2", f = "DevicePerformanceClassRepositoryImpl.kt", l = {173, 179}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class DevicePerformanceClassRepositoryImpl$monitorDynamicPerformanceClass$2 extends SuspendLambda implements wls {
    final /* synthetic */ DevicePerformanceClassExperiment $experiment;
    final /* synthetic */ long $ttlMs;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DevicePerformanceClassRepositoryImpl$monitorDynamicPerformanceClass$2(a aVar, long j, DevicePerformanceClassExperiment devicePerformanceClassExperiment, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$ttlMs = j;
        this.$experiment = devicePerformanceClassExperiment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DevicePerformanceClassRepositoryImpl$monitorDynamicPerformanceClass$2 devicePerformanceClassRepositoryImpl$monitorDynamicPerformanceClass$2 = new DevicePerformanceClassRepositoryImpl$monitorDynamicPerformanceClass$2(this.this$0, this.$ttlMs, this.$experiment, continuation);
        devicePerformanceClassRepositoryImpl$monitorDynamicPerformanceClass$2.L$0 = obj;
        return devicePerformanceClassRepositoryImpl$monitorDynamicPerformanceClass$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DevicePerformanceClassRepositoryImpl$monitorDynamicPerformanceClass$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (kotlinx.coroutines.a.i(5000, r9) == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        if (r10.f(r2, r9) == r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x004f -> B:11:0x001f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0061 -> B:11:0x001f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                long currentTimeMillis = System.currentTimeMillis();
                obj objVar = this.this$0.b;
                long longValue = currentTimeMillis - ((Number) objVar.c.getValue(objVar, obj.d[1])).longValue();
                if (longValue >= this.$ttlMs) {
                    a aVar = this.this$0;
                    DevicePerformanceClassExperiment.DynamicThresholds dynamicThresholds = this.$experiment.f;
                    this.L$0 = tseVar;
                    this.J$0 = longValue;
                    this.label = 2;
                }
                if (bvf0.D(tseVar)) {
                    return zy11.a;
                }
                this.L$0 = tseVar;
                this.label = 1;
            } else if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        b.b(obj);
        if (bvf0.D(tseVar)) {
        }
    }
}
