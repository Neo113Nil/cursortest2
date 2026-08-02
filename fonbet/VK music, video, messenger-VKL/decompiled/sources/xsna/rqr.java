package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: FloatingActionButton.kt */
@b6l(c = "androidx.compose.material3.FloatingActionButtonElevation$animateElevation$1$1", f = "FloatingActionButton.kt", l = {641}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class rqr extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ xqr $animatable;
    int label;
    final /* synthetic */ uqr this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rqr(xqr xqrVar, uqr uqrVar, spj<? super rqr> spjVar) {
        super(2, spjVar);
        this.$animatable = xqrVar;
        this.this$0 = uqrVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new rqr(this.$animatable, this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((rqr) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            xqr xqrVar = this.$animatable;
            uqr uqrVar = this.this$0;
            float f = uqrVar.a;
            float f2 = uqrVar.b;
            float f3 = uqrVar.d;
            float f4 = uqrVar.c;
            this.label = 1;
            xqrVar.a = f;
            xqrVar.b = f2;
            xqrVar.c = f3;
            xqrVar.d = f4;
            Object b = xqrVar.b(this);
            if (b != coroutineSingletons) {
                b = s3q0.a;
            }
            if (b == coroutineSingletons) {
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
