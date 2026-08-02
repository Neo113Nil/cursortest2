package com.yandex.plus.home.ybsdk;

import com.yandex.plus.log.api.LogPriority;
import defpackage.fqd0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rkd0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfqd0;", "it", "Lzy11;", "<anonymous>", "(Lfqd0;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.ybsdk.TreasuryAdapterProxy$eventsFlow$2", f = "TreasuryAdapterProxy.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TreasuryAdapterProxy$eventsFlow$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TreasuryAdapterProxy$eventsFlow$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TreasuryAdapterProxy$eventsFlow$2 treasuryAdapterProxy$eventsFlow$2 = new TreasuryAdapterProxy$eventsFlow$2(this.this$0, continuation);
        treasuryAdapterProxy$eventsFlow$2.L$0 = obj;
        return treasuryAdapterProxy$eventsFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TreasuryAdapterProxy$eventsFlow$2 treasuryAdapterProxy$eventsFlow$2 = (TreasuryAdapterProxy$eventsFlow$2) create((fqd0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        treasuryAdapterProxy$eventsFlow$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        fqd0 fqd0Var = (fqd0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        rkd0 rkd0Var = this.this$0.c;
        LogPriority logPriority = LogPriority.INFO;
        if (rkd0Var.e(logPriority)) {
            rkd0Var.b(logPriority, "TreasuryAdapterProxy", "collect event=" + fqd0Var, null);
        }
        return zy11.a;
    }
}
