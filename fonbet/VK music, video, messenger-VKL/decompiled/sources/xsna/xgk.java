package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: CropEditorScreen.kt */
@b6l(c = "com.vk.newsfeed.posting.crop_editor.presentation.base.view.CropEditorScreenState", f = "CropEditorScreen.kt", l = {648}, m = "updateControls")
/* loaded from: classes4.dex */
public final class xgk extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ygk this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xgk(ygk ygkVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = ygkVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.k(this);
    }
}
