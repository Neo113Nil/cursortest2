package com.yandex.messaging.internal.authorized.sync;

import defpackage.c18;
import defpackage.cn2;
import defpackage.dvw;
import defpackage.j18;
import defpackage.kde;
import defpackage.kgx;
import defpackage.mvg;
import defpackage.n5t0;
import defpackage.ny61;
import defpackage.op3;
import defpackage.sls;
import defpackage.tse;
import defpackage.uo3;
import defpackage.vlu;
import defpackage.wls;
import defpackage.wlu;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.sync.HistoryLoader$requestHistory$$inlined$cancelableCoroutineWrapper$1", f = "HistoryLoader.kt", l = {113}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class HistoryLoader$requestHistory$$inlined$cancelableCoroutineWrapper$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $minChatVersion$inlined;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ wlu this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistoryLoader$requestHistory$$inlined$cancelableCoroutineWrapper$1(Continuation continuation, wlu wluVar, long j) {
        super(2, continuation);
        this.this$0 = wluVar;
        this.$minChatVersion$inlined = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        HistoryLoader$requestHistory$$inlined$cancelableCoroutineWrapper$1 historyLoader$requestHistory$$inlined$cancelableCoroutineWrapper$1 = new HistoryLoader$requestHistory$$inlined$cancelableCoroutineWrapper$1(continuation, this.this$0, this.$minChatVersion$inlined);
        historyLoader$requestHistory$$inlined$cancelableCoroutineWrapper$1.L$0 = obj;
        return historyLoader$requestHistory$$inlined$cancelableCoroutineWrapper$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((HistoryLoader$requestHistory$$inlined$cancelableCoroutineWrapper$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        c18 c18Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        final int i2 = 1;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return obj;
        }
        kotlin.b.b(obj);
        tse tseVar = (tse) this.L$0;
        this.L$0 = tseVar;
        this.label = 1;
        j18 j18Var = new j18(1, dvw.b(this));
        j18Var.u();
        final wlu wluVar = this.this$0;
        long j = this.$minChatVersion$inlined;
        kde kdeVar = new kde(j18Var, 4);
        op3 op3Var = wluVar.e;
        final int i3 = 0;
        kgx kgxVar = wlu.f[0];
        if (op3Var.a() != null) {
            c18Var = new c18(0, new sls() { // from class: ulu
                @Override // defpackage.sls
                public final Object invoke() {
                    int i4 = i3;
                    zy11 zy11Var = zy11.a;
                    wlu wluVar2 = wluVar;
                    switch (i4) {
                        case 0:
                            wluVar2.c(null);
                            break;
                        default:
                            wluVar2.c(null);
                            break;
                    }
                    return zy11Var;
                }
            });
        } else {
            wluVar.c(((n5t0) wluVar.b.get()).f(new vlu(wluVar, wluVar.a(j), kdeVar)));
            c18Var = new c18(0, new sls() { // from class: ulu
                @Override // defpackage.sls
                public final Object invoke() {
                    int i4 = i2;
                    zy11 zy11Var = zy11.a;
                    wlu wluVar2 = wluVar;
                    switch (i4) {
                        case 0:
                            wluVar2.c(null);
                            break;
                        default:
                            wluVar2.c(null);
                            break;
                    }
                    return zy11Var;
                }
            });
        }
        j18Var.w(new uo3(tseVar, new cn2(c18Var, 1), 21));
        Object s = j18Var.s();
        return s == coroutineSingletons ? coroutineSingletons : s;
    }
}
