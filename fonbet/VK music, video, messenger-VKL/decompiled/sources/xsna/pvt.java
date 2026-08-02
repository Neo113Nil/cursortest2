package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: GetStepsHealthConnectDelegate.kt */
@b6l(c = "com.vk.superapp.vksteps.infrastructure.delegates.GetStepsHealthConnectDelegate", f = "GetStepsHealthConnectDelegate.kt", l = {164, 174}, m = "trySendSteps")
/* loaded from: classes6.dex */
public final class pvt extends ContinuationImpl {
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ kvt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvt(kvt kvtVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = kvtVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        kvt kvtVar = this.this$0;
        zrp zrpVar = kvt.o;
        return kvtVar.n(null, 0L, 0L, this);
    }
}
