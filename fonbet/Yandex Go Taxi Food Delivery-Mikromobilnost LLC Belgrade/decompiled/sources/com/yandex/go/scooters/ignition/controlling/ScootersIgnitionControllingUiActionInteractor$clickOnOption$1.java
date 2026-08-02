package com.yandex.go.scooters.ignition.controlling;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.ignition.controlling.ScootersIgnitionControllingUiActionInteractor", f = "ScootersIgnitionControllingUiActionInteractor.kt", l = {HProv.PP_NK_SYNC, 128, 139}, m = "clickOnOption-pzNXOmc", v = 2)
/* loaded from: classes13.dex */
final class ScootersIgnitionControllingUiActionInteractor$clickOnOption$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersIgnitionControllingUiActionInteractor$clickOnOption$1(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, 0, null, null, this);
    }
}
