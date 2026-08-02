package ru.rustore.sdk.pushclient.h;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.hfy0;

@b6l(c = "ru.rustore.sdk.pushclient.internal.auth.AuthIPCClientImpl", f = "AuthIPCClientImpl.kt", l = {48}, m = "isUserAuthorized-IoAF18A")
/* loaded from: classes9.dex */
public final class b$f extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ hfy0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b$f(hfy0 hfy0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = hfy0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object a = this.b.a(this);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
    }
}
