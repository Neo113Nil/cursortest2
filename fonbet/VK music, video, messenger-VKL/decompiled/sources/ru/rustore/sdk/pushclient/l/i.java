package ru.rustore.sdk.pushclient.l;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.nyy0;

@b6l(c = "ru.rustore.sdk.pushclient.internal.data.source.IPCClientsDataSource", f = "IPCClientsDataSource.kt", l = {56}, m = "createIPCClients")
/* loaded from: classes9.dex */
public final class i extends ContinuationImpl {
    public nyy0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ nyy0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(nyy0 nyy0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = nyy0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return nyy0.b(this.c, this);
    }
}
