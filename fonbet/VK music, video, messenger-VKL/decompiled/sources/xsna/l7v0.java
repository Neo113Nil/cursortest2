package xsna;

import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.us2;

/* compiled from: VkOnboardingBanner.kt */
@b6l(c = "com.vk.core.tool.compose.onboarding.VkOnboardingBannerKt$BannerBody$1$1", f = "VkOnboardingBanner.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class l7v0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wh50<us2> $annotatedTitle$delegate;
    final /* synthetic */ long $blackColor;
    final /* synthetic */ VkOnboarding$TintColor $color;
    final /* synthetic */ l5g $highlightedTextColor;
    final /* synthetic */ v5v $highlightedTextInfo;
    final /* synthetic */ boolean $isLightTheme;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7v0(v5v v5vVar, l5g l5gVar, boolean z, VkOnboarding$TintColor vkOnboarding$TintColor, long j, wh50<us2> wh50Var, spj<? super l7v0> spjVar) {
        super(2, spjVar);
        this.$highlightedTextInfo = v5vVar;
        this.$highlightedTextColor = l5gVar;
        this.$isLightTheme = z;
        this.$color = vkOnboarding$TintColor;
        this.$blackColor = j;
        this.$annotatedTitle$delegate = wh50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new l7v0(this.$highlightedTextInfo, this.$highlightedTextColor, this.$isLightTheme, this.$color, this.$blackColor, this.$annotatedTitle$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((l7v0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0039, code lost:
    
        if (r3.j().intValue() >= 1) goto L10;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        wh50<us2> wh50Var = this.$annotatedTitle$delegate;
        us2.b bVar = new us2.b(this.$highlightedTextInfo.a);
        v5v v5vVar = this.$highlightedTextInfo;
        l5g l5gVar = this.$highlightedTextColor;
        boolean z = this.$isLightTheme;
        VkOnboarding$TintColor vkOnboarding$TintColor = this.$color;
        long j = this.$blackColor;
        Pair<Integer, Integer> pair = v5vVar.b;
        boolean z2 = pair.i().intValue() >= 0;
        if ((l5gVar != null || (!z && z2 && (vkOnboarding$TintColor == VkOnboarding$TintColor.Lime || vkOnboarding$TintColor == VkOnboarding$TintColor.Cyan))) && z2) {
            if (l5gVar != null) {
                j = l5gVar.a;
            }
            bVar.d(new hik0(j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), pair.i().intValue(), pair.j().intValue());
        }
        wh50Var.setValue(bVar.n());
        return s3q0.a;
    }
}
