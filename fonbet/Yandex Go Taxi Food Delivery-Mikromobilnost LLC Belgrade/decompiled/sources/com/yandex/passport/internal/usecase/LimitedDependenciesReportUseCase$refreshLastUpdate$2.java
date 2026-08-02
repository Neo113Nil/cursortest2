package com.yandex.passport.internal.usecase;

import android.content.SharedPreferences;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.usecase.LimitedDependenciesReportUseCase$refreshLastUpdate$2", f = "LimitedDependenciesReportUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class LimitedDependenciesReportUseCase$refreshLastUpdate$2 extends SuspendLambda implements wls {
    final /* synthetic */ long $nowAppVersion;
    int label;
    final /* synthetic */ s0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LimitedDependenciesReportUseCase$refreshLastUpdate$2(s0 s0Var, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = s0Var;
        this.$nowAppVersion = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LimitedDependenciesReportUseCase$refreshLastUpdate$2(this.this$0, this.$nowAppVersion, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        LimitedDependenciesReportUseCase$refreshLastUpdate$2 limitedDependenciesReportUseCase$refreshLastUpdate$2 = (LimitedDependenciesReportUseCase$refreshLastUpdate$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        limitedDependenciesReportUseCase$refreshLastUpdate$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        SharedPreferences sharedPreferences = this.this$0.e;
        long j = this.$nowAppVersion;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putLong("last_version", j);
        edit.commit();
        return zy11.a;
    }
}
