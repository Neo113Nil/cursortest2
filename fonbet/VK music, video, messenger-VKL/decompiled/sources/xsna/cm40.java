package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: MusicKidsModeManagerImpl.kt */
@b6l(c = "com.vk.musc.kidsmode.impl.MusicKidsModeManagerImpl", f = "MusicKidsModeManagerImpl.kt", l = {185, PsExtractor.PRIVATE_STREAM_1, 193}, m = "internalToggleMode")
/* loaded from: classes3.dex */
public final class cm40 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ zl40 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cm40(zl40 zl40Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = zl40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return zl40.b(this.this$0, null, null, null, this);
    }
}
