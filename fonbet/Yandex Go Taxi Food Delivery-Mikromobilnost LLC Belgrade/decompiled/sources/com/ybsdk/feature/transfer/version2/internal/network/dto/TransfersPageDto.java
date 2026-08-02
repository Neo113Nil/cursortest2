package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.ActionButtonDto;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.xvz;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Bo\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0001\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003Jv\u0010)\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0003\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020\r2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\f\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014¨\u00060"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransfersPageDto;", "", "agreements", "", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/AgreementInfoDto;", "agreementsBottomSheetTitle", "", "defaultMoneyValue", "Lcom/ybsdk/core/common/data/network/dto/Money;", "title", "primaryButton", "Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;", "isAmountEditable", "", "autotopupWidget", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferPageWidgetWithToggleDto;", "autotopupWhitelistNspkMembersConfirmation", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;Ljava/lang/Boolean;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferPageWidgetWithToggleDto;Ljava/util/List;)V", "getAgreements", "()Ljava/util/List;", "getAgreementsBottomSheetTitle", "()Ljava/lang/String;", "getDefaultMoneyValue", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getTitle", "getPrimaryButton", "()Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAutotopupWidget", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferPageWidgetWithToggleDto;", "getAutotopupWhitelistNspkMembersConfirmation", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/util/List;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;Ljava/lang/Boolean;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferPageWidgetWithToggleDto;Ljava/util/List;)Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransfersPageDto;", "equals", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransfersPageDto {
    private final List<AgreementInfoDto> agreements;
    private final String agreementsBottomSheetTitle;
    private final List<String> autotopupWhitelistNspkMembersConfirmation;
    private final TransferPageWidgetWithToggleDto autotopupWidget;
    private final Money defaultMoneyValue;
    private final Boolean isAmountEditable;
    private final ActionButtonDto primaryButton;
    private final String title;

    public TransfersPageDto(@Json(name = "agreements") List<AgreementInfoDto> list, @Json(name = "agreements_sheet_title") String str, @Json(name = "default_money_value") Money money, @Json(name = "title") String str2, @Json(name = "primary_button") ActionButtonDto actionButtonDto, @Json(name = "is_amount_editable") Boolean bool, @Json(name = "autotopup_widget") TransferPageWidgetWithToggleDto transferPageWidgetWithToggleDto, @Json(name = "autotopup_whitelist_nspk_members_confirmation") List<String> list2) {
        this.agreements = list;
        this.agreementsBottomSheetTitle = str;
        this.defaultMoneyValue = money;
        this.title = str2;
        this.primaryButton = actionButtonDto;
        this.isAmountEditable = bool;
        this.autotopupWidget = transferPageWidgetWithToggleDto;
        this.autotopupWhitelistNspkMembersConfirmation = list2;
    }

    public static /* synthetic */ TransfersPageDto copy$default(TransfersPageDto transfersPageDto, List list, String str, Money money, String str2, ActionButtonDto actionButtonDto, Boolean bool, TransferPageWidgetWithToggleDto transferPageWidgetWithToggleDto, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = transfersPageDto.agreements;
        }
        if ((i & 2) != 0) {
            str = transfersPageDto.agreementsBottomSheetTitle;
        }
        if ((i & 4) != 0) {
            money = transfersPageDto.defaultMoneyValue;
        }
        if ((i & 8) != 0) {
            str2 = transfersPageDto.title;
        }
        if ((i & 16) != 0) {
            actionButtonDto = transfersPageDto.primaryButton;
        }
        if ((i & 32) != 0) {
            bool = transfersPageDto.isAmountEditable;
        }
        if ((i & 64) != 0) {
            transferPageWidgetWithToggleDto = transfersPageDto.autotopupWidget;
        }
        if ((i & 128) != 0) {
            list2 = transfersPageDto.autotopupWhitelistNspkMembersConfirmation;
        }
        TransferPageWidgetWithToggleDto transferPageWidgetWithToggleDto2 = transferPageWidgetWithToggleDto;
        List list3 = list2;
        ActionButtonDto actionButtonDto2 = actionButtonDto;
        Boolean bool2 = bool;
        return transfersPageDto.copy(list, str, money, str2, actionButtonDto2, bool2, transferPageWidgetWithToggleDto2, list3);
    }

    public final List<AgreementInfoDto> component1() {
        return this.agreements;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAgreementsBottomSheetTitle() {
        return this.agreementsBottomSheetTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final Money getDefaultMoneyValue() {
        return this.defaultMoneyValue;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component5, reason: from getter */
    public final ActionButtonDto getPrimaryButton() {
        return this.primaryButton;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getIsAmountEditable() {
        return this.isAmountEditable;
    }

    /* renamed from: component7, reason: from getter */
    public final TransferPageWidgetWithToggleDto getAutotopupWidget() {
        return this.autotopupWidget;
    }

    public final List<String> component8() {
        return this.autotopupWhitelistNspkMembersConfirmation;
    }

    public final TransfersPageDto copy(@Json(name = "agreements") List<AgreementInfoDto> agreements, @Json(name = "agreements_sheet_title") String agreementsBottomSheetTitle, @Json(name = "default_money_value") Money defaultMoneyValue, @Json(name = "title") String title, @Json(name = "primary_button") ActionButtonDto primaryButton, @Json(name = "is_amount_editable") Boolean isAmountEditable, @Json(name = "autotopup_widget") TransferPageWidgetWithToggleDto autotopupWidget, @Json(name = "autotopup_whitelist_nspk_members_confirmation") List<String> autotopupWhitelistNspkMembersConfirmation) {
        return new TransfersPageDto(agreements, agreementsBottomSheetTitle, defaultMoneyValue, title, primaryButton, isAmountEditable, autotopupWidget, autotopupWhitelistNspkMembersConfirmation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransfersPageDto)) {
            return false;
        }
        TransfersPageDto transfersPageDto = (TransfersPageDto) other;
        return jl40.l(this.agreements, transfersPageDto.agreements) && jl40.l(this.agreementsBottomSheetTitle, transfersPageDto.agreementsBottomSheetTitle) && jl40.l(this.defaultMoneyValue, transfersPageDto.defaultMoneyValue) && jl40.l(this.title, transfersPageDto.title) && jl40.l(this.primaryButton, transfersPageDto.primaryButton) && jl40.l(this.isAmountEditable, transfersPageDto.isAmountEditable) && jl40.l(this.autotopupWidget, transfersPageDto.autotopupWidget) && jl40.l(this.autotopupWhitelistNspkMembersConfirmation, transfersPageDto.autotopupWhitelistNspkMembersConfirmation);
    }

    public final List<AgreementInfoDto> getAgreements() {
        return this.agreements;
    }

    public final String getAgreementsBottomSheetTitle() {
        return this.agreementsBottomSheetTitle;
    }

    public final List<String> getAutotopupWhitelistNspkMembersConfirmation() {
        return this.autotopupWhitelistNspkMembersConfirmation;
    }

    public final TransferPageWidgetWithToggleDto getAutotopupWidget() {
        return this.autotopupWidget;
    }

    public final Money getDefaultMoneyValue() {
        return this.defaultMoneyValue;
    }

    public final ActionButtonDto getPrimaryButton() {
        return this.primaryButton;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b = unr0.b(this.agreements.hashCode() * 31, 31, this.agreementsBottomSheetTitle);
        Money money = this.defaultMoneyValue;
        int hashCode = (b + (money == null ? 0 : money.hashCode())) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ActionButtonDto actionButtonDto = this.primaryButton;
        int hashCode3 = (hashCode2 + (actionButtonDto == null ? 0 : actionButtonDto.hashCode())) * 31;
        Boolean bool = this.isAmountEditable;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        TransferPageWidgetWithToggleDto transferPageWidgetWithToggleDto = this.autotopupWidget;
        int hashCode5 = (hashCode4 + (transferPageWidgetWithToggleDto == null ? 0 : transferPageWidgetWithToggleDto.hashCode())) * 31;
        List<String> list = this.autotopupWhitelistNspkMembersConfirmation;
        return hashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final Boolean isAmountEditable() {
        return this.isAmountEditable;
    }

    public String toString() {
        List<AgreementInfoDto> list = this.agreements;
        String str = this.agreementsBottomSheetTitle;
        Money money = this.defaultMoneyValue;
        String str2 = this.title;
        ActionButtonDto actionButtonDto = this.primaryButton;
        Boolean bool = this.isAmountEditable;
        TransferPageWidgetWithToggleDto transferPageWidgetWithToggleDto = this.autotopupWidget;
        List<String> list2 = this.autotopupWhitelistNspkMembersConfirmation;
        StringBuilder s = xvz.s("TransfersPageDto(agreements=", list, ", agreementsBottomSheetTitle=", str, ", defaultMoneyValue=");
        s.append(money);
        s.append(", title=");
        s.append(str2);
        s.append(", primaryButton=");
        s.append(actionButtonDto);
        s.append(", isAmountEditable=");
        s.append(bool);
        s.append(", autotopupWidget=");
        s.append(transferPageWidgetWithToggleDto);
        s.append(", autotopupWhitelistNspkMembersConfirmation=");
        s.append(list2);
        s.append(Extension.C_BRAKE);
        return s.toString();
    }
}
