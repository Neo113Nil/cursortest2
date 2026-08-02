package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: FeedFooter.kt */
@b6l(c = "com.vk.feed.design.compose.newsfeed.footer.FeedFooterKt$ReactionLottieOverlay$1$1", f = "FeedFooter.kt", l = {785, 787}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class pzq extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ s700 $composition$delegate;
    final /* synthetic */ long $fadeDurationMs;
    final /* synthetic */ wh50<Boolean> $fadeOut$delegate;
    final /* synthetic */ long $startFadeDelayMs;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pzq(long j, long j2, s700 s700Var, wh50<Boolean> wh50Var, spj<? super pzq> spjVar) {
        super(2, spjVar);
        this.$startFadeDelayMs = j;
        this.$fadeDurationMs = j2;
        this.$composition$delegate = s700Var;
        this.$fadeOut$delegate = wh50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new pzq(this.$startFadeDelayMs, this.$fadeDurationMs, this.$composition$delegate, this.$fadeOut$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((pzq) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
    
        if (xsna.qsl.b(r3, r6) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        if (xsna.qsl.b(r4, r6) == r0) goto L21;
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
            if (this.$composition$delegate.getValue() == null) {
                return s3q0.a;
            }
            if (!this.$fadeOut$delegate.getValue().booleanValue()) {
                long j = this.$startFadeDelayMs;
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
        this.$fadeOut$delegate.setValue(Boolean.TRUE);
        long j2 = this.$fadeDurationMs;
        this.label = 2;
    }
}
