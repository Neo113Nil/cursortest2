package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.ActionButtonDto;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.transfer.utils.domain.dto.CashbackDto;
import com.ybsdk.core.transfer.utils.domain.dto.UnconditionalLimitWidgetDto;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.n;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Bõ\u0001\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\u0010\b\u0001\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b \u0010!J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010H\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rHÆ\u0003J\t\u0010I\u001a\u00020\u000fHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010M\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u00104J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u0011\u0010Q\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aHÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u001fHÆ\u0003Jü\u0001\u0010T\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0003\u0010\u000e\u001a\u00020\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0010\b\u0003\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÆ\u0001¢\u0006\u0002\u0010UJ\u0013\u0010V\u001a\u00020\u000f2\b\u0010W\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010X\u001a\u00020YHÖ\u0001J\t\u0010Z\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010#R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010#R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010#R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010#R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010#R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010#R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u00105\u001a\u0004\b3\u00104R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010#R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0019\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@¨\u0006["}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CheckTransferDto;", "", "fee", "", "limitWidget", "Lcom/ybsdk/core/transfer/utils/domain/dto/UnconditionalLimitWidgetDto;", "resultPage", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferResultPageDto;", "timeoutResultPage", "tooltip", "tooltipAction", "tooltipActionText", "tooltipActionImage", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "transferAllowed", "", "checkId", "transferId", "preConfirmAction", "dropPreConfirmActionAfterUse", "feeAction", "feePayload", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "cashback", "Lcom/ybsdk/core/transfer/utils/domain/dto/CashbackDto;", "agreements", "", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CheckTransferAgreementDto;", "primaryButton", "Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;", "crossBorderPayload", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CheckCrossBorderPayloadDto;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/transfer/utils/domain/dto/UnconditionalLimitWidgetDto;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferResultPageDto;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferResultPageDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Lcom/ybsdk/core/transfer/utils/domain/dto/CashbackDto;Ljava/util/List;Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CheckCrossBorderPayloadDto;)V", "getFee", "()Ljava/lang/String;", "getLimitWidget", "()Lcom/ybsdk/core/transfer/utils/domain/dto/UnconditionalLimitWidgetDto;", "getResultPage", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferResultPageDto;", "getTimeoutResultPage", "getTooltip", "getTooltipAction", "getTooltipActionText", "getTooltipActionImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getTransferAllowed", "()Z", "getCheckId", "getTransferId", "getPreConfirmAction", "getDropPreConfirmActionAfterUse", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getFeeAction", "getFeePayload", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getCashback", "()Lcom/ybsdk/core/transfer/utils/domain/dto/CashbackDto;", "getAgreements", "()Ljava/util/List;", "getPrimaryButton", "()Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;", "getCrossBorderPayload", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CheckCrossBorderPayloadDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "(Ljava/lang/String;Lcom/ybsdk/core/transfer/utils/domain/dto/UnconditionalLimitWidgetDto;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferResultPageDto;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferResultPageDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Lcom/ybsdk/core/transfer/utils/domain/dto/CashbackDto;Ljava/util/List;Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CheckCrossBorderPayloadDto;)Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CheckTransferDto;", "equals", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CheckTransferDto {
    private final List<CheckTransferAgreementDto> agreements;
    private final CashbackDto cashback;
    private final String checkId;
    private final CheckCrossBorderPayloadDto crossBorderPayload;
    private final Boolean dropPreConfirmActionAfterUse;
    private final String fee;
    private final String feeAction;
    private final DivDataDto feePayload;
    private final UnconditionalLimitWidgetDto limitWidget;
    private final String preConfirmAction;
    private final ActionButtonDto primaryButton;
    private final TransferResultPageDto resultPage;
    private final TransferResultPageDto timeoutResultPage;
    private final String tooltip;
    private final String tooltipAction;
    private final Themes<String> tooltipActionImage;
    private final String tooltipActionText;
    private final boolean transferAllowed;
    private final String transferId;

    public CheckTransferDto(@Json(name = "fee") String str, @Json(name = "limit_widget") UnconditionalLimitWidgetDto unconditionalLimitWidgetDto, @Json(name = "result_page") TransferResultPageDto transferResultPageDto, @Json(name = "timeout_result_page") TransferResultPageDto transferResultPageDto2, @Json(name = "tooltip") String str2, @Json(name = "tooltip_action") String str3, @Json(name = "tooltip_action_text") String str4, @Json(name = "tooltip_action_image") Themes<String> themes, @Json(name = "is_transfer_allowed") boolean z, @Json(name = "check_id") String str5, @Json(name = "transfer_id") String str6, @Json(name = "pre_confirm_action") String str7, @Json(name = "drop_pre_confirm_action_after_use") Boolean bool, @Json(name = "fee_action") String str8, @Json(name = "fee_payload") DivDataDto divDataDto, @Json(name = "cashback") CashbackDto cashbackDto, @Json(name = "agreements") List<CheckTransferAgreementDto> list, @Json(name = "primary_button") ActionButtonDto actionButtonDto, @Json(name = "cross_border_payload") CheckCrossBorderPayloadDto checkCrossBorderPayloadDto) {
        this.fee = str;
        this.limitWidget = unconditionalLimitWidgetDto;
        this.resultPage = transferResultPageDto;
        this.timeoutResultPage = transferResultPageDto2;
        this.tooltip = str2;
        this.tooltipAction = str3;
        this.tooltipActionText = str4;
        this.tooltipActionImage = themes;
        this.transferAllowed = z;
        this.checkId = str5;
        this.transferId = str6;
        this.preConfirmAction = str7;
        this.dropPreConfirmActionAfterUse = bool;
        this.feeAction = str8;
        this.feePayload = divDataDto;
        this.cashback = cashbackDto;
        this.agreements = list;
        this.primaryButton = actionButtonDto;
        this.crossBorderPayload = checkCrossBorderPayloadDto;
    }

    public static /* synthetic */ CheckTransferDto copy$default(CheckTransferDto checkTransferDto, String str, UnconditionalLimitWidgetDto unconditionalLimitWidgetDto, TransferResultPageDto transferResultPageDto, TransferResultPageDto transferResultPageDto2, String str2, String str3, String str4, Themes themes, boolean z, String str5, String str6, String str7, Boolean bool, String str8, DivDataDto divDataDto, CashbackDto cashbackDto, List list, ActionButtonDto actionButtonDto, CheckCrossBorderPayloadDto checkCrossBorderPayloadDto, int i, Object obj) {
        CheckCrossBorderPayloadDto checkCrossBorderPayloadDto2;
        ActionButtonDto actionButtonDto2;
        String str9 = (i & 1) != 0 ? checkTransferDto.fee : str;
        UnconditionalLimitWidgetDto unconditionalLimitWidgetDto2 = (i & 2) != 0 ? checkTransferDto.limitWidget : unconditionalLimitWidgetDto;
        TransferResultPageDto transferResultPageDto3 = (i & 4) != 0 ? checkTransferDto.resultPage : transferResultPageDto;
        TransferResultPageDto transferResultPageDto4 = (i & 8) != 0 ? checkTransferDto.timeoutResultPage : transferResultPageDto2;
        String str10 = (i & 16) != 0 ? checkTransferDto.tooltip : str2;
        String str11 = (i & 32) != 0 ? checkTransferDto.tooltipAction : str3;
        String str12 = (i & 64) != 0 ? checkTransferDto.tooltipActionText : str4;
        Themes themes2 = (i & 128) != 0 ? checkTransferDto.tooltipActionImage : themes;
        boolean z2 = (i & 256) != 0 ? checkTransferDto.transferAllowed : z;
        String str13 = (i & 512) != 0 ? checkTransferDto.checkId : str5;
        String str14 = (i & 1024) != 0 ? checkTransferDto.transferId : str6;
        String str15 = (i & 2048) != 0 ? checkTransferDto.preConfirmAction : str7;
        Boolean bool2 = (i & 4096) != 0 ? checkTransferDto.dropPreConfirmActionAfterUse : bool;
        String str16 = (i & 8192) != 0 ? checkTransferDto.feeAction : str8;
        String str17 = str9;
        DivDataDto divDataDto2 = (i & 16384) != 0 ? checkTransferDto.feePayload : divDataDto;
        CashbackDto cashbackDto2 = (i & 32768) != 0 ? checkTransferDto.cashback : cashbackDto;
        List list2 = (i & 65536) != 0 ? checkTransferDto.agreements : list;
        ActionButtonDto actionButtonDto3 = (i & 131072) != 0 ? checkTransferDto.primaryButton : actionButtonDto;
        if ((i & 262144) != 0) {
            actionButtonDto2 = actionButtonDto3;
            checkCrossBorderPayloadDto2 = checkTransferDto.crossBorderPayload;
        } else {
            checkCrossBorderPayloadDto2 = checkCrossBorderPayloadDto;
            actionButtonDto2 = actionButtonDto3;
        }
        return checkTransferDto.copy(str17, unconditionalLimitWidgetDto2, transferResultPageDto3, transferResultPageDto4, str10, str11, str12, themes2, z2, str13, str14, str15, bool2, str16, divDataDto2, cashbackDto2, list2, actionButtonDto2, checkCrossBorderPayloadDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFee() {
        return this.fee;
    }

    /* renamed from: component10, reason: from getter */
    public final String getCheckId() {
        return this.checkId;
    }

    /* renamed from: component11, reason: from getter */
    public final String getTransferId() {
        return this.transferId;
    }

    /* renamed from: component12, reason: from getter */
    public final String getPreConfirmAction() {
        return this.preConfirmAction;
    }

    /* renamed from: component13, reason: from getter */
    public final Boolean getDropPreConfirmActionAfterUse() {
        return this.dropPreConfirmActionAfterUse;
    }

    /* renamed from: component14, reason: from getter */
    public final String getFeeAction() {
        return this.feeAction;
    }

    /* renamed from: component15, reason: from getter */
    public final DivDataDto getFeePayload() {
        return this.feePayload;
    }

    /* renamed from: component16, reason: from getter */
    public final CashbackDto getCashback() {
        return this.cashback;
    }

    public final List<CheckTransferAgreementDto> component17() {
        return this.agreements;
    }

    /* renamed from: component18, reason: from getter */
    public final ActionButtonDto getPrimaryButton() {
        return this.primaryButton;
    }

    /* renamed from: component19, reason: from getter */
    public final CheckCrossBorderPayloadDto getCrossBorderPayload() {
        return this.crossBorderPayload;
    }

    /* renamed from: component2, reason: from getter */
    public final UnconditionalLimitWidgetDto getLimitWidget() {
        return this.limitWidget;
    }

    /* renamed from: component3, reason: from getter */
    public final TransferResultPageDto getResultPage() {
        return this.resultPage;
    }

    /* renamed from: component4, reason: from getter */
    public final TransferResultPageDto getTimeoutResultPage() {
        return this.timeoutResultPage;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTooltip() {
        return this.tooltip;
    }

    /* renamed from: component6, reason: from getter */
    public final String getTooltipAction() {
        return this.tooltipAction;
    }

    /* renamed from: component7, reason: from getter */
    public final String getTooltipActionText() {
        return this.tooltipActionText;
    }

    public final Themes<String> component8() {
        return this.tooltipActionImage;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getTransferAllowed() {
        return this.transferAllowed;
    }

    public final CheckTransferDto copy(@Json(name = "fee") String fee, @Json(name = "limit_widget") UnconditionalLimitWidgetDto limitWidget, @Json(name = "result_page") TransferResultPageDto resultPage, @Json(name = "timeout_result_page") TransferResultPageDto timeoutResultPage, @Json(name = "tooltip") String tooltip, @Json(name = "tooltip_action") String tooltipAction, @Json(name = "tooltip_action_text") String tooltipActionText, @Json(name = "tooltip_action_image") Themes<String> tooltipActionImage, @Json(name = "is_transfer_allowed") boolean transferAllowed, @Json(name = "check_id") String checkId, @Json(name = "transfer_id") String transferId, @Json(name = "pre_confirm_action") String preConfirmAction, @Json(name = "drop_pre_confirm_action_after_use") Boolean dropPreConfirmActionAfterUse, @Json(name = "fee_action") String feeAction, @Json(name = "fee_payload") DivDataDto feePayload, @Json(name = "cashback") CashbackDto cashback, @Json(name = "agreements") List<CheckTransferAgreementDto> agreements, @Json(name = "primary_button") ActionButtonDto primaryButton, @Json(name = "cross_border_payload") CheckCrossBorderPayloadDto crossBorderPayload) {
        return new CheckTransferDto(fee, limitWidget, resultPage, timeoutResultPage, tooltip, tooltipAction, tooltipActionText, tooltipActionImage, transferAllowed, checkId, transferId, preConfirmAction, dropPreConfirmActionAfterUse, feeAction, feePayload, cashback, agreements, primaryButton, crossBorderPayload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckTransferDto)) {
            return false;
        }
        CheckTransferDto checkTransferDto = (CheckTransferDto) other;
        return jl40.l(this.fee, checkTransferDto.fee) && jl40.l(this.limitWidget, checkTransferDto.limitWidget) && jl40.l(this.resultPage, checkTransferDto.resultPage) && jl40.l(this.timeoutResultPage, checkTransferDto.timeoutResultPage) && jl40.l(this.tooltip, checkTransferDto.tooltip) && jl40.l(this.tooltipAction, checkTransferDto.tooltipAction) && jl40.l(this.tooltipActionText, checkTransferDto.tooltipActionText) && jl40.l(this.tooltipActionImage, checkTransferDto.tooltipActionImage) && this.transferAllowed == checkTransferDto.transferAllowed && jl40.l(this.checkId, checkTransferDto.checkId) && jl40.l(this.transferId, checkTransferDto.transferId) && jl40.l(this.preConfirmAction, checkTransferDto.preConfirmAction) && jl40.l(this.dropPreConfirmActionAfterUse, checkTransferDto.dropPreConfirmActionAfterUse) && jl40.l(this.feeAction, checkTransferDto.feeAction) && jl40.l(this.feePayload, checkTransferDto.feePayload) && jl40.l(this.cashback, checkTransferDto.cashback) && jl40.l(this.agreements, checkTransferDto.agreements) && jl40.l(this.primaryButton, checkTransferDto.primaryButton) && jl40.l(this.crossBorderPayload, checkTransferDto.crossBorderPayload);
    }

    public final List<CheckTransferAgreementDto> getAgreements() {
        return this.agreements;
    }

    public final CashbackDto getCashback() {
        return this.cashback;
    }

    public final String getCheckId() {
        return this.checkId;
    }

    public final CheckCrossBorderPayloadDto getCrossBorderPayload() {
        return this.crossBorderPayload;
    }

    public final Boolean getDropPreConfirmActionAfterUse() {
        return this.dropPreConfirmActionAfterUse;
    }

    public final String getFee() {
        return this.fee;
    }

    public final String getFeeAction() {
        return this.feeAction;
    }

    public final DivDataDto getFeePayload() {
        return this.feePayload;
    }

    public final UnconditionalLimitWidgetDto getLimitWidget() {
        return this.limitWidget;
    }

    public final String getPreConfirmAction() {
        return this.preConfirmAction;
    }

    public final ActionButtonDto getPrimaryButton() {
        return this.primaryButton;
    }

    public final TransferResultPageDto getResultPage() {
        return this.resultPage;
    }

    public final TransferResultPageDto getTimeoutResultPage() {
        return this.timeoutResultPage;
    }

    public final String getTooltip() {
        return this.tooltip;
    }

    public final String getTooltipAction() {
        return this.tooltipAction;
    }

    public final Themes<String> getTooltipActionImage() {
        return this.tooltipActionImage;
    }

    public final String getTooltipActionText() {
        return this.tooltipActionText;
    }

    public final boolean getTransferAllowed() {
        return this.transferAllowed;
    }

    public final String getTransferId() {
        return this.transferId;
    }

    public int hashCode() {
        String str = this.fee;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        UnconditionalLimitWidgetDto unconditionalLimitWidgetDto = this.limitWidget;
        int hashCode2 = (hashCode + (unconditionalLimitWidgetDto == null ? 0 : unconditionalLimitWidgetDto.hashCode())) * 31;
        TransferResultPageDto transferResultPageDto = this.resultPage;
        int hashCode3 = (hashCode2 + (transferResultPageDto == null ? 0 : transferResultPageDto.hashCode())) * 31;
        TransferResultPageDto transferResultPageDto2 = this.timeoutResultPage;
        int hashCode4 = (hashCode3 + (transferResultPageDto2 == null ? 0 : transferResultPageDto2.hashCode())) * 31;
        String str2 = this.tooltip;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tooltipAction;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tooltipActionText;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Themes<String> themes = this.tooltipActionImage;
        int e = unr0.e((hashCode7 + (themes == null ? 0 : themes.hashCode())) * 31, 31, this.transferAllowed);
        String str5 = this.checkId;
        int hashCode8 = (e + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.transferId;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.preConfirmAction;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.dropPreConfirmActionAfterUse;
        int hashCode11 = (hashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str8 = this.feeAction;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        DivDataDto divDataDto = this.feePayload;
        int hashCode13 = (hashCode12 + (divDataDto == null ? 0 : divDataDto.hashCode())) * 31;
        CashbackDto cashbackDto = this.cashback;
        int hashCode14 = (hashCode13 + (cashbackDto == null ? 0 : cashbackDto.hashCode())) * 31;
        List<CheckTransferAgreementDto> list = this.agreements;
        int hashCode15 = (hashCode14 + (list == null ? 0 : list.hashCode())) * 31;
        ActionButtonDto actionButtonDto = this.primaryButton;
        int hashCode16 = (hashCode15 + (actionButtonDto == null ? 0 : actionButtonDto.hashCode())) * 31;
        CheckCrossBorderPayloadDto checkCrossBorderPayloadDto = this.crossBorderPayload;
        return hashCode16 + (checkCrossBorderPayloadDto != null ? checkCrossBorderPayloadDto.hashCode() : 0);
    }

    public String toString() {
        String str = this.fee;
        UnconditionalLimitWidgetDto unconditionalLimitWidgetDto = this.limitWidget;
        TransferResultPageDto transferResultPageDto = this.resultPage;
        TransferResultPageDto transferResultPageDto2 = this.timeoutResultPage;
        String str2 = this.tooltip;
        String str3 = this.tooltipAction;
        String str4 = this.tooltipActionText;
        Themes<String> themes = this.tooltipActionImage;
        boolean z = this.transferAllowed;
        String str5 = this.checkId;
        String str6 = this.transferId;
        String str7 = this.preConfirmAction;
        Boolean bool = this.dropPreConfirmActionAfterUse;
        String str8 = this.feeAction;
        DivDataDto divDataDto = this.feePayload;
        CashbackDto cashbackDto = this.cashback;
        List<CheckTransferAgreementDto> list = this.agreements;
        ActionButtonDto actionButtonDto = this.primaryButton;
        CheckCrossBorderPayloadDto checkCrossBorderPayloadDto = this.crossBorderPayload;
        StringBuilder sb = new StringBuilder("CheckTransferDto(fee=");
        sb.append(str);
        sb.append(", limitWidget=");
        sb.append(unconditionalLimitWidgetDto);
        sb.append(", resultPage=");
        sb.append(transferResultPageDto);
        sb.append(", timeoutResultPage=");
        sb.append(transferResultPageDto2);
        sb.append(", tooltip=");
        g8e.D(sb, str2, ", tooltipAction=", str3, ", tooltipActionText=");
        n.B(sb, str4, ", tooltipActionImage=", themes, ", transferAllowed=");
        unr0.A(", checkId=", str5, ", transferId=", sb, z);
        g8e.D(sb, str6, ", preConfirmAction=", str7, ", dropPreConfirmActionAfterUse=");
        sb.append(bool);
        sb.append(", feeAction=");
        sb.append(str8);
        sb.append(", feePayload=");
        sb.append(divDataDto);
        sb.append(", cashback=");
        sb.append(cashbackDto);
        sb.append(", agreements=");
        sb.append(list);
        sb.append(", primaryButton=");
        sb.append(actionButtonDto);
        sb.append(", crossBorderPayload=");
        sb.append(checkCrossBorderPayloadDto);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
