package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: GetStepsGoogleFitDelegate.kt */
@b6l(c = "com.vk.superapp.vksteps.infrastructure.delegates.GetStepsGoogleFitDelegate", f = "GetStepsGoogleFitDelegate.kt", l = {155}, m = "trySendSteps")
/* loaded from: classes6.dex */
public final class yut extends ContinuationImpl {
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ uut this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yut(uut uutVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = uutVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        uut uutVar = this.this$0;
        zrp zrpVar = uut.j;
        return uutVar.m(null, 0L, 0L, null, this);
    }
}
