package com.ybsdk.core.common.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\u0010\b\u0001\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jq\u0010$\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\b\b\u0003\u0010\u000b\u001a\u00020\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006+"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/CurrentPaymentMethodDto;", "", "title", "", "subtitle", "selectedMethodDescription", "money", "Lcom/ybsdk/core/common/data/network/dto/Money;", "logo", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "secondLogo", "info", "Lcom/ybsdk/core/common/data/network/dto/PaymentMethodInfoDto;", "legalText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/PaymentMethodInfoDto;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getSelectedMethodDescription", "getMoney", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getLogo", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getSecondLogo", "getInfo", "()Lcom/ybsdk/core/common/data/network/dto/PaymentMethodInfoDto;", "getLegalText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CurrentPaymentMethodDto {
    private final PaymentMethodInfoDto info;
    private final String legalText;
    private final Themes<String> logo;
    private final Money money;
    private final Themes<String> secondLogo;
    private final String selectedMethodDescription;
    private final String subtitle;
    private final String title;

    public CurrentPaymentMethodDto(@Json(name = "title") String str, @Json(name = "subtitle") String str2, @Json(name = "selected_method_description") String str3, @Json(name = "money") Money money, @Json(name = "logo") Themes<String> themes, @Json(name = "second_logo") Themes<String> themes2, @Json(name = "info") PaymentMethodInfoDto paymentMethodInfoDto, @Json(name = "legal_text") String str4) {
        this.title = str;
        this.subtitle = str2;
        this.selectedMethodDescription = str3;
        this.money = money;
        this.logo = themes;
        this.secondLogo = themes2;
        this.info = paymentMethodInfoDto;
        this.legalText = str4;
    }

    public static /* synthetic */ CurrentPaymentMethodDto copy$default(CurrentPaymentMethodDto currentPaymentMethodDto, String str, String str2, String str3, Money money, Themes themes, Themes themes2, PaymentMethodInfoDto paymentMethodInfoDto, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = currentPaymentMethodDto.title;
        }
        if ((i & 2) != 0) {
            str2 = currentPaymentMethodDto.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = currentPaymentMethodDto.selectedMethodDescription;
        }
        if ((i & 8) != 0) {
            money = currentPaymentMethodDto.money;
        }
        if ((i & 16) != 0) {
            themes = currentPaymentMethodDto.logo;
        }
        if ((i & 32) != 0) {
            themes2 = currentPaymentMethodDto.secondLogo;
        }
        if ((i & 64) != 0) {
            paymentMethodInfoDto = currentPaymentMethodDto.info;
        }
        if ((i & 128) != 0) {
            str4 = currentPaymentMethodDto.legalText;
        }
        PaymentMethodInfoDto paymentMethodInfoDto2 = paymentMethodInfoDto;
        String str5 = str4;
        Themes themes3 = themes;
        Themes themes4 = themes2;
        return currentPaymentMethodDto.copy(str, str2, str3, money, themes3, themes4, paymentMethodInfoDto2, str5);
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
    public final String getSelectedMethodDescription() {
        return this.selectedMethodDescription;
    }

    /* renamed from: component4, reason: from getter */
    public final Money getMoney() {
        return this.money;
    }

    public final Themes<String> component5() {
        return this.logo;
    }

    public final Themes<String> component6() {
        return this.secondLogo;
    }

    /* renamed from: component7, reason: from getter */
    public final PaymentMethodInfoDto getInfo() {
        return this.info;
    }

    /* renamed from: component8, reason: from getter */
    public final String getLegalText() {
        return this.legalText;
    }

    public final CurrentPaymentMethodDto copy(@Json(name = "title") String title, @Json(name = "subtitle") String subtitle, @Json(name = "selected_method_description") String selectedMethodDescription, @Json(name = "money") Money money, @Json(name = "logo") Themes<String> logo, @Json(name = "second_logo") Themes<String> secondLogo, @Json(name = "info") PaymentMethodInfoDto info, @Json(name = "legal_text") String legalText) {
        return new CurrentPaymentMethodDto(title, subtitle, selectedMethodDescription, money, logo, secondLogo, info, legalText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrentPaymentMethodDto)) {
            return false;
        }
        CurrentPaymentMethodDto currentPaymentMethodDto = (CurrentPaymentMethodDto) other;
        return jl40.l(this.title, currentPaymentMethodDto.title) && jl40.l(this.subtitle, currentPaymentMethodDto.subtitle) && jl40.l(this.selectedMethodDescription, currentPaymentMethodDto.selectedMethodDescription) && jl40.l(this.money, currentPaymentMethodDto.money) && jl40.l(this.logo, currentPaymentMethodDto.logo) && jl40.l(this.secondLogo, currentPaymentMethodDto.secondLogo) && jl40.l(this.info, currentPaymentMethodDto.info) && jl40.l(this.legalText, currentPaymentMethodDto.legalText);
    }

    public final PaymentMethodInfoDto getInfo() {
        return this.info;
    }

    public final String getLegalText() {
        return this.legalText;
    }

    public final Themes<String> getLogo() {
        return this.logo;
    }

    public final Money getMoney() {
        return this.money;
    }

    public final Themes<String> getSecondLogo() {
        return this.secondLogo;
    }

    public final String getSelectedMethodDescription() {
        return this.selectedMethodDescription;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.selectedMethodDescription;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Money money = this.money;
        int hashCode4 = (hashCode3 + (money == null ? 0 : money.hashCode())) * 31;
        Themes<String> themes = this.logo;
        int hashCode5 = (hashCode4 + (themes == null ? 0 : themes.hashCode())) * 31;
        Themes<String> themes2 = this.secondLogo;
        int hashCode6 = (this.info.hashCode() + ((hashCode5 + (themes2 == null ? 0 : themes2.hashCode())) * 31)) * 31;
        String str3 = this.legalText;
        return hashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.selectedMethodDescription;
        Money money = this.money;
        Themes<String> themes = this.logo;
        Themes<String> themes2 = this.secondLogo;
        PaymentMethodInfoDto paymentMethodInfoDto = this.info;
        String str4 = this.legalText;
        StringBuilder v = b64.v("CurrentPaymentMethodDto(title=", str, ", subtitle=", str2, ", selectedMethodDescription=");
        v.append(str3);
        v.append(", money=");
        v.append(money);
        v.append(", logo=");
        v.append(themes);
        v.append(", secondLogo=");
        v.append(themes2);
        v.append(", info=");
        v.append(paymentMethodInfoDto);
        v.append(", legalText=");
        v.append(str4);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
