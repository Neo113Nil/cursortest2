package com.yandex.go.suggest.impl.router;

import defpackage.bm1;
import defpackage.hxx;
import defpackage.i9t0;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rdb;
import defpackage.rfw0;
import defpackage.sy60;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.suggest.impl.router.SuperappSuggestFlexModalViewRouter$InnerNavigator$openAiAssistant$2", f = "SuperappSuggestFlexModalViewRouter.kt", l = {368}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SuperappSuggestFlexModalViewRouter$InnerNavigator$openAiAssistant$2 extends SuspendLambda implements wls {
    final /* synthetic */ rdb $chatViewController;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappSuggestFlexModalViewRouter$InnerNavigator$openAiAssistant$2(d dVar, rdb rdbVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$chatViewController = rdbVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperappSuggestFlexModalViewRouter$InnerNavigator$openAiAssistant$2(this.this$0, this.$chatViewController, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperappSuggestFlexModalViewRouter$InnerNavigator$openAiAssistant$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        n0 n0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            rfw0 rfw0Var = this.this$0.e0;
            if (rfw0Var != null && (n0Var = (n0) rfw0Var.b) != null) {
                this.label = 1;
                obj = n0Var.emit(zy11Var, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            d dVar = this.this$0;
            dVar.E((m950) dVar.W.get(), new i9t0(new bm1(this.$chatViewController), null, null, 12), sy60.Q2, hxx.a);
            return zy11Var;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        d dVar2 = this.this$0;
        dVar2.E((m950) dVar2.W.get(), new i9t0(new bm1(this.$chatViewController), null, null, 12), sy60.Q2, hxx.a);
        return zy11Var;
    }
}
