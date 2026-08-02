package com.ybsdk.feature.credit.deposit.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\u0010\b\u0001\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0003J\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010+\u001a\u00020\u0011HÆ\u0003J\u0089\u0001\u0010,\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n2\u0010\b\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0003\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0013\u0010-\u001a\u00020\u00112\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010!¨\u00062"}, d2 = {"Lcom/ybsdk/feature/credit/deposit/internal/network/dto/CreditDepositAmountCheckResponse;", "", "amountDescription", "", "tooltip", "tooltipAmount", "tooltipPosition", "tooltipActionText", "tooltipAction", "tooltipActionImage", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "suggests", "", "Lcom/ybsdk/feature/credit/deposit/internal/network/dto/SuggestDto;", "divkitData", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "isPaymentAllowed", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/util/List;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Z)V", "getAmountDescription", "()Ljava/lang/String;", "getTooltip", "getTooltipAmount", "getTooltipPosition", "getTooltipActionText", "getTooltipAction", "getTooltipActionImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getSuggests", "()Ljava/util/List;", "getDivkitData", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "", "toString", "feature-credit-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CreditDepositAmountCheckResponse {
    private final String amountDescription;
    private final DivDataDto divkitData;
    private final boolean isPaymentAllowed;
    private final List<SuggestDto> suggests;
    private final String tooltip;
    private final String tooltipAction;
    private final Themes<String> tooltipActionImage;
    private final String tooltipActionText;
    private final String tooltipAmount;
    private final String tooltipPosition;

    public CreditDepositAmountCheckResponse(@Json(name = "amount_description") String str, @Json(name = "tooltip") String str2, @Json(name = "tooltip_amount") String str3, @Json(name = "tooltip_position") String str4, @Json(name = "tooltip_action_text") String str5, @Json(name = "tooltip_action") String str6, @Json(name = "tooltip_action_image") Themes<String> themes, @Json(name = "suggests") List<SuggestDto> list, @Json(name = "divkit_data") DivDataDto divDataDto, @Json(name = "is_payment_allowed") boolean z) {
        this.amountDescription = str;
        this.tooltip = str2;
        this.tooltipAmount = str3;
        this.tooltipPosition = str4;
        this.tooltipActionText = str5;
        this.tooltipAction = str6;
        this.tooltipActionImage = themes;
        this.suggests = list;
        this.divkitData = divDataDto;
        this.isPaymentAllowed = z;
    }

    public static /* synthetic */ CreditDepositAmountCheckResponse copy$default(CreditDepositAmountCheckResponse creditDepositAmountCheckResponse, String str, String str2, String str3, String str4, String str5, String str6, Themes themes, List list, DivDataDto divDataDto, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = creditDepositAmountCheckResponse.amountDescription;
        }
        if ((i & 2) != 0) {
            str2 = creditDepositAmountCheckResponse.tooltip;
        }
        if ((i & 4) != 0) {
            str3 = creditDepositAmountCheckResponse.tooltipAmount;
        }
        if ((i & 8) != 0) {
            str4 = creditDepositAmountCheckResponse.tooltipPosition;
        }
        if ((i & 16) != 0) {
            str5 = creditDepositAmountCheckResponse.tooltipActionText;
        }
        if ((i & 32) != 0) {
            str6 = creditDepositAmountCheckResponse.tooltipAction;
        }
        if ((i & 64) != 0) {
            themes = creditDepositAmountCheckResponse.tooltipActionImage;
        }
        if ((i & 128) != 0) {
            list = creditDepositAmountCheckResponse.suggests;
        }
        if ((i & 256) != 0) {
            divDataDto = creditDepositAmountCheckResponse.divkitData;
        }
        if ((i & 512) != 0) {
            z = creditDepositAmountCheckResponse.isPaymentAllowed;
        }
        DivDataDto divDataDto2 = divDataDto;
        boolean z2 = z;
        Themes themes2 = themes;
        List list2 = list;
        String str7 = str5;
        String str8 = str6;
        return creditDepositAmountCheckResponse.copy(str, str2, str3, str4, str7, str8, themes2, list2, divDataDto2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAmountDescription() {
        return this.amountDescription;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsPaymentAllowed() {
        return this.isPaymentAllowed;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTooltip() {
        return this.tooltip;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTooltipAmount() {
        return this.tooltipAmount;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTooltipPosition() {
        return this.tooltipPosition;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTooltipActionText() {
        return this.tooltipActionText;
    }

    /* renamed from: component6, reason: from getter */
    public final String getTooltipAction() {
        return this.tooltipAction;
    }

    public final Themes<String> component7() {
        return this.tooltipActionImage;
    }

    public final List<SuggestDto> component8() {
        return this.suggests;
    }

    /* renamed from: component9, reason: from getter */
    public final DivDataDto getDivkitData() {
        return this.divkitData;
    }

    public final CreditDepositAmountCheckResponse copy(@Json(name = "amount_description") String amountDescription, @Json(name = "tooltip") String tooltip, @Json(name = "tooltip_amount") String tooltipAmount, @Json(name = "tooltip_position") String tooltipPosition, @Json(name = "tooltip_action_text") String tooltipActionText, @Json(name = "tooltip_action") String tooltipAction, @Json(name = "tooltip_action_image") Themes<String> tooltipActionImage, @Json(name = "suggests") List<SuggestDto> suggests, @Json(name = "divkit_data") DivDataDto divkitData, @Json(name = "is_payment_allowed") boolean isPaymentAllowed) {
        return new CreditDepositAmountCheckResponse(amountDescription, tooltip, tooltipAmount, tooltipPosition, tooltipActionText, tooltipAction, tooltipActionImage, suggests, divkitData, isPaymentAllowed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditDepositAmountCheckResponse)) {
            return false;
        }
        CreditDepositAmountCheckResponse creditDepositAmountCheckResponse = (CreditDepositAmountCheckResponse) other;
        return jl40.l(this.amountDescription, creditDepositAmountCheckResponse.amountDescription) && jl40.l(this.tooltip, creditDepositAmountCheckResponse.tooltip) && jl40.l(this.tooltipAmount, creditDepositAmountCheckResponse.tooltipAmount) && jl40.l(this.tooltipPosition, creditDepositAmountCheckResponse.tooltipPosition) && jl40.l(this.tooltipActionText, creditDepositAmountCheckResponse.tooltipActionText) && jl40.l(this.tooltipAction, creditDepositAmountCheckResponse.tooltipAction) && jl40.l(this.tooltipActionImage, creditDepositAmountCheckResponse.tooltipActionImage) && jl40.l(this.suggests, creditDepositAmountCheckResponse.suggests) && jl40.l(this.divkitData, creditDepositAmountCheckResponse.divkitData) && this.isPaymentAllowed == creditDepositAmountCheckResponse.isPaymentAllowed;
    }

    public final String getAmountDescription() {
        return this.amountDescription;
    }

    public final DivDataDto getDivkitData() {
        return this.divkitData;
    }

    public final List<SuggestDto> getSuggests() {
        return this.suggests;
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

    public final String getTooltipAmount() {
        return this.tooltipAmount;
    }

    public final String getTooltipPosition() {
        return this.tooltipPosition;
    }

    public int hashCode() {
        int hashCode = this.amountDescription.hashCode() * 31;
        String str = this.tooltip;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.tooltipAmount;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tooltipPosition;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tooltipActionText;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.tooltipAction;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Themes<String> themes = this.tooltipActionImage;
        int hashCode7 = (hashCode6 + (themes == null ? 0 : themes.hashCode())) * 31;
        List<SuggestDto> list = this.suggests;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        DivDataDto divDataDto = this.divkitData;
        return Boolean.hashCode(this.isPaymentAllowed) + ((hashCode8 + (divDataDto != null ? divDataDto.hashCode() : 0)) * 31);
    }

    public final boolean isPaymentAllowed() {
        return this.isPaymentAllowed;
    }

    public String toString() {
        String str = this.amountDescription;
        String str2 = this.tooltip;
        String str3 = this.tooltipAmount;
        String str4 = this.tooltipPosition;
        String str5 = this.tooltipActionText;
        String str6 = this.tooltipAction;
        Themes<String> themes = this.tooltipActionImage;
        List<SuggestDto> list = this.suggests;
        DivDataDto divDataDto = this.divkitData;
        boolean z = this.isPaymentAllowed;
        StringBuilder v = b64.v("CreditDepositAmountCheckResponse(amountDescription=", str, ", tooltip=", str2, ", tooltipAmount=");
        g8e.D(v, str3, ", tooltipPosition=", str4, ", tooltipActionText=");
        g8e.D(v, str5, ", tooltipAction=", str6, ", tooltipActionImage=");
        v.append(themes);
        v.append(", suggests=");
        v.append(list);
        v.append(", divkitData=");
        v.append(divDataDto);
        v.append(", isPaymentAllowed=");
        v.append(z);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
