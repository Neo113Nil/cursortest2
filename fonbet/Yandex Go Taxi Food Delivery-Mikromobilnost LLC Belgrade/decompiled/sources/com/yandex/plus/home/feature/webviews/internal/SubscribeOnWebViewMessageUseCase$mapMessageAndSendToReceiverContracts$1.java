package com.yandex.plus.home.feature.webviews.internal;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p9g0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lxlv;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.feature.webviews.internal.SubscribeOnWebViewMessageUseCase$mapMessageAndSendToReceiverContracts$1", f = "SubscribeOnWebViewMessageUseCase.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SubscribeOnWebViewMessageUseCase$mapMessageAndSendToReceiverContracts$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $screenId;
    final /* synthetic */ tpr $this_mapMessageAndSendToReceiverContracts;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscribeOnWebViewMessageUseCase$mapMessageAndSendToReceiverContracts$1(tpr tprVar, String str, Continuation continuation) {
        super(2, continuation);
        this.$this_mapMessageAndSendToReceiverContracts = tprVar;
        this.$screenId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SubscribeOnWebViewMessageUseCase$mapMessageAndSendToReceiverContracts$1 subscribeOnWebViewMessageUseCase$mapMessageAndSendToReceiverContracts$1 = new SubscribeOnWebViewMessageUseCase$mapMessageAndSendToReceiverContracts$1(this.$this_mapMessageAndSendToReceiverContracts, this.$screenId, continuation);
        subscribeOnWebViewMessageUseCase$mapMessageAndSendToReceiverContracts$1.L$0 = obj;
        return subscribeOnWebViewMessageUseCase$mapMessageAndSendToReceiverContracts$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SubscribeOnWebViewMessageUseCase$mapMessageAndSendToReceiverContracts$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr tprVar = this.$this_mapMessageAndSendToReceiverContracts;
            p9g0 p9g0Var = new p9g0(18, this.$screenId, vprVar);
            this.L$0 = null;
            this.label = 1;
            if (tprVar.collect(p9g0Var, this) == coroutineSingletons) {
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
