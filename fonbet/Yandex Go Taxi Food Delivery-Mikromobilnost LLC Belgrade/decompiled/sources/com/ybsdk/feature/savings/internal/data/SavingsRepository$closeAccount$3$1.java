package com.ybsdk.feature.savings.internal.data;

import com.ybsdk.feature.savings.internal.network.dto.SavingsAccountClosingResponse;
import defpackage.l4m0;
import defpackage.m4m0;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class SavingsRepository$closeAccount$3$1 extends AdaptedFunctionReference implements wls {
    public static final SavingsRepository$closeAccount$3$1 a = new SavingsRepository$closeAccount$3$1(2, 5, m4m0.class, "toEntity", "toEntity(Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountClosingResponse;)Lcom/ybsdk/feature/savings/internal/entities/SavingsAccountClosingInfoEntity;");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new l4m0(((SavingsAccountClosingResponse) obj).getRequestId());
    }
}
