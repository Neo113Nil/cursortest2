package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ReportContent.kt */
@b6l(c = "com.vk.overlaymenu.feature.report.ReportContentKt$ReportContent$2$1", f = "ReportContent.kt", l = {95}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class i5g0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ kg50 $imeHeight;
    final /* synthetic */ jgh0 $scrollState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5g0(jgh0 jgh0Var, kg50 kg50Var, spj<? super i5g0> spjVar) {
        super(2, spjVar);
        this.$scrollState = jgh0Var;
        this.$imeHeight = kg50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new i5g0(this.$scrollState, this.$imeHeight, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((i5g0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            jgh0 jgh0Var = this.$scrollState;
            float floatValue = this.$imeHeight.getFloatValue();
            this.label = 1;
            g = fdi.g(jgh0Var, floatValue, jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 7), this);
            if (g == coroutineSingletons) {
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
