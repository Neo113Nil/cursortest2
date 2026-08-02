package com.ybsdk.feature.pinstorage.internal.data;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.pinstorage.internal.data.PinStorageImpl", f = "PinStorageImpl.kt", l = {HProv.PP_CONTAINER_EXTENSION, HProv.PP_CONTAINER_DEFAULT, HProv.PP_LCD_QUERY}, m = "saveEncryptedPinCode-gIAlu-s")
/* loaded from: classes3.dex */
final class PinStorageImpl$saveEncryptedPinCode$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinStorageImpl$saveEncryptedPinCode$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object y = this.this$0.y(null, this);
        return y == CoroutineSingletons.COROUTINE_SUSPENDED ? y : new Result(y);
    }
}
