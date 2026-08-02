package com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.o4w0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/go/flex/main_screen/api/domain/SuperappTopPlaqueType;", "<anonymous>", "(Ltse;)Lcom/yandex/go/flex/main_screen/api/domain/SuperappTopPlaqueType;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing.SuperAppMainScreenViewRouter$provideModalViewInstance$1", f = "SuperAppMainScreenViewRouter.kt", l = {181}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class SuperAppMainScreenViewRouter$provideModalViewInstance$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ o4w0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppMainScreenViewRouter$provideModalViewInstance$1(o4w0 o4w0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = o4w0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppMainScreenViewRouter$provideModalViewInstance$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppMainScreenViewRouter$provideModalViewInstance$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.go.flex.main_screen.domain.h hVar = this.this$0.J;
        this.label = 1;
        Enum a = hVar.a(this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
