package com.yandex.mapkit.maps.core.utils.extensions;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt$interval$1", f = "FlowExtensions.kt", l = {99, 100, 102, 103}, m = "invokeSuspend", v = 1)
/* loaded from: classes15.dex */
public final class FlowExtensionsKt$interval$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $initialDelayMillis;
    final /* synthetic */ long $periodMillis;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtensionsKt$interval$1(long j, long j2, Continuation<? super FlowExtensionsKt$interval$1> continuation) {
        super(2, continuation);
        this.$initialDelayMillis = j;
        this.$periodMillis = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        FlowExtensionsKt$interval$1 flowExtensionsKt$interval$1 = new FlowExtensionsKt$interval$1(this.$initialDelayMillis, this.$periodMillis, continuation);
        flowExtensionsKt$interval$1.L$0 = obj;
        return flowExtensionsKt$interval$1;
    }

    @Override // defpackage.wls
    public final Object invoke(vpr vprVar, Continuation<? super zy11> continuation) {
        return ((FlowExtensionsKt$interval$1) create(vprVar, continuation)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0085, code lost:
    
        if (kotlinx.coroutines.a.i(r5, r17) == r2) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        if (r1.emit(r10, r17) == r2) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
    
        r3 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        long j2;
        long j3;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            long j4 = this.$initialDelayMillis;
            if (j4 < 0) {
                ny61.g("initialDelayMillis cannot be negative");
                return null;
            }
            j = 1;
            if (this.$periodMillis <= 0) {
                ny61.g("periodMillis must be positive");
                return null;
            }
            this.L$0 = vprVar;
            this.J$0 = 0L;
            this.label = 1;
            if (a.i(j4, this) != coroutineSingletons) {
                j2 = 0;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    j3 = this.J$0;
                    b.b(obj);
                    j = 1;
                    long j5 = j3 + j;
                    Long l = new Long(j3);
                    this.L$0 = vprVar;
                    this.J$0 = j5;
                    this.label = 4;
                    if (vprVar.emit(l, this) != coroutineSingletons) {
                        j3 = j5;
                        if (a.p(get_context())) {
                            return zy11.a;
                        }
                        long j6 = this.$periodMillis;
                        this.L$0 = vprVar;
                        this.J$0 = j3;
                        this.label = 3;
                    }
                    return coroutineSingletons;
                }
                if (i != 4) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            j3 = this.J$0;
            b.b(obj);
            j = 1;
            if (a.p(get_context())) {
            }
        } else {
            j2 = this.J$0;
            b.b(obj);
            j = 1;
        }
        long j7 = j2 + j;
        Long l2 = new Long(j2);
        this.L$0 = vprVar;
        this.J$0 = j7;
        this.label = 2;
    }
}
