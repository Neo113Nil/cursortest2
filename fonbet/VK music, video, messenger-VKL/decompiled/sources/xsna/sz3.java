package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
@b6l(c = "androidx.compose.ui.text.font.AsyncTypefaceCache", f = "FontListFontFamilyTypefaceAdapter.kt", l = {412}, m = "runCached", v = 1)
/* loaded from: classes11.dex */
public final class sz3 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ rz3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz3(rz3 rz3Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = rz3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, null, null, this);
    }
}
