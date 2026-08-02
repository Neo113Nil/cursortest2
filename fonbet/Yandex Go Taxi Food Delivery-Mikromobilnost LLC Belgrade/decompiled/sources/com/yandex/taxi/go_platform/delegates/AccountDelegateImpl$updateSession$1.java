package com.yandex.taxi.go_platform.delegates;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.taxi.go_platform.delegates.AccountDelegateImpl", f = "AccountDelegateImpl.kt", l = {MSException.ERROR_INVALID_PASSWORD}, m = "updateSession-IoAF18A", v = 2)
/* loaded from: classes2.dex */
final class AccountDelegateImpl$updateSession$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountDelegateImpl$updateSession$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object e = this.this$0.e(this);
        return e == CoroutineSingletons.COROUTINE_SUSPENDED ? e : new Result(e);
    }
}
