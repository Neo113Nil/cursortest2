package xsna;

import com.vk.dto.hints.HintId;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.ugf;

/* compiled from: ClipsUploadAsyncLoadExecutor.kt */
@b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.executors.ClipsUploadAsyncLoadExecutor$loadPostOnMainOnboarding$2", f = "ClipsUploadAsyncLoadExecutor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class gcf extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ wcf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gcf(wcf wcfVar, spj<? super gcf> spjVar) {
        super(2, spjVar);
        this.this$0 = wcfVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new gcf(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((gcf) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        boolean z = this.this$0.s.p(HintId.COMMUNITY_PROFILE_MAIN_WALL_CLIP_POSTING_ON_MAIN_OPTION_ONBOARDING.getId()) == null;
        boolean z2 = this.this$0.s.p(HintId.USER_PROFILE_MAIN_WALL_CLIP_POSTING_ON_MAIN_OPTION_ONBOARDING.getId()) == null;
        this.this$0.e(new ugf.g.j(!z, !z2));
        this.this$0.e(new ugf.g.i(z, z2));
        return s3q0.a;
    }
}
