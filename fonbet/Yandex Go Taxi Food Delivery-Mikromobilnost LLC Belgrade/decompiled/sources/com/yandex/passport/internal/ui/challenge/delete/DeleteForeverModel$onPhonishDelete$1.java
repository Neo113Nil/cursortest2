package com.yandex.passport.internal.ui.challenge.delete;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.ui.challenge.delete.DeleteForeverModel", f = "DeleteForeverModel.kt", l = {HProv.ALG_SID_SHA3_256, 80, 81, MSException.ERROR_INVALID_PASSWORD, HProv.ALG_SID_KECCAK_224}, m = "onPhonishDelete")
/* loaded from: classes2.dex */
final class DeleteForeverModel$onPhonishDelete$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ y0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteForeverModel$onPhonishDelete$1(y0 y0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = y0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.i(this);
    }
}
