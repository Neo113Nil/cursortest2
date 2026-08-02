package ru.rustore.sdk.pushclient.y;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.lfy0;

@b6l(c = "ru.rustore.sdk.pushclient.internal.push.ipc.PushIPCClientImpl", f = "PushIPCClientImpl.kt", l = {35}, m = "registerForPushes-gIAlu-s")
/* loaded from: classes9.dex */
public final class b$a extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ lfy0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b$a(lfy0 lfy0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = lfy0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object b = this.b.b(null, this);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : new Result(b);
    }
}
