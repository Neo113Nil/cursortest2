package xsna;

import com.vk.dzenarticle.impl.domain.DzenArticle;
import com.vk.dzenarticle.impl.ui.store.DzenArticleInlineActor;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: DzenArticleInlineActor.kt */
@b6l(c = "com.vk.dzenarticle.impl.ui.store.DzenArticleInlineActor$loadArticle$1", f = "DzenArticleInlineActor.kt", l = {Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class nro extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ gzs<s3q0> $onError;
    int label;
    final /* synthetic */ DzenArticleInlineActor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nro(DzenArticleInlineActor dzenArticleInlineActor, gzs<s3q0> gzsVar, spj<? super nro> spjVar) {
        super(2, spjVar);
        this.this$0 = dzenArticleInlineActor;
        this.$onError = gzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new nro(this.this$0, this.$onError, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((nro) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                qro a = this.this$0.c.a();
                String e = this.this$0.c.e();
                this.label = 1;
                a.getClass();
                obj = myc0.k(hqu0.b(), new pro(a, e, null), this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            DzenArticle dzenArticle = (DzenArticle) obj;
            DzenArticleInlineActor.m(this.this$0, dzenArticle);
            DzenArticleInlineActor dzenArticleInlineActor = this.this$0;
            rdi.y(dzenArticleInlineActor, new lh(11, dzenArticleInlineActor, dzenArticle));
        } catch (Exception unused) {
            this.$onError.invoke();
        }
        return s3q0.a;
    }
}
