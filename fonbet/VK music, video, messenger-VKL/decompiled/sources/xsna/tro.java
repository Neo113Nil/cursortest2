package xsna;

import com.vk.audience.api.domain.tracking.AudienceResearchTrackerCodes;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: DzenArticleMediascopeTracker.kt */
@b6l(c = "com.vk.dzenarticle.impl.ui.tracking.DzenArticleMediascopeTracker$track$2", f = "DzenArticleMediascopeTracker.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class tro extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ AudienceResearchTrackerCodes $code;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tro(AudienceResearchTrackerCodes audienceResearchTrackerCodes, spj<? super tro> spjVar) {
        super(2, spjVar);
        this.$code = audienceResearchTrackerCodes;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new tro(this.$code, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((tro) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        try {
            tkv tkvVar = new tkv("https://" + this.$code.h() + ".ms.dzen.ru", false, 14);
            vx2.a.getClass();
            vx2.b().p(tkvVar);
        } catch (Exception unused) {
        }
        return s3q0.a;
    }
}
