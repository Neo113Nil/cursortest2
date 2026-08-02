package com.yandex.go.scooters.ignition.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.ignition.domain.ScootersIgnitionInteractor", f = "ScootersIgnitionInteractor.kt", l = {HProv.PP_SIGNATUREOID, HProv.PP_REBOOT, HProv.PP_NK_SYNC, HProv.PP_INFO, HProv.PP_DELETE_KEYSET}, m = "safeStart", v = 2)
/* loaded from: classes13.dex */
final class ScootersIgnitionInteractor$safeStart$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersIgnitionInteractor$safeStart$1(k kVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(this);
    }
}
