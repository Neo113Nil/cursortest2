package com.ybsdk.feature.autotopup.internal.data;

import com.ybsdk.core.common.data.network.dto.ActionButtonDto;
import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.feature.autotopup.internal.network.dto.GetAutoTopupStatusSuccessData;
import defpackage.c24;
import defpackage.d24;
import defpackage.h04;
import defpackage.i04;
import defpackage.ns;
import defpackage.qxy0;
import defpackage.w511;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class AutoTopupSetupRepository$getAutoTopupRequestStatus$3$1$1 extends AdaptedFunctionReference implements wls {
    public static final AutoTopupSetupRepository$getAutoTopupRequestStatus$3$1$1 a = new AutoTopupSetupRepository$getAutoTopupRequestStatus$3$1$1(2, 5, i04.class, "toEntity", "toEntity(Lcom/ybsdk/feature/autotopup/internal/network/dto/GetAutoTopupStatusSuccessData;)Ljava/lang/Object;");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Object d24Var;
        GetAutoTopupStatusSuccessData getAutoTopupStatusSuccessData = (GetAutoTopupStatusSuccessData) obj;
        int i = h04.c[getAutoTopupStatusSuccessData.getStatus().ordinal()];
        if (i != 1) {
            if (i != 2) {
                w511.b();
                return null;
            }
            d24Var = getAutoTopupStatusSuccessData.getInProgressData() == null ? new Result.Failure(new Exception("Auto topup request status: in_progress_data is null, for IN_PROGRESS")) : new c24(getAutoTopupStatusSuccessData.getInProgressData().getUrl3ds());
        } else if (getAutoTopupStatusSuccessData.getSuccessData() == null) {
            d24Var = new Result.Failure(new Exception("Auto topup request status: success_data is null, for IN_SUCCESS"));
        } else {
            ActionButtonEntity actionButtonEntity = null;
            String autoTopupId = getAutoTopupStatusSuccessData.getSuccessData().getAutoTopupId();
            ThemedImageUrlEntity c = qxy0.c(getAutoTopupStatusSuccessData.getSuccessData().getLogo(), null);
            String title = getAutoTopupStatusSuccessData.getSuccessData().getTitle();
            String description = getAutoTopupStatusSuccessData.getSuccessData().getDescription();
            ActionButtonEntity a2 = ns.a(getAutoTopupStatusSuccessData.getSuccessData().getFirstButton());
            ActionButtonDto secondButton = getAutoTopupStatusSuccessData.getSuccessData().getSecondButton();
            if (secondButton != null) {
                actionButtonEntity = ns.a(secondButton);
            }
            d24Var = new d24(autoTopupId, c, title, description, a2, actionButtonEntity);
        }
        return d24Var == CoroutineSingletons.COROUTINE_SUSPENDED ? d24Var : new Result(d24Var);
    }
}
