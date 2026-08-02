package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ModalBottomSheet.kt */
@b6l(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$2$1$1$3$1", f = "ModalBottomSheet.kt", l = {420}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class ox20 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ gdj0 $this_with;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ox20(gdj0 gdj0Var, spj<? super ox20> spjVar) {
        super(2, spjVar);
        this.$this_with = gdj0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ox20(this.$this_with, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ox20) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            gdj0 gdj0Var = this.$this_with;
            this.label = 1;
            if (gdj0Var.e(this) == coroutineSingletons) {
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
