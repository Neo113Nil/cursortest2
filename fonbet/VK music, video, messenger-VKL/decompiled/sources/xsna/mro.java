package xsna;

import com.vk.dzenarticle.impl.ui.entity.DzenArticleState;
import com.vk.dzenarticle.impl.ui.store.DzenArticleInlineActor;
import com.vk.toggle.features.FeedFeatures;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: DzenArticleInlineActor.kt */
@b6l(c = "com.vk.dzenarticle.impl.ui.store.DzenArticleInlineActor$handleResume$1", f = "DzenArticleInlineActor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class mro extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DzenArticleInlineActor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mro(DzenArticleInlineActor dzenArticleInlineActor, spj<? super mro> spjVar) {
        super(2, spjVar);
        this.this$0 = dzenArticleInlineActor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        mro mroVar = new mro(this.this$0, spjVar);
        mroVar.L$0 = obj;
        return mroVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((mro) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        uro b = this.this$0.c.b();
        String str = ((DzenArticleState) this.this$0.b.getCurrentState()).b;
        b.getClass();
        FeedFeatures feedFeatures = FeedFeatures.DZEN_CAROUSEL_MEDIASCOPE;
        feedFeatures.getClass();
        if (com.vk.toggle.b.A.a(feedFeatures) && b.a.compareAndSet(false, true)) {
            b.b = myc0.h(yvjVar, null, null, new rro(b, str, null), 3);
        }
        return s3q0.a;
    }
}
