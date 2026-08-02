package com.yandex.go.call_order_fallback;

import defpackage.agd;
import defpackage.aj7;
import defpackage.co40;
import defpackage.lj7;
import defpackage.mj7;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oj7;
import defpackage.pj7;
import defpackage.qj7;
import defpackage.qu;
import defpackage.rj7;
import defpackage.sj7;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.yfd;
import defpackage.yi7;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.call_order_fallback.CallOrderFallbackRouter$content$1$1$1", f = "CallOrderFallbackRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class CallOrderFallbackRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ rj7 $action;
    final /* synthetic */ sj7 $callOrderFallbackUiActionInteractor;
    final /* synthetic */ mj7 $innerNavigator;
    final /* synthetic */ yfd $this_buildContent;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallOrderFallbackRouter$content$1$1$1(sj7 sj7Var, rj7 rj7Var, yfd yfdVar, mj7 mj7Var, Continuation continuation) {
        super(2, continuation);
        this.$callOrderFallbackUiActionInteractor = sj7Var;
        this.$action = rj7Var;
        this.$this_buildContent = yfdVar;
        this.$innerNavigator = mj7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CallOrderFallbackRouter$content$1$1$1(this.$callOrderFallbackUiActionInteractor, this.$action, this.$this_buildContent, this.$innerNavigator, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        CallOrderFallbackRouter$content$1$1$1 callOrderFallbackRouter$content$1$1$1 = (CallOrderFallbackRouter$content$1$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        callOrderFallbackRouter$content$1$1$1.invokeSuspend(zy11Var);
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
        sj7 sj7Var = this.$callOrderFallbackUiActionInteractor;
        rj7 rj7Var = this.$action;
        lj7 lj7Var = (lj7) ((agd) this.$this_buildContent).a;
        mj7 mj7Var = this.$innerNavigator;
        com.yandex.go.call_order_fallback.analytics.a aVar = sj7Var.a;
        if (rj7Var instanceof qj7) {
            co40 co40Var = aVar.a;
            co40Var.getClass();
            co40Var.a.a("TaxiFallbackCallOrderModal.Shown", new HashMap(), 1, new HashMap());
        } else if (rj7Var instanceof pj7) {
            aVar.b();
            mj7Var.a.r(new qu(9));
        } else {
            if (!(rj7Var instanceof oj7)) {
                w511.b();
                return null;
            }
            co40 co40Var2 = aVar.a;
            co40Var2.getClass();
            co40Var2.a.a("TaxiFallbackCallOrderModal.CallButtonTapped", new HashMap(), 1, new HashMap());
            ((aj7) ((yi7) sj7Var.b.get())).b(lj7Var.d, true);
        }
        return zy11.a;
    }
}
