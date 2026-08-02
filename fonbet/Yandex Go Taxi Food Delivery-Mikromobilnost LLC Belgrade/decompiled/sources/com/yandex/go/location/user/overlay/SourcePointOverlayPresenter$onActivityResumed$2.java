package com.yandex.go.location.user.overlay;

import defpackage.gh00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wgt0;
import defpackage.wls;
import defpackage.ygt0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.location.user.overlay.SourcePointOverlayPresenter$onActivityResumed$2", f = "SourcePointOverlayPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SourcePointOverlayPresenter$onActivityResumed$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ygt0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourcePointOverlayPresenter$onActivityResumed$2(ygt0 ygt0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ygt0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SourcePointOverlayPresenter$onActivityResumed$2 sourcePointOverlayPresenter$onActivityResumed$2 = new SourcePointOverlayPresenter$onActivityResumed$2(this.this$0, continuation);
        sourcePointOverlayPresenter$onActivityResumed$2.L$0 = obj;
        return sourcePointOverlayPresenter$onActivityResumed$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SourcePointOverlayPresenter$onActivityResumed$2 sourcePointOverlayPresenter$onActivityResumed$2 = (SourcePointOverlayPresenter$onActivityResumed$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        sourcePointOverlayPresenter$onActivityResumed$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.Kg();
        tje.N(tseVar, null, null, new SourcePointOverlayPresenter$onActivityResumed$2$invokeSuspend$$inlined$safeCollectIn$1(d.a(this.this$0.A), null, this.this$0), 3);
        tje.N(tseVar, null, null, new SourcePointOverlayPresenter$onActivityResumed$2$invokeSuspend$$inlined$safeCollectIn$2(this.this$0.B.a(), null, this.this$0), 3);
        tje.N(tseVar, null, null, new SourcePointOverlayPresenter$onActivityResumed$2$invokeSuspend$$inlined$safeCollectIn$3(this.this$0.C.a(), null, this.this$0), 3);
        ygt0 ygt0Var = this.this$0;
        tje.N(tseVar, null, null, new SourcePointOverlayPresenter$onActivityResumed$2$invokeSuspend$$inlined$safeCollectIn$4(ygt0Var.E.b, null, ygt0Var), 3);
        ygt0 ygt0Var2 = this.this$0;
        tje.N(tseVar, null, null, new SourcePointOverlayPresenter$onActivityResumed$2$invokeSuspend$$inlined$safeCollectIn$5(ygt0Var2.F.a, null, ygt0Var2), 3);
        ygt0 ygt0Var3 = this.this$0;
        ((gh00) ygt0Var3.z).e(ygt0Var3.K);
        ((wgt0) this.this$0.Dg()).resume();
        return zy11.a;
    }
}
