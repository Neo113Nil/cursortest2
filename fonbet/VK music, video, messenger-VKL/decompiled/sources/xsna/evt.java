package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: GetStepsHealthConnectCommand.kt */
@b6l(c = "com.vk.superapp.vksteps.infrastructure.commands.GetStepsHealthConnectCommand", f = "GetStepsHealthConnectCommand.kt", l = {258}, m = "getVkHealthStatus")
/* loaded from: classes6.dex */
public final class evt extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ dvt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public evt(dvt dvtVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = dvtVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.n(null, null, this);
    }
}
