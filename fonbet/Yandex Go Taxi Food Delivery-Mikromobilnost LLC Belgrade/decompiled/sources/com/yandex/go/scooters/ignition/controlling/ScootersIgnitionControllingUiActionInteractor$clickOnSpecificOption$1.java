package com.yandex.go.scooters.ignition.controlling;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.ignition.controlling.ScootersIgnitionControllingUiActionInteractor", f = "ScootersIgnitionControllingUiActionInteractor.kt", l = {159, 161, MSException.ERROR_MORE_DATA, 175}, m = "clickOnSpecificOption-dlKKtPk", v = 2)
/* loaded from: classes13.dex */
final class ScootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, null, 0, null, this);
    }
}
