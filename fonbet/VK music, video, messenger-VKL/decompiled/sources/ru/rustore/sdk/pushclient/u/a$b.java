package ru.rustore.sdk.pushclient.u;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.iay0;

@b6l(c = "ru.rustore.sdk.pushclient.internal.incoming.ClientServiceDataDispatcher", f = "ClientServiceDataDispatcher.kt", l = {42}, m = "sendNewPushMessageToService")
/* loaded from: classes9.dex */
public final class a$b extends ContinuationImpl {
    public iay0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ iay0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a$b(iay0 iay0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = iay0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
