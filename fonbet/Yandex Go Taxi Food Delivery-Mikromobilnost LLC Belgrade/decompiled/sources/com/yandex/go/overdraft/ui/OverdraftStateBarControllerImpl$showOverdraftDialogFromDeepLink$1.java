package com.yandex.go.overdraft.ui;

import com.yandex.go.overdraft.api.domain.model.OverdraftContext;
import defpackage.h0a0;
import defpackage.hxx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pep0;
import defpackage.pz80;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.overdraft.ui.OverdraftStateBarControllerImpl$showOverdraftDialogFromDeepLink$1", f = "OverdraftStateBarControllerImpl.kt", l = {152}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OverdraftStateBarControllerImpl$showOverdraftDialogFromDeepLink$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverdraftStateBarControllerImpl$showOverdraftDialogFromDeepLink$1(g gVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OverdraftStateBarControllerImpl$showOverdraftDialogFromDeepLink$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OverdraftStateBarControllerImpl$showOverdraftDialogFromDeepLink$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OverdraftContext overdraftContext;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ((com.yandex.go.overdraft.domain.g) this.this$0.p.get()).f();
            OverdraftContext overdraftContext2 = OverdraftContext.MAIN_SCREEN;
            g gVar = this.this$0;
            this.L$0 = overdraftContext2;
            this.label = 1;
            Object h = g.h(gVar, this);
            if (h == coroutineSingletons) {
                return coroutineSingletons;
            }
            overdraftContext = overdraftContext2;
            obj = h;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            overdraftContext = (OverdraftContext) this.L$0;
            kotlin.b.b(obj);
        }
        pz80 pz80Var = new pz80(overdraftContext, null, (h0a0) obj);
        g gVar2 = this.this$0;
        ((pep0) gVar2.w).f(gVar2.v, pz80Var, hxx.a);
        return zy11.a;
    }
}
