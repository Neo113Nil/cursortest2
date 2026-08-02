package com.ybsdk.feature.autotopup.internal.data;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.autotopup.internal.domain.entities.AutotopupRetryPaymentEntity$Status;
import com.ybsdk.feature.autotopup.internal.domain.entities.AutotopupRetryPaymentEntity$StatusDataEntity$Status;
import com.ybsdk.feature.autotopup.internal.network.dto.AutotopupRetryPaymentResponse;
import com.ybsdk.feature.autotopup.internal.network.dto.StatusDataDto;
import defpackage.ca4;
import defpackage.da4;
import defpackage.h04;
import defpackage.i04;
import defpackage.ns;
import defpackage.w511;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class AutoTopupSetupRepository$retryAutotopupPayment$3$1 extends AdaptedFunctionReference implements wls {
    public static final AutoTopupSetupRepository$retryAutotopupPayment$3$1 a = new AutoTopupSetupRepository$retryAutotopupPayment$3$1(2, 5, i04.class, "toEntity", "toEntity(Lcom/ybsdk/feature/autotopup/internal/network/dto/AutotopupRetryPaymentResponse;)Lcom/ybsdk/feature/autotopup/internal/domain/entities/AutotopupRetryPaymentEntity;");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AutotopupRetryPaymentEntity$Status autotopupRetryPaymentEntity$Status;
        AutotopupRetryPaymentEntity$StatusDataEntity$Status autotopupRetryPaymentEntity$StatusDataEntity$Status;
        AutotopupRetryPaymentResponse autotopupRetryPaymentResponse = (AutotopupRetryPaymentResponse) obj;
        int i = h04.a[autotopupRetryPaymentResponse.getStatus().ordinal()];
        ca4 ca4Var = null;
        if (i == 1) {
            autotopupRetryPaymentEntity$Status = AutotopupRetryPaymentEntity$Status.INITIATED;
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            autotopupRetryPaymentEntity$Status = AutotopupRetryPaymentEntity$Status.FAIL;
        }
        StatusDataDto statusData = autotopupRetryPaymentResponse.getStatusData();
        if (statusData != null) {
            Text title = statusData.getTitle();
            Text description = statusData.getDescription();
            ThemedImageUrlEntity themedImageUrlEntity = new ThemedImageUrlEntity(statusData.getLogo().getLight(), statusData.getLogo().getDark());
            int i2 = h04.b[statusData.getStatus().ordinal()];
            if (i2 == 1) {
                autotopupRetryPaymentEntity$StatusDataEntity$Status = AutotopupRetryPaymentEntity$StatusDataEntity$Status.SUCCESS;
            } else {
                if (i2 != 2) {
                    w511.b();
                    return null;
                }
                autotopupRetryPaymentEntity$StatusDataEntity$Status = AutotopupRetryPaymentEntity$StatusDataEntity$Status.ERROR;
            }
            ca4Var = new ca4(title, description, themedImageUrlEntity, autotopupRetryPaymentEntity$StatusDataEntity$Status, ns.a(statusData.getPrimaryButton()));
        }
        return new da4(autotopupRetryPaymentEntity$Status, ca4Var);
    }
}
