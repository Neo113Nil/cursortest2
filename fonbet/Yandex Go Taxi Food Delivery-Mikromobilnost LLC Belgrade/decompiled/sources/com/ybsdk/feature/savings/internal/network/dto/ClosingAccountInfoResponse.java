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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Bõ\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e\u0012\u000e\b\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e\u0012\u000e\b\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e\u0012\u000e\b\u0001\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e\u0012\u000e\b\u0001\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e\u0012\u000e\b\u0001\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u00105\u001a\u00020\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0007HÆ\u0003J\t\u00109\u001a\u00020\u0007HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010$J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eHÆ\u0003J\u000f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eHÆ\u0003J\u000f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eHÆ\u0003J\u000f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eHÆ\u0003J\u000f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eHÆ\u0003J\u000f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eHÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\u0011\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0019HÆ\u0003Jü\u0001\u0010G\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00072\u000e\b\u0003\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u000e\b\u0003\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u000e\b\u0003\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u000e\b\u0003\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u000e\b\u0003\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u000e\b\u0003\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\b\b\u0003\u0010\u0014\u001a\u00020\u00032\u0010\b\u0003\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e2\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0002\u0010HJ\u0013\u0010I\u001a\u00020\n2\b\u0010J\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010K\u001a\u00020LHÖ\u0001J\t\u0010M\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u0010!R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010)R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e¢\u0006\b\n\u0000\u001a\u0004\b,\u0010)R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e¢\u0006\b\n\u0000\u001a\u0004\b-\u0010)R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e¢\u0006\b\n\u0000\u001a\u0004\b.\u0010)R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001dR\u0019\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b0\u0010)R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b3\u00104¨\u0006N"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/ClosingAccountInfoResponse;", "", "title", "", "subtitle", "action", "balance", "Lcom/ybsdk/core/common/data/network/dto/Money;", "interest", "interestLocked", "", "textUnderAmount", "target", "cardBackground", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "titleTextColor", "subtitleTextColor", "balanceTextColor", "interestTextColor", "interestBackground", "agreementId", "backgroundImage", "imageScaleTypeDto", "Lcom/ybsdk/widgets/common/ImageScaleTypeDto;", "divSubtitle", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/Boolean;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/widgets/common/ImageScaleTypeDto;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getAction", "getBalance", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getInterest", "getInterestLocked", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTextUnderAmount", "getTarget", "getCardBackground", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getTitleTextColor", "getSubtitleTextColor", "getBalanceTextColor", "getInterestTextColor", "getInterestBackground", "getAgreementId", "getBackgroundImage", "getImageScaleTypeDto", "()Lcom/ybsdk/widgets/common/ImageScaleTypeDto;", "getDivSubtitle", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/Boolean;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/widgets/common/ImageScaleTypeDto;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;)Lcom/ybsdk/feature/savings/internal/network/dto/ClosingAccountInfoResponse;", "equals", "other", "hashCode", "", "toString", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ClosingAccountInfoResponse {
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
    private final String textUnderAmount;
    private final String title;
    private final Themes<String> titleTextColor;

    public ClosingAccountInfoResponse(@Json(name = "title") String str, @Json(name = "subtitle") String str2, @Json(name = "action") String str3, @Json(name = "balance") Money money, @Json(name = "interest") Money money2, @Json(name = "interest_locked") Boolean bool, @Json(name = "interest_payment_term") String str4, @Json(name = "target") Money money3, @Json(name = "background") Themes<String> themes, @Json(name = "title_text_color") Themes<String> themes2, @Json(name = "subtitle_text_color") Themes<String> themes3, @Json(name = "balance_text_color") Themes<String> themes4, @Json(name = "interest_text_color") Themes<String> themes5, @Json(name = "interest_background") Themes<String> themes6, @Json(name = "agreement_id") String str5, @Json(name = "background_image") Themes<String> themes7, @Json(name = "background_image_scale_type") ImageScaleTypeDto imageScaleTypeDto, @Json(name = "div_subtitle") DivDataDto divDataDto) {
        this.title = str;
        this.subtitle = str2;
        this.action = str3;
        this.balance = money;
        this.interest = money2;
        this.interestLocked = bool;
        this.textUnderAmount = str4;
        this.target = money3;
        this.cardBackground = themes;
        this.titleTextColor = themes2;
        this.subtitleTextColor = themes3;
        this.balanceTextColor = themes4;
        this.interestTextColor = themes5;
        this.interestBackground = themes6;
        this.agreementId = str5;
        this.backgroundImage = themes7;
        this.imageScaleTypeDto = imageScaleTypeDto;
        this.divSubtitle = divDataDto;
    }

    public static /* synthetic */ ClosingAccountInfoResponse copy$default(ClosingAccountInfoResponse closingAccountInfoResponse, String str, String str2, String str3, Money money, Money money2, Boolean bool, String str4, Money money3, Themes themes, Themes themes2, Themes themes3, Themes themes4, Themes themes5, Themes themes6, String str5, Themes themes7, ImageScaleTypeDto imageScaleTypeDto, DivDataDto divDataDto, int i, Object obj) {
        DivDataDto divDataDto2;
        ImageScaleTypeDto imageScaleTypeDto2;
        String str6 = (i & 1) != 0 ? closingAccountInfoResponse.title : str;
        String str7 = (i & 2) != 0 ? closingAccountInfoResponse.subtitle : str2;
        String str8 = (i & 4) != 0 ? closingAccountInfoResponse.action : str3;
        Money money4 = (i & 8) != 0 ? closingAccountInfoResponse.balance : money;
        Money money5 = (i & 16) != 0 ? closingAccountInfoResponse.interest : money2;
        Boolean bool2 = (i & 32) != 0 ? closingAccountInfoResponse.interestLocked : bool;
        String str9 = (i & 64) != 0 ? closingAccountInfoResponse.textUnderAmount : str4;
        Money money6 = (i & 128) != 0 ? closingAccountInfoResponse.target : money3;
        Themes themes8 = (i & 256) != 0 ? closingAccountInfoResponse.cardBackground : themes;
        Themes themes9 = (i & 512) != 0 ? closingAccountInfoResponse.titleTextColor : themes2;
        Themes themes10 = (i & 1024) != 0 ? closingAccountInfoResponse.subtitleTextColor : themes3;
        Themes themes11 = (i & 2048) != 0 ? closingAccountInfoResponse.balanceTextColor : themes4;
        Themes themes12 = (i & 4096) != 0 ? closingAccountInfoResponse.interestTextColor : themes5;
        Themes themes13 = (i & 8192) != 0 ? closingAccountInfoResponse.interestBackground : themes6;
        String str10 = str6;
        String str11 = (i & 16384) != 0 ? closingAccountInfoResponse.agreementId : str5;
        Themes themes14 = (i & 32768) != 0 ? closingAccountInfoResponse.backgroundImage : themes7;
        ImageScaleTypeDto imageScaleTypeDto3 = (i & 65536) != 0 ? closingAccountInfoResponse.imageScaleTypeDto : imageScaleTypeDto;
        if ((i & 131072) != 0) {
            imageScaleTypeDto2 = imageScaleTypeDto3;
            divDataDto2 = closingAccountInfoResponse.divSubtitle;
        } else {
            divDataDto2 = divDataDto;
            imageScaleTypeDto2 = imageScaleTypeDto3;
        }
        return closingAccountInfoResponse.copy(str10, str7, str8, money4, money5, bool2, str9, money6, themes8, themes9, themes10, themes11, themes12, themes13, str11, themes14, imageScaleTypeDto2, divDataDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final Themes<String> component10() {
        return this.titleTextColor;
    }

    public final Themes<String> component11() {
        return this.subtitleTextColor;
    }

    public final Themes<String> component12() {
        return this.balanceTextColor;
    }

    public final Themes<String> component13() {
        return this.interestTextColor;
    }

    public final Themes<String> component14() {
        return this.interestBackground;
    }

    /* renamed from: component15, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    public final Themes<String> component16() {
        return this.backgroundImage;
    }

    /* renamed from: component17, reason: from getter */
    public final ImageScaleTypeDto getImageScaleTypeDto() {
        return this.imageScaleTypeDto;
    }

    /* renamed from: component18, reason: from getter */
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

    public final Themes<String> component9() {
        return this.cardBackground;
    }

    public final ClosingAccountInfoResponse copy(@Json(name = "title") String title, @Json(name = "subtitle") String subtitle, @Json(name = "action") String action, @Json(name = "balance") Money balance, @Json(name = "interest") Money interest, @Json(name = "interest_locked") Boolean interestLocked, @Json(name = "interest_payment_term") String textUnderAmount, @Json(name = "target") Money target, @Json(name = "background") Themes<String> cardBackground, @Json(name = "title_text_color") Themes<String> titleTextColor, @Json(name = "subtitle_text_color") Themes<String> subtitleTextColor, @Json(name = "balance_text_color") Themes<String> balanceTextColor, @Json(name = "interest_text_color") Themes<String> interestTextColor, @Json(name = "interest_background") Themes<String> interestBackground, @Json(name = "agreement_id") String agreementId, @Json(name = "background_image") Themes<String> backgroundImage, @Json(name = "background_image_scale_type") ImageScaleTypeDto imageScaleTypeDto, @Json(name = "div_subtitle") DivDataDto divSubtitle) {
        return new ClosingAccountInfoResponse(title, subtitle, action, balance, interest, interestLocked, textUnderAmount, target, cardBackground, titleTextColor, subtitleTextColor, balanceTextColor, interestTextColor, interestBackground, agreementId, backgroundImage, imageScaleTypeDto, divSubtitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClosingAccountInfoResponse)) {
            return false;
        }
        ClosingAccountInfoResponse closingAccountInfoResponse = (ClosingAccountInfoResponse) other;
        return jl40.l(this.title, closingAccountInfoResponse.title) && jl40.l(this.subtitle, closingAccountInfoResponse.subtitle) && jl40.l(this.action, closingAccountInfoResponse.action) && jl40.l(this.balance, closingAccountInfoResponse.balance) && jl40.l(this.interest, closingAccountInfoResponse.interest) && jl40.l(this.interestLocked, closingAccountInfoResponse.interestLocked) && jl40.l(this.textUnderAmount, closingAccountInfoResponse.textUnderAmount) && jl40.l(this.target, closingAccountInfoResponse.target) && jl40.l(this.cardBackground, closingAccountInfoResponse.cardBackground) && jl40.l(this.titleTextColor, closingAccountInfoResponse.titleTextColor) && jl40.l(this.subtitleTextColor, closingAccountInfoResponse.subtitleTextColor) && jl40.l(this.balanceTextColor, closingAccountInfoResponse.balanceTextColor) && jl40.l(this.interestTextColor, closingAccountInfoResponse.interestTextColor) && jl40.l(this.interestBackground, closingAccountInfoResponse.interestBackground) && jl40.l(this.agreementId, closingAccountInfoResponse.agreementId) && jl40.l(this.backgroundImage, closingAccountInfoResponse.backgroundImage) && this.imageScaleTypeDto == closingAccountInfoResponse.imageScaleTypeDto && jl40.l(this.divSubtitle, closingAccountInfoResponse.divSubtitle);
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
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.action;
        int c = tse0.c(this.interest, tse0.c(this.balance, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31);
        Boolean bool = this.interestLocked;
        int hashCode3 = (c + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.textUnderAmount;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Money money = this.target;
        int b = unr0.b(nnm.c(this.interestBackground, nnm.c(this.interestTextColor, nnm.c(this.balanceTextColor, nnm.c(this.subtitleTextColor, nnm.c(this.titleTextColor, nnm.c(this.cardBackground, (hashCode4 + (money == null ? 0 : money.hashCode())) * 31, 31), 31), 31), 31), 31), 31), 31, this.agreementId);
        Themes<String> themes = this.backgroundImage;
        int hashCode5 = (b + (themes == null ? 0 : themes.hashCode())) * 31;
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
        Themes<String> themes = this.cardBackground;
        Themes<String> themes2 = this.titleTextColor;
        Themes<String> themes3 = this.subtitleTextColor;
        Themes<String> themes4 = this.balanceTextColor;
        Themes<String> themes5 = this.interestTextColor;
        Themes<String> themes6 = this.interestBackground;
        String str5 = this.agreementId;
        Themes<String> themes7 = this.backgroundImage;
        ImageScaleTypeDto imageScaleTypeDto = this.imageScaleTypeDto;
        DivDataDto divDataDto = this.divSubtitle;
        StringBuilder v = b64.v("ClosingAccountInfoResponse(title=", str, ", subtitle=", str2, ", action=");
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
        v.append(", cardBackground=");
        v.append(themes);
        v.append(", titleTextColor=");
        v.append(themes2);
        v.append(", subtitleTextColor=");
        v.append(themes3);
        v.append(", balanceTextColor=");
        v.append(themes4);
        v.append(", interestTextColor=");
        v.append(themes5);
        v.append(", interestBackground=");
        v.append(themes6);
        v.append(", agreementId=");
        n.B(v, str5, ", backgroundImage=", themes7, ", imageScaleTypeDto=");
        v.append(imageScaleTypeDto);
        v.append(", divSubtitle=");
        v.append(divDataDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
