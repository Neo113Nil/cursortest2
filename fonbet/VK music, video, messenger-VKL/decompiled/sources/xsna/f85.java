package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AuthorHeaderContent.kt */
@b6l(c = "com.vk.profile.design.compose.header.content.AuthorHeaderContentKt$AuthorHeaderContent$1$1", f = "AuthorHeaderContent.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class f85 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ int $mediaPageCount;
    final /* synthetic */ ja5 $mediaPagerState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f85(ja5 ja5Var, int i, spj<? super f85> spjVar) {
        super(2, spjVar);
        this.$mediaPagerState = ja5Var;
        this.$mediaPageCount = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new f85(this.$mediaPagerState, this.$mediaPageCount, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((f85) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        ja5 ja5Var = this.$mediaPagerState;
        int i = this.$mediaPageCount;
        ja5Var.getClass();
        if (i < 0) {
            i = 0;
        }
        int max = Math.max(i, 1) - 1;
        int g = swe0.g(ja5Var.a().c, 0, max);
        la5 a = ja5Var.a();
        int g2 = swe0.g(ja5Var.a().b, 0, max);
        float f = i <= 1 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : ja5Var.a().d;
        a.getClass();
        ((zak0) ja5Var.a).setValue(new la5(i, g2, g, f));
        return s3q0.a;
    }
}
