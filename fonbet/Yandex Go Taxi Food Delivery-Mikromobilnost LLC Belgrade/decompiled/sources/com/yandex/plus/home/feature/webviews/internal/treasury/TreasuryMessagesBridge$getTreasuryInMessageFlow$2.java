package com.yandex.plus.home.feature.webviews.internal.treasury;

import com.yandex.plus.core.analytics.logging.PlusLogTag;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qnv;
import defpackage.skd0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqnv;", "it", "Lzy11;", "<anonymous>", "(Lqnv;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.feature.webviews.internal.treasury.TreasuryMessagesBridge$getTreasuryInMessageFlow$2", f = "TreasuryMessagesBridge.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TreasuryMessagesBridge$getTreasuryInMessageFlow$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TreasuryMessagesBridge$getTreasuryInMessageFlow$2 treasuryMessagesBridge$getTreasuryInMessageFlow$2 = new TreasuryMessagesBridge$getTreasuryInMessageFlow$2(2, continuation);
        treasuryMessagesBridge$getTreasuryInMessageFlow$2.L$0 = obj;
        return treasuryMessagesBridge$getTreasuryInMessageFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TreasuryMessagesBridge$getTreasuryInMessageFlow$2 treasuryMessagesBridge$getTreasuryInMessageFlow$2 = (TreasuryMessagesBridge$getTreasuryInMessageFlow$2) create((qnv) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        treasuryMessagesBridge$getTreasuryInMessageFlow$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        qnv qnvVar = (qnv) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        skd0.b(PlusLogTag.TREASURY, "treasuryAdapter.eventsFlow.onEach(inMessage=" + qnvVar + ')');
        return zy11.a;
    }
}
