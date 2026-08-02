package com.yandex.go.rida.bids.interactor;

import defpackage.bgc;
import defpackage.c29;
import defpackage.h0w;
import defpackage.mvg;
import defpackage.np5;
import defpackage.ny61;
import defpackage.th40;
import defpackage.tls;
import defpackage.xq5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.object.DriveState;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.rida.bids.interactor.BidsCancelOrderInteractor$onCancelOrderClick$4", f = "BidsCancelOrderInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class BidsCancelOrderInteractor$onCancelOrderClick$4 extends SuspendLambda implements tls {
    final /* synthetic */ xq5 $navigator;
    int label;
    final /* synthetic */ np5 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BidsCancelOrderInteractor$onCancelOrderClick$4(np5 np5Var, xq5 xq5Var, Continuation continuation) {
        super(1, continuation);
        this.this$0 = np5Var;
        this.$navigator = xq5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new BidsCancelOrderInteractor$onCancelOrderClick$4(this.this$0, this.$navigator, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        BidsCancelOrderInteractor$onCancelOrderClick$4 bidsCancelOrderInteractor$onCancelOrderClick$4 = (BidsCancelOrderInteractor$onCancelOrderClick$4) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        bidsCancelOrderInteractor$onCancelOrderClick$4.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        np5 np5Var = this.this$0;
        xq5 xq5Var = this.$navigator;
        c29 c29Var = np5Var.d;
        DriveState driveState = np5Var.b.b().h.b;
        h0w h0wVar = new h0w(28, xq5Var, np5Var);
        com.yandex.go.taxi.order.controller.a aVar = (com.yandex.go.taxi.order.controller.a) c29Var.b;
        aVar.c(new bgc(12), new th40(6, aVar, driveState, h0wVar));
        return zy11.a;
    }
}
