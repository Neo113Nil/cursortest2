package com.yandex.plus.home.graphql.plusstate;

import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.kyy;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rkd0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkyy;", "Lhmd0;", TarifficatorScenarioActivity.RESULT_KEY, "Lzy11;", "<anonymous>", "(Lkyy;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.graphql.plusstate.PlusStateRepositoryImpl$getPlusStateFlow$2", f = "PlusStateRepositoryImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class PlusStateRepositoryImpl$getPlusStateFlow$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusStateRepositoryImpl$getPlusStateFlow$2(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PlusStateRepositoryImpl$getPlusStateFlow$2 plusStateRepositoryImpl$getPlusStateFlow$2 = new PlusStateRepositoryImpl$getPlusStateFlow$2(this.this$0, continuation);
        plusStateRepositoryImpl$getPlusStateFlow$2.L$0 = obj;
        return plusStateRepositoryImpl$getPlusStateFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PlusStateRepositoryImpl$getPlusStateFlow$2 plusStateRepositoryImpl$getPlusStateFlow$2 = (PlusStateRepositoryImpl$getPlusStateFlow$2) create((kyy) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        plusStateRepositoryImpl$getPlusStateFlow$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kyy kyyVar = (kyy) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        rkd0 rkd0Var = this.this$0.g;
        LogPriority logPriority = LogPriority.DEBUG;
        if (rkd0Var.e(logPriority)) {
            rkd0Var.b(logPriority, "PlusStateRepositoryImpl", "getPlusStateFlow(): " + kyyVar, null);
        }
        return zy11.a;
    }
}
