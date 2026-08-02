package ru.rustore.sdk.pushclient.l;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.x8z0;

@b6l(c = "ru.rustore.sdk.pushclient.internal.data.source.RegisterPushTokenDataSource", f = "RegisterPushTokenDataSource.kt", l = {10, 11}, m = "registerForPushes-gIAlu-s")
/* loaded from: classes9.dex */
public final class p$a extends ContinuationImpl {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ x8z0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p$a(x8z0 x8z0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = x8z0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        Object a = this.c.a(null, this);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
    }
}
