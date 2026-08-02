package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BookingRecordCompletedScreen.kt */
@b6l(c = "com.vk.ecomm.onlinebooking.impl.completed.pesentation.BookingRecordCompletedScreenKt$BookingRecordCompletedScreen$2$1", f = "BookingRecordCompletedScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class eu7 extends SuspendLambda implements yzs<z37<nt7>, qt7, spj<? super s3q0>, Object> {
    final /* synthetic */ izs<qt7, s3q0> $onEvent;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public eu7(izs<? super qt7, s3q0> izsVar, spj<? super eu7> spjVar) {
        super(3, spjVar);
        this.$onEvent = izsVar;
    }

    @Override // xsna.yzs
    public final Object invoke(z37<nt7> z37Var, qt7 qt7Var, spj<? super s3q0> spjVar) {
        eu7 eu7Var = new eu7(this.$onEvent, spjVar);
        eu7Var.L$0 = qt7Var;
        return eu7Var.invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        qt7 qt7Var = (qt7) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.$onEvent.invoke(qt7Var);
        return s3q0.a;
    }
}
