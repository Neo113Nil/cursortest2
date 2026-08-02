package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Scrollable.kt */
@b6l(c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$2", f = "Scrollable.kt", l = {610}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class jhh0 extends SuspendLambda implements wzs<ov70, spj<? super ov70>, Object> {
    /* synthetic */ long J$0;
    int label;
    final /* synthetic */ androidx.compose.foundation.gestures.l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jhh0(androidx.compose.foundation.gestures.l lVar, spj<? super jhh0> spjVar) {
        super(2, spjVar);
        this.this$0 = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        jhh0 jhh0Var = new jhh0(this.this$0, spjVar);
        jhh0Var.J$0 = ((ov70) obj).a;
        return jhh0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(ov70 ov70Var, spj<? super ov70> spjVar) {
        long j = ov70Var.a;
        jhh0 jhh0Var = new jhh0(this.this$0, spjVar);
        jhh0Var.J$0 = j;
        return jhh0Var.invokeSuspend(s3q0.a);
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
        long j = this.J$0;
        zhh0 zhh0Var = this.this$0.O;
        this.label = 1;
        Object a = ahh0.a(zhh0Var, j, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
