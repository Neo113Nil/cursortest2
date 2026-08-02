package com.ybsdk.utils.poller;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q2e0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n"}, d2 = {"T", "it", "Ls2e0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.utils.poller.PollerFactoryImpl$createSimplePoller$1", f = "PollerFactoryImpl.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PollerFactoryImpl$createSimplePoller$1 extends SuspendLambda implements wls {
    final /* synthetic */ wls $isTerminating;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollerFactoryImpl$createSimplePoller$1(wls wlsVar, Continuation continuation) {
        super(2, continuation);
        this.$isTerminating = wlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PollerFactoryImpl$createSimplePoller$1 pollerFactoryImpl$createSimplePoller$1 = new PollerFactoryImpl$createSimplePoller$1(this.$isTerminating, continuation);
        pollerFactoryImpl$createSimplePoller$1.L$0 = obj;
        return pollerFactoryImpl$createSimplePoller$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PollerFactoryImpl$createSimplePoller$1) create(obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Object obj3 = this.L$0;
            wls wlsVar = this.$isTerminating;
            this.L$0 = obj3;
            this.label = 1;
            Object invoke = wlsVar.invoke(obj3, this);
            if (invoke == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = invoke;
            obj2 = obj3;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj2 = this.L$0;
            kotlin.b.b(obj);
        }
        return new q2e0(obj2, ((Boolean) obj).booleanValue());
    }
}
