package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AndroidComposeView.android.kt */
@b6l(c = "androidx.compose.ui.platform.AndroidComposeView", f = "AndroidComposeView.android.kt", l = {860}, m = "textInputSession", v = 1)
/* loaded from: classes11.dex */
public final class v52 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ p52 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v52(p52 p52Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = p52Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.u(null, this);
    }
}
