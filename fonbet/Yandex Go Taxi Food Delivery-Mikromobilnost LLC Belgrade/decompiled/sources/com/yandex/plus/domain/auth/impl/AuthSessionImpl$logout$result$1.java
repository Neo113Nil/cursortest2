package com.yandex.plus.domain.auth.impl;

import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.c1d0;
import defpackage.e1d0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lzy11;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.domain.auth.impl.AuthSessionImpl$logout$result$1", f = "AuthSessionImpl.kt", l = {CalendarDayView.DISABLED_DAY_ALPHA}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AuthSessionImpl$logout$result$1 extends SuspendLambda implements wls {
    final /* synthetic */ c1d0 $params;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthSessionImpl$logout$result$1(a aVar, c1d0 c1d0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$params = c1d0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AuthSessionImpl$logout$result$1(this.this$0, this.$params, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AuthSessionImpl$logout$result$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            e1d0 e1d0Var = this.this$0.a;
            c1d0 c1d0Var = this.$params;
            this.label = 1;
            f = e1d0Var.f(c1d0Var, this);
            if (f == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            f = ((Result) obj).getValue();
        }
        return new Result(f);
    }
}
