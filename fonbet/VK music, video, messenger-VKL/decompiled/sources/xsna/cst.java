package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: GetHealthConnectWorkoutsCommand.kt */
@b6l(c = "com.vk.superapp.vkworkout.infrastructure.commands.GetHealthConnectWorkoutsCommand", f = "GetHealthConnectWorkoutsCommand.kt", l = {205}, m = "getVkHealthStatus")
/* loaded from: classes6.dex */
public final class cst extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ bst this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cst(bst bstVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bstVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return bst.d(this.this$0, null, this);
    }
}
