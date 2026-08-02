package com.yandex.plus.experiments.impl.cooldown;

import android.content.SharedPreferences;
import defpackage.e3n;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o430;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lzy11;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.experiments.impl.cooldown.PreferencesExperimentsCooldownManager$setCooldownEndTime$2", f = "PreferencesExperimentsCooldownManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class PreferencesExperimentsCooldownManager$setCooldownEndTime$2 extends SuspendLambda implements wls {
    final /* synthetic */ long $cooldownEndTime;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferencesExperimentsCooldownManager$setCooldownEndTime$2(a aVar, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$cooldownEndTime = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PreferencesExperimentsCooldownManager$setCooldownEndTime$2 preferencesExperimentsCooldownManager$setCooldownEndTime$2 = new PreferencesExperimentsCooldownManager$setCooldownEndTime$2(this.this$0, this.$cooldownEndTime, continuation);
        preferencesExperimentsCooldownManager$setCooldownEndTime$2.L$0 = obj;
        return preferencesExperimentsCooldownManager$setCooldownEndTime$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PreferencesExperimentsCooldownManager$setCooldownEndTime$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        long j = this.$cooldownEndTime;
        try {
            SharedPreferences.Editor edit = aVar.d.edit();
            o430 o430Var = e3n.b;
            edit.putLong("RECHARGE_END", e3n.o(j, DurationUnit.SECONDS));
            edit.commit();
            failure = zy11.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return new Result(failure);
    }
}
