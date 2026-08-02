package com.yandex.go.taxi.summary.verticalsummary.interactor;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.ph31;
import defpackage.tje;
import defpackage.tse;
import defpackage.uio0;
import defpackage.vep0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.summary.solid.interactor.t;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.verticalsummary.interactor.ScreenStartInteractor$handleAction$2", f = "ScreenStartInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ScreenStartInteractor$handleAction$2 extends SuspendLambda implements wls {
    final /* synthetic */ ph31 $navigator;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ vep0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenStartInteractor$handleAction$2(vep0 vep0Var, ph31 ph31Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = vep0Var;
        this.$navigator = ph31Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScreenStartInteractor$handleAction$2 screenStartInteractor$handleAction$2 = new ScreenStartInteractor$handleAction$2(this.this$0, this.$navigator, continuation);
        screenStartInteractor$handleAction$2.L$0 = obj;
        return screenStartInteractor$handleAction$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ScreenStartInteractor$handleAction$2 screenStartInteractor$handleAction$2 = (ScreenStartInteractor$handleAction$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        screenStartInteractor$handleAction$2.invokeSuspend(zy11Var);
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
        this.this$0.a.a("VerticalSummary.Opened");
        tje.N(tseVar, null, null, new ScreenStartInteractor$handleAction$2$invokeSuspend$$inlined$safeCollectIn$1(this.this$0.e.b(), null, this.this$0, this.$navigator), 3);
        vep0 vep0Var = this.this$0;
        tje.N(tseVar, null, null, new ScreenStartInteractor$handleAction$2$invokeSuspend$$inlined$safeCollectIn$2(vep0Var.g.b, null, vep0Var), 3);
        uio0 uio0Var = this.this$0.h;
        tje.N(tseVar, null, null, new ScreenStartInteractor$handleAction$2$invokeSuspend$$inlined$safeCollectIn$3(new i(((t) uio0Var.a).a(), uio0Var), null, this.this$0), 3);
        return zy11.a;
    }
}
