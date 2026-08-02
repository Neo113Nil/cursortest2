package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: MixBackgroundCpuShader.kt */
@b6l(c = "com.vk.music.bottomsheets.track.redesigned.presentation.components.shaders.source.MixBackgroundCpuShader", f = "MixBackgroundCpuShader.kt", l = {15}, m = "generate")
/* loaded from: classes3.dex */
public final class rs20 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ts20 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rs20(ts20 ts20Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = ts20Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(0, 0, 0, this);
    }
}
