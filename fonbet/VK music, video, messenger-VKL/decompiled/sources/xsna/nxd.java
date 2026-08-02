package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ClipsEditorDraftControllerImpl.kt */
@b6l(c = "com.vk.clips.editor.draft.ClipsEditorDraftControllerImpl", f = "ClipsEditorDraftControllerImpl.kt", l = {176, 195, Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, 211}, m = "applyChangesToDraft")
/* loaded from: classes16.dex */
public final class nxd extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ mxd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nxd(mxd mxdVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = mxdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, false, this);
    }
}
