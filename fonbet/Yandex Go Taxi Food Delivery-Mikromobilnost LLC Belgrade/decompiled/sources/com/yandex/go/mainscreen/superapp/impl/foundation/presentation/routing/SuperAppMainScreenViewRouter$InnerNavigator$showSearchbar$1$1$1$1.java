package com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing;

import com.yandex.go.dto.response.q1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o4w0;
import defpackage.t8w0;
import defpackage.tse;
import defpackage.u8w0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing.SuperAppMainScreenViewRouter$InnerNavigator$showSearchbar$1$1$1$1", f = "SuperAppMainScreenViewRouter.kt", l = {377}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SuperAppMainScreenViewRouter$InnerNavigator$showSearchbar$1$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ q1 $action;
    int label;
    final /* synthetic */ o4w0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppMainScreenViewRouter$InnerNavigator$showSearchbar$1$1$1$1(o4w0 o4w0Var, q1 q1Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = o4w0Var;
        this.$action = q1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppMainScreenViewRouter$InnerNavigator$showSearchbar$1$1$1$1(this.this$0, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppMainScreenViewRouter$InnerNavigator$showSearchbar$1$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            t8w0 t8w0Var = (t8w0) this.this$0.I.get();
            q1 q1Var = this.$action;
            this.label = 1;
            if (((u8w0) t8w0Var).a(q1Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
