package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: PrivacyDelegate.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.presentation.publish.feature.store.delegate.PrivacyDelegateKt", f = "PrivacyDelegate.kt", l = {Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE}, m = "updateVideoPrivacyPossibleRules")
/* loaded from: classes7.dex */
public final class tcd0 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public tcd0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ucd0.a(null, this);
    }
}
