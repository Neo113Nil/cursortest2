package xsna;

import com.vk.dto.hints.HintId;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AuthorInlineActor.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.presentation.author.feature.store.AuthorInlineActor$handleOnboardingWasShownAction$1", f = "AuthorInlineActor.kt", l = {59}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class qb5 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ sb5 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb5(sb5 sb5Var, spj<? super qb5> spjVar) {
        super(2, spjVar);
        this.this$0 = sb5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new qb5(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((qb5) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            kee0 kee0Var = this.this$0.d;
            HintId hintId = HintId.INFO_PROFILE_UPLOAD_ONBOARDING;
            this.label = 1;
            b = kee0Var.b(hintId, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            b = ((Result) obj).d();
        }
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        Throwable a = Result.a(b);
        if (a != null) {
            bVar.a(a);
        }
        sb5 sb5Var = this.this$0;
        if (!(b instanceof Result.Failure) && ((Number) b).intValue() > 5) {
            sb5Var.e.b(HintId.INFO_PROFILE_UPLOAD_ONBOARDING.getId());
            rdi.y(sb5Var, new db(11));
        }
        return s3q0.a;
    }
}
