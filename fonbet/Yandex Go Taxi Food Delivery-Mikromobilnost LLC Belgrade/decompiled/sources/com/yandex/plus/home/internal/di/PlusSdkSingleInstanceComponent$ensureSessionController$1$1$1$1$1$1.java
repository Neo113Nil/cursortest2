package com.yandex.plus.home.internal.di;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.syq0;
import defpackage.tse;
import defpackage.ua20;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.internal.di.PlusSdkSingleInstanceComponent$ensureSessionController$1$1$1$1$1$1", f = "PlusSdkSingleInstanceComponent.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class PlusSdkSingleInstanceComponent$ensureSessionController$1$1$1$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ syq0 $sessionController;
    final /* synthetic */ boolean $sessionResumed;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusSdkSingleInstanceComponent$ensureSessionController$1$1$1$1$1$1(boolean z, syq0 syq0Var, Continuation continuation) {
        super(2, continuation);
        this.$sessionResumed = z;
        this.$sessionController = syq0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlusSdkSingleInstanceComponent$ensureSessionController$1$1$1$1$1$1(this.$sessionResumed, this.$sessionController, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PlusSdkSingleInstanceComponent$ensureSessionController$1$1$1$1$1$1 plusSdkSingleInstanceComponent$ensureSessionController$1$1$1$1$1$1 = (PlusSdkSingleInstanceComponent$ensureSessionController$1$1$1$1$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        plusSdkSingleInstanceComponent$ensureSessionController$1$1$1$1$1$1.invokeSuspend(zy11Var);
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
        boolean z = this.$sessionResumed;
        syq0 syq0Var = this.$sessionController;
        if (z) {
            ((ua20) syq0Var).a.resumeSession();
        } else {
            ((ua20) syq0Var).a.pauseSession();
        }
        return zy11.a;
    }
}
