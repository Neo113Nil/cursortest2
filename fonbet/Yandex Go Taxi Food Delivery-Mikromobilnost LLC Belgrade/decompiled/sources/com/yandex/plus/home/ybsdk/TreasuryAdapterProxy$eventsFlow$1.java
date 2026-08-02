package com.yandex.plus.home.ybsdk;

import defpackage.gqd0;
import defpackage.hqd0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Lfqd0;", "", "throwable", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.ybsdk.TreasuryAdapterProxy$eventsFlow$1", f = "TreasuryAdapterProxy.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TreasuryAdapterProxy$eventsFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TreasuryAdapterProxy$eventsFlow$1 treasuryAdapterProxy$eventsFlow$1 = new TreasuryAdapterProxy$eventsFlow$1(3, (Continuation) obj3);
        treasuryAdapterProxy$eventsFlow$1.L$0 = (Throwable) obj2;
        zy11 zy11Var = zy11.a;
        treasuryAdapterProxy$eventsFlow$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th = (Throwable) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        new hqd0(Collections.singletonList(new gqd0(th, null)));
        return zy11.a;
    }
}
