package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: PlatformSelectionBehaviors.android.kt */
@b6l(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl", f = "PlatformSelectionBehaviors.android.kt", l = {369, 380}, m = "classifyText-M8tDOmk", v = 1)
/* loaded from: classes11.dex */
public final class bua0 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ fua0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bua0(fua0 fua0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = fua0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return fua0.d(this.this$0, null, 0L, null, this);
    }
}
