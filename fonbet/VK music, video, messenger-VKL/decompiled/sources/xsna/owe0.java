package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: InternalSlider.kt */
@b6l(c = "com.vk.core.compose.component.internal.RangeSliderLogic$captureThumb$1", f = "InternalSlider.kt", l = {837}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class owe0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ boolean $draggingStart;
    final /* synthetic */ vax $interaction;
    int label;
    final /* synthetic */ pwe0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public owe0(pwe0 pwe0Var, boolean z, vax vaxVar, spj<? super owe0> spjVar) {
        super(2, spjVar);
        this.this$0 = pwe0Var;
        this.$draggingStart = z;
        this.$interaction = vaxVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new owe0(this.this$0, this.$draggingStart, this.$interaction, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((owe0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            pwe0 pwe0Var = this.this$0;
            sg50 sg50Var = this.$draggingStart ? pwe0Var.a : pwe0Var.b;
            vax vaxVar = this.$interaction;
            this.label = 1;
            if (sg50Var.a(vaxVar, this) == coroutineSingletons) {
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
