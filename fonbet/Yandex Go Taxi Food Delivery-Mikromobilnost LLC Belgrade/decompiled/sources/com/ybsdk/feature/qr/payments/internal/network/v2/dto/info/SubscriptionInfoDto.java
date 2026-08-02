package com.ybsdk.feature.qr.payments.internal.network.v2.dto.info;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.feature.qr.payments.internal.network.common.AgreementDto;
import defpackage.b64;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.tse0;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JW\u0010\u001d\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/info/SubscriptionInfoDto;", "", "title", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "logo", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "redirectUrl", "agreementsSheetTitle", "agreements", "", "Lcom/ybsdk/feature/qr/payments/internal/network/common/AgreementDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getLogo", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getRedirectUrl", "getAgreementsSheetTitle", "getAgreements", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SubscriptionInfoDto {
    private final List<AgreementDto> agreements;
    private final String agreementsSheetTitle;
    private final String description;
    private final Themes<String> logo;
    private final String redirectUrl;
    private final String title;

    public SubscriptionInfoDto(@Json(name = "title") String str, @Json(name = "description") String str2, @Json(name = "logo") Themes<String> themes, @Json(name = "redirect_url") String str3, @Json(name = "agreements_sheet_title") String str4, @Json(name = "agreements") List<AgreementDto> list) {
        this.title = str;
        this.description = str2;
        this.logo = themes;
        this.redirectUrl = str3;
        this.agreementsSheetTitle = str4;
        this.agreements = list;
    }

    public static /* synthetic */ SubscriptionInfoDto copy$default(SubscriptionInfoDto subscriptionInfoDto, String str, String str2, Themes themes, String str3, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subscriptionInfoDto.title;
        }
        if ((i & 2) != 0) {
            str2 = subscriptionInfoDto.description;
        }
        if ((i & 4) != 0) {
            themes = subscriptionInfoDto.logo;
        }
        if ((i & 8) != 0) {
            str3 = subscriptionInfoDto.redirectUrl;
        }
        if ((i & 16) != 0) {
            str4 = subscriptionInfoDto.agreementsSheetTitle;
        }
        if ((i & 32) != 0) {
            list = subscriptionInfoDto.agreements;
        }
        String str5 = str4;
        List list2 = list;
        return subscriptionInfoDto.copy(str, str2, themes, str3, str5, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final Themes<String> component3() {
        return this.logo;
    }

    /* renamed from: component4, reason: from getter */
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAgreementsSheetTitle() {
        return this.agreementsSheetTitle;
    }

    public final List<AgreementDto> component6() {
        return this.agreements;
    }

    public final SubscriptionInfoDto copy(@Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "logo") Themes<String> logo, @Json(name = "redirect_url") String redirectUrl, @Json(name = "agreements_sheet_title") String agreementsSheetTitle, @Json(name = "agreements") List<AgreementDto> agreements) {
        return new SubscriptionInfoDto(title, description, logo, redirectUrl, agreementsSheetTitle, agreements);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionInfoDto)) {
            return false;
        }
        SubscriptionInfoDto subscriptionInfoDto = (SubscriptionInfoDto) other;
        return jl40.l(this.title, subscriptionInfoDto.title) && jl40.l(this.description, subscriptionInfoDto.description) && jl40.l(this.logo, subscriptionInfoDto.logo) && jl40.l(this.redirectUrl, subscriptionInfoDto.redirectUrl) && jl40.l(this.agreementsSheetTitle, subscriptionInfoDto.agreementsSheetTitle) && jl40.l(this.agreements, subscriptionInfoDto.agreements);
    }

    public final List<AgreementDto> getAgreements() {
        return this.agreements;
    }

    public final String getAgreementsSheetTitle() {
        return this.agreementsSheetTitle;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Themes<String> getLogo() {
        return this.logo;
    }

    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int c = nnm.c(this.logo, unr0.b(this.title.hashCode() * 31, 31, this.description), 31);
        String str = this.redirectUrl;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.agreementsSheetTitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<AgreementDto> list = this.agreements;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        Themes<String> themes = this.logo;
        String str3 = this.redirectUrl;
        String str4 = this.agreementsSheetTitle;
        List<AgreementDto> list = this.agreements;
        StringBuilder v = b64.v("SubscriptionInfoDto(title=", str, ", description=", str2, ", logo=");
        v.append(themes);
        v.append(", redirectUrl=");
        v.append(str3);
        v.append(", agreementsSheetTitle=");
        return tse0.j(str4, ", agreements=", Extension.C_BRAKE, v, list);
    }
}
