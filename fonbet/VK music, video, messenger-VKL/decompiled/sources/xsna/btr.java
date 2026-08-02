package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: Emitters.kt */
@b6l(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", f = "Emitters.kt", l = {Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE}, m = "invokeSafely$FlowKt__EmittersKt")
/* loaded from: classes8.dex */
public final class btr<T> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public btr(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return f0q.b(null, null, null, this);
    }
}
