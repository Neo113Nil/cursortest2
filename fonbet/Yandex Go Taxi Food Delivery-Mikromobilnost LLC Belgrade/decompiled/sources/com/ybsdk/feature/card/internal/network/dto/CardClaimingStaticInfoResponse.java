package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.smw0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JG\u0010\u001c\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/CardClaimingStaticInfoResponse;", "", "pan", "Lcom/ybsdk/feature/card/internal/network/dto/CardClaimingPanResponse;", "cvv", "Lcom/ybsdk/feature/card/internal/network/dto/CardClaimingCvvResponse;", "hintPan", "", "hintCvv", "themes", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "Lcom/ybsdk/feature/card/internal/network/dto/CardClaimingTheme;", "<init>", "(Lcom/ybsdk/feature/card/internal/network/dto/CardClaimingPanResponse;Lcom/ybsdk/feature/card/internal/network/dto/CardClaimingCvvResponse;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;)V", "getPan", "()Lcom/ybsdk/feature/card/internal/network/dto/CardClaimingPanResponse;", "getCvv", "()Lcom/ybsdk/feature/card/internal/network/dto/CardClaimingCvvResponse;", "getHintPan", "()Ljava/lang/String;", "getHintCvv", "getThemes", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CardClaimingStaticInfoResponse {
    private final CardClaimingCvvResponse cvv;
    private final String hintCvv;
    private final String hintPan;
    private final CardClaimingPanResponse pan;
    private final Themes<CardClaimingTheme> themes;

    public CardClaimingStaticInfoResponse(@Json(name = "pan") CardClaimingPanResponse cardClaimingPanResponse, @Json(name = "cvv") CardClaimingCvvResponse cardClaimingCvvResponse, @Json(name = "promo_hint_pan") String str, @Json(name = "promo_hint_cvv") String str2, @Json(name = "themes") Themes<CardClaimingTheme> themes) {
        this.pan = cardClaimingPanResponse;
        this.cvv = cardClaimingCvvResponse;
        this.hintPan = str;
        this.hintCvv = str2;
        this.themes = themes;
    }

    public static /* synthetic */ CardClaimingStaticInfoResponse copy$default(CardClaimingStaticInfoResponse cardClaimingStaticInfoResponse, CardClaimingPanResponse cardClaimingPanResponse, CardClaimingCvvResponse cardClaimingCvvResponse, String str, String str2, Themes themes, int i, Object obj) {
        if ((i & 1) != 0) {
            cardClaimingPanResponse = cardClaimingStaticInfoResponse.pan;
        }
        if ((i & 2) != 0) {
            cardClaimingCvvResponse = cardClaimingStaticInfoResponse.cvv;
        }
        if ((i & 4) != 0) {
            str = cardClaimingStaticInfoResponse.hintPan;
        }
        if ((i & 8) != 0) {
            str2 = cardClaimingStaticInfoResponse.hintCvv;
        }
        if ((i & 16) != 0) {
            themes = cardClaimingStaticInfoResponse.themes;
        }
        Themes themes2 = themes;
        String str3 = str;
        return cardClaimingStaticInfoResponse.copy(cardClaimingPanResponse, cardClaimingCvvResponse, str3, str2, themes2);
    }

    /* renamed from: component1, reason: from getter */
    public final CardClaimingPanResponse getPan() {
        return this.pan;
    }

    /* renamed from: component2, reason: from getter */
    public final CardClaimingCvvResponse getCvv() {
        return this.cvv;
    }

    /* renamed from: component3, reason: from getter */
    public final String getHintPan() {
        return this.hintPan;
    }

    /* renamed from: component4, reason: from getter */
    public final String getHintCvv() {
        return this.hintCvv;
    }

    public final Themes<CardClaimingTheme> component5() {
        return this.themes;
    }

    public final CardClaimingStaticInfoResponse copy(@Json(name = "pan") CardClaimingPanResponse pan, @Json(name = "cvv") CardClaimingCvvResponse cvv, @Json(name = "promo_hint_pan") String hintPan, @Json(name = "promo_hint_cvv") String hintCvv, @Json(name = "themes") Themes<CardClaimingTheme> themes) {
        return new CardClaimingStaticInfoResponse(pan, cvv, hintPan, hintCvv, themes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardClaimingStaticInfoResponse)) {
            return false;
        }
        CardClaimingStaticInfoResponse cardClaimingStaticInfoResponse = (CardClaimingStaticInfoResponse) other;
        return jl40.l(this.pan, cardClaimingStaticInfoResponse.pan) && jl40.l(this.cvv, cardClaimingStaticInfoResponse.cvv) && jl40.l(this.hintPan, cardClaimingStaticInfoResponse.hintPan) && jl40.l(this.hintCvv, cardClaimingStaticInfoResponse.hintCvv) && jl40.l(this.themes, cardClaimingStaticInfoResponse.themes);
    }

    public final CardClaimingCvvResponse getCvv() {
        return this.cvv;
    }

    public final String getHintCvv() {
        return this.hintCvv;
    }

    public final String getHintPan() {
        return this.hintPan;
    }

    public final CardClaimingPanResponse getPan() {
        return this.pan;
    }

    public final Themes<CardClaimingTheme> getThemes() {
        return this.themes;
    }

    public int hashCode() {
        int hashCode = (this.cvv.hashCode() + (this.pan.hashCode() * 31)) * 31;
        String str = this.hintPan;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.hintCvv;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Themes<CardClaimingTheme> themes = this.themes;
        return hashCode3 + (themes != null ? themes.hashCode() : 0);
    }

    public String toString() {
        CardClaimingPanResponse cardClaimingPanResponse = this.pan;
        CardClaimingCvvResponse cardClaimingCvvResponse = this.cvv;
        String str = this.hintPan;
        String str2 = this.hintCvv;
        Themes<CardClaimingTheme> themes = this.themes;
        StringBuilder sb = new StringBuilder("CardClaimingStaticInfoResponse(pan=");
        sb.append(cardClaimingPanResponse);
        sb.append(", cvv=");
        sb.append(cardClaimingCvvResponse);
        sb.append(", hintPan=");
        g8e.D(sb, str, ", hintCvv=", str2, ", themes=");
        return smw0.l(sb, themes, Extension.C_BRAKE);
    }
}
