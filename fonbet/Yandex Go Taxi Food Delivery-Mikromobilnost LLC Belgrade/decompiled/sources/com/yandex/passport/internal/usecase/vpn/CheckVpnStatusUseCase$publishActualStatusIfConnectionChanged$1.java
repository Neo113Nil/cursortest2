package com.yandex.passport.internal.usecase.vpn;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.usecase.vpn.CheckVpnStatusUseCase", f = "CheckVpnStatusUseCase.kt", l = {HProv.PP_SECURITY_LEVEL, HProv.PP_REFCOUNT, 145}, m = "publishActualStatusIfConnectionChanged")
/* loaded from: classes8.dex */
final class CheckVpnStatusUseCase$publishActualStatusIfConnectionChanged$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckVpnStatusUseCase$publishActualStatusIfConnectionChanged$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return b.a(this.this$0, this);
    }
}
