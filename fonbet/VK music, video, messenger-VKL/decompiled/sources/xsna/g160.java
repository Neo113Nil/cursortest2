package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: NestedScrollModifier.kt */
@b6l(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", l = {199}, m = "dispatchPreFling-QWom1Mo", v = 1)
/* loaded from: classes11.dex */
public final class g160 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e160 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g160(e160 e160Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = e160Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(0L, this);
    }
}
