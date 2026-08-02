package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: MsgTemplateCreateOrUpdate.kt */
@b6l(c = "com.vk.messagetemplates.impl.data.MsgTemplateCreateOrUpdate", f = "MsgTemplateCreateOrUpdate.kt", l = {38}, m = "saveNew")
/* loaded from: classes3.dex */
public final class g040 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ f040 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g040(f040 f040Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = f040Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.f(null, null, null, this);
    }
}
