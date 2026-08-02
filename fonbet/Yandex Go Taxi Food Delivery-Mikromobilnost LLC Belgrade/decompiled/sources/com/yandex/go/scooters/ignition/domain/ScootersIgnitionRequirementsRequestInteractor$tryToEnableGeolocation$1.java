package com.yandex.go.scooters.ignition.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.ignition.domain.ScootersIgnitionRequirementsRequestInteractor", f = "ScootersIgnitionRequirementsRequestInteractor.kt", l = {HProv.PP_HASHOID}, m = "tryToEnableGeolocation", v = 2)
/* loaded from: classes13.dex */
final class ScootersIgnitionRequirementsRequestInteractor$tryToEnableGeolocation$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersIgnitionRequirementsRequestInteractor$tryToEnableGeolocation$1(n nVar, Continuation continuation) {
        super(continuation);
        this.this$0 = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.h(this);
    }
}
