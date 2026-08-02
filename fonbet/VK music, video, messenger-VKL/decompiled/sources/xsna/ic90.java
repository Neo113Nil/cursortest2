package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: PagerState.kt */
@b6l(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", l = {663, 670}, m = "animateScrollToPage", v = 1)
/* loaded from: classes11.dex */
public final class ic90 extends ContinuationImpl {
    float F$0;
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ mc90 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic90(mc90 mc90Var, spj<? super ic90> spjVar) {
        super(spjVar);
        this.this$0 = mc90Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.f(0, null, this);
    }
}
