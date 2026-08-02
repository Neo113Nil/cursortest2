package com.yandex.go.scooters.passes.active.v3.renew.menu;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.passes.active.v3.renew.menu.ScootersActivePassesV3RenewMenuUiActionInteractor", f = "ScootersActivePassesV3RenewMenuUiActionInteractor.kt", l = {HProv.PP_VERSION_TIMESTAMP}, m = "openPaymentMethodsWithUserData", v = 2)
/* loaded from: classes13.dex */
final class ScootersActivePassesV3RenewMenuUiActionInteractor$openPaymentMethodsWithUserData$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersActivePassesV3RenewMenuUiActionInteractor$openPaymentMethodsWithUserData$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
