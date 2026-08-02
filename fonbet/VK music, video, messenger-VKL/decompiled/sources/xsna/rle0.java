package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: PushTokenRepositoryImpl.kt */
@b6l(c = "com.vk.push.pushsdk.data.repository.PushTokenRepositoryImpl", f = "PushTokenRepositoryImpl.kt", l = {31}, m = "deleteTokenRemote-0E7RQCE")
/* loaded from: classes5.dex */
public final class rle0 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ sle0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rle0(sle0 sle0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = sle0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.a(null, null, this);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
    }
}
