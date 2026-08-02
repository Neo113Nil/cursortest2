package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: DialogTagsGetCmd.kt */
@b6l(c = "com.vk.dialogtags.impl.data.DialogTagsGetCmd", f = "DialogTagsGetCmd.kt", l = {29}, m = "requestActual")
/* loaded from: classes18.dex */
public final class gkm extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ fkm this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gkm(fkm fkmVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = fkmVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        fkm fkmVar = this.this$0;
        int i = fkm.d;
        return fkmVar.f(null, this);
    }
}
