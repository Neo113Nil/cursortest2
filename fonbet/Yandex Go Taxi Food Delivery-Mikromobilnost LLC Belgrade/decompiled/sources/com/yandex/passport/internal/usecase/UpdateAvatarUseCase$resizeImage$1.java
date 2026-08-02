package com.yandex.passport.internal.usecase;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.usecase.UpdateAvatarUseCase", f = "UpdateAvatarUseCase.kt", l = {HProv.PP_SIGNATUREOID}, m = "resizeImage")
/* loaded from: classes2.dex */
final class UpdateAvatarUseCase$resizeImage$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ t1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateAvatarUseCase$resizeImage$1(t1 t1Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = t1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return t1.c(this.this$0, null, this);
    }
}
