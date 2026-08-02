package com.yandex.go.chargers.utils;

import android.os.SystemClock;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvpr;", "", "it", "", "<anonymous>", "(Lvpr;J)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.utils.ChargersCountdownTimerFlow$start$1", f = "ChargersCountdownTimerFlow.kt", l = {16}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersCountdownTimerFlow$start$1 extends SuspendLambda implements zls {
    final /* synthetic */ long $endTimeMs;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersCountdownTimerFlow$start$1(long j, Continuation continuation) {
        super(3, continuation);
        this.$endTimeMs = j;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj2).longValue();
        ChargersCountdownTimerFlow$start$1 chargersCountdownTimerFlow$start$1 = new ChargersCountdownTimerFlow$start$1(this.$endTimeMs, (Continuation) obj3);
        chargersCountdownTimerFlow$start$1.L$0 = (vpr) obj;
        return chargersCountdownTimerFlow$start$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            long elapsedRealtime = this.$endTimeMs - SystemClock.elapsedRealtime();
            Long l = new Long(elapsedRealtime < 0 ? 0L : elapsedRealtime);
            this.L$0 = null;
            this.J$0 = elapsedRealtime;
            this.label = 1;
            if (vprVar.emit(l, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            j = elapsedRealtime;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.J$0;
            b.b(obj);
        }
        return Boolean.valueOf(j > 0);
    }
}
