package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.xb30;

/* compiled from: MouseWheelScrollingLogic.kt */
@b6l(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2", f = "MouseWheelScrollingLogic.kt", l = {201}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class cc30 extends SuspendLambda implements wzs<yvj, spj<? super xb30.a>, Object> {
    int label;
    final /* synthetic */ xb30 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc30(xb30 xb30Var, spj<? super cc30> spjVar) {
        super(2, spjVar);
        this.this$0 = xb30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new cc30(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super xb30.a> spjVar) {
        return ((cc30) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
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
        nm8 nm8Var = this.this$0.g;
        this.label = 1;
        Object d = zvj.d(new k670(nm8Var, null), this);
        return d == coroutineSingletons ? coroutineSingletons : d;
    }
}
