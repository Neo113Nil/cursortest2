package ru.rustore.sdk.pushclient.t;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.hay0;

@b6l(c = "ru.rustore.sdk.pushclient.internal.external.ExternalAppsRepository", f = "ExternalAppsRepository.kt", l = {28}, m = "setIsWritten")
/* loaded from: classes9.dex */
public final class a$f extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ hay0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a$f(hay0 hay0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = hay0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(this);
    }
}
