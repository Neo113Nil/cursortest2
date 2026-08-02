package com.yandex.go.payments.transport.navigation;

import defpackage.mo21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.po21;
import defpackage.tje;
import defpackage.tse;
import defpackage.ur30;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.transport.navigation.MtPaymentSelectionRouterImpl$onLaunch$2", f = "MtPaymentSelectionRouterImpl.kt", l = {35}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class MtPaymentSelectionRouterImpl$onLaunch$2 extends SuspendLambda implements wls {
    final /* synthetic */ ur30 $payload;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtPaymentSelectionRouterImpl$onLaunch$2(ur30 ur30Var, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$payload = ur30Var;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MtPaymentSelectionRouterImpl$onLaunch$2 mtPaymentSelectionRouterImpl$onLaunch$2 = new MtPaymentSelectionRouterImpl$onLaunch$2(this.$payload, this.this$0, continuation);
        mtPaymentSelectionRouterImpl$onLaunch$2.L$0 = obj;
        return mtPaymentSelectionRouterImpl$onLaunch$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtPaymentSelectionRouterImpl$onLaunch$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.$payload.getClass();
            po21 po21Var = this.this$0.E;
            this.L$0 = tseVar;
            this.label = 1;
            obj = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).h(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        tje.N(this.this$0.o(), null, null, new MtPaymentSelectionRouterImpl$onLaunch$2$invokeSuspend$$inlined$safeCollectIn$1(this.this$0.F.c(((mo21) obj).a(), false), null, this.this$0, tseVar), 3);
        return zy11.a;
    }
}
