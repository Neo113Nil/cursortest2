package xsna;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AttachedClipsNetworkApiImpl.kt */
@b6l(c = "com.vk.video.ui.upload.impl.attachedclips.data.network.AttachedClipsNetworkApiImpl", f = "AttachedClipsNetworkApiImpl.kt", l = {TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER}, m = "saveAttachedClips-BWLJW6A")
/* loaded from: classes7.dex */
public final class v54 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ x54 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v54(x54 x54Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = x54Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object b = this.this$0.b(0, null, null, this);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : new Result(b);
    }
}
