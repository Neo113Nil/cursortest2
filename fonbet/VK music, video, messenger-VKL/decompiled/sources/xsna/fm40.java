package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: MusicKidsModeManagerImpl.kt */
@b6l(c = "com.vk.musc.kidsmode.impl.MusicKidsModeManagerImpl", f = "MusicKidsModeManagerImpl.kt", l = {202}, m = "setMode")
/* loaded from: classes3.dex */
public final class fm40 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ zl40 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fm40(zl40 zl40Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = zl40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(false, null, null, this);
    }
}
