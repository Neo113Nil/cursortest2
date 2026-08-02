package com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.state;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.state.TransferRequisiteStateKt", f = "TransferRequisiteState.kt", l = {HProv.PP_SECURITY_LEVEL}, m = "initialHcsState")
/* loaded from: classes3.dex */
final class TransferRequisiteStateKt$initialHcsState$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.e(null, null, this);
    }
}
