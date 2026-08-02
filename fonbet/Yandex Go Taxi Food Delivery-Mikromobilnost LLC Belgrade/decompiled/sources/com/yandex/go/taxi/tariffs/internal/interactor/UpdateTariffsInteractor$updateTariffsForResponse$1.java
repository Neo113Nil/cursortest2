package com.yandex.go.taxi.tariffs.internal.interactor;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.tariffs.internal.interactor.UpdateTariffsInteractor", f = "UpdateTariffsInteractor.kt", l = {MSException.ERROR_INVALID_PASSWORD, HProv.PP_CIPHEROID, HProv.PP_SIGNATUREOID}, m = "updateTariffsForResponse", v = 2)
/* loaded from: classes8.dex */
final class UpdateTariffsInteractor$updateTariffsForResponse$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateTariffsInteractor$updateTariffsForResponse$1(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, false, null, this);
    }
}
