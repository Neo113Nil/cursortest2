package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BookingStartScreen.kt */
@b6l(c = "com.vk.ecomm.onlinebooking.impl.main.presentation.BookingStartScreenKt$BookingStartScreen$2$1", f = "BookingStartScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class uz7 extends SuspendLambda implements yzs<z37<com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.a>, com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.d, spj<? super s3q0>, Object> {
    final /* synthetic */ izs<com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.d, s3q0> $onEvent;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public uz7(izs<? super com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.d, s3q0> izsVar, spj<? super uz7> spjVar) {
        super(3, spjVar);
        this.$onEvent = izsVar;
    }

    @Override // xsna.yzs
    public final Object invoke(z37<com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.a> z37Var, com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.d dVar, spj<? super s3q0> spjVar) {
        uz7 uz7Var = new uz7(this.$onEvent, spjVar);
        uz7Var.L$0 = dVar;
        return uz7Var.invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.d dVar = (com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.d) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.$onEvent.invoke(dVar);
        return s3q0.a;
    }
}
