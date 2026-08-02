package com.yandex.passport.internal.ui.challenge.delete;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.challenge.delete.DeleteForeverViewModel$wishSloth$1", f = "DeleteForeverViewModel.kt", l = {HProv.PP_FAST_CODE}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class DeleteForeverViewModel$wishSloth$1 extends SuspendLambda implements wls {
    final /* synthetic */ q0 $slothWish;
    int label;
    final /* synthetic */ f1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteForeverViewModel$wishSloth$1(f1 f1Var, q0 q0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = f1Var;
        this.$slothWish = q0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeleteForeverViewModel$wishSloth$1(this.this$0, this.$slothWish, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeleteForeverViewModel$wishSloth$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            y0 y0Var = this.this$0.c;
            y0 y0Var2 = y0Var != null ? y0Var : null;
            q0 q0Var = this.$slothWish;
            this.label = 1;
            if (y0Var2.j(q0Var, this) == coroutineSingletons) {
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
