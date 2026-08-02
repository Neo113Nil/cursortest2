package ru.rustore.sdk.pushclient.A;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.cfy0;
import xsna.kay0;

@b6l(c = "ru.rustore.sdk.pushclient.internal.push.storage.PushTokenDataSource", f = "PushTokenDataSource.kt", l = {58}, m = "getPushToken-JT9GLNw")
/* loaded from: classes9.dex */
public final class b$e extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ cfy0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b$e(cfy0 cfy0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = cfy0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object d = this.b.d(this);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : new kay0((String) d);
    }
}
