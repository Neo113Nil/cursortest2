package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.tse0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003Ji\u0010&\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001b¨\u0006-"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferPageWidgetWithToggleDto;", "", "title", "", "textColor", "Lcom/ybsdk/core/common/data/network/dto/Themes;", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "controlColor", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/ControlColor;", "infoButton", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/InfoButton;", "autoFundAmount", "Lcom/ybsdk/core/common/data/network/dto/Money;", "autoTopupAmount", "autoTopupThreshold", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/ControlColor;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/InfoButton;Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/core/common/data/network/dto/Money;)V", "getTitle", "()Ljava/lang/String;", "getTextColor", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getBackgroundColor", "getControlColor", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/ControlColor;", "getInfoButton", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/InfoButton;", "getAutoFundAmount", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getAutoTopupAmount", "getAutoTopupThreshold", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransferPageWidgetWithToggleDto {
    private final Money autoFundAmount;
    private final Money autoTopupAmount;
    private final Money autoTopupThreshold;
    private final Themes<String> backgroundColor;
    private final ControlColor controlColor;
    private final InfoButton infoButton;
    private final Themes<String> textColor;
    private final String title;

    public TransferPageWidgetWithToggleDto(@Json(name = "title") String str, @Json(name = "text_color") Themes<String> themes, @Json(name = "background_color") Themes<String> themes2, @Json(name = "control_color") ControlColor controlColor, @Json(name = "info_button") InfoButton infoButton, @Json(name = "autofund_amount") Money money, @Json(name = "autotopup_amount") Money money2, @Json(name = "autotopup_threshold") Money money3) {
        this.title = str;
        this.textColor = themes;
        this.backgroundColor = themes2;
        this.controlColor = controlColor;
        this.infoButton = infoButton;
        this.autoFundAmount = money;
        this.autoTopupAmount = money2;
        this.autoTopupThreshold = money3;
    }

    public static /* synthetic */ TransferPageWidgetWithToggleDto copy$default(TransferPageWidgetWithToggleDto transferPageWidgetWithToggleDto, String str, Themes themes, Themes themes2, ControlColor controlColor, InfoButton infoButton, Money money, Money money2, Money money3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transferPageWidgetWithToggleDto.title;
        }
        if ((i & 2) != 0) {
            themes = transferPageWidgetWithToggleDto.textColor;
        }
        if ((i & 4) != 0) {
            themes2 = transferPageWidgetWithToggleDto.backgroundColor;
        }
        if ((i & 8) != 0) {
            controlColor = transferPageWidgetWithToggleDto.controlColor;
        }
        if ((i & 16) != 0) {
            infoButton = transferPageWidgetWithToggleDto.infoButton;
        }
        if ((i & 32) != 0) {
            money = transferPageWidgetWithToggleDto.autoFundAmount;
        }
        if ((i & 64) != 0) {
            money2 = transferPageWidgetWithToggleDto.autoTopupAmount;
        }
        if ((i & 128) != 0) {
            money3 = transferPageWidgetWithToggleDto.autoTopupThreshold;
        }
        Money money4 = money2;
        Money money5 = money3;
        InfoButton infoButton2 = infoButton;
        Money money6 = money;
        return transferPageWidgetWithToggleDto.copy(str, themes, themes2, controlColor, infoButton2, money6, money4, money5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final Themes<String> component2() {
        return this.textColor;
    }

    public final Themes<String> component3() {
        return this.backgroundColor;
    }

    /* renamed from: component4, reason: from getter */
    public final ControlColor getControlColor() {
        return this.controlColor;
    }

    /* renamed from: component5, reason: from getter */
    public final InfoButton getInfoButton() {
        return this.infoButton;
    }

    /* renamed from: component6, reason: from getter */
    public final Money getAutoFundAmount() {
        return this.autoFundAmount;
    }

    /* renamed from: component7, reason: from getter */
    public final Money getAutoTopupAmount() {
        return this.autoTopupAmount;
    }

    /* renamed from: component8, reason: from getter */
    public final Money getAutoTopupThreshold() {
        return this.autoTopupThreshold;
    }

    public final TransferPageWidgetWithToggleDto copy(@Json(name = "title") String title, @Json(name = "text_color") Themes<String> textColor, @Json(name = "background_color") Themes<String> backgroundColor, @Json(name = "control_color") ControlColor controlColor, @Json(name = "info_button") InfoButton infoButton, @Json(name = "autofund_amount") Money autoFundAmount, @Json(name = "autotopup_amount") Money autoTopupAmount, @Json(name = "autotopup_threshold") Money autoTopupThreshold) {
        return new TransferPageWidgetWithToggleDto(title, textColor, backgroundColor, controlColor, infoButton, autoFundAmount, autoTopupAmount, autoTopupThreshold);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferPageWidgetWithToggleDto)) {
            return false;
        }
        TransferPageWidgetWithToggleDto transferPageWidgetWithToggleDto = (TransferPageWidgetWithToggleDto) other;
        return jl40.l(this.title, transferPageWidgetWithToggleDto.title) && jl40.l(this.textColor, transferPageWidgetWithToggleDto.textColor) && jl40.l(this.backgroundColor, transferPageWidgetWithToggleDto.backgroundColor) && jl40.l(this.controlColor, transferPageWidgetWithToggleDto.controlColor) && jl40.l(this.infoButton, transferPageWidgetWithToggleDto.infoButton) && jl40.l(this.autoFundAmount, transferPageWidgetWithToggleDto.autoFundAmount) && jl40.l(this.autoTopupAmount, transferPageWidgetWithToggleDto.autoTopupAmount) && jl40.l(this.autoTopupThreshold, transferPageWidgetWithToggleDto.autoTopupThreshold);
    }

    public final Money getAutoFundAmount() {
        return this.autoFundAmount;
    }

    public final Money getAutoTopupAmount() {
        return this.autoTopupAmount;
    }

    public final Money getAutoTopupThreshold() {
        return this.autoTopupThreshold;
    }

    public final Themes<String> getBackgroundColor() {
        return this.backgroundColor;
    }

    public final ControlColor getControlColor() {
        return this.controlColor;
    }

    public final InfoButton getInfoButton() {
        return this.infoButton;
    }

    public final Themes<String> getTextColor() {
        return this.textColor;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int c = tse0.c(this.autoFundAmount, (this.infoButton.hashCode() + ((this.controlColor.hashCode() + nnm.c(this.backgroundColor, nnm.c(this.textColor, this.title.hashCode() * 31, 31), 31)) * 31)) * 31, 31);
        Money money = this.autoTopupAmount;
        int hashCode = (c + (money == null ? 0 : money.hashCode())) * 31;
        Money money2 = this.autoTopupThreshold;
        return hashCode + (money2 != null ? money2.hashCode() : 0);
    }

    public String toString() {
        return "TransferPageWidgetWithToggleDto(title=" + this.title + ", textColor=" + this.textColor + ", backgroundColor=" + this.backgroundColor + ", controlColor=" + this.controlColor + ", infoButton=" + this.infoButton + ", autoFundAmount=" + this.autoFundAmount + ", autoTopupAmount=" + this.autoTopupAmount + ", autoTopupThreshold=" + this.autoTopupThreshold + Extension.C_BRAKE;
    }
}
