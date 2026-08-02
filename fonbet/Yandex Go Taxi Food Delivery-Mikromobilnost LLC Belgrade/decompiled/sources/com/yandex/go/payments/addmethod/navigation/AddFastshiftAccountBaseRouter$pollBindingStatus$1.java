package com.yandex.go.payments.addmethod.navigation;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.payments.addmethod.navigation.AddFastshiftAccountBaseRouter", f = "AddFastshiftAccountBaseRouter.kt", l = {210, 221, 250, 253, MSException.ERROR_NO_MORE_ITEMS}, m = "pollBindingStatus", v = 2)
/* loaded from: classes13.dex */
final class AddFastshiftAccountBaseRouter$pollBindingStatus$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddFastshiftAccountBaseRouter$pollBindingStatus$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return c.P(this.this$0, null, null, null, null, this);
    }
}
