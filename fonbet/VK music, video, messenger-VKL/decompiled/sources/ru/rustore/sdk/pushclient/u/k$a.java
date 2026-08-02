package ru.rustore.sdk.pushclient.u;

import com.vk.push.core.domain.model.CallingAppIds;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.i2z0;

@b6l(c = "ru.rustore.sdk.pushclient.internal.incoming.ValidateCallingHostInteractor", f = "ValidateCallingHostInteractor.kt", l = {17}, m = "invoke-gIAlu-s")
/* loaded from: classes9.dex */
public final class k$a extends ContinuationImpl {
    public CallingAppIds a;
    public i2z0 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ i2z0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k$a(i2z0 i2z0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = i2z0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        Object a = this.d.a(null, this);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
    }
}
