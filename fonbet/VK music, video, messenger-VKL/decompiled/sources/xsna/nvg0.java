package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: RxScheduler.kt */
@b6l(c = "kotlinx.coroutines.rx3.RxSchedulerKt", f = "RxScheduler.kt", l = {Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE}, m = "scheduleTask$task")
/* loaded from: classes8.dex */
public final class nvg0 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public nvg0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return edi.k(null, null, null, this);
    }
}
