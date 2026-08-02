package com.yandex.passport.internal.usecase;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.usecase.UpdateMasterTokenIfPossibleUseCase", f = "UpdateMasterTokenIfPossibleUseCase.kt", l = {32, 52, 66, SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE, HProv.ALG_SID_SHA3_224}, m = "execute")
/* loaded from: classes2.dex */
final class UpdateMasterTokenIfPossibleUseCase$execute$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ u1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateMasterTokenIfPossibleUseCase$execute$1(u1 u1Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = u1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
