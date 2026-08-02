package ru.rustore.sdk.pushclient.l;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.niy0;

@b6l(c = "ru.rustore.sdk.pushclient.internal.data.source.ArbiterDataSource", f = "ArbiterDataSource.kt", l = {61}, m = "getMaster")
/* loaded from: classes9.dex */
public final class c$d extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ niy0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c$d(niy0 niy0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = niy0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(this);
    }
}
