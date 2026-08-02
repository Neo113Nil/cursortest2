package com.ybsdk.feature.qr.payments.internal.screens.result.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.qr.payments.internal.screens.result.domain.QrPaymentsResultDataMapperKt", f = "QrPaymentsResultDataMapper.kt", l = {44}, m = "toEntity")
/* loaded from: classes3.dex */
final class QrPaymentsResultDataMapperKt$toEntity$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return b.b(null, this);
    }
}
