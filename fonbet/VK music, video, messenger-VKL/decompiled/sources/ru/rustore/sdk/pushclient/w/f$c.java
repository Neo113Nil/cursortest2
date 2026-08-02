package ru.rustore.sdk.pushclient.w;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.pvy0;

@b6l(c = "ru.rustore.sdk.pushclient.internal.push.VkpnsPusherApi", f = "VkpnsPusherApi.kt", l = {27}, m = "getNewPushToken-0E7RQCE")
/* loaded from: classes9.dex */
public final class f$c extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ pvy0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f$c(pvy0 pvy0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = pvy0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object a = this.b.a(null, null, this);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
    }
}
