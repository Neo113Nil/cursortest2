package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.jra;

/* compiled from: PlatformTextInputModifierNode.kt */
@b6l(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1", f = "PlatformTextInputModifierNode.kt", l = {230}, m = "startInputMethod", v = 1)
/* loaded from: classes11.dex */
public final class gra extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ jra.a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gra(jra.a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
