package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: DirectedScrollSpanBehavior.kt */
@b6l(c = "com.vk.music.playlist.framework.presentation.DirectedScrollSpanBehaviorKt$createDirectedScrollSpanBehavior$2$1", f = "DirectedScrollSpanBehavior.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class tzm extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ y6p0 $state;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: DirectedScrollSpanBehavior.kt */
    @b6l(c = "com.vk.music.playlist.framework.presentation.DirectedScrollSpanBehaviorKt$createDirectedScrollSpanBehavior$2$1$1", f = "DirectedScrollSpanBehavior.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ y6p0 $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y6p0 y6p0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$state = y6p0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$state, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            y6p0 y6p0Var = this.$state;
            y6p0Var.c(y6p0Var.a() < 0.5f ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : this.$state.a);
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tzm(y6p0 y6p0Var, spj<? super tzm> spjVar) {
        super(2, spjVar);
        this.$state = y6p0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        tzm tzmVar = new tzm(this.$state, spjVar);
        tzmVar.L$0 = obj;
        return tzmVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((tzm) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        myc0.h(yvjVar, null, null, new a(this.$state, null), 3);
        return s3q0.a;
    }
}
