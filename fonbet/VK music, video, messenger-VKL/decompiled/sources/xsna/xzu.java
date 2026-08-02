package xsna;

import com.unity3d.mediation.LevelPlayAdError;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: HealthConnectClientUpsideDownImpl.kt */
@b6l(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl", f = "HealthConnectClientUpsideDownImpl.kt", l = {LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED}, m = "wrapPlatformException")
/* loaded from: classes12.dex */
public final class xzu<T> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ qzu this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xzu(qzu qzuVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = qzuVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.f(null, this);
    }
}
