package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
@b6l(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", l = {Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED_VALUE}, m = "loadWithTimeoutOrNull$ui_text", v = 1)
/* loaded from: classes11.dex */
public final class fy3 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ hy3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fy3(hy3 hy3Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = hy3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.h(null, this);
    }
}
