package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.us2;

/* compiled from: CommunityCreationOnboarding.kt */
@b6l(c = "com.vk.community.design.compose.onboarding.CommunityCreationOnboardingKt$HighlightedHeader$1$1$1$1", f = "CommunityCreationOnboarding.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class g0h extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wh50<us2> $annotatedTitle$delegate;
    final /* synthetic */ long $blackColor;
    final /* synthetic */ boolean $isLightTheme;
    final /* synthetic */ j0h $title;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0h(j0h j0hVar, boolean z, long j, wh50<us2> wh50Var, spj<? super g0h> spjVar) {
        super(2, spjVar);
        this.$title = j0hVar;
        this.$isLightTheme = z;
        this.$blackColor = j;
        this.$annotatedTitle$delegate = wh50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new g0h(this.$title, this.$isLightTheme, this.$blackColor, this.$annotatedTitle$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((g0h) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        wh50<us2> wh50Var = this.$annotatedTitle$delegate;
        us2.b bVar = new us2.b(this.$title.a);
        boolean z = this.$isLightTheme;
        long j = this.$blackColor;
        j0h j0hVar = this.$title;
        if (!z) {
            bVar.d(new hik0(j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), j0hVar.b.i().intValue(), j0hVar.b.j().intValue());
        }
        wh50Var.setValue(bVar.n());
        return s3q0.a;
    }
}
