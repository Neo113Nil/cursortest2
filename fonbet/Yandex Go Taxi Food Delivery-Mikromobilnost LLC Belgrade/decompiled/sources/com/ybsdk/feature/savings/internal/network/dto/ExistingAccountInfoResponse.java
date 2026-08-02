package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.widgets.common.ImageScaleTypeDto;
import defpackage.b64;
import defpackage.jl40;
import defpackage.n;
import defpackage.nnm;
import defpackage.tse0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0087\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\r\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f\u0012\u000e\b\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f\u0012\u000e\b\u0001\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f\u0012\u0010\b\u0001\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f\u0012\u000e\b\u0001\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f\u0012\u000e\b\u0001\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f\u0012\u0010\b\u0001\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f\u0012\u0010\b\u0001\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u00107\u001a\u00020\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0007HÆ\u0003J\t\u0010;\u001a\u00020\u0007HÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010%J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\u000f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fHÆ\u0003J\u000f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fHÆ\u0003J\u000f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fHÆ\u0003J\u0011\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fHÆ\u0003J\u000f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fHÆ\u0003J\u000f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fHÆ\u0003J\u0011\u0010F\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fHÆ\u0003J\u0011\u0010G\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u008e\u0002\u0010J\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\r\u001a\u00020\u00032\u000e\b\u0003\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\u000e\b\u0003\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\u000e\b\u0003\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\u0010\b\u0003\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f2\u000e\b\u0003\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\u000e\b\u0003\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\u0010\b\u0003\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f2\u0010\b\u0003\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f2\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÆ\u0001¢\u0006\u0002\u0010KJ\u0013\u0010L\u001a\u00020\n2\b\u0010M\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010N\u001a\u00020OHÖ\u0001J\t\u0010P\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001eR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f¢\u0006\b\n\u0000\u001a\u0004\b-\u0010+R\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b.\u0010+R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f¢\u0006\b\n\u0000\u001a\u0004\b/\u0010+R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f¢\u0006\b\n\u0000\u001a\u0004\b0\u0010+R\u0019\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b1\u0010+R\u0019\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b2\u0010+R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b5\u00106¨\u0006Q"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/ExistingAccountInfoResponse;", "", "title", "", "subtitle", "action", "balance", "Lcom/ybsdk/core/common/data/network/dto/Money;", "interest", "interestLocked", "", "textUnderAmount", "target", "agreementId", "cardBackground", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "titleTextColor", "balanceTextColor", "subtitleTextColor", "interestTextColor", "interestBackground", "targetTextColor", "backgroundImage", "imageScaleTypeDto", "Lcom/ybsdk/widgets/common/ImageScaleTypeDto;", "divSubtitle", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/Boolean;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/widgets/common/ImageScaleTypeDto;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getAction", "getBalance", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getInterest", "getInterestLocked", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTextUnderAmount", "getTarget", "getAgreementId", "getCardBackground", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getTitleTextColor", "getBalanceTextColor", "getSubtitleTextColor", "getInterestTextColor", "getInterestBackground", "getTargetTextColor", "getBackgroundImage", "getImageScaleTypeDto", "()Lcom/ybsdk/widgets/common/ImageScaleTypeDto;", "getDivSubtitle", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/Boolean;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/widgets/common/ImageScaleTypeDto;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;)Lcom/ybsdk/feature/savings/internal/network/dto/ExistingAccountInfoResponse;", "equals", "other", "hashCode", "", "toString", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ExistingAccountInfoResponse {
    private final String action;
    private final String agreementId;
    private final Themes<String> backgroundImage;
    private final Money balance;
    private final Themes<String> balanceTextColor;
    private final Themes<String> cardBackground;
    private final DivDataDto divSubtitle;
    private final ImageScaleTypeDto imageScaleTypeDto;
    private final Money interest;
    private final Themes<String> interestBackground;
    private final Boolean interestLocked;
    private final Themes<String> interestTextColor;
    private final String subtitle;
    private final Themes<String> subtitleTextColor;
    private final Money target;
    private final Themes<String> targetTextColor;
    private final String textUnderAmount;
    private final String title;
    private final Themes<String> titleTextColor;

    public ExistingAccountInfoResponse(@Json(name = "title") String str, @Json(name = "subtitle") String str2, @Json(name = "action") String str3, @Json(name = "balance") Money money, @Json(name = "interest") Money money2, @Json(name = "interest_locked") Boolean bool, @Json(name = "interest_payment_term") String str4, @Json(name = "target") Money money3, @Json(name = "agreement_id") String str5, @Json(name = "background") Themes<String> themes, @Json(name = "title_text_color") Themes<String> themes2, @Json(name = "balance_text_color") Themes<String> themes3, @Json(name = "subtitle_text_color") Themes<String> themes4, @Json(name = "interest_text_color") Themes<String> themes5, @Json(name = "interest_background") Themes<String> themes6, @Json(name = "target_text_color") Themes<String> themes7, @Json(name = "background_image") Themes<String> themes8, @Json(name = "background_image_scale_type") ImageScaleTypeDto imageScaleTypeDto, @Json(name = "div_subtitle") DivDataDto divDataDto) {
        this.title = str;
        this.subtitle = str2;
        this.action = str3;
        this.balance = money;
        this.interest = money2;
        this.interestLocked = bool;
        this.textUnderAmount = str4;
        this.target = money3;
        this.agreementId = str5;
        this.cardBackground = themes;
        this.titleTextColor = themes2;
        this.balanceTextColor = themes3;
        this.subtitleTextColor = themes4;
        this.interestTextColor = themes5;
        this.interestBackground = themes6;
        this.targetTextColor = themes7;
        this.backgroundImage = themes8;
        this.imageScaleTypeDto = imageScaleTypeDto;
        this.divSubtitle = divDataDto;
    }

    public static /* synthetic */ ExistingAccountInfoResponse copy$default(ExistingAccountInfoResponse existingAccountInfoResponse, String str, String str2, String str3, Money money, Money money2, Boolean bool, String str4, Money money3, String str5, Themes themes, Themes themes2, Themes themes3, Themes themes4, Themes themes5, Themes themes6, Themes themes7, Themes themes8, ImageScaleTypeDto imageScaleTypeDto, DivDataDto divDataDto, int i, Object obj) {
        DivDataDto divDataDto2;
        ImageScaleTypeDto imageScaleTypeDto2;
        String str6 = (i & 1) != 0 ? existingAccountInfoResponse.title : str;
        String str7 = (i & 2) != 0 ? existingAccountInfoResponse.subtitle : str2;
        String str8 = (i & 4) != 0 ? existingAccountInfoResponse.action : str3;
        Money money4 = (i & 8) != 0 ? existingAccountInfoResponse.balance : money;
        Money money5 = (i & 16) != 0 ? existingAccountInfoResponse.interest : money2;
        Boolean bool2 = (i & 32) != 0 ? existingAccountInfoResponse.interestLocked : bool;
        String str9 = (i & 64) != 0 ? existingAccountInfoResponse.textUnderAmount : str4;
        Money money6 = (i & 128) != 0 ? existingAccountInfoResponse.target : money3;
        String str10 = (i & 256) != 0 ? existingAccountInfoResponse.agreementId : str5;
        Themes themes9 = (i & 512) != 0 ? existingAccountInfoResponse.cardBackground : themes;
        Themes themes10 = (i & 1024) != 0 ? existingAccountInfoResponse.titleTextColor : themes2;
        Themes themes11 = (i & 2048) != 0 ? existingAccountInfoResponse.balanceTextColor : themes3;
        Themes themes12 = (i & 4096) != 0 ? existingAccountInfoResponse.subtitleTextColor : themes4;
        Themes themes13 = (i & 8192) != 0 ? existingAccountInfoResponse.interestTextColor : themes5;
        String str11 = str6;
        Themes themes14 = (i & 16384) != 0 ? existingAccountInfoResponse.interestBackground : themes6;
        Themes themes15 = (i & 32768) != 0 ? existingAccountInfoResponse.targetTextColor : themes7;
        Themes themes16 = (i & 65536) != 0 ? existingAccountInfoResponse.backgroundImage : themes8;
        ImageScaleTypeDto imageScaleTypeDto3 = (i & 131072) != 0 ? existingAccountInfoResponse.imageScaleTypeDto : imageScaleTypeDto;
        if ((i & 262144) != 0) {
            imageScaleTypeDto2 = imageScaleTypeDto3;
            divDataDto2 = existingAccountInfoResponse.divSubtitle;
        } else {
            divDataDto2 = divDataDto;
            imageScaleTypeDto2 = imageScaleTypeDto3;
        }
        return existingAccountInfoResponse.copy(str11, str7, str8, money4, money5, bool2, str9, money6, str10, themes9, themes10, themes11, themes12, themes13, themes14, themes15, themes16, imageScaleTypeDto2, divDataDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final Themes<String> component10() {
        return this.cardBackground;
    }

    public final Themes<String> component11() {
        return this.titleTextColor;
    }

    public final Themes<String> component12() {
        return this.balanceTextColor;
    }

    public final Themes<String> component13() {
        return this.subtitleTextColor;
    }

    public final Themes<String> component14() {
        return this.interestTextColor;
    }

    public final Themes<String> component15() {
        return this.interestBackground;
    }

    public final Themes<String> component16() {
        return this.targetTextColor;
    }

    public final Themes<String> component17() {
        return this.backgroundImage;
    }

    /* renamed from: component18, reason: from getter */
    public final ImageScaleTypeDto getImageScaleTypeDto() {
        return this.imageScaleTypeDto;
    }

    /* renamed from: component19, reason: from getter */
    public final DivDataDto getDivSubtitle() {
        return this.divSubtitle;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* renamed from: component4, reason: from getter */
    public final Money getBalance() {
        return this.balance;
    }

    /* renamed from: component5, reason: from getter */
    public final Money getInterest() {
        return this.interest;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getInterestLocked() {
        return this.interestLocked;
    }

    /* renamed from: component7, reason: from getter */
    public final String getTextUnderAmount() {
        return this.textUnderAmount;
    }

    /* renamed from: component8, reason: from getter */
    public final Money getTarget() {
        return this.target;
    }

    /* renamed from: component9, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    public final ExistingAccountInfoResponse copy(@Json(name = "title") String title, @Json(name = "subtitle") String subtitle, @Json(name = "action") String action, @Json(name = "balance") Money balance, @Json(name = "interest") Money interest, @Json(name = "interest_locked") Boolean interestLocked, @Json(name = "interest_payment_term") String textUnderAmount, @Json(name = "target") Money target, @Json(name = "agreement_id") String agreementId, @Json(name = "background") Themes<String> cardBackground, @Json(name = "title_text_color") Themes<String> titleTextColor, @Json(name = "balance_text_color") Themes<String> balanceTextColor, @Json(name = "subtitle_text_color") Themes<String> subtitleTextColor, @Json(name = "interest_text_color") Themes<String> interestTextColor, @Json(name = "interest_background") Themes<String> interestBackground, @Json(name = "target_text_color") Themes<String> targetTextColor, @Json(name = "background_image") Themes<String> backgroundImage, @Json(name = "background_image_scale_type") ImageScaleTypeDto imageScaleTypeDto, @Json(name = "div_subtitle") DivDataDto divSubtitle) {
        return new ExistingAccountInfoResponse(title, subtitle, action, balance, interest, interestLocked, textUnderAmount, target, agreementId, cardBackground, titleTextColor, balanceTextColor, subtitleTextColor, interestTextColor, interestBackground, targetTextColor, backgroundImage, imageScaleTypeDto, divSubtitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExistingAccountInfoResponse)) {
            return false;
        }
        ExistingAccountInfoResponse existingAccountInfoResponse = (ExistingAccountInfoResponse) other;
        return jl40.l(this.title, existingAccountInfoResponse.title) && jl40.l(this.subtitle, existingAccountInfoResponse.subtitle) && jl40.l(this.action, existingAccountInfoResponse.action) && jl40.l(this.balance, existingAccountInfoResponse.balance) && jl40.l(this.interest, existingAccountInfoResponse.interest) && jl40.l(this.interestLocked, existingAccountInfoResponse.interestLocked) && jl40.l(this.textUnderAmount, existingAccountInfoResponse.textUnderAmount) && jl40.l(this.target, existingAccountInfoResponse.target) && jl40.l(this.agreementId, existingAccountInfoResponse.agreementId) && jl40.l(this.cardBackground, existingAccountInfoResponse.cardBackground) && jl40.l(this.titleTextColor, existingAccountInfoResponse.titleTextColor) && jl40.l(this.balanceTextColor, existingAccountInfoResponse.balanceTextColor) && jl40.l(this.subtitleTextColor, existingAccountInfoResponse.subtitleTextColor) && jl40.l(this.interestTextColor, existingAccountInfoResponse.interestTextColor) && jl40.l(this.interestBackground, existingAccountInfoResponse.interestBackground) && jl40.l(this.targetTextColor, existingAccountInfoResponse.targetTextColor) && jl40.l(this.backgroundImage, existingAccountInfoResponse.backgroundImage) && this.imageScaleTypeDto == existingAccountInfoResponse.imageScaleTypeDto && jl40.l(this.divSubtitle, existingAccountInfoResponse.divSubtitle);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final Themes<String> getBackgroundImage() {
        return this.backgroundImage;
    }

    public final Money getBalance() {
        return this.balance;
    }

    public final Themes<String> getBalanceTextColor() {
        return this.balanceTextColor;
    }

    public final Themes<String> getCardBackground() {
        return this.cardBackground;
    }

    public final DivDataDto getDivSubtitle() {
        return this.divSubtitle;
    }

    public final ImageScaleTypeDto getImageScaleTypeDto() {
        return this.imageScaleTypeDto;
    }

    public final Money getInterest() {
        return this.interest;
    }

    public final Themes<String> getInterestBackground() {
        return this.interestBackground;
    }

    public final Boolean getInterestLocked() {
        return this.interestLocked;
    }

    public final Themes<String> getInterestTextColor() {
        return this.interestTextColor;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final Themes<String> getSubtitleTextColor() {
        return this.subtitleTextColor;
    }

    public final Money getTarget() {
        return this.target;
    }

    public final Themes<String> getTargetTextColor() {
        return this.targetTextColor;
    }

    public final String getTextUnderAmount() {
        return this.textUnderAmount;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Themes<String> getTitleTextColor() {
        return this.titleTextColor;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int c = tse0.c(this.interest, tse0.c(this.balance, unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.action), 31), 31);
        Boolean bool = this.interestLocked;
        int hashCode2 = (c + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.textUnderAmount;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Money money = this.target;
        int c2 = nnm.c(this.balanceTextColor, nnm.c(this.titleTextColor, nnm.c(this.cardBackground, unr0.b((hashCode3 + (money == null ? 0 : money.hashCode())) * 31, 31, this.agreementId), 31), 31), 31);
        Themes<String> themes = this.subtitleTextColor;
        int c3 = nnm.c(this.interestBackground, nnm.c(this.interestTextColor, (c2 + (themes == null ? 0 : themes.hashCode())) * 31, 31), 31);
        Themes<String> themes2 = this.targetTextColor;
        int hashCode4 = (c3 + (themes2 == null ? 0 : themes2.hashCode())) * 31;
        Themes<String> themes3 = this.backgroundImage;
        int hashCode5 = (hashCode4 + (themes3 == null ? 0 : themes3.hashCode())) * 31;
        ImageScaleTypeDto imageScaleTypeDto = this.imageScaleTypeDto;
        int hashCode6 = (hashCode5 + (imageScaleTypeDto == null ? 0 : imageScaleTypeDto.hashCode())) * 31;
        DivDataDto divDataDto = this.divSubtitle;
        return hashCode6 + (divDataDto != null ? divDataDto.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.action;
        Money money = this.balance;
        Money money2 = this.interest;
        Boolean bool = this.interestLocked;
        String str4 = this.textUnderAmount;
        Money money3 = this.target;
        String str5 = this.agreementId;
        Themes<String> themes = this.cardBackground;
        Themes<String> themes2 = this.titleTextColor;
        Themes<String> themes3 = this.balanceTextColor;
        Themes<String> themes4 = this.subtitleTextColor;
        Themes<String> themes5 = this.interestTextColor;
        Themes<String> themes6 = this.interestBackground;
        Themes<String> themes7 = this.targetTextColor;
        Themes<String> themes8 = this.backgroundImage;
        ImageScaleTypeDto imageScaleTypeDto = this.imageScaleTypeDto;
        DivDataDto divDataDto = this.divSubtitle;
        StringBuilder v = b64.v("ExistingAccountInfoResponse(title=", str, ", subtitle=", str2, ", action=");
        v.append(str3);
        v.append(", balance=");
        v.append(money);
        v.append(", interest=");
        v.append(money2);
        v.append(", interestLocked=");
        v.append(bool);
        v.append(", textUnderAmount=");
        v.append(str4);
        v.append(", target=");
        v.append(money3);
        v.append(", agreementId=");
        n.B(v, str5, ", cardBackground=", themes, ", titleTextColor=");
        v.append(themes2);
        v.append(", balanceTextColor=");
        v.append(themes3);
        v.append(", subtitleTextColor=");
        v.append(themes4);
        v.append(", interestTextColor=");
        v.append(themes5);
        v.append(", interestBackground=");
        v.append(themes6);
        v.append(", targetTextColor=");
        v.append(themes7);
        v.append(", backgroundImage=");
        v.append(themes8);
        v.append(", imageScaleTypeDto=");
        v.append(imageScaleTypeDto);
        v.append(", divSubtitle=");
        v.append(divDataDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
