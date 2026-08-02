package ru.rustore.sdk.pushclient.q;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.gay0;

@b6l(c = "ru.rustore.sdk.pushclient.internal.domain.interactor.DeletePushTokenIfClientModeChangedInteractor", f = "DeletePushTokenIfClientModeChangedInteractor.kt", l = {14, 16}, m = "invoke")
/* loaded from: classes9.dex */
public final class a$a extends ContinuationImpl {
    public gay0 a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ gay0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a$a(gay0 gay0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = gay0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(this);
    }
}
