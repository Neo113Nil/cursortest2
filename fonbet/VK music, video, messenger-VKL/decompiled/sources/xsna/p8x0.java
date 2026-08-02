package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.ok.android.api.json.JsonToken;

/* compiled from: WakeLockHolder.kt */
@b6l(c = "com.vk.push.pushsdk.wakelock.WakeLockHolder", f = "WakeLockHolder.kt", l = {JsonToken.BOOLEAN}, m = "getWakeLock")
/* loaded from: classes5.dex */
public final class p8x0 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ u8x0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8x0(u8x0 u8x0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = u8x0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        u8x0 u8x0Var = this.this$0;
        int i = u8x0.h;
        return u8x0Var.b(this);
    }
}
