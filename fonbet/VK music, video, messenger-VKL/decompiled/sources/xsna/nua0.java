package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: PlatformTextInputModifierNode.kt */
@b6l(c = "androidx.compose.ui.platform.PlatformTextInputModifierNodeKt", f = "PlatformTextInputModifierNode.kt", l = {184, 186}, m = "interceptedTextInputSession", v = 1)
/* loaded from: classes11.dex */
public final class nua0 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public nua0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return lua0.b(null, null, null, this);
    }
}
