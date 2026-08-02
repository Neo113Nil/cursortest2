package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: InfiniteAnimationPolicy.kt */
@b6l(c = "androidx.compose.ui.platform.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", f = "InfiniteAnimationPolicy.kt", l = {66}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class uuw extends SuspendLambda implements izs<spj<Object>, Object> {
    final /* synthetic */ izs<Long, Object> $onFrame;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public uuw(izs<? super Long, Object> izsVar, spj<? super uuw> spjVar) {
        super(1, spjVar);
        this.$onFrame = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new uuw(this.$onFrame, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<Object> spjVar) {
        return ((uuw) create(spjVar)).invokeSuspend(s3q0.a);
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
        izs<Long, Object> izsVar = this.$onFrame;
        this.label = 1;
        Object k = i830.a(getContext()).k(izsVar, this);
        return k == coroutineSingletons ? coroutineSingletons : k;
    }
}
