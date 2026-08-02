package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: LazyListState.kt */
@b6l(c = "androidx.compose.foundation.lazy.LazyListState", f = "LazyListState.kt", l = {585}, m = "animateScrollToItem", v = 1)
/* loaded from: classes11.dex */
public final class svy extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ xvy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public svy(xvy xvyVar, spj<? super svy> spjVar) {
        super(spjVar);
        this.this$0 = xvyVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.f(0, this);
    }
}
