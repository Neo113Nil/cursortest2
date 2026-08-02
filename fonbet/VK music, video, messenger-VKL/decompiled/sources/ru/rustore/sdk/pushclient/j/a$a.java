package ru.rustore.sdk.pushclient.j;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.aay0;
import xsna.b6l;

@b6l(c = "ru.rustore.sdk.pushclient.internal.data.ipc.ArbiterIPCClient", f = "ArbiterIPCClient.kt", l = {31}, m = "getMaster-IoAF18A")
/* loaded from: classes9.dex */
public final class a$a extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ aay0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a$a(aay0 aay0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = aay0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object a = this.b.a(this);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
    }
}
