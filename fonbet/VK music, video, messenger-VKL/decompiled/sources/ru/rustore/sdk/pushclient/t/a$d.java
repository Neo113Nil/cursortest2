package ru.rustore.sdk.pushclient.t;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.hay0;

@b6l(c = "ru.rustore.sdk.pushclient.internal.external.ExternalAppsRepository", f = "ExternalAppsRepository.kt", l = {20, 21, 24}, m = "isWritten")
/* loaded from: classes9.dex */
public final class a$d extends ContinuationImpl {
    public hay0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ hay0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a$d(hay0 hay0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = hay0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(this);
    }
}
