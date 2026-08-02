package com.yandex.mob;

import com.yandex.mob.domain.InitialUseCase$Result;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oo20;
import defpackage.tse;
import defpackage.wls;
import defpackage.xo20;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mob.MobMainInitializer$startBackgroundOperations$1$1$configMigrationDeferred$1", f = "MobMainInitializer.kt", l = {HProv.PP_REBOOT}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class MobMainInitializer$startBackgroundOperations$1$1$configMigrationDeferred$1 extends SuspendLambda implements wls {
    final /* synthetic */ InitialUseCase$Result $initialResult;
    final /* synthetic */ oo20 $this_with;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobMainInitializer$startBackgroundOperations$1$1$configMigrationDeferred$1(oo20 oo20Var, InitialUseCase$Result initialUseCase$Result, Continuation continuation) {
        super(2, continuation);
        this.$this_with = oo20Var;
        this.$initialResult = initialUseCase$Result;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MobMainInitializer$startBackgroundOperations$1$1$configMigrationDeferred$1(this.$this_with, this.$initialResult, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MobMainInitializer$startBackgroundOperations$1$1$configMigrationDeferred$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.mob.domain.e eVar = (com.yandex.mob.domain.e) ((xo20) this.$this_with).z.getValue();
            InitialUseCase$Result initialUseCase$Result = this.$initialResult;
            this.label = 1;
            if (eVar.a(initialUseCase$Result, this) == coroutineSingletons) {
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
