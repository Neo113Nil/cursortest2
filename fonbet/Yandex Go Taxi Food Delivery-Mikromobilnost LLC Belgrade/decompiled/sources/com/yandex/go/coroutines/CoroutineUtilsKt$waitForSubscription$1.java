package com.yandex.go.coroutines;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.coroutines.CoroutineUtilsKt", f = "CoroutineUtils.kt", l = {HProv.PP_BIO_STATISTICA_LEN}, m = "waitForSubscription", v = 2)
/* loaded from: classes12.dex */
final class CoroutineUtilsKt$waitForSubscription$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public CoroutineUtilsKt$waitForSubscription$1(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return b.n(null, this);
    }
}
