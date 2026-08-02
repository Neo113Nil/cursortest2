package ru.rustore.sdk.pushclient.A;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.cfy0;

@b6l(c = "ru.rustore.sdk.pushclient.internal.push.storage.PushTokenDataSource", f = "PushTokenDataSource.kt", l = {71, 72}, m = "setPushTokenDeliveredToClientApp")
/* loaded from: classes9.dex */
public final class b$i extends ContinuationImpl {
    public cfy0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ cfy0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b$i(cfy0 cfy0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = cfy0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(this);
    }
}
