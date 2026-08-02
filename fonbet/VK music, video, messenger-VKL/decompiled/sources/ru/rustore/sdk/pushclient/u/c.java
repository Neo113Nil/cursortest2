package ru.rustore.sdk.pushclient.u;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;

@b6l(c = "ru.rustore.sdk.pushclient.internal.incoming.ClientServiceInteractorImpl", f = "ClientServiceInteractorImpl.kt", l = {125}, m = "callOnDeleteMessages")
/* loaded from: classes9.dex */
public final class c extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ d b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return d.g(this.b, this);
    }
}
