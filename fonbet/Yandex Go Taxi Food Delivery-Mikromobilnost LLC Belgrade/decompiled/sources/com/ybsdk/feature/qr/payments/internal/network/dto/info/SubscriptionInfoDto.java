package com.ybsdk.feature.qr.payments.internal.network.dto.info;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.feature.qr.payments.internal.network.common.AgreementDto;
import defpackage.b64;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.n;
import defpackage.tse0;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JW\u0010\u001f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u000fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/SubscriptionInfoDto;", "", "title", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "logo", "themedLogo", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "agreementsSheetTitle", "agreements", "", "Lcom/ybsdk/feature/qr/payments/internal/network/common/AgreementDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getLogo$annotations", "()V", "getLogo", "getThemedLogo", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getAgreementsSheetTitle", "getAgreements", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SubscriptionInfoDto {
    private final List<AgreementDto> agreements;
    private final String agreementsSheetTitle;
    private final String description;
    private final String logo;
    private final Themes<String> themedLogo;
    private final String title;

    public SubscriptionInfoDto(@Json(name = "title") String str, @Json(name = "description") String str2, @Json(name = "logo") String str3, @Json(name = "themed_logo") Themes<String> themes, @Json(name = "agreements_sheet_title") String str4, @Json(name = "agreements") List<AgreementDto> list) {
        this.title = str;
        this.description = str2;
        this.logo = str3;
        this.themedLogo = themes;
        this.agreementsSheetTitle = str4;
        this.agreements = list;
    }

    public static /* synthetic */ SubscriptionInfoDto copy$default(SubscriptionInfoDto subscriptionInfoDto, String str, String str2, String str3, Themes themes, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subscriptionInfoDto.title;
        }
        if ((i & 2) != 0) {
            str2 = subscriptionInfoDto.description;
        }
        if ((i & 4) != 0) {
            str3 = subscriptionInfoDto.logo;
        }
        if ((i & 8) != 0) {
            themes = subscriptionInfoDto.themedLogo;
        }
        if ((i & 16) != 0) {
            str4 = subscriptionInfoDto.agreementsSheetTitle;
        }
        if ((i & 32) != 0) {
            list = subscriptionInfoDto.agreements;
        }
        String str5 = str4;
        List list2 = list;
        return subscriptionInfoDto.copy(str, str2, str3, themes, str5, list2);
    }

    @jxi
    public static /* synthetic */ void getLogo$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    public final Themes<String> component4() {
        return this.themedLogo;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAgreementsSheetTitle() {
        return this.agreementsSheetTitle;
    }

    public final List<AgreementDto> component6() {
        return this.agreements;
    }

    public final SubscriptionInfoDto copy(@Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "logo") String logo, @Json(name = "themed_logo") Themes<String> themedLogo, @Json(name = "agreements_sheet_title") String agreementsSheetTitle, @Json(name = "agreements") List<AgreementDto> agreements) {
        return new SubscriptionInfoDto(title, description, logo, themedLogo, agreementsSheetTitle, agreements);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionInfoDto)) {
            return false;
        }
        SubscriptionInfoDto subscriptionInfoDto = (SubscriptionInfoDto) other;
        return jl40.l(this.title, subscriptionInfoDto.title) && jl40.l(this.description, subscriptionInfoDto.description) && jl40.l(this.logo, subscriptionInfoDto.logo) && jl40.l(this.themedLogo, subscriptionInfoDto.themedLogo) && jl40.l(this.agreementsSheetTitle, subscriptionInfoDto.agreementsSheetTitle) && jl40.l(this.agreements, subscriptionInfoDto.agreements);
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

    public final String getLogo() {
        return this.logo;
    }

    public final Themes<String> getThemedLogo() {
        return this.themedLogo;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b = unr0.b(unr0.b(this.title.hashCode() * 31, 31, this.description), 31, this.logo);
        Themes<String> themes = this.themedLogo;
        int hashCode = (b + (themes == null ? 0 : themes.hashCode())) * 31;
        String str = this.agreementsSheetTitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<AgreementDto> list = this.agreements;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        String str3 = this.logo;
        Themes<String> themes = this.themedLogo;
        String str4 = this.agreementsSheetTitle;
        List<AgreementDto> list = this.agreements;
        StringBuilder v = b64.v("SubscriptionInfoDto(title=", str, ", description=", str2, ", logo=");
        n.B(v, str3, ", themedLogo=", themes, ", agreementsSheetTitle=");
        return tse0.j(str4, ", agreements=", Extension.C_BRAKE, v, list);
    }
}
