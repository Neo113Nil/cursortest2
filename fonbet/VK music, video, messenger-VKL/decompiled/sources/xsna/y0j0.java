package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: SettingsCache.kt */
@b6l(c = "com.google.firebase.sessions.settings.SettingsCache", f = "SettingsCache.kt", l = {Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE}, m = "updateConfigValue")
/* loaded from: classes13.dex */
public final class y0j0<T> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ x0j0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0j0(x0j0 x0j0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = x0j0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, null, this);
    }
}
