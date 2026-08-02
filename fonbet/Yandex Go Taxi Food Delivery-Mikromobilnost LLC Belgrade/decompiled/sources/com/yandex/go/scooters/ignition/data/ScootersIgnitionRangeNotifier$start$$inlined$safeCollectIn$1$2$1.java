package com.yandex.go.scooters.ignition.data;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.ignition.data.ScootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1$2", f = "ScootersIgnitionRangeNotifier.kt", l = {HProv.PP_DHOID, HProv.PP_BIO_STATISTICA_LEN, HProv.PP_BIO_STATISTICA_LEN}, m = "emit", v = 2)
/* loaded from: classes13.dex */
public final class ScootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1$2$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1$2$1(f fVar, Continuation continuation) {
        super(continuation);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
