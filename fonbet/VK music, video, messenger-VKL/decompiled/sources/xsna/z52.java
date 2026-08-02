package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
@b6l(c = "androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat", f = "AndroidComposeViewAccessibilityDelegateCompat.android.kt", l = {2374, 2410}, m = "boundsUpdatesEventLoop$ui", v = 1)
/* loaded from: classes11.dex */
public final class z52 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ y52 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z52(y52 y52Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = y52Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(this);
    }
}
