package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: MusicKidsModeManagerImpl.kt */
@b6l(c = "com.vk.musc.kidsmode.impl.MusicKidsModeManagerImpl", f = "MusicKidsModeManagerImpl.kt", l = {247}, m = "awaitSetupPinCodeEvent")
/* loaded from: classes3.dex */
public final class am40 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ zl40 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am40(zl40 zl40Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = zl40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(this);
    }
}
