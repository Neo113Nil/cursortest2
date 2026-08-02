package com.yandex.go.rida.bids.ui;

import defpackage.ck11;
import defpackage.e3n;
import defpackage.kp50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o430;
import defpackage.rq5;
import defpackage.sb2;
import defpackage.sls;
import defpackage.tse;
import defpackage.tx40;
import defpackage.ubn;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;
import ru.yandex.video.m3.player.ui.debug.internal.providers.SessionColorProviderImpl;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.rida.bids.ui.BidsListKt$rememberAcceptButtonTimerProgressState$1$1", f = "BidsList.kt", l = {SessionColorProviderImpl.SHORT_SESSION_MAX_STALLED_LENGTH_MS_YELLOW_BOUND}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class BidsListKt$rememberAcceptButtonTimerProgressState$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $bidCreatedTime;
    final /* synthetic */ int $cancelTtlSeconds;
    final /* synthetic */ boolean $isProgressEnabled;
    final /* synthetic */ sls $onAnimationEnd;
    final /* synthetic */ tx40 $progressState;
    float F$0;
    long J$0;
    long J$1;
    long J$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BidsListKt$rememberAcceptButtonTimerProgressState$1$1(long j, int i, tx40 tx40Var, boolean z, sls slsVar, Continuation continuation) {
        super(2, continuation);
        this.$bidCreatedTime = j;
        this.$cancelTtlSeconds = i;
        this.$progressState = tx40Var;
        this.$isProgressEnabled = z;
        this.$onAnimationEnd = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BidsListKt$rememberAcceptButtonTimerProgressState$1$1(this.$bidCreatedTime, this.$cancelTtlSeconds, this.$progressState, this.$isProgressEnabled, this.$onAnimationEnd, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BidsListKt$rememberAcceptButtonTimerProgressState$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            long j = this.$bidCreatedTime;
            o430 o430Var = e3n.b;
            long e = e3n.e(kp50.U(this.$cancelTtlSeconds, DurationUnit.SECONDS)) + j;
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = e - currentTimeMillis;
            if (j2 > 0) {
                float f = 1.0f - (this.$bidCreatedTime != e ? (currentTimeMillis - r12) / (e - r12) : 0.0f);
                this.$progressState.setFloatValue(f);
                if (!this.$isProgressEnabled) {
                    return zy11Var;
                }
                ck11 K = sb2.K((int) j2, 0, ubn.d, 2);
                rq5 rq5Var = new rq5(this.$progressState, 1);
                this.J$0 = e;
                this.J$1 = currentTimeMillis;
                this.J$2 = j2;
                this.F$0 = f;
                this.label = 1;
                if (androidx.compose.animation.core.e.c(f, 0.0f, K, rq5Var, this, 4) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                this.$progressState.setFloatValue(0.0f);
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.$onAnimationEnd.invoke();
        return zy11Var;
    }
}
