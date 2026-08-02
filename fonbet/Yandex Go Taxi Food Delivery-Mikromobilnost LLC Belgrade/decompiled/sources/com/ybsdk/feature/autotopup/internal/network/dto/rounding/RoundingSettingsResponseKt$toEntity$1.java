package com.ybsdk.feature.autotopup.internal.network.dto.rounding;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.autotopup.internal.network.dto.rounding.RoundingSettingsResponseKt", f = "RoundingSettingsResponse.kt", l = {74, HProv.ALG_SID_SHA3_224}, m = "toEntity")
/* loaded from: classes3.dex */
final class RoundingSettingsResponseKt$toEntity$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return b.a(null, this);
    }
}
