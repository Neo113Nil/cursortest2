package com.yandex.plus.experiments.impl.cooldown;

import android.content.SharedPreferences;
import defpackage.e3n;
import defpackage.kp50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o430;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Le3n;", "<anonymous>", "(Ltse;)Le3n;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.experiments.impl.cooldown.PreferencesExperimentsCooldownManager$getCooldownEndTime$cooldownEndTime$1", f = "PreferencesExperimentsCooldownManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class PreferencesExperimentsCooldownManager$getCooldownEndTime$cooldownEndTime$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferencesExperimentsCooldownManager$getCooldownEndTime$cooldownEndTime$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PreferencesExperimentsCooldownManager$getCooldownEndTime$cooldownEndTime$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PreferencesExperimentsCooldownManager$getCooldownEndTime$cooldownEndTime$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        SharedPreferences sharedPreferences = this.this$0.d;
        if (!sharedPreferences.contains("RECHARGE_END")) {
            sharedPreferences = null;
        }
        if (sharedPreferences == null) {
            return null;
        }
        long j = sharedPreferences.getLong("RECHARGE_END", Long.MIN_VALUE);
        o430 o430Var = e3n.b;
        return new e3n(kp50.V(j, DurationUnit.SECONDS));
    }
}
