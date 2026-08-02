package xsna;

import android.graphics.Rect;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VkOnboardingHighlighter.kt */
@b6l(c = "com.vk.core.tool.compose.onboarding.VkOnboardingHighlighterKt$VkOnboardingHighlighter$2$1", f = "VkOnboardingHighlighter.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class z7v0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wh50<Rect> $currentSpanRect$delegate;
    final /* synthetic */ wh50<ljo0> $currentTextLayout$delegate;
    final /* synthetic */ Pair<Integer, Integer> $tokenPosition;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7v0(wh50<ljo0> wh50Var, Pair<Integer, Integer> pair, wh50<Rect> wh50Var2, spj<? super z7v0> spjVar) {
        super(2, spjVar);
        this.$currentTextLayout$delegate = wh50Var;
        this.$tokenPosition = pair;
        this.$currentSpanRect$delegate = wh50Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        z7v0 z7v0Var = new z7v0(this.$currentTextLayout$delegate, this.$tokenPosition, this.$currentSpanRect$delegate, spjVar);
        z7v0Var.L$0 = obj;
        return z7v0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((z7v0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        m540 m540Var;
        int d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        ljo0 value = this.$currentTextLayout$delegate.getValue();
        Rect rect = null;
        if (value != null) {
            Pair<Integer, Integer> pair = this.$tokenPosition;
            wh50<Rect> wh50Var = this.$currentSpanRect$delegate;
            int intValue = pair.d().intValue();
            int intValue2 = pair.g().intValue();
            if (intValue >= 0 && intValue2 >= 0 && intValue2 > intValue && (d = (m540Var = value.b).d(intValue)) == m540Var.d(intValue2)) {
                int b = an10.b(value.f(intValue, true));
                int b2 = an10.b(value.f(intValue2, true));
                float f = 6;
                rect = new Rect(b, an10.b(m540Var.g(d) + f), b2, an10.b(m540Var.b(d) + f));
            }
            wh50Var.setValue(rect);
        } else {
            this.$currentSpanRect$delegate.setValue(null);
        }
        return s3q0.a;
    }
}
