package com.yandex.go.coroutines;

import defpackage.bvf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tfi0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lvpr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.coroutines.TimeoutKt$timeout$1", f = "Timeout.kt", l = {22}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class TimeoutKt$timeout$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $other;
    final /* synthetic */ long $timeout;
    final /* synthetic */ tpr $upstreamFlow;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.coroutines.TimeoutKt$timeout$1$1", f = "Timeout.kt", l = {28, 29, 31}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.coroutines.TimeoutKt$timeout$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ vpr $$this$flow;
        final /* synthetic */ tpr $other;
        final /* synthetic */ long $timeout;
        final /* synthetic */ tpr $upstreamFlow;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, vpr vprVar, tpr tprVar, tpr tprVar2, Continuation continuation) {
            super(2, continuation);
            this.$timeout = j;
            this.$$this$flow = vprVar;
            this.$other = tprVar;
            this.$upstreamFlow = tprVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$timeout, this.$$this$flow, this.$other, this.$upstreamFlow, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x00a5, code lost:
        
            if (kotlinx.coroutines.flow.e.u(r0, r11, r10) == r1) goto L35;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
        /* JADX WARN: Type inference failed for: r0v13, types: [tfi0] */
        /* JADX WARN: Type inference failed for: r11v11, types: [x6f0] */
        /* JADX WARN: Type inference failed for: r11v12 */
        /* JADX WARN: Type inference failed for: r11v6 */
        /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, tfi0] */
        /* JADX WARN: Type inference failed for: r11v9 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a5 -> B:8:0x0027). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            TimeoutCancellationException timeoutCancellationException;
            Object obj2;
            tpr tprVar;
            vpr vprVar;
            ?? r11;
            tse tseVar = (tse) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
            } catch (TimeoutCancellationException e) {
                timeoutCancellationException = e;
                obj2 = tseVar;
                tprVar = this.$other;
                if (tprVar != null) {
                }
            }
            if (i == 0) {
                kotlin.b.b(obj);
                r11 = kotlinx.coroutines.channels.b.b(tseVar, 0, new TimeoutKt$timeout$1$1$values$1(this.$upstreamFlow, null), 3);
            } else {
                if (i == 1) {
                    ?? r0 = (tfi0) this.L$1;
                    kotlin.b.b(obj);
                    tseVar = r0;
                    vprVar = this.$$this$flow;
                    this.L$0 = null;
                    this.L$1 = tseVar;
                    this.L$2 = null;
                    this.label = 2;
                    if (vprVar.emit(obj, this) != coroutineSingletons) {
                        r11 = tseVar;
                    }
                    return coroutineSingletons;
                }
                if (i == 2) {
                    tfi0 tfi0Var = (tfi0) this.L$1;
                    kotlin.b.b(obj);
                    r11 = tfi0Var;
                } else {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tprVar = (tpr) this.L$3;
                    timeoutCancellationException = (TimeoutCancellationException) this.L$2;
                    obj2 = (tfi0) this.L$1;
                    kotlin.b.b(obj);
                    r11 = obj2;
                    if (tprVar == null) {
                        throw timeoutCancellationException;
                    }
                }
            }
            if (kotlinx.coroutines.a.p(get_context())) {
                try {
                } catch (TimeoutCancellationException e2) {
                    obj2 = r11;
                    timeoutCancellationException = e2;
                    tprVar = this.$other;
                    if (tprVar != null) {
                        throw timeoutCancellationException;
                    }
                    vpr vprVar2 = this.$$this$flow;
                    this.L$0 = null;
                    this.L$1 = obj2;
                    this.L$2 = timeoutCancellationException;
                    this.L$3 = tprVar;
                    this.L$4 = null;
                    this.label = 3;
                }
                long j = this.$timeout;
                TimeoutKt$timeout$1$1$value$1 timeoutKt$timeout$1$1$value$1 = new TimeoutKt$timeout$1$1$value$1(r11, null);
                this.L$0 = null;
                this.L$1 = r11;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 1;
                Object u = kotlinx.coroutines.a.u(j, timeoutKt$timeout$1$1$value$1, this);
                if (u != coroutineSingletons) {
                    tseVar = r11;
                    obj = u;
                    vprVar = this.$$this$flow;
                    this.L$0 = null;
                    this.L$1 = tseVar;
                    this.L$2 = null;
                    this.label = 2;
                    if (vprVar.emit(obj, this) != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeoutKt$timeout$1(long j, tpr tprVar, tpr tprVar2, Continuation continuation) {
        super(2, continuation);
        this.$timeout = j;
        this.$other = tprVar;
        this.$upstreamFlow = tprVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TimeoutKt$timeout$1 timeoutKt$timeout$1 = new TimeoutKt$timeout$1(this.$timeout, this.$other, this.$upstreamFlow, continuation);
        timeoutKt$timeout$1.L$0 = obj;
        return timeoutKt$timeout$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TimeoutKt$timeout$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$timeout, vprVar, this.$other, this.$upstreamFlow, null);
            this.L$0 = null;
            this.label = 1;
            if (bvf0.n(anonymousClass1, this) == coroutineSingletons) {
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
