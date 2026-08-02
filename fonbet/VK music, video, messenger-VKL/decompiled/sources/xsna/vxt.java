package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: GetWorkoutsHealthConnectDelegate.kt */
@b6l(c = "com.vk.superapp.vkworkout.infrastructure.delegates.GetWorkoutsHealthConnectDelegate", f = "GetWorkoutsHealthConnectDelegate.kt", l = {147}, m = "trySendWorkouts")
/* loaded from: classes6.dex */
public final class vxt extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ xxt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxt(xxt xxtVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = xxtVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return xxt.c(this.this$0, null, null, this);
    }
}
