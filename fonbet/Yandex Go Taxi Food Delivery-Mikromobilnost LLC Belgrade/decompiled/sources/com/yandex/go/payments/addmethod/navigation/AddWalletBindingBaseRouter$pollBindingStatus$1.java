package com.yandex.go.payments.addmethod.navigation;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.CryptoPro.ssl.cl_88;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.payments.addmethod.navigation.AddWalletBindingBaseRouter", f = "AddWalletBindingBaseRouter.kt", l = {209, 220, 249, 252, MSException.ERROR_NO_MORE_ITEMS, cl_88.n}, m = "pollBindingStatus", v = 2)
/* loaded from: classes13.dex */
final class AddWalletBindingBaseRouter$pollBindingStatus$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddWalletBindingBaseRouter$pollBindingStatus$1(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return e.Q(this.this$0, null, null, null, null, this);
    }
}
