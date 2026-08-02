package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AudioAdStateManagerImpl.kt */
@b6l(c = "com.vk.music.player.ads.impl.AudioAdStateManagerImpl", f = "AudioAdStateManagerImpl.kt", l = {165}, m = "createPendingAudioState")
/* loaded from: classes3.dex */
public final class rb4 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ pb4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb4(pb4 pb4Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = pb4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.g(null, null, null, null, this);
    }
}
