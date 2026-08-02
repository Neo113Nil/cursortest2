package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.o2d0;

/* compiled from: FeedFooter.kt */
@b6l(c = "com.vk.feed.design.compose.newsfeed.footer.FeedFooterKt$VkReactionsTouchArea$2$1$2$1", f = "FeedFooter.kt", l = {IronSourceError.ERROR_BN_UNSUPPORTED_SIZE}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class uzq extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ sg50 $interactionSource;
    final /* synthetic */ o2d0.b $p;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uzq(spj spjVar, sg50 sg50Var, o2d0.b bVar) {
        super(2, spjVar);
        this.$interactionSource = sg50Var;
        this.$p = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new uzq(spjVar, this.$interactionSource, this.$p);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((uzq) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            sg50 sg50Var = this.$interactionSource;
            o2d0.c cVar = new o2d0.c(this.$p);
            this.label = 1;
            if (sg50Var.a(cVar, this) == coroutineSingletons) {
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
