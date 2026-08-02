package com.yandex.go.coroutines;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.coroutines.ExpiredTimer$start$1$2$1", f = "ExpiredTimer.kt", l = {39, 40, 43}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ExpiredTimer$start$1$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $timeout;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpiredTimer$start$1$2$1(long j, Continuation continuation) {
        super(2, continuation);
        this.$timeout = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ExpiredTimer$start$1$2$1 expiredTimer$start$1$2$1 = new ExpiredTimer$start$1$2$1(this.$timeout, continuation);
        expiredTimer$start$1$2$1.L$0 = obj;
        return expiredTimer$start$1$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ExpiredTimer$start$1$2$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        if (r0.emit(r14, r13) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (kotlinx.coroutines.a.i(1000, r13) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (r0.emit(r14, r13) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0053 -> B:13:0x0056). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            j = this.$timeout;
            if (j <= 0) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.J$0;
            kotlin.b.b(obj);
            j -= 1000;
            if (j <= 0) {
                Long l = new Long(j);
                this.L$0 = vprVar;
                this.J$0 = j;
                this.label = 1;
            } else {
                Long l2 = new Long(0L);
                this.L$0 = null;
                this.J$0 = j;
                this.label = 3;
            }
            return coroutineSingletons;
        }
        j = this.J$0;
        kotlin.b.b(obj);
        this.L$0 = vprVar;
        this.J$0 = j;
        this.label = 2;
    }
}
