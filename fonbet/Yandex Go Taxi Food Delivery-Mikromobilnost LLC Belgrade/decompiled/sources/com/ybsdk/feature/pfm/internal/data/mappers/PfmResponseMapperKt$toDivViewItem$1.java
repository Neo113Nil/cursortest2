package com.ybsdk.feature.pfm.internal.data.mappers;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.pfm.internal.data.mappers.PfmResponseMapperKt", f = "PfmResponseMapper.kt", l = {HProv.PP_HASHOID}, m = "toDivViewItem")
/* loaded from: classes3.dex */
final class PfmResponseMapperKt$toDivViewItem$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return b.b(null, null, this);
    }
}
