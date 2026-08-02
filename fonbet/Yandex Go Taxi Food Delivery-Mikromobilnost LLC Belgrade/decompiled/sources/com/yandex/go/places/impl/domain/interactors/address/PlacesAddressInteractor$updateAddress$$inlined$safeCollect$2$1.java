package com.yandex.go.places.impl.domain.interactors.address;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.places.impl.domain.interactors.address.PlacesAddressInteractor$updateAddress$$inlined$safeCollect$2", f = "PlacesAddressInteractor.kt", l = {HProv.PP_RESERVED1, HProv.PP_SET_PIN, HProv.PP_INFO}, m = "emit", v = 2)
/* loaded from: classes13.dex */
public final class PlacesAddressInteractor$updateAddress$$inlined$safeCollect$2$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesAddressInteractor$updateAddress$$inlined$safeCollect$2$1(e eVar, Continuation continuation) {
        super(continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
