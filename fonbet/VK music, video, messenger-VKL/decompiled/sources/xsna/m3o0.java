package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: TapGestureDetector.kt */
@b6l(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$processTapGesture$7", f = "TapGestureDetector.kt", l = {188}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class m3o0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ yzs<j2d0, ov70, spj<? super s3q0>, Object> $onPress;
    final /* synthetic */ n2d0 $pressScope;
    final /* synthetic */ xlb0 $secondDown;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m3o0(yzs<? super j2d0, ? super ov70, ? super spj<? super s3q0>, ? extends Object> yzsVar, n2d0 n2d0Var, xlb0 xlb0Var, spj<? super m3o0> spjVar) {
        super(2, spjVar);
        this.$onPress = yzsVar;
        this.$pressScope = n2d0Var;
        this.$secondDown = xlb0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new m3o0(this.$onPress, this.$pressScope, this.$secondDown, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((m3o0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            yzs<j2d0, ov70, spj<? super s3q0>, Object> yzsVar = this.$onPress;
            n2d0 n2d0Var = this.$pressScope;
            ov70 ov70Var = new ov70(this.$secondDown.c);
            this.label = 1;
            if (yzsVar.invoke(n2d0Var, ov70Var, this) == coroutineSingletons) {
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
