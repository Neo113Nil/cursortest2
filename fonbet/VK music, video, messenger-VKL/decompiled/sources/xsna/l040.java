package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: MsgTemplatesGetCmd.kt */
@b6l(c = "com.vk.messagetemplates.impl.data.MsgTemplatesGetCmd", f = "MsgTemplatesGetCmd.kt", l = {40}, m = "requestNetwork")
/* loaded from: classes3.dex */
public final class l040 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ j040 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l040(j040 j040Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = j040Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        j040 j040Var = this.this$0;
        int i = j040.d;
        return j040Var.g(null, this);
    }
}
