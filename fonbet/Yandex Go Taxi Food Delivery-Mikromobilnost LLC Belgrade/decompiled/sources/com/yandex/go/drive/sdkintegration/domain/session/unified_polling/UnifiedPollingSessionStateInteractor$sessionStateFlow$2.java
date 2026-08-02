package com.yandex.go.drive.sdkintegration.domain.session.unified_polling;

import defpackage.jnt;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljnt;", "it", "Lzy11;", "<anonymous>", "(Ljnt;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.drive.sdkintegration.domain.session.unified_polling.UnifiedPollingSessionStateInteractor$sessionStateFlow$2", f = "UnifiedPollingSessionStateInteractor.kt", l = {46}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class UnifiedPollingSessionStateInteractor$sessionStateFlow$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifiedPollingSessionStateInteractor$sessionStateFlow$2(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UnifiedPollingSessionStateInteractor$sessionStateFlow$2 unifiedPollingSessionStateInteractor$sessionStateFlow$2 = new UnifiedPollingSessionStateInteractor$sessionStateFlow$2(this.this$0, continuation);
        unifiedPollingSessionStateInteractor$sessionStateFlow$2.L$0 = obj;
        return unifiedPollingSessionStateInteractor$sessionStateFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UnifiedPollingSessionStateInteractor$sessionStateFlow$2) create((jnt) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        jnt jntVar = (jnt) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            n0 n0Var = this.this$0.c;
            this.L$0 = null;
            this.label = 1;
            if (n0Var.emit(jntVar, this) == coroutineSingletons) {
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
