package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: WakeLockHolder.kt */
@b6l(c = "com.vk.push.pushsdk.wakelock.WakeLockHolder", f = "WakeLockHolder.kt", l = {29, 34}, m = "acquireWakeLock")
/* loaded from: classes5.dex */
public final class o8x0 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ u8x0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8x0(u8x0 u8x0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = u8x0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
