package com.yandex.go.safety.center.safetycenter_web.ui.error;

import defpackage.bvf0;
import defpackage.ful0;
import defpackage.mvg;
import defpackage.nul0;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lqul0;", "<anonymous>", "(Ltse;)Lqul0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.safety.center.safetycenter_web.ui.error.SafetyCenterWebErrorViewPresenter$attachView$1$uiState$1", f = "SafetyCenterWebErrorViewPresenter.kt", l = {28}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SafetyCenterWebErrorViewPresenter$attachView$1$uiState$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ nul0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyCenterWebErrorViewPresenter$attachView$1$uiState$1(nul0 nul0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nul0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SafetyCenterWebErrorViewPresenter$attachView$1$uiState$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SafetyCenterWebErrorViewPresenter$attachView$1$uiState$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        nul0 nul0Var = this.this$0;
        a aVar = nul0Var.B;
        ful0 ful0Var = nul0Var.x;
        this.label = 1;
        aVar.getClass();
        Object n = bvf0.n(new SafetyCenterWebErrorViewUiStateFactory$createUiState$2(ful0Var, aVar, null), this);
        return n == coroutineSingletons ? coroutineSingletons : n;
    }
}
