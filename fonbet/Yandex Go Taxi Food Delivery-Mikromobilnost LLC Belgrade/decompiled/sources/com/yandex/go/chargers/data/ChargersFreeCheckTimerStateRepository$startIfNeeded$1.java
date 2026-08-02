package com.yandex.go.chargers.data;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.tse;
import defpackage.ud;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.data.ChargersFreeCheckTimerStateRepository$startIfNeeded$1", f = "ChargersFreeCheckTimerStateRepository.kt", l = {49}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersFreeCheckTimerStateRepository$startIfNeeded$1 extends SuspendLambda implements wls {
    final /* synthetic */ int $initialSeconds;
    final /* synthetic */ String $timerKey;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersFreeCheckTimerStateRepository$startIfNeeded$1(int i, j jVar, String str, Continuation continuation) {
        super(2, continuation);
        this.$initialSeconds = i;
        this.this$0 = jVar;
        this.$timerKey = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersFreeCheckTimerStateRepository$startIfNeeded$1(this.$initialSeconds, this.this$0, this.$timerKey, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersFreeCheckTimerStateRepository$startIfNeeded$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            rol0 a = com.yandex.go.chargers.utils.a.a(this.$initialSeconds);
            ud udVar = new ud(11, this.this$0, this.$timerKey);
            this.label = 1;
            if (a.collect(udVar, this) == coroutineSingletons) {
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
