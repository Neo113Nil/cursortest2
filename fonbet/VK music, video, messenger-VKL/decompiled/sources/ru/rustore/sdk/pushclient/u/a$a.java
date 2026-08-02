package ru.rustore.sdk.pushclient.u;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.iay0;

@b6l(c = "ru.rustore.sdk.pushclient.internal.incoming.ClientServiceDataDispatcher", f = "ClientServiceDataDispatcher.kt", l = {23, 24, 27}, m = "checkForUndeliveredPushToken")
/* loaded from: classes9.dex */
public final class a$a extends ContinuationImpl {
    public iay0 a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ iay0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a$a(iay0 iay0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = iay0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.d(this);
    }
}
