package com.ybsdk.core.common.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.n;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÅ\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\u0010\b\u0001\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u00104\u001a\u00020\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00109\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0003J\u0011\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÇ\u0001\u0010C\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n2\u0010\b\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010G\u001a\u00020HHÖ\u0001J\t\u0010I\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u001e\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u001cR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001cR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001c¨\u0006J"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/PaymentMethodDto;", "", "title", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "amount", "Lcom/ybsdk/core/common/data/network/dto/Money;", "selectedMethodDescription", "logo", "secondLogo", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "themedLogo", "type", "Lcom/ybsdk/core/common/data/network/dto/PaymentMethodTypeDto;", "ybSuggestId", "cardInfo", "Lcom/ybsdk/core/common/data/network/dto/CardInfoDto;", "me2meInfo", "Lcom/ybsdk/core/common/data/network/dto/Me2MeInfo;", "savingsAccountInfo", "Lcom/ybsdk/core/common/data/network/dto/SavingsAccountInfo;", "yandexAccountInfo", "Lcom/ybsdk/core/common/data/network/dto/YandexAccountInfo;", "legalText", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/PaymentMethodTypeDto;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/CardInfoDto;Lcom/ybsdk/core/common/data/network/dto/Me2MeInfo;Lcom/ybsdk/core/common/data/network/dto/SavingsAccountInfo;Lcom/ybsdk/core/common/data/network/dto/YandexAccountInfo;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getAmount", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getSelectedMethodDescription", "getLogo$annotations", "()V", "getLogo", "getSecondLogo", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getThemedLogo", "getType", "()Lcom/ybsdk/core/common/data/network/dto/PaymentMethodTypeDto;", "getYbSuggestId", "getCardInfo", "()Lcom/ybsdk/core/common/data/network/dto/CardInfoDto;", "getMe2meInfo", "()Lcom/ybsdk/core/common/data/network/dto/Me2MeInfo;", "getSavingsAccountInfo", "()Lcom/ybsdk/core/common/data/network/dto/SavingsAccountInfo;", "getYandexAccountInfo", "()Lcom/ybsdk/core/common/data/network/dto/YandexAccountInfo;", "getLegalText", "getAction", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", "", "other", "hashCode", "", "toString", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PaymentMethodDto {
    private final String action;
    private final Money amount;
    private final CardInfoDto cardInfo;
    private final String description;
    private final String legalText;
    private final String logo;
    private final Me2MeInfo me2meInfo;
    private final SavingsAccountInfo savingsAccountInfo;
    private final Themes<String> secondLogo;
    private final String selectedMethodDescription;
    private final Themes<String> themedLogo;
    private final String title;
    private final PaymentMethodTypeDto type;
    private final YandexAccountInfo yandexAccountInfo;
    private final String ybSuggestId;

    public PaymentMethodDto(@Json(name = "title") String str, @Json(name = "description") String str2, @Json(name = "amount") Money money, @Json(name = "selected_method_description") String str3, @Json(name = "logo") String str4, @Json(name = "second_logo") Themes<String> themes, @Json(name = "themed_logo") Themes<String> themes2, @Json(name = "type") PaymentMethodTypeDto paymentMethodTypeDto, @Json(name = "JSON_FIELD_MEMBER_SUGGEST_ID") String str5, @Json(name = "card_info") CardInfoDto cardInfoDto, @Json(name = "me2me_info") Me2MeInfo me2MeInfo, @Json(name = "savings_account_info") SavingsAccountInfo savingsAccountInfo, @Json(name = "yandex_account_info") YandexAccountInfo yandexAccountInfo, @Json(name = "legal_text") String str6, @Json(name = "action") String str7) {
        this.title = str;
        this.description = str2;
        this.amount = money;
        this.selectedMethodDescription = str3;
        this.logo = str4;
        this.secondLogo = themes;
        this.themedLogo = themes2;
        this.type = paymentMethodTypeDto;
        this.ybSuggestId = str5;
        this.cardInfo = cardInfoDto;
        this.me2meInfo = me2MeInfo;
        this.savingsAccountInfo = savingsAccountInfo;
        this.yandexAccountInfo = yandexAccountInfo;
        this.legalText = str6;
        this.action = str7;
    }

    @jxi
    public static /* synthetic */ void getLogo$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component10, reason: from getter */
    public final CardInfoDto getCardInfo() {
        return this.cardInfo;
    }

    /* renamed from: component11, reason: from getter */
    public final Me2MeInfo getMe2meInfo() {
        return this.me2meInfo;
    }

    /* renamed from: component12, reason: from getter */
    public final SavingsAccountInfo getSavingsAccountInfo() {
        return this.savingsAccountInfo;
    }

    /* renamed from: component13, reason: from getter */
    public final YandexAccountInfo getYandexAccountInfo() {
        return this.yandexAccountInfo;
    }

    /* renamed from: component14, reason: from getter */
    public final String getLegalText() {
        return this.legalText;
    }

    /* renamed from: component15, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final Money getAmount() {
        return this.amount;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSelectedMethodDescription() {
        return this.selectedMethodDescription;
    }

    /* renamed from: component5, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    public final Themes<String> component6() {
        return this.secondLogo;
    }

    public final Themes<String> component7() {
        return this.themedLogo;
    }

    /* renamed from: component8, reason: from getter */
    public final PaymentMethodTypeDto getType() {
        return this.type;
    }

    /* renamed from: component9, reason: from getter */
    public final String getYbSuggestId() {
        return this.ybSuggestId;
    }

    public final PaymentMethodDto copy(@Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "amount") Money amount, @Json(name = "selected_method_description") String selectedMethodDescription, @Json(name = "logo") String logo, @Json(name = "second_logo") Themes<String> secondLogo, @Json(name = "themed_logo") Themes<String> themedLogo, @Json(name = "type") PaymentMethodTypeDto type, @Json(name = "JSON_FIELD_MEMBER_SUGGEST_ID") String ybSuggestId, @Json(name = "card_info") CardInfoDto cardInfo, @Json(name = "me2me_info") Me2MeInfo me2meInfo, @Json(name = "savings_account_info") SavingsAccountInfo savingsAccountInfo, @Json(name = "yandex_account_info") YandexAccountInfo yandexAccountInfo, @Json(name = "legal_text") String legalText, @Json(name = "action") String action) {
        return new PaymentMethodDto(title, description, amount, selectedMethodDescription, logo, secondLogo, themedLogo, type, ybSuggestId, cardInfo, me2meInfo, savingsAccountInfo, yandexAccountInfo, legalText, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethodDto)) {
            return false;
        }
        PaymentMethodDto paymentMethodDto = (PaymentMethodDto) other;
        return jl40.l(this.title, paymentMethodDto.title) && jl40.l(this.description, paymentMethodDto.description) && jl40.l(this.amount, paymentMethodDto.amount) && jl40.l(this.selectedMethodDescription, paymentMethodDto.selectedMethodDescription) && jl40.l(this.logo, paymentMethodDto.logo) && jl40.l(this.secondLogo, paymentMethodDto.secondLogo) && jl40.l(this.themedLogo, paymentMethodDto.themedLogo) && this.type == paymentMethodDto.type && jl40.l(this.ybSuggestId, paymentMethodDto.ybSuggestId) && jl40.l(this.cardInfo, paymentMethodDto.cardInfo) && jl40.l(this.me2meInfo, paymentMethodDto.me2meInfo) && jl40.l(this.savingsAccountInfo, paymentMethodDto.savingsAccountInfo) && jl40.l(this.yandexAccountInfo, paymentMethodDto.yandexAccountInfo) && jl40.l(this.legalText, paymentMethodDto.legalText) && jl40.l(this.action, paymentMethodDto.action);
    }

    public final String getAction() {
        return this.action;
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final CardInfoDto getCardInfo() {
        return this.cardInfo;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getLegalText() {
        return this.legalText;
    }

    public final String getLogo() {
        return this.logo;
    }

    public final Me2MeInfo getMe2meInfo() {
        return this.me2meInfo;
    }

    public final SavingsAccountInfo getSavingsAccountInfo() {
        return this.savingsAccountInfo;
    }

    public final Themes<String> getSecondLogo() {
        return this.secondLogo;
    }

    public final String getSelectedMethodDescription() {
        return this.selectedMethodDescription;
    }

    public final Themes<String> getThemedLogo() {
        return this.themedLogo;
    }

    public final String getTitle() {
        return this.title;
    }

    public final PaymentMethodTypeDto getType() {
        return this.type;
    }

    public final YandexAccountInfo getYandexAccountInfo() {
        return this.yandexAccountInfo;
    }

    public final String getYbSuggestId() {
        return this.ybSuggestId;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Money money = this.amount;
        int hashCode3 = (hashCode2 + (money == null ? 0 : money.hashCode())) * 31;
        String str2 = this.selectedMethodDescription;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.logo;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Themes<String> themes = this.secondLogo;
        int hashCode6 = (hashCode5 + (themes == null ? 0 : themes.hashCode())) * 31;
        Themes<String> themes2 = this.themedLogo;
        int hashCode7 = (hashCode6 + (themes2 == null ? 0 : themes2.hashCode())) * 31;
        PaymentMethodTypeDto paymentMethodTypeDto = this.type;
        int hashCode8 = (hashCode7 + (paymentMethodTypeDto == null ? 0 : paymentMethodTypeDto.hashCode())) * 31;
        String str4 = this.ybSuggestId;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        CardInfoDto cardInfoDto = this.cardInfo;
        int hashCode10 = (hashCode9 + (cardInfoDto == null ? 0 : cardInfoDto.hashCode())) * 31;
        Me2MeInfo me2MeInfo = this.me2meInfo;
        int hashCode11 = (hashCode10 + (me2MeInfo == null ? 0 : me2MeInfo.hashCode())) * 31;
        SavingsAccountInfo savingsAccountInfo = this.savingsAccountInfo;
        int hashCode12 = (hashCode11 + (savingsAccountInfo == null ? 0 : savingsAccountInfo.hashCode())) * 31;
        YandexAccountInfo yandexAccountInfo = this.yandexAccountInfo;
        int hashCode13 = (hashCode12 + (yandexAccountInfo == null ? 0 : yandexAccountInfo.hashCode())) * 31;
        String str5 = this.legalText;
        int hashCode14 = (hashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.action;
        return hashCode14 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        Money money = this.amount;
        String str3 = this.selectedMethodDescription;
        String str4 = this.logo;
        Themes<String> themes = this.secondLogo;
        Themes<String> themes2 = this.themedLogo;
        PaymentMethodTypeDto paymentMethodTypeDto = this.type;
        String str5 = this.ybSuggestId;
        CardInfoDto cardInfoDto = this.cardInfo;
        Me2MeInfo me2MeInfo = this.me2meInfo;
        SavingsAccountInfo savingsAccountInfo = this.savingsAccountInfo;
        YandexAccountInfo yandexAccountInfo = this.yandexAccountInfo;
        String str6 = this.legalText;
        String str7 = this.action;
        StringBuilder v = b64.v("PaymentMethodDto(title=", str, ", description=", str2, ", amount=");
        v.append(money);
        v.append(", selectedMethodDescription=");
        v.append(str3);
        v.append(", logo=");
        n.B(v, str4, ", secondLogo=", themes, ", themedLogo=");
        v.append(themes2);
        v.append(", type=");
        v.append(paymentMethodTypeDto);
        v.append(", ybSuggestId=");
        v.append(str5);
        v.append(", cardInfo=");
        v.append(cardInfoDto);
        v.append(", me2meInfo=");
        v.append(me2MeInfo);
        v.append(", savingsAccountInfo=");
        v.append(savingsAccountInfo);
        v.append(", yandexAccountInfo=");
        v.append(yandexAccountInfo);
        v.append(", legalText=");
        v.append(str6);
        v.append(", action=");
        return oyr.t(v, str7, Extension.C_BRAKE);
    }
}
