package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BookingEditMultiLineInput.kt */
@b6l(c = "com.vk.ecomm.onlinebooking.impl.edit.ui.BookingEditMultiLineInputImpl$MutableContent$1$2$1$1", f = "BookingEditMultiLineInput.kt", l = {166}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class ep7 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ gp7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ep7(gp7 gp7Var, spj<? super ep7> spjVar) {
        super(2, spjVar);
        this.this$0 = gp7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ep7(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ep7) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            bd8 bd8Var = this.this$0.g;
            this.label = 1;
            if (bd8Var.a(null, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
