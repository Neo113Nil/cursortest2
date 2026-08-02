package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AudioAdStateManagerImpl.kt */
@b6l(c = "com.vk.music.player.ads.impl.AudioAdStateManagerImpl", f = "AudioAdStateManagerImpl.kt", l = {Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 145, 155}, m = "updateUserStatistic")
/* loaded from: classes3.dex */
public final class wb4 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ pb4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb4(pb4 pb4Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = pb4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return pb4.f(this.this$0, null, null, null, null, this);
    }
}
