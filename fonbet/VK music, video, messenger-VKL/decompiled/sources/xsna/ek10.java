package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: MasterInfoRepository.kt */
@b6l(c = "com.vk.push.pushsdk.data.repository.MasterInfoRepository", f = "MasterInfoRepository.kt", l = {49, 50}, m = "setHostIsNotMaster")
/* loaded from: classes.dex */
public final class ek10 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ bk10 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek10(bk10 bk10Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bk10Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(this);
    }
}
