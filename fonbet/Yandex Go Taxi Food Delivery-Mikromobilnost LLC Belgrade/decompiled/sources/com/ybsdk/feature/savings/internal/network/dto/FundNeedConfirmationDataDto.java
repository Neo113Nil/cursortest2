package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0001\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bHÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/FundNeedConfirmationDataDto;", "", "title", "", "subtitle", "bottomDivkitWidget", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "primaryButton", "Lcom/ybsdk/feature/savings/internal/network/dto/ActionButtonDto;", "secondaryButton", "backgroundImage", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Lcom/ybsdk/feature/savings/internal/network/dto/ActionButtonDto;Lcom/ybsdk/feature/savings/internal/network/dto/ActionButtonDto;Lcom/ybsdk/core/common/data/network/dto/Themes;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getBottomDivkitWidget", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getPrimaryButton", "()Lcom/ybsdk/feature/savings/internal/network/dto/ActionButtonDto;", "getSecondaryButton", "getBackgroundImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FundNeedConfirmationDataDto {
    private final Themes<String> backgroundImage;
    private final DivDataDto bottomDivkitWidget;
    private final ActionButtonDto primaryButton;
    private final ActionButtonDto secondaryButton;
    private final String subtitle;
    private final String title;

    public FundNeedConfirmationDataDto(@Json(name = "title") String str, @Json(name = "subtitle") String str2, @Json(name = "bottom_divkit_widget") DivDataDto divDataDto, @Json(name = "primary_button") ActionButtonDto actionButtonDto, @Json(name = "secondary_button") ActionButtonDto actionButtonDto2, @Json(name = "background_image") Themes<String> themes) {
        this.title = str;
        this.subtitle = str2;
        this.bottomDivkitWidget = divDataDto;
        this.primaryButton = actionButtonDto;
        this.secondaryButton = actionButtonDto2;
        this.backgroundImage = themes;
    }

    public static /* synthetic */ FundNeedConfirmationDataDto copy$default(FundNeedConfirmationDataDto fundNeedConfirmationDataDto, String str, String str2, DivDataDto divDataDto, ActionButtonDto actionButtonDto, ActionButtonDto actionButtonDto2, Themes themes, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fundNeedConfirmationDataDto.title;
        }
        if ((i & 2) != 0) {
            str2 = fundNeedConfirmationDataDto.subtitle;
        }
        if ((i & 4) != 0) {
            divDataDto = fundNeedConfirmationDataDto.bottomDivkitWidget;
        }
        if ((i & 8) != 0) {
            actionButtonDto = fundNeedConfirmationDataDto.primaryButton;
        }
        if ((i & 16) != 0) {
            actionButtonDto2 = fundNeedConfirmationDataDto.secondaryButton;
        }
        if ((i & 32) != 0) {
            themes = fundNeedConfirmationDataDto.backgroundImage;
        }
        ActionButtonDto actionButtonDto3 = actionButtonDto2;
        Themes themes2 = themes;
        return fundNeedConfirmationDataDto.copy(str, str2, divDataDto, actionButtonDto, actionButtonDto3, themes2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final DivDataDto getBottomDivkitWidget() {
        return this.bottomDivkitWidget;
    }

    /* renamed from: component4, reason: from getter */
    public final ActionButtonDto getPrimaryButton() {
        return this.primaryButton;
    }

    /* renamed from: component5, reason: from getter */
    public final ActionButtonDto getSecondaryButton() {
        return this.secondaryButton;
    }

    public final Themes<String> component6() {
        return this.backgroundImage;
    }

    public final FundNeedConfirmationDataDto copy(@Json(name = "title") String title, @Json(name = "subtitle") String subtitle, @Json(name = "bottom_divkit_widget") DivDataDto bottomDivkitWidget, @Json(name = "primary_button") ActionButtonDto primaryButton, @Json(name = "secondary_button") ActionButtonDto secondaryButton, @Json(name = "background_image") Themes<String> backgroundImage) {
        return new FundNeedConfirmationDataDto(title, subtitle, bottomDivkitWidget, primaryButton, secondaryButton, backgroundImage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FundNeedConfirmationDataDto)) {
            return false;
        }
        FundNeedConfirmationDataDto fundNeedConfirmationDataDto = (FundNeedConfirmationDataDto) other;
        return jl40.l(this.title, fundNeedConfirmationDataDto.title) && jl40.l(this.subtitle, fundNeedConfirmationDataDto.subtitle) && jl40.l(this.bottomDivkitWidget, fundNeedConfirmationDataDto.bottomDivkitWidget) && jl40.l(this.primaryButton, fundNeedConfirmationDataDto.primaryButton) && jl40.l(this.secondaryButton, fundNeedConfirmationDataDto.secondaryButton) && jl40.l(this.backgroundImage, fundNeedConfirmationDataDto.backgroundImage);
    }

    public final Themes<String> getBackgroundImage() {
        return this.backgroundImage;
    }

    public final DivDataDto getBottomDivkitWidget() {
        return this.bottomDivkitWidget;
    }

    public final ActionButtonDto getPrimaryButton() {
        return this.primaryButton;
    }

    public final ActionButtonDto getSecondaryButton() {
        return this.secondaryButton;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = (this.primaryButton.hashCode() + ((this.bottomDivkitWidget.hashCode() + unr0.b(this.title.hashCode() * 31, 31, this.subtitle)) * 31)) * 31;
        ActionButtonDto actionButtonDto = this.secondaryButton;
        int hashCode2 = (hashCode + (actionButtonDto == null ? 0 : actionButtonDto.hashCode())) * 31;
        Themes<String> themes = this.backgroundImage;
        return hashCode2 + (themes != null ? themes.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        DivDataDto divDataDto = this.bottomDivkitWidget;
        ActionButtonDto actionButtonDto = this.primaryButton;
        ActionButtonDto actionButtonDto2 = this.secondaryButton;
        Themes<String> themes = this.backgroundImage;
        StringBuilder v = b64.v("FundNeedConfirmationDataDto(title=", str, ", subtitle=", str2, ", bottomDivkitWidget=");
        v.append(divDataDto);
        v.append(", primaryButton=");
        v.append(actionButtonDto);
        v.append(", secondaryButton=");
        v.append(actionButtonDto2);
        v.append(", backgroundImage=");
        v.append(themes);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
