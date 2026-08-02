package com.yandex.go.masstransit.sdk.ble.impl.fullscreen;

import defpackage.a36;
import defpackage.agd;
import defpackage.ml30;
import defpackage.mvg;
import defpackage.n26;
import defpackage.nk30;
import defpackage.ny61;
import defpackage.pk30;
import defpackage.tse;
import defpackage.wls;
import defpackage.xrr;
import defpackage.yfd;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.ble.impl.fullscreen.MtGeoPaymentFullscreenRouterImpl$content$1$1$1", f = "MtGeoPaymentFullscreenRouterImpl.kt", l = {HProv.ALG_SID_NO_HASH}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MtGeoPaymentFullscreenRouterImpl$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ ml30 $action;
    final /* synthetic */ yfd $this_buildContent;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtGeoPaymentFullscreenRouterImpl$content$1$1$1(d dVar, ml30 ml30Var, yfd yfdVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$action = ml30Var;
        this.$this_buildContent = yfdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtGeoPaymentFullscreenRouterImpl$content$1$1$1(this.this$0, this.$action, this.$this_buildContent, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtGeoPaymentFullscreenRouterImpl$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            xrr xrrVar = dVar.J;
            ml30 ml30Var = this.$action;
            pk30 pk30Var = dVar.N;
            tse o = dVar.o();
            Object obj2 = ((agd) this.$this_buildContent).a;
            n26 n26Var = ((nk30) obj2).a;
            a36 a36Var = ((nk30) obj2).b;
            this.label = 1;
            if (xrrVar.m(ml30Var, pk30Var, o, n26Var, a36Var, this) == coroutineSingletons) {
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
