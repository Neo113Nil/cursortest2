package com.ybsdk.feature.transfer.version2.internal.data.helpers;

import com.ybsdk.feature.transfer.version2.internal.network.dto.TransfersPageDto;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class Transfer2Helper$getTransferMainData$3$1 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((a) this.receiver).e.a((TransfersPageDto) obj, (Continuation) obj2);
    }
}
