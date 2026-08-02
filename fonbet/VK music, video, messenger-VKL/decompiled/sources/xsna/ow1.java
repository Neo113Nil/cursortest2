package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: TimePicker.kt */
@b6l(c = "androidx.compose.material3.AnalogTimePickerState$onGestureEnd$2", f = "TimePicker.kt", l = {804}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class ow1 extends SuspendLambda implements izs<spj<? super fq2<Float, sq2>>, Object> {
    final /* synthetic */ iq2<Float> $animationSpec;
    final /* synthetic */ float $end;
    int label;
    final /* synthetic */ qw1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow1(qw1 qw1Var, float f, iq2<Float> iq2Var, spj<? super ow1> spjVar) {
        super(1, spjVar);
        this.this$0 = qw1Var;
        this.$end = f;
        this.$animationSpec = iq2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new ow1(this.this$0, this.$end, this.$animationSpec, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super fq2<Float, sq2>> spjVar) {
        return ((ow1) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return obj;
        }
        kotlin.a.a(obj);
        if2<Float, sq2> if2Var = this.this$0.f;
        Float f = new Float(this.$end);
        iq2<Float> iq2Var = this.$animationSpec;
        this.label = 1;
        Object c = if2.c(if2Var, f, iq2Var, null, this, 12);
        return c == coroutineSingletons ? coroutineSingletons : c;
    }
}
