package xsna;

import com.vk.audience.api.domain.tracking.AudienceResearchTrackerCodes;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: DzenArticleMediascopeTracker.kt */
@b6l(c = "com.vk.dzenarticle.impl.ui.tracking.DzenArticleMediascopeTracker$stop$1", f = "DzenArticleMediascopeTracker.kt", l = {52}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class sro extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ String $articleId;
    int label;
    final /* synthetic */ uro this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sro(uro uroVar, String str, spj<? super sro> spjVar) {
        super(2, spjVar);
        this.this$0 = uroVar;
        this.$articleId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new sro(this.this$0, this.$articleId, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((sro) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            uro uroVar = this.this$0;
            this.label = 1;
            uroVar.getClass();
            Object a = uro.a(AudienceResearchTrackerCodes.DZEN_ARTICLE_STOP, this);
            if (a != obj2) {
                a = s3q0.a;
            }
            if (a == obj2) {
                return obj2;
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
