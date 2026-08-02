package xsna;

import com.vk.core.tool.compose.onboarding.VkFullscreenOnboardingKt$Pager$1$1$1$invokeSuspend$$inlined$filter$1$2;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VkFullscreenOnboarding.kt */
@b6l(c = "com.vk.core.tool.compose.onboarding.VkFullscreenOnboardingKt$Pager$1$1$1", f = "VkFullscreenOnboarding.kt", l = {102}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class nwu0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ int $currentPage;
    final /* synthetic */ jys $scope;
    final /* synthetic */ oys $stepScope;
    int label;

    /* compiled from: VkFullscreenOnboarding.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ jys b;

        public a(jys jysVar) {
            this.b = jysVar;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            Boolean bool = (Boolean) ((Pair) obj).j();
            bool.booleanValue();
            ((zak0) this.b.d).setValue(bool);
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwu0(jys jysVar, oys oysVar, int i, spj<? super nwu0> spjVar) {
        super(2, spjVar);
        this.$scope = jysVar;
        this.$stepScope = oysVar;
        this.$currentPage = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new nwu0(this.$scope, this.$stepScope, this.$currentPage, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((nwu0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            izg0 M = nr2.M(new dpx0(1, this.$scope, this.$stepScope));
            int i2 = this.$currentPage;
            a aVar = new a(this.$scope);
            this.label = 1;
            Object collect = M.collect(new VkFullscreenOnboardingKt$Pager$1$1$1$invokeSuspend$$inlined$filter$1$2(aVar, i2), this);
            if (collect != coroutineSingletons) {
                collect = s3q0.a;
            }
            if (collect == coroutineSingletons) {
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
