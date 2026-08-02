package com.yandex.go.scooters.passes.purchase.superpasses;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.passes.purchase.superpasses.ScootersSuperPassesPurchaseUiStateMapper", f = "ScootersSuperPassesPurchaseUiStateMapper.kt", l = {HProv.PP_SET_PIN, 108, 112, HProv.PP_NK_SYNC, HProv.PP_INFO, HProv.PP_SAME_MEDIA, HProv.PP_DELETE_KEYSET, HProv.PP_DELETE_SAVED_PASSWD, HProv.PP_VERSION_TIMESTAMP, HProv.PP_SECURITY_LEVEL}, m = "getPassGroup", v = 2)
/* loaded from: classes13.dex */
final class ScootersSuperPassesPurchaseUiStateMapper$getPassGroup$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$14;
    Object L$15;
    Object L$16;
    Object L$17;
    Object L$18;
    Object L$19;
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
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersSuperPassesPurchaseUiStateMapper$getPassGroup$1(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return h.a(this.this$0, null, null, null, this);
    }
}
