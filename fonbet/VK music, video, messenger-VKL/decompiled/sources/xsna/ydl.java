package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: DefaultEditorRender.kt */
@b6l(c = "com.vk.photo.editor.domain.DefaultEditorRender", f = "DefaultEditorRender.kt", l = {23}, m = "render")
/* loaded from: classes4.dex */
public final class ydl extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ zdl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydl(zdl zdlVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = zdlVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, null, this);
    }
}
