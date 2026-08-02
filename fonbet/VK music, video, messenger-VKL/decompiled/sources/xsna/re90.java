package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PaginationScreenContent.kt */
@b6l(c = "com.vk.design.demo.presentation.screens.PaginationScreenContent$ComposeContent$4$1", f = "PaginationScreenContent.kt", l = {164, 165}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class re90 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wh50<Boolean> $needScrollByTime$delegate;
    final /* synthetic */ if2<Float, sq2> $pagerProgress;
    final /* synthetic */ int $scrollDuration;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re90(int i, if2<Float, sq2> if2Var, wh50<Boolean> wh50Var, spj<? super re90> spjVar) {
        super(2, spjVar);
        this.$scrollDuration = i;
        this.$pagerProgress = if2Var;
        this.$needScrollByTime$delegate = wh50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new re90(this.$scrollDuration, this.$pagerProgress, this.$needScrollByTime$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((re90) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        if (r9.e(r1, r8) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (xsna.qsl.b(r4, r8) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (this.$needScrollByTime$delegate.getValue().booleanValue()) {
                long j = this.$scrollDuration / 2;
                this.label = 1;
            }
            return s3q0.a;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return s3q0.a;
        }
        kotlin.a.a(obj);
        if2<Float, sq2> if2Var = this.$pagerProgress;
        Float f = new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.label = 2;
    }
}
