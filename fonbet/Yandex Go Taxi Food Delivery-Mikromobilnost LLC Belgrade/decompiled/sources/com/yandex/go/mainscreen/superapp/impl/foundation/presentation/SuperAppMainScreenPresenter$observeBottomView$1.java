package com.yandex.go.mainscreen.superapp.impl.foundation.presentation;

import defpackage.l900;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o900;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "isSplashClosed", "Lo900;", "feedBottomView", "<anonymous>", "(ZLo900;)Lo900;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.impl.foundation.presentation.SuperAppMainScreenPresenter$observeBottomView$1", f = "SuperAppMainScreenPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class SuperAppMainScreenPresenter$observeBottomView$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        SuperAppMainScreenPresenter$observeBottomView$1 superAppMainScreenPresenter$observeBottomView$1 = new SuperAppMainScreenPresenter$observeBottomView$1(3, (Continuation) obj3);
        superAppMainScreenPresenter$observeBottomView$1.Z$0 = booleanValue;
        superAppMainScreenPresenter$observeBottomView$1.L$0 = (o900) obj2;
        return superAppMainScreenPresenter$observeBottomView$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        o900 o900Var = (o900) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return z ? o900Var : l900.a;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
