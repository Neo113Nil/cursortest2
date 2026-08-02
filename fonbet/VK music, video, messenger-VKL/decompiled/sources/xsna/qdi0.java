package xsna;

import androidx.car.app.hardware.common.CarZone;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SelectionMagnifier.kt */
@b6l(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1", f = "SelectionMagnifier.kt", l = {CarZone.CAR_ZONE_COLUMN_PASSENGER}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class qdi0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ if2<ov70, tq2> $animatable;
    final /* synthetic */ long $targetValue;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qdi0(if2<ov70, tq2> if2Var, long j, spj<? super qdi0> spjVar) {
        super(2, spjVar);
        this.$animatable = if2Var;
        this.$targetValue = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new qdi0(this.$animatable, this.$targetValue, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((qdi0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if2<ov70, tq2> if2Var = this.$animatable;
            ov70 ov70Var = new ov70(this.$targetValue);
            xmk0<ov70> xmk0Var = sdi0.d;
            this.label = 1;
            if (if2.c(if2Var, ov70Var, xmk0Var, null, this, 12) == coroutineSingletons) {
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
