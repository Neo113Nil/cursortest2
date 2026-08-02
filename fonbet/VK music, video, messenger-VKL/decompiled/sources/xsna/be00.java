package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MainContent.kt */
@b6l(c = "com.vk.clips.coauthors.selector.ui.MainContentKt$createDirectedScrollSpanBehavior$2$1", f = "MainContent.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class be00 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ x6p0 $state;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: MainContent.kt */
    @b6l(c = "com.vk.clips.coauthors.selector.ui.MainContentKt$createDirectedScrollSpanBehavior$2$1$1", f = "MainContent.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ x6p0 $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x6p0 x6p0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$state = x6p0Var;
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
            x6p0 x6p0Var = this.$state;
            x6p0Var.e(x6p0Var.a() < 0.5f ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : this.$state.c());
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be00(x6p0 x6p0Var, spj<? super be00> spjVar) {
        super(2, spjVar);
        this.$state = x6p0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        be00 be00Var = new be00(this.$state, spjVar);
        be00Var.L$0 = obj;
        return be00Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((be00) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
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
