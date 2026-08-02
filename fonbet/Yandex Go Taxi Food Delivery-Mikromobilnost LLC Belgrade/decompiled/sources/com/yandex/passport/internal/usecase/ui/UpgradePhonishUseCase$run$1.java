package com.yandex.passport.internal.usecase.ui;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.usecase.ui.UpgradePhonishUseCase", f = "UpgradePhonishUseCase.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE, 62, HProv.ALG_SID_SHA3_224}, m = "run-gIAlu-s")
/* loaded from: classes2.dex */
final class UpgradePhonishUseCase$run$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ x0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradePhonishUseCase$run$1(x0 x0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = x0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, this);
    }
}
