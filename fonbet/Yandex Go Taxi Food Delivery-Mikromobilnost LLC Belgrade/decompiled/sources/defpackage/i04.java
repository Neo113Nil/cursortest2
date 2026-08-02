package defpackage;

import com.ybsdk.core.common.data.network.dto.ActionButtonDto;
import com.ybsdk.core.common.data.network.dto.CommonSheet;
import com.ybsdk.core.common.data.network.dto.Me2MeInfo;
import com.ybsdk.core.common.data.network.dto.SavingsAccountInfo;
import com.ybsdk.core.common.data.network.dto.YandexAccountInfo;
import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.common.domain.entities.CommonSheetEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.autotopup.api.AutoTopupSwitchStatus;
import com.ybsdk.feature.autotopup.api.AutoTopupType;
import com.ybsdk.feature.autotopup.internal.network.dto.AutoTopupParamsDto;
import com.ybsdk.feature.autotopup.internal.network.dto.AutoTopupSwitchStatusRequestDto;
import com.ybsdk.feature.autotopup.internal.network.dto.AutoTopupTypeRequestDto;
import com.ybsdk.feature.autotopup.internal.network.dto.SaveAutoTopupSuccessResponse;
import java.math.BigDecimal;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class i04 {
    public static final yv3 a(AutoTopupParamsDto autoTopupParamsDto, lr3 lr3Var) {
        AutoTopupType autoTopupType;
        AutoTopupSwitchStatus autoTopupSwitchStatus;
        BigDecimal amount = autoTopupParamsDto.getAmount();
        BigDecimal threshold = autoTopupParamsDto.getThreshold();
        YandexAccountInfo yandexAccountInfo = autoTopupParamsDto.getPaymentMethodInfo().getYandexAccountInfo();
        AutoTopupSwitchStatus autoTopupSwitchStatus2 = null;
        String agreementId = yandexAccountInfo != null ? yandexAccountInfo.getAgreementId() : null;
        SavingsAccountInfo savingsAccountInfo = autoTopupParamsDto.getPaymentMethodInfo().getSavingsAccountInfo();
        String agreementId2 = savingsAccountInfo != null ? savingsAccountInfo.getAgreementId() : null;
        Me2MeInfo me2meInfo = autoTopupParamsDto.getPaymentMethodInfo().getMe2meInfo();
        q5a0 q5a0Var = new q5a0(agreementId, agreementId2, me2meInfo != null ? me2meInfo.getPartnerId() : null, autoTopupParamsDto.getPaymentMethodInfo().getPaymentType());
        AutoTopupTypeRequestDto autoTopupType2 = autoTopupParamsDto.getAutoTopupType();
        if (autoTopupType2 != null) {
            int i = h04.h[autoTopupType2.ordinal()];
            if (i == 1) {
                autoTopupType = AutoTopupType.BALANCE_THRESHOLD;
            } else {
                if (i != 2) {
                    w511.b();
                    return null;
                }
                autoTopupType = AutoTopupType.UP_TO_BALANCE;
            }
        } else {
            autoTopupType = null;
        }
        AutoTopupSwitchStatusRequestDto autoTopupStatus = autoTopupParamsDto.getAutoTopupStatus();
        if (autoTopupStatus != null) {
            int i2 = h04.i[autoTopupStatus.ordinal()];
            if (i2 == 1) {
                autoTopupSwitchStatus = AutoTopupSwitchStatus.ENABLED;
            } else {
                if (i2 != 2) {
                    w511.b();
                    return null;
                }
                autoTopupSwitchStatus = AutoTopupSwitchStatus.DISABLED;
            }
            autoTopupSwitchStatus2 = autoTopupSwitchStatus;
        }
        return new yv3(amount, threshold, q5a0Var, autoTopupType, autoTopupSwitchStatus2, lr3Var);
    }

    public static final AutoTopupSwitchStatusRequestDto b(AutoTopupSwitchStatus autoTopupSwitchStatus) {
        int i = h04.e[autoTopupSwitchStatus.ordinal()];
        if (i == 1) {
            return AutoTopupSwitchStatusRequestDto.ENABLED;
        }
        if (i == 2) {
            return AutoTopupSwitchStatusRequestDto.DISABLED;
        }
        w511.b();
        return null;
    }

    public static final ty3 c(SaveAutoTopupSuccessResponse saveAutoTopupSuccessResponse, boolean z) {
        String requestId = saveAutoTopupSuccessResponse.getRequestId();
        ActionButtonDto button = saveAutoTopupSuccessResponse.getButton();
        ActionButtonEntity actionButtonEntity = button != null ? new ActionButtonEntity(g8e.i(Text.Companion, button.getText()), button.getAction(), false, null, 12, null) : null;
        CommonSheet appNotFoundSheet = saveAutoTopupSuccessResponse.getAppNotFoundSheet();
        CommonSheetEntity a = appNotFoundSheet != null ? kpc.a(appNotFoundSheet) : null;
        SaveAutoTopupSuccessResponse.SaveAutoTopupResultDto resultData = saveAutoTopupSuccessResponse.getResultData();
        ThemedImageUrlEntity c = qxy0.c(resultData.getImage(), null);
        String title = resultData.getTitle();
        String subtitle = resultData.getSubtitle();
        SaveAutoTopupSuccessResponse.SaveAutoTopupButtonDto primaryButton = resultData.getPrimaryButton();
        return new ty3(requestId, actionButtonEntity, a, new sy3(c, title, subtitle, new ActionButtonEntity(g8e.i(Text.Companion, primaryButton.getText()), primaryButton.getAction(), false, null, 12, null)), z);
    }

    public static final AutoTopupTypeRequestDto d(AutoTopupType autoTopupType) {
        int i = h04.d[autoTopupType.ordinal()];
        if (i == 1) {
            return AutoTopupTypeRequestDto.BALANCE_THRESHOLD;
        }
        if (i == 2) {
            return AutoTopupTypeRequestDto.UP_TO_BALANCE;
        }
        w511.b();
        return null;
    }

    public static final BigDecimal e(String str) {
        Locale locale = tm60.a;
        BigDecimal g = tm60.g(str);
        return g == null ? BigDecimal.ZERO : g;
    }
}
