package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: SmartCropInlineActor.kt */
@b6l(c = "com.vk.video.ui.smartcrop.impl.presentation.feature.store.SmartCropInlineActor", f = "SmartCropInlineActor.kt", l = {187, 190}, m = "longPollCropVideoStatus")
/* loaded from: classes7.dex */
public final class r4k0 extends ContinuationImpl {
    long J$0;
    long J$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ w4k0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4k0(w4k0 w4k0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = w4k0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return w4k0.m(this.this$0, 0L, this);
    }
}
