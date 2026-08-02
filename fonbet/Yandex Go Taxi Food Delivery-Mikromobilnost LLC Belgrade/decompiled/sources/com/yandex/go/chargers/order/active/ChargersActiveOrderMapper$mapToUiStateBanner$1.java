package com.yandex.go.chargers.order.active;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.chargers.order.active.ChargersActiveOrderMapper", f = "ChargersActiveOrderMapper.kt", l = {HProv.PP_HANDLE_COUNT, 164, HProv.PP_REFCOUNT, HProv.PP_EXPORT_CSP}, m = "mapToUiStateBanner", v = 2)
/* loaded from: classes12.dex */
final class ChargersActiveOrderMapper$mapToUiStateBanner$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersActiveOrderMapper$mapToUiStateBanner$1(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(null, this);
    }
}
