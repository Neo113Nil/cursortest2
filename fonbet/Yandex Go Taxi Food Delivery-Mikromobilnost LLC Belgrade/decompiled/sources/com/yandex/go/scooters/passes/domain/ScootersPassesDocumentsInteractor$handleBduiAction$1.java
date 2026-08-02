package com.yandex.go.scooters.passes.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.NGate.tools.Constants;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.passes.domain.ScootersPassesDocumentsInteractor", f = "ScootersPassesDocumentsInteractor.kt", l = {HProv.PP_INFO, 119, 120, Constants.VPN_TRAFFIC, 122, HProv.PP_PASSWD_TERM, HProv.PP_DELETE_SAVED_PASSWD, HProv.PP_VERSION_TIMESTAMP, HProv.PP_FAST_CODE, HProv.PP_CONTAINER_DEFAULT, 142, 143, 144}, m = "handleBduiAction", v = 2)
/* loaded from: classes13.dex */
final class ScootersPassesDocumentsInteractor$handleBduiAction$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPassesDocumentsInteractor$handleBduiAction$1(h hVar, Continuation continuation) {
        super(continuation);
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(null, this);
    }
}
