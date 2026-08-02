package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.jl40;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010+\u001a\u0004\u0018\u00010\u0010HÆ\u0003Jr\u0010,\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020\u000e2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u000203HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00064"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/SingleCardResponse;", "", "header", "Lcom/ybsdk/feature/card/internal/network/dto/SingleCardHeaderResponse;", "cardDetails", "Lcom/ybsdk/feature/card/internal/network/dto/SingleCarDetailsResponse;", "settings", "Lcom/ybsdk/feature/card/internal/network/dto/SingleCardDetailsSettingsSectionResponse;", "managementSettings", "notificationDivData", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "cardAdditionalSetting", "bottomNotification", "showRequisites", "", "snackbars", "Lcom/ybsdk/feature/card/internal/network/dto/Snackbars;", "<init>", "(Lcom/ybsdk/feature/card/internal/network/dto/SingleCardHeaderResponse;Lcom/ybsdk/feature/card/internal/network/dto/SingleCarDetailsResponse;Lcom/ybsdk/feature/card/internal/network/dto/SingleCardDetailsSettingsSectionResponse;Lcom/ybsdk/feature/card/internal/network/dto/SingleCardDetailsSettingsSectionResponse;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Lcom/ybsdk/feature/card/internal/network/dto/SingleCardDetailsSettingsSectionResponse;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Ljava/lang/Boolean;Lcom/ybsdk/feature/card/internal/network/dto/Snackbars;)V", "getHeader", "()Lcom/ybsdk/feature/card/internal/network/dto/SingleCardHeaderResponse;", "getCardDetails", "()Lcom/ybsdk/feature/card/internal/network/dto/SingleCarDetailsResponse;", "getSettings", "()Lcom/ybsdk/feature/card/internal/network/dto/SingleCardDetailsSettingsSectionResponse;", "getManagementSettings", "getNotificationDivData", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getCardAdditionalSetting", "getBottomNotification", "getShowRequisites", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSnackbars", "()Lcom/ybsdk/feature/card/internal/network/dto/Snackbars;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/ybsdk/feature/card/internal/network/dto/SingleCardHeaderResponse;Lcom/ybsdk/feature/card/internal/network/dto/SingleCarDetailsResponse;Lcom/ybsdk/feature/card/internal/network/dto/SingleCardDetailsSettingsSectionResponse;Lcom/ybsdk/feature/card/internal/network/dto/SingleCardDetailsSettingsSectionResponse;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Lcom/ybsdk/feature/card/internal/network/dto/SingleCardDetailsSettingsSectionResponse;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Ljava/lang/Boolean;Lcom/ybsdk/feature/card/internal/network/dto/Snackbars;)Lcom/ybsdk/feature/card/internal/network/dto/SingleCardResponse;", "equals", "other", "hashCode", "", "toString", "", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SingleCardResponse {
    private final DivDataDto bottomNotification;
    private final SingleCardDetailsSettingsSectionResponse cardAdditionalSetting;
    private final SingleCarDetailsResponse cardDetails;
    private final SingleCardHeaderResponse header;
    private final SingleCardDetailsSettingsSectionResponse managementSettings;
    private final DivDataDto notificationDivData;
    private final SingleCardDetailsSettingsSectionResponse settings;
    private final Boolean showRequisites;
    private final Snackbars snackbars;

    public SingleCardResponse(@Json(name = "header") SingleCardHeaderResponse singleCardHeaderResponse, @Json(name = "card_details") SingleCarDetailsResponse singleCarDetailsResponse, @Json(name = "settings") SingleCardDetailsSettingsSectionResponse singleCardDetailsSettingsSectionResponse, @Json(name = "management_settings") SingleCardDetailsSettingsSectionResponse singleCardDetailsSettingsSectionResponse2, @Json(name = "notifications") DivDataDto divDataDto, @Json(name = "card_additional_setting") SingleCardDetailsSettingsSectionResponse singleCardDetailsSettingsSectionResponse3, @Json(name = "bottom_notification") DivDataDto divDataDto2, @Json(name = "show_requisites") Boolean bool, @Json(name = "snackbars") Snackbars snackbars) {
        this.header = singleCardHeaderResponse;
        this.cardDetails = singleCarDetailsResponse;
        this.settings = singleCardDetailsSettingsSectionResponse;
        this.managementSettings = singleCardDetailsSettingsSectionResponse2;
        this.notificationDivData = divDataDto;
        this.cardAdditionalSetting = singleCardDetailsSettingsSectionResponse3;
        this.bottomNotification = divDataDto2;
        this.showRequisites = bool;
        this.snackbars = snackbars;
    }

    public static /* synthetic */ SingleCardResponse copy$default(SingleCardResponse singleCardResponse, SingleCardHeaderResponse singleCardHeaderResponse, SingleCarDetailsResponse singleCarDetailsResponse, SingleCardDetailsSettingsSectionResponse singleCardDetailsSettingsSectionResponse, SingleCardDetailsSettingsSectionResponse singleCardDetailsSettingsSectionResponse2, DivDataDto divDataDto, SingleCardDetailsSettingsSectionResponse singleCardDetailsSettingsSectionResponse3, DivDataDto divDataDto2, Boolean bool, Snackbars snackbars, int i, Object obj) {
        if ((i & 1) != 0) {
            singleCardHeaderResponse = singleCardResponse.header;
        }
        if ((i & 2) != 0) {
            singleCarDetailsResponse = singleCardResponse.cardDetails;
        }
        if ((i & 4) != 0) {
            singleCardDetailsSettingsSectionResponse = singleCardResponse.settings;
        }
        if ((i & 8) != 0) {
            singleCardDetailsSettingsSectionResponse2 = singleCardResponse.managementSettings;
        }
        if ((i & 16) != 0) {
            divDataDto = singleCardResponse.notificationDivData;
        }
        if ((i & 32) != 0) {
            singleCardDetailsSettingsSectionResponse3 = singleCardResponse.cardAdditionalSetting;
        }
        if ((i & 64) != 0) {
            divDataDto2 = singleCardResponse.bottomNotification;
        }
        if ((i & 128) != 0) {
            bool = singleCardResponse.showRequisites;
        }
        if ((i & 256) != 0) {
            snackbars = singleCardResponse.snackbars;
        }
        Boolean bool2 = bool;
        Snackbars snackbars2 = snackbars;
        SingleCardDetailsSettingsSectionResponse singleCardDetailsSettingsSectionResponse4 = singleCardDetailsSettingsSectionResponse3;
        DivDataDto divDataDto3 = divDataDto2;
        DivDataDto divDataDto4 = divDataDto;
        SingleCardDetailsSettingsSectionResponse singleCardDetailsSettingsSectionResponse5 = singleCardDetailsSettingsSectionResponse;
        return singleCardResponse.copy(singleCardHeaderResponse, singleCarDetailsResponse, singleCardDetailsSettingsSectionResponse5, singleCardDetailsSettingsSectionResponse2, divDataDto4, singleCardDetailsSettingsSectionResponse4, divDataDto3, bool2, snackbars2);
    }

    /* renamed from: component1, reason: from getter */
    public final SingleCardHeaderResponse getHeader() {
        return this.header;
    }

    /* renamed from: component2, reason: from getter */
    public final SingleCarDetailsResponse getCardDetails() {
        return this.cardDetails;
    }

    /* renamed from: component3, reason: from getter */
    public final SingleCardDetailsSettingsSectionResponse getSettings() {
        return this.settings;
    }

    /* renamed from: component4, reason: from getter */
    public final SingleCardDetailsSettingsSectionResponse getManagementSettings() {
        return this.managementSettings;
    }

    /* renamed from: component5, reason: from getter */
    public final DivDataDto getNotificationDivData() {
        return this.notificationDivData;
    }

    /* renamed from: component6, reason: from getter */
    public final SingleCardDetailsSettingsSectionResponse getCardAdditionalSetting() {
        return this.cardAdditionalSetting;
    }

    /* renamed from: component7, reason: from getter */
    public final DivDataDto getBottomNotification() {
        return this.bottomNotification;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getShowRequisites() {
        return this.showRequisites;
    }

    /* renamed from: component9, reason: from getter */
    public final Snackbars getSnackbars() {
        return this.snackbars;
    }

    public final SingleCardResponse copy(@Json(name = "header") SingleCardHeaderResponse header, @Json(name = "card_details") SingleCarDetailsResponse cardDetails, @Json(name = "settings") SingleCardDetailsSettingsSectionResponse settings, @Json(name = "management_settings") SingleCardDetailsSettingsSectionResponse managementSettings, @Json(name = "notifications") DivDataDto notificationDivData, @Json(name = "card_additional_setting") SingleCardDetailsSettingsSectionResponse cardAdditionalSetting, @Json(name = "bottom_notification") DivDataDto bottomNotification, @Json(name = "show_requisites") Boolean showRequisites, @Json(name = "snackbars") Snackbars snackbars) {
        return new SingleCardResponse(header, cardDetails, settings, managementSettings, notificationDivData, cardAdditionalSetting, bottomNotification, showRequisites, snackbars);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleCardResponse)) {
            return false;
        }
        SingleCardResponse singleCardResponse = (SingleCardResponse) other;
        return jl40.l(this.header, singleCardResponse.header) && jl40.l(this.cardDetails, singleCardResponse.cardDetails) && jl40.l(this.settings, singleCardResponse.settings) && jl40.l(this.managementSettings, singleCardResponse.managementSettings) && jl40.l(this.notificationDivData, singleCardResponse.notificationDivData) && jl40.l(this.cardAdditionalSetting, singleCardResponse.cardAdditionalSetting) && jl40.l(this.bottomNotification, singleCardResponse.bottomNotification) && jl40.l(this.showRequisites, singleCardResponse.showRequisites) && jl40.l(this.snackbars, singleCardResponse.snackbars);
    }

    public final DivDataDto getBottomNotification() {
        return this.bottomNotification;
    }

    public final SingleCardDetailsSettingsSectionResponse getCardAdditionalSetting() {
        return this.cardAdditionalSetting;
    }

    public final SingleCarDetailsResponse getCardDetails() {
        return this.cardDetails;
    }

    public final SingleCardHeaderResponse getHeader() {
        return this.header;
    }

    public final SingleCardDetailsSettingsSectionResponse getManagementSettings() {
        return this.managementSettings;
    }

    public final DivDataDto getNotificationDivData() {
        return this.notificationDivData;
    }

    public final SingleCardDetailsSettingsSectionResponse getSettings() {
        return this.settings;
    }

    public final Boolean getShowRequisites() {
        return this.showRequisites;
    }

    public final Snackbars getSnackbars() {
        return this.snackbars;
    }

    public int hashCode() {
        int hashCode = (this.managementSettings.hashCode() + ((this.settings.hashCode() + ((this.cardDetails.hashCode() + (this.header.hashCode() * 31)) * 31)) * 31)) * 31;
        DivDataDto divDataDto = this.notificationDivData;
        int hashCode2 = (hashCode + (divDataDto == null ? 0 : divDataDto.hashCode())) * 31;
        SingleCardDetailsSettingsSectionResponse singleCardDetailsSettingsSectionResponse = this.cardAdditionalSetting;
        int hashCode3 = (hashCode2 + (singleCardDetailsSettingsSectionResponse == null ? 0 : singleCardDetailsSettingsSectionResponse.hashCode())) * 31;
        DivDataDto divDataDto2 = this.bottomNotification;
        int hashCode4 = (hashCode3 + (divDataDto2 == null ? 0 : divDataDto2.hashCode())) * 31;
        Boolean bool = this.showRequisites;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Snackbars snackbars = this.snackbars;
        return hashCode5 + (snackbars != null ? snackbars.hashCode() : 0);
    }

    public String toString() {
        return "SingleCardResponse(header=" + this.header + ", cardDetails=" + this.cardDetails + ", settings=" + this.settings + ", managementSettings=" + this.managementSettings + ", notificationDivData=" + this.notificationDivData + ", cardAdditionalSetting=" + this.cardAdditionalSetting + ", bottomNotification=" + this.bottomNotification + ", showRequisites=" + this.showRequisites + ", snackbars=" + this.snackbars + Extension.C_BRAKE;
    }

    public /* synthetic */ SingleCardResponse(SingleCardHeaderResponse singleCardHeaderResponse, SingleCarDetailsResponse singleCarDetailsResponse, SingleCardDetailsSettingsSectionResponse singleCardDetailsSettingsSectionResponse, SingleCardDetailsSettingsSectionResponse singleCardDetailsSettingsSectionResponse2, DivDataDto divDataDto, SingleCardDetailsSettingsSectionResponse singleCardDetailsSettingsSectionResponse3, DivDataDto divDataDto2, Boolean bool, Snackbars snackbars, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(singleCardHeaderResponse, singleCarDetailsResponse, singleCardDetailsSettingsSectionResponse, singleCardDetailsSettingsSectionResponse2, divDataDto, (i & 32) != 0 ? null : singleCardDetailsSettingsSectionResponse3, divDataDto2, bool, (i & 256) != 0 ? null : snackbars);
    }
}
