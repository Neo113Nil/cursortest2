package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.d5r0;

/* compiled from: UxPolls.kt */
@b6l(c = "com.vk.uxpolls.framework.UxPolls$interacted$1", f = "UxPolls.kt", l = {160}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class k4r0 extends SuspendLambda implements wzs<yvj, spj<? super Boolean>, Object> {
    final /* synthetic */ d5r0.a $params;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4r0(d5r0.a aVar, spj<? super k4r0> spjVar) {
        super(2, spjVar);
        this.$params = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new k4r0(this.$params, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Boolean> spjVar) {
        return ((k4r0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
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
        asl b = ((d5r0) l4r0.g.getValue()).b(l4r0.c, this.$params);
        this.label = 1;
        Object J = b.J(this);
        return J == coroutineSingletons ? coroutineSingletons : J;
    }
}
