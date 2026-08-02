package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;

/* compiled from: AutoscrollHelper.kt */
@b6l(c = "com.vk.games.presentation.utils.AutoscrollHelperKt$customAnimateScrollToPage$2", f = "AutoscrollHelper.kt", l = {97}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class ap5 extends SuspendLambda implements wzs<ggh0, spj<? super s3q0>, Object> {
    final /* synthetic */ int $page;
    final /* synthetic */ int $preJumpPosition;
    final /* synthetic */ mc90 $this_customAnimateScrollToPage;
    float F$0;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap5(mc90 mc90Var, int i, int i2, spj<? super ap5> spjVar) {
        super(2, spjVar);
        this.$this_customAnimateScrollToPage = mc90Var;
        this.$page = i;
        this.$preJumpPosition = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        ap5 ap5Var = new ap5(this.$this_customAnimateScrollToPage, this.$page, this.$preJumpPosition, spjVar);
        ap5Var.L$0 = obj;
        return ap5Var;
    }

    @Override // xsna.wzs
    public final Object invoke(ggh0 ggh0Var, spj<? super s3q0> spjVar) {
        return ((ap5) create(ggh0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ggh0 ggh0Var = (ggh0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            mc90 mc90Var = this.$this_customAnimateScrollToPage;
            ((wak0) mc90Var.q).C(mc90Var.j(this.$page));
            this.$this_customAnimateScrollToPage.x(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.$preJumpPosition, true);
            int k = this.$page - this.$this_customAnimateScrollToPage.k();
            float d = (this.$this_customAnimateScrollToPage.n().d() + this.$this_customAnimateScrollToPage.n().e()) * k;
            zo5 zo5Var = new zo5(new Ref$FloatRef(), ggh0Var, 0);
            this.L$0 = null;
            this.L$1 = null;
            this.I$0 = k;
            this.F$0 = d;
            this.label = 1;
            if (nkn0.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, zo5Var, this, 12) == coroutineSingletons) {
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
