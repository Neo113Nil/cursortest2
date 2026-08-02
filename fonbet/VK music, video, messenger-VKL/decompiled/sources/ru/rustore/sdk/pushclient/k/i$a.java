package ru.rustore.sdk.pushclient.k;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.qzy0;

@b6l(c = "ru.rustore.sdk.pushclient.internal.data.repository.RegisterPushTokenRepository", f = "RegisterPushTokenRepository.kt", l = {11}, m = "registerForPushes-iRXhn8M")
/* loaded from: classes9.dex */
public final class i$a extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ qzy0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i$a(qzy0 qzy0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = qzy0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object a = this.b.a(null, this);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
    }
}
