package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: MsgTemplatesGetCmd.kt */
@b6l(c = "com.vk.messagetemplates.impl.data.MsgTemplatesGetCmd", f = "MsgTemplatesGetCmd.kt", l = {29}, m = "requestActual")
/* loaded from: classes3.dex */
public final class k040 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ j040 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k040(j040 j040Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = j040Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        j040 j040Var = this.this$0;
        int i = j040.d;
        return j040Var.f(null, this);
    }
}
