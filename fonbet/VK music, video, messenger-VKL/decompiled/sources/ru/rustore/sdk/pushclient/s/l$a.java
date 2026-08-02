package ru.rustore.sdk.pushclient.s;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.d4z0;

@b6l(c = "ru.rustore.sdk.pushclient.internal.domain.usecase.SendPushTokenToClientIfNeedUseCase", f = "SendPushTokenToClientIfNeedUseCase.kt", l = {17, 19, 20}, m = "invoke-Du7M8sQ")
/* loaded from: classes9.dex */
public final class l$a extends ContinuationImpl {
    public d4z0 a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ d4z0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l$a(d4z0 d4z0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = d4z0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
