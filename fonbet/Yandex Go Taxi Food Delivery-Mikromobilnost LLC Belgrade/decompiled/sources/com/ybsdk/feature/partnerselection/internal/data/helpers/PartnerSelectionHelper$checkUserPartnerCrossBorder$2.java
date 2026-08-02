package com.ybsdk.feature.partnerselection.internal.data.helpers;

import com.ybsdk.core.common.data.network.dto.ActionButtonDto;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.transfer.utils.domain.entities.ResultScreenHeader;
import com.ybsdk.feature.partnerselection.api.SelectedPartnerCrossBorderData;
import com.ybsdk.feature.partnerselection.internal.network.dto.crossborder.CrossBorderCheckUserPartnerErrorInfoDto;
import com.ybsdk.feature.partnerselection.internal.network.dto.crossborder.CrossBorderCheckUserPartnerResultDto;
import com.ybsdk.feature.partnerselection.internal.network.dto.crossborder.CrossBorderCheckUserPartnerSuccessDto;
import com.ybsdk.feature.partnerselection.internal.network.dto.crossborder.CrossBorderReceiverDto;
import defpackage.br51;
import defpackage.di90;
import defpackage.ns;
import defpackage.qxy0;
import defpackage.w511;
import defpackage.wls;
import defpackage.xq51;
import defpackage.yq51;
import defpackage.zq51;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class PartnerSelectionHelper$checkUserPartnerCrossBorder$2 extends AdaptedFunctionReference implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        String requestId;
        Pair pair;
        CrossBorderReceiverDto receiver;
        br51 br51Var;
        CrossBorderCheckUserPartnerResultDto crossBorderCheckUserPartnerResultDto = (CrossBorderCheckUserPartnerResultDto) obj;
        ((a) this.receiver).getClass();
        int i = di90.b[crossBorderCheckUserPartnerResultDto.getStatus().ordinal()];
        if (i == 1 || i == 2) {
            CrossBorderCheckUserPartnerSuccessDto successData = crossBorderCheckUserPartnerResultDto.getSuccessData();
            String receiverFullName = (successData == null || (receiver = successData.getReceiver()) == null) ? null : receiver.getReceiverFullName();
            ResultScreenHeader resultScreenHeader = new ResultScreenHeader(null, null);
            CrossBorderCheckUserPartnerSuccessDto successData2 = crossBorderCheckUserPartnerResultDto.getSuccessData();
            if (successData2 == null || (requestId = successData2.getCheckUserPartnerId()) == null) {
                requestId = crossBorderCheckUserPartnerResultDto.getRequestId();
            }
            xq51 xq51Var = new xq51(receiverFullName, resultScreenHeader, requestId);
            CrossBorderCheckUserPartnerSuccessDto successData3 = crossBorderCheckUserPartnerResultDto.getSuccessData();
            pair = new Pair(xq51Var, successData3 != null ? new SelectedPartnerCrossBorderData(null, new MoneyEntity(BigDecimal.ZERO, successData3.getCurrency(), ""), new SelectedPartnerCrossBorderData.CurrencyRate(successData3.getCurrencyRate().getAmount().toPlainString(), successData3.getCurrency()), null, successData3.getCheckUserPartnerId(), successData3.getFee(), successData3.getConvertationTemplate()) : null);
        } else if (i == 3) {
            String error = crossBorderCheckUserPartnerResultDto.getError();
            CrossBorderCheckUserPartnerErrorInfoDto errorInfo = crossBorderCheckUserPartnerResultDto.getErrorInfo();
            if (errorInfo != null) {
                String title = errorInfo.getTitle();
                String description = errorInfo.getDescription();
                Themes<String> imageUrl = errorInfo.getImageUrl();
                ThemedImageUrlEntity c = imageUrl != null ? qxy0.c(imageUrl, null) : null;
                ActionButtonDto buttonPrimary = errorInfo.getButtonPrimary();
                ActionButtonEntity a = buttonPrimary != null ? ns.a(buttonPrimary) : null;
                ActionButtonDto buttonSecondary = errorInfo.getButtonSecondary();
                br51Var = new br51(title, description, c, a, buttonSecondary != null ? ns.a(buttonSecondary) : null);
            } else {
                br51Var = null;
            }
            pair = new Pair(new yq51(error, br51Var), null);
        } else {
            if (i != 4) {
                w511.b();
                return null;
            }
            pair = new Pair(zq51.a, null);
        }
        return pair == CoroutineSingletons.COROUTINE_SUSPENDED ? pair : new Result(pair);
    }
}
