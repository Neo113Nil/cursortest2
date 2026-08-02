package com.yandex.go.chargers;

import com.yandex.messaging.domain.poll.PollMessageDraft;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.psa;
import defpackage.tse;
import defpackage.wls;
import defpackage.zoa;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.ChargersRouterImpl$onLaunch$1$1", f = "ChargersRouterImpl.kt", l = {PollMessageDraft.MAX_ANSWER_LENGTH}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersRouterImpl$onLaunch$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ zoa $chargersDetailsMapActionListener;
    final /* synthetic */ psa $it;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersRouterImpl$onLaunch$1$1(zoa zoaVar, psa psaVar, Continuation continuation) {
        super(2, continuation);
        this.$chargersDetailsMapActionListener = zoaVar;
        this.$it = psaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersRouterImpl$onLaunch$1$1(this.$chargersDetailsMapActionListener, this.$it, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersRouterImpl$onLaunch$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        zoa zoaVar = this.$chargersDetailsMapActionListener;
        psa psaVar = this.$it;
        this.label = 1;
        zoaVar.a(psaVar);
        return zy11Var == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
