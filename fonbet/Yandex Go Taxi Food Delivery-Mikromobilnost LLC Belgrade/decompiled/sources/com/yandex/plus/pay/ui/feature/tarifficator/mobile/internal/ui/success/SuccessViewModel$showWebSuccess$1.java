package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success;

import defpackage.b4v0;
import defpackage.c4v0;
import defpackage.ind0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.x3v0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.SuccessViewModel$showWebSuccess$1", f = "SuccessViewModel.kt", l = {103}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SuccessViewModel$showWebSuccess$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuccessViewModel$showWebSuccess$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuccessViewModel$showWebSuccess$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuccessViewModel$showWebSuccess$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ind0 a = this.this$0.b.a.a();
            c4v0 c4v0Var = this.this$0.w;
            this.L$0 = null;
            this.label = 1;
            obj = ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.success.a) c4v0Var).a(a, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        b4v0 b4v0Var = (b4v0) obj;
        b bVar = this.this$0;
        if (b4v0Var != null) {
            bVar.getClass();
            r0 r0Var = bVar.C;
            x3v0 x3v0Var = new x3v0(b4v0Var.a, b4v0Var.c, b4v0Var.b);
            r0Var.getClass();
            r0Var.m(null, x3v0Var);
        } else {
            bVar.X();
        }
        return zy11.a;
    }
}
