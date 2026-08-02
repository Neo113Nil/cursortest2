package com.ybsdk.feature.pinstorage.internal.data;

import defpackage.mvg;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.Key.foreign.JCSP3DesKeyGenerator;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.pinstorage.internal.data.PinStorageImpl", f = "PinStorageImpl.kt", l = {JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN, 175}, m = "readPinTokenForDeviceIdFromStash-IoAF18A")
/* loaded from: classes3.dex */
final class PinStorageImpl$readPinTokenForDeviceIdFromStash$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinStorageImpl$readPinTokenForDeviceIdFromStash$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Serializable q = this.this$0.q(this);
        return q == CoroutineSingletons.COROUTINE_SUSPENDED ? q : new Result(q);
    }
}
