package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: InternalPullToRefresh.kt */
@b6l(c = "com.vk.core.compose.component.internal.PullToRefreshModifierNode", f = "InternalPullToRefresh.kt", l = {383}, m = "animateToHidden")
/* loaded from: classes17.dex */
public final class ege0 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ gge0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ege0(gge0 gge0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = gge0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.l2(this);
    }
}
