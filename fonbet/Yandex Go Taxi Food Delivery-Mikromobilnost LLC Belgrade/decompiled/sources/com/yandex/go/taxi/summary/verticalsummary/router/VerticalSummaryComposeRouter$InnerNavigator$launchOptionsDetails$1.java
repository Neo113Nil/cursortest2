package com.yandex.go.taxi.summary.verticalsummary.router;

import defpackage.djx0;
import defpackage.eix0;
import defpackage.hwo0;
import defpackage.ih31;
import defpackage.jh31;
import defpackage.mvg;
import defpackage.n3w;
import defpackage.ny61;
import defpackage.p1j0;
import defpackage.rz2;
import defpackage.tls;
import defpackage.tse;
import defpackage.viv0;
import defpackage.w0g;
import defpackage.wiq0;
import defpackage.wls;
import defpackage.xvf0;
import defpackage.zix0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.verticalsummary.router.VerticalSummaryComposeRouter$InnerNavigator$launchOptionsDetails$1", f = "VerticalSummaryComposeRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class VerticalSummaryComposeRouter$InnerNavigator$launchOptionsDetails$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $onClosed;
    final /* synthetic */ zix0 $payload;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalSummaryComposeRouter$InnerNavigator$launchOptionsDetails$1(d dVar, zix0 zix0Var, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$payload = zix0Var;
        this.$onClosed = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VerticalSummaryComposeRouter$InnerNavigator$launchOptionsDetails$1(this.this$0, this.$payload, this.$onClosed, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        VerticalSummaryComposeRouter$InnerNavigator$launchOptionsDetails$1 verticalSummaryComposeRouter$InnerNavigator$launchOptionsDetails$1 = (VerticalSummaryComposeRouter$InnerNavigator$launchOptionsDetails$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        verticalSummaryComposeRouter$InnerNavigator$launchOptionsDetails$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        com.yandex.go.common.a aVar = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.go.common.a aVar2 = this.this$0.K0;
        if (aVar2 != null && aVar2.u()) {
            aVar = aVar2;
        }
        zy11 zy11Var = zy11.a;
        if (aVar != null) {
            this.$payload.getClass();
            return zy11Var;
        }
        ih31 ih31Var = new ih31(this.$onClosed);
        d dVar = this.this$0;
        djx0 djx0Var = dVar.b0;
        jh31 jh31Var = new jh31(dVar, ih31Var);
        hwo0 hwo0Var = djx0Var.a;
        com.yandex.go.common.a aVar3 = new com.yandex.go.common.a((wiq0) ((w0g) hwo0Var.b).get(), (rz2) hwo0Var.c, (viv0) ((xvf0) hwo0Var.w).get(), (eix0) ((n3w) hwo0Var.x).a, jh31Var);
        d dVar2 = this.this$0;
        dVar2.K0 = aVar3;
        dVar2.B(aVar3, this.$payload, ih31Var, p1j0.a);
        return zy11Var;
    }
}
