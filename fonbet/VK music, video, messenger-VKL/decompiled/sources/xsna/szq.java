package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: FeedFooter.kt */
@b6l(c = "com.vk.feed.design.compose.newsfeed.footer.FeedFooterKt$VkLikesFooterButton$1$1", f = "FeedFooter.kt", l = {704, 704}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class szq extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ boolean $animateOnChange;
    final /* synthetic */ p6z $animator;
    final /* synthetic */ Integer $reactionId;
    final /* synthetic */ yyq $reactionOverlay;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public szq(boolean z, yyq yyqVar, Integer num, p6z p6zVar, spj<? super szq> spjVar) {
        super(2, spjVar);
        this.$animateOnChange = z;
        this.$reactionOverlay = yyqVar;
        this.$reactionId = num;
        this.$animator = p6zVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new szq(this.$animateOnChange, this.$reactionOverlay, this.$reactionId, this.$animator, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((szq) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        if (r5.b(1.45f, r4) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        if (r5.a(r4) == r0) goto L22;
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
            if (!this.$animateOnChange || this.$reactionOverlay != null) {
                return s3q0.a;
            }
            if (this.$reactionId != null) {
                p6z p6zVar = this.$animator;
                this.label = 1;
            } else {
                p6z p6zVar2 = this.$animator;
                this.label = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
