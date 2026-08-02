package com.yandex.go.call_order_fallback.domain;

import android.os.SystemClock;
import defpackage.c2t;
import defpackage.e3n;
import defpackage.jj7;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.w1t;
import defpackage.z1t;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvpr;", "Lzy11;", "Ljj7;", ClidProvider.STATE, "<anonymous>", "(Lvpr;Ljj7;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.call_order_fallback.domain.CallOrderFallbackInteractor$showScreenTriggerFlow$2", f = "CallOrderFallbackInteractor.kt", l = {52, 64, 65}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class CallOrderFallbackInteractor$showScreenTriggerFlow$2 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallOrderFallbackInteractor$showScreenTriggerFlow$2(c cVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CallOrderFallbackInteractor$showScreenTriggerFlow$2 callOrderFallbackInteractor$showScreenTriggerFlow$2 = new CallOrderFallbackInteractor$showScreenTriggerFlow$2(this.this$0, (Continuation) obj3);
        callOrderFallbackInteractor$showScreenTriggerFlow$2.L$0 = (vpr) obj;
        callOrderFallbackInteractor$showScreenTriggerFlow$2.L$1 = (jj7) obj2;
        return callOrderFallbackInteractor$showScreenTriggerFlow$2.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0086, code lost:
    
        if (kotlinx.coroutines.a.i(r9, r13) == r2) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Long l;
        vpr vprVar = (vpr) this.L$0;
        jj7 jj7Var = (jj7) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 3;
                    if (vprVar.emit(zy11Var, this) != coroutineSingletons) {
                        return zy11Var;
                    }
                } else {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
            }
            kotlin.b.b(obj);
            return zy11Var;
        }
        kotlin.b.b(obj);
        c2t c2tVar = jj7Var.a;
        if (!(c2tVar instanceof w1t)) {
            if (jl40.l(c2tVar, z1t.a)) {
                Long l2 = jj7Var.c;
                if (l2 != null) {
                    c cVar = this.this$0;
                    long longValue = l2.longValue();
                    e3n e3nVar = jj7Var.b;
                    if (e3nVar != null) {
                        long j = e3nVar.a;
                        cVar.getClass();
                        l = new Long((e3n.e(j) + longValue) - SystemClock.elapsedRealtime());
                        if (l != null) {
                            return zy11Var;
                        }
                        long longValue2 = l.longValue();
                        this.L$0 = vprVar;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 2;
                    }
                }
                l = null;
                if (l != null) {
                }
            }
            return zy11Var;
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 1;
        if (vprVar.emit(zy11Var, this) == coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
