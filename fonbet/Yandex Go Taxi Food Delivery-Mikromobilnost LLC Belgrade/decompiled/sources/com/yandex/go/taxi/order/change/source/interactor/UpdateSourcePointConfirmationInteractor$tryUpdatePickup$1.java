package com.yandex.go.taxi.order.change.source.interactor;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.change.source.interactor.UpdateSourcePointConfirmationInteractor", f = "UpdateSourcePointConfirmationInteractor.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE, SystemProfileProtos$SystemProfileProto.ComponentId.THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE, 71, HProv.ALG_SID_SHA3_384, HProv.PP_CIPHEROID, HProv.PP_RESERVED1, HProv.PP_CACHE_SIZE, HProv.PP_ENUM_CONTAINER_EXTENSION, 147, HProv.PP_HANDLE_COUNT}, m = "tryUpdatePickup", v = 2)
/* loaded from: classes14.dex */
final class UpdateSourcePointConfirmationInteractor$tryUpdatePickup$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$10;
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
    final /* synthetic */ b0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateSourcePointConfirmationInteractor$tryUpdatePickup$1(b0 b0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = b0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, null, this);
    }
}
