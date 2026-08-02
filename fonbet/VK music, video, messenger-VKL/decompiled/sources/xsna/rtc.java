package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ClipEditSdkRepositoryImpl.kt */
@b6l(c = "com.vk.clips.viewer.edit.data.ClipEditSdkRepositoryImpl", f = "ClipEditSdkRepositoryImpl.kt", l = {Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE}, m = "getTrendingHashtags")
/* loaded from: classes17.dex */
public final class rtc extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ wtc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rtc(wtc wtcVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = wtcVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(this);
    }
}
