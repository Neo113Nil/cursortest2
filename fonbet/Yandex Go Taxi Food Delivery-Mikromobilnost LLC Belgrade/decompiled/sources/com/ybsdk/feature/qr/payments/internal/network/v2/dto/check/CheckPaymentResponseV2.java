package com.ybsdk.feature.qr.payments.internal.network.v2.dto.check;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.qr.payments.internal.network.common.CredlimCheckPayloadDto;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.unr0;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Bm\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0016\b\u0001\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0017\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000fHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jo\u0010)\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\u0016\b\u0003\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010*\u001a\u00020\u00032\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015¨\u0006/"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/check/CheckPaymentResponseV2;", "", "isPaymentAllowed", "", "checkId", "", "tooltip", "Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/check/TooltipWithActionDto;", "resultPageData", "Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/check/ResultPageDataDto;", "divkitWidget", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "credlimPayload", "Lcom/ybsdk/feature/qr/payments/internal/network/common/CredlimCheckPayloadDto;", "divkitAgreementsChipText", "", "declineReason", "<init>", "(ZLjava/lang/String;Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/check/TooltipWithActionDto;Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/check/ResultPageDataDto;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Lcom/ybsdk/feature/qr/payments/internal/network/common/CredlimCheckPayloadDto;Ljava/util/Map;Ljava/lang/String;)V", "()Z", "getCheckId", "()Ljava/lang/String;", "getTooltip", "()Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/check/TooltipWithActionDto;", "getResultPageData", "()Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/check/ResultPageDataDto;", "getDivkitWidget", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getCredlimPayload", "()Lcom/ybsdk/feature/qr/payments/internal/network/common/CredlimCheckPayloadDto;", "getDivkitAgreementsChipText", "()Ljava/util/Map;", "getDeclineReason", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CheckPaymentResponseV2 {
    private final String checkId;
    private final CredlimCheckPayloadDto credlimPayload;
    private final String declineReason;
    private final Map<String, String> divkitAgreementsChipText;
    private final DivDataDto divkitWidget;
    private final boolean isPaymentAllowed;
    private final ResultPageDataDto resultPageData;
    private final TooltipWithActionDto tooltip;

    public CheckPaymentResponseV2(@Json(name = "is_payment_allowed") boolean z, @Json(name = "check_id") String str, @Json(name = "tooltip") TooltipWithActionDto tooltipWithActionDto, @Json(name = "result_page_data") ResultPageDataDto resultPageDataDto, @Json(name = "divkit_widget") DivDataDto divDataDto, @Json(name = "credlim_payload") CredlimCheckPayloadDto credlimCheckPayloadDto, @Json(name = "divkit_agreements_chip_text") Map<String, String> map, @Json(name = "decline_reason") String str2) {
        this.isPaymentAllowed = z;
        this.checkId = str;
        this.tooltip = tooltipWithActionDto;
        this.resultPageData = resultPageDataDto;
        this.divkitWidget = divDataDto;
        this.credlimPayload = credlimCheckPayloadDto;
        this.divkitAgreementsChipText = map;
        this.declineReason = str2;
    }

    public static /* synthetic */ CheckPaymentResponseV2 copy$default(CheckPaymentResponseV2 checkPaymentResponseV2, boolean z, String str, TooltipWithActionDto tooltipWithActionDto, ResultPageDataDto resultPageDataDto, DivDataDto divDataDto, CredlimCheckPayloadDto credlimCheckPayloadDto, Map map, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = checkPaymentResponseV2.isPaymentAllowed;
        }
        if ((i & 2) != 0) {
            str = checkPaymentResponseV2.checkId;
        }
        if ((i & 4) != 0) {
            tooltipWithActionDto = checkPaymentResponseV2.tooltip;
        }
        if ((i & 8) != 0) {
            resultPageDataDto = checkPaymentResponseV2.resultPageData;
        }
        if ((i & 16) != 0) {
            divDataDto = checkPaymentResponseV2.divkitWidget;
        }
        if ((i & 32) != 0) {
            credlimCheckPayloadDto = checkPaymentResponseV2.credlimPayload;
        }
        if ((i & 64) != 0) {
            map = checkPaymentResponseV2.divkitAgreementsChipText;
        }
        if ((i & 128) != 0) {
            str2 = checkPaymentResponseV2.declineReason;
        }
        Map map2 = map;
        String str3 = str2;
        DivDataDto divDataDto2 = divDataDto;
        CredlimCheckPayloadDto credlimCheckPayloadDto2 = credlimCheckPayloadDto;
        return checkPaymentResponseV2.copy(z, str, tooltipWithActionDto, resultPageDataDto, divDataDto2, credlimCheckPayloadDto2, map2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsPaymentAllowed() {
        return this.isPaymentAllowed;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCheckId() {
        return this.checkId;
    }

    /* renamed from: component3, reason: from getter */
    public final TooltipWithActionDto getTooltip() {
        return this.tooltip;
    }

    /* renamed from: component4, reason: from getter */
    public final ResultPageDataDto getResultPageData() {
        return this.resultPageData;
    }

    /* renamed from: component5, reason: from getter */
    public final DivDataDto getDivkitWidget() {
        return this.divkitWidget;
    }

    /* renamed from: component6, reason: from getter */
    public final CredlimCheckPayloadDto getCredlimPayload() {
        return this.credlimPayload;
    }

    public final Map<String, String> component7() {
        return this.divkitAgreementsChipText;
    }

    /* renamed from: component8, reason: from getter */
    public final String getDeclineReason() {
        return this.declineReason;
    }

    public final CheckPaymentResponseV2 copy(@Json(name = "is_payment_allowed") boolean isPaymentAllowed, @Json(name = "check_id") String checkId, @Json(name = "tooltip") TooltipWithActionDto tooltip, @Json(name = "result_page_data") ResultPageDataDto resultPageData, @Json(name = "divkit_widget") DivDataDto divkitWidget, @Json(name = "credlim_payload") CredlimCheckPayloadDto credlimPayload, @Json(name = "divkit_agreements_chip_text") Map<String, String> divkitAgreementsChipText, @Json(name = "decline_reason") String declineReason) {
        return new CheckPaymentResponseV2(isPaymentAllowed, checkId, tooltip, resultPageData, divkitWidget, credlimPayload, divkitAgreementsChipText, declineReason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckPaymentResponseV2)) {
            return false;
        }
        CheckPaymentResponseV2 checkPaymentResponseV2 = (CheckPaymentResponseV2) other;
        return this.isPaymentAllowed == checkPaymentResponseV2.isPaymentAllowed && jl40.l(this.checkId, checkPaymentResponseV2.checkId) && jl40.l(this.tooltip, checkPaymentResponseV2.tooltip) && jl40.l(this.resultPageData, checkPaymentResponseV2.resultPageData) && jl40.l(this.divkitWidget, checkPaymentResponseV2.divkitWidget) && jl40.l(this.credlimPayload, checkPaymentResponseV2.credlimPayload) && jl40.l(this.divkitAgreementsChipText, checkPaymentResponseV2.divkitAgreementsChipText) && jl40.l(this.declineReason, checkPaymentResponseV2.declineReason);
    }

    public final String getCheckId() {
        return this.checkId;
    }

    public final CredlimCheckPayloadDto getCredlimPayload() {
        return this.credlimPayload;
    }

    public final String getDeclineReason() {
        return this.declineReason;
    }

    public final Map<String, String> getDivkitAgreementsChipText() {
        return this.divkitAgreementsChipText;
    }

    public final DivDataDto getDivkitWidget() {
        return this.divkitWidget;
    }

    public final ResultPageDataDto getResultPageData() {
        return this.resultPageData;
    }

    public final TooltipWithActionDto getTooltip() {
        return this.tooltip;
    }

    public int hashCode() {
        int b = unr0.b(Boolean.hashCode(this.isPaymentAllowed) * 31, 31, this.checkId);
        TooltipWithActionDto tooltipWithActionDto = this.tooltip;
        int hashCode = (this.resultPageData.hashCode() + ((b + (tooltipWithActionDto == null ? 0 : tooltipWithActionDto.hashCode())) * 31)) * 31;
        DivDataDto divDataDto = this.divkitWidget;
        int hashCode2 = (hashCode + (divDataDto == null ? 0 : divDataDto.hashCode())) * 31;
        CredlimCheckPayloadDto credlimCheckPayloadDto = this.credlimPayload;
        int hashCode3 = (hashCode2 + (credlimCheckPayloadDto == null ? 0 : credlimCheckPayloadDto.hashCode())) * 31;
        Map<String, String> map = this.divkitAgreementsChipText;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.declineReason;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final boolean isPaymentAllowed() {
        return this.isPaymentAllowed;
    }

    public String toString() {
        boolean z = this.isPaymentAllowed;
        String str = this.checkId;
        TooltipWithActionDto tooltipWithActionDto = this.tooltip;
        ResultPageDataDto resultPageDataDto = this.resultPageData;
        DivDataDto divDataDto = this.divkitWidget;
        CredlimCheckPayloadDto credlimCheckPayloadDto = this.credlimPayload;
        Map<String, String> map = this.divkitAgreementsChipText;
        String str2 = this.declineReason;
        StringBuilder v = ly3.v("CheckPaymentResponseV2(isPaymentAllowed=", ", checkId=", str, ", tooltip=", z);
        v.append(tooltipWithActionDto);
        v.append(", resultPageData=");
        v.append(resultPageDataDto);
        v.append(", divkitWidget=");
        v.append(divDataDto);
        v.append(", credlimPayload=");
        v.append(credlimCheckPayloadDto);
        v.append(", divkitAgreementsChipText=");
        v.append(map);
        v.append(", declineReason=");
        v.append(str2);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
