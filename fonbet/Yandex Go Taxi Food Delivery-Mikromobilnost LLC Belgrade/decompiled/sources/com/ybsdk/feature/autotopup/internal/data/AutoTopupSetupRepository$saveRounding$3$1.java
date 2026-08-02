package com.ybsdk.feature.autotopup.internal.data;

import com.ybsdk.core.common.data.network.dto.ActionButtonDto;
import com.ybsdk.core.common.data.network.dto.CommonSheet;
import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.feature.autotopup.internal.network.dto.rounding.RoundingSaveResponse;
import defpackage.bzk0;
import defpackage.kpc;
import defpackage.ns;
import defpackage.ty3;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class AutoTopupSetupRepository$saveRounding$3$1 extends AdaptedFunctionReference implements wls {
    public static final AutoTopupSetupRepository$saveRounding$3$1 a = new AutoTopupSetupRepository$saveRounding$3$1(2, 5, bzk0.class, "toEntity", "toEntity(Lcom/ybsdk/feature/autotopup/internal/network/dto/rounding/RoundingSaveResponse;)Lcom/ybsdk/feature/autotopup/internal/domain/entities/AutoTopupRequestEntity;");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        RoundingSaveResponse roundingSaveResponse = (RoundingSaveResponse) obj;
        String requestId = roundingSaveResponse.getRequestId();
        ActionButtonDto button = roundingSaveResponse.getButton();
        ActionButtonEntity a2 = button != null ? ns.a(button) : null;
        CommonSheet appNotFoundSheet = roundingSaveResponse.getAppNotFoundSheet();
        return new ty3(requestId, a2, appNotFoundSheet != null ? kpc.a(appNotFoundSheet) : null);
    }
}
