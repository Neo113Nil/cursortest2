package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: WaveAnimationHelper.kt */
@b6l(c = "com.vk.music.stickyplayer.domain.onboarding.WaveAnimationHelper", f = "WaveAnimationHelper.kt", l = {14, 19, 21}, m = "animate")
/* loaded from: classes3.dex */
public final class idx0 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ jdx0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public idx0(jdx0 jdx0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = jdx0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
