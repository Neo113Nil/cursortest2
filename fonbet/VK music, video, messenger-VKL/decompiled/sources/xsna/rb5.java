package xsna;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AuthorInlineActor.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.presentation.author.feature.store.AuthorInlineActor$initOnboardingState$1", f = "AuthorInlineActor.kt", l = {TokenParametersOuterClass$TokenParameters.GPP_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class rb5 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ sb5 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb5(sb5 sb5Var, spj<? super rb5> spjVar) {
        super(2, spjVar);
        this.this$0 = sb5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new rb5(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((rb5) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            kee0 kee0Var = this.this$0.d;
            HintId hintId = HintId.INFO_PROFILE_UPLOAD_ONBOARDING;
            this.label = 1;
            a = kee0Var.a(hintId, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            a = ((Result) obj).d();
        }
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        Throwable a2 = Result.a(a);
        if (a2 != null) {
            bVar.a(a2);
        }
        sb5 sb5Var = this.this$0;
        if (!(a instanceof Result.Failure)) {
            int intValue = ((Number) a).intValue();
            sb5Var.getClass();
            HintId hintId2 = HintId.INFO_PROFILE_UPLOAD_ONBOARDING;
            h7v h7vVar = sb5Var.e;
            Hint p = h7vVar.p(hintId2.getId());
            boolean z = sb5Var.g && p != null && h7vVar.a(hintId2.getId()) && intValue <= 5;
            String str = p != null ? p.c : null;
            if (str == null) {
                str = "";
            }
            rdi.y(sb5Var, new lv2(str, z, 1));
        }
        return s3q0.a;
    }
}
