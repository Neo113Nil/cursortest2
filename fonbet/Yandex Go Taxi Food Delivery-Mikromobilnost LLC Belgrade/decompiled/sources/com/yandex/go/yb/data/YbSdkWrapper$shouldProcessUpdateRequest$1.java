package com.yandex.go.yb.data;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.yb.data.YbSdkWrapper", f = "YbSdkWrapper.kt", l = {HProv.ALG_SID_KECCAK_224, 90}, m = "shouldProcessUpdateRequest", v = 2)
/* loaded from: classes8.dex */
final class YbSdkWrapper$shouldProcessUpdateRequest$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ u this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YbSdkWrapper$shouldProcessUpdateRequest$1(u uVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = uVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.g(this);
    }
}
