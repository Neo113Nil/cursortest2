package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;

/* compiled from: ScrollExtensions.kt */
@b6l(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2", f = "ScrollExtensions.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class hfh0 extends SuspendLambda implements wzs<ggh0, spj<? super s3q0>, Object> {
    final /* synthetic */ Ref$FloatRef $consumed;
    final /* synthetic */ float $value;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hfh0(Ref$FloatRef ref$FloatRef, float f, spj<? super hfh0> spjVar) {
        super(2, spjVar);
        this.$consumed = ref$FloatRef;
        this.$value = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        hfh0 hfh0Var = new hfh0(this.$consumed, this.$value, spjVar);
        hfh0Var.L$0 = obj;
        return hfh0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(ggh0 ggh0Var, spj<? super s3q0> spjVar) {
        return ((hfh0) create(ggh0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        ggh0 ggh0Var = (ggh0) this.L$0;
        this.$consumed.element = ggh0Var.f(this.$value);
        return s3q0.a;
    }
}
