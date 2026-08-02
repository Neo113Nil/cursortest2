package com.yandex.passport.internal;

import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.usecase.w0;
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
@mvg(c = "com.yandex.passport.internal.PassportInitialization$tryToMakeAllTokensMasterRelated$1$1", f = "PassportInitialization.kt", l = {595}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class PassportInitialization$tryToMakeAllTokensMasterRelated$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ PassportProcessGlobalComponent $this_with;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassportInitialization$tryToMakeAllTokensMasterRelated$1$1(PassportProcessGlobalComponent passportProcessGlobalComponent, Continuation continuation) {
        super(2, continuation);
        this.$this_with = passportProcessGlobalComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PassportInitialization$tryToMakeAllTokensMasterRelated$1$1(this.$this_with, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PassportInitialization$tryToMakeAllTokensMasterRelated$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            w0 makeAllTokenMasterRelatedUseCase = this.$this_with.getMakeAllTokenMasterRelatedUseCase();
            this.label = 1;
            return makeAllTokenMasterRelatedUseCase.a(this) == coroutineSingletons ? coroutineSingletons : zy11Var;
        }
        if (i == 1) {
            kotlin.b.b(obj);
            return zy11Var;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
