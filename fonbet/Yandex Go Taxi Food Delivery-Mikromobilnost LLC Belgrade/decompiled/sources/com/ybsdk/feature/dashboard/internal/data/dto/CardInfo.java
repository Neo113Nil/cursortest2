package com.ybsdk.feature.dashboard.internal.data.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.b64;
import defpackage.jl40;
import defpackage.n;
import defpackage.nnm;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0081\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\b\b\u0001\u0010\t\u001a\u00020\u0006\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JM\u0010\u001e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\b\b\u0003\u0010\t\u001a\u00020\u00062\b\b\u0003\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/data/dto/CardInfo;", "", "cardCount", "", "promoCount", "action", "", "image", "Lcom/ybsdk/core/common/data/network/dto/Themes;", ACSPConstants.STATUS, "hasPlasticCard", "", "<init>", "(IILjava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/String;Z)V", "getCardCount", "()I", "getPromoCount", "getAction", "()Ljava/lang/String;", "getImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getStatus", "getHasPlasticCard", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CardInfo {
    private final String action;
    private final int cardCount;
    private final boolean hasPlasticCard;
    private final Themes<String> image;
    private final int promoCount;
    private final String status;

    public CardInfo(@Json(name = "card_count") int i, @Json(name = "promo_count") int i2, @Json(name = "action") String str, @Json(name = "image") Themes<String> themes, @Json(name = "status") String str2, @Json(name = "has_plastic_card") boolean z) {
        this.cardCount = i;
        this.promoCount = i2;
        this.action = str;
        this.image = themes;
        this.status = str2;
        this.hasPlasticCard = z;
    }

    public static /* synthetic */ CardInfo copy$default(CardInfo cardInfo, int i, int i2, String str, Themes themes, String str2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = cardInfo.cardCount;
        }
        if ((i3 & 2) != 0) {
            i2 = cardInfo.promoCount;
        }
        if ((i3 & 4) != 0) {
            str = cardInfo.action;
        }
        if ((i3 & 8) != 0) {
            themes = cardInfo.image;
        }
        if ((i3 & 16) != 0) {
            str2 = cardInfo.status;
        }
        if ((i3 & 32) != 0) {
            z = cardInfo.hasPlasticCard;
        }
        String str3 = str2;
        boolean z2 = z;
        return cardInfo.copy(i, i2, str, themes, str3, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCardCount() {
        return this.cardCount;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPromoCount() {
        return this.promoCount;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    public final Themes<String> component4() {
        return this.image;
    }

    /* renamed from: component5, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getHasPlasticCard() {
        return this.hasPlasticCard;
    }

    public final CardInfo copy(@Json(name = "card_count") int cardCount, @Json(name = "promo_count") int promoCount, @Json(name = "action") String action, @Json(name = "image") Themes<String> image, @Json(name = "status") String status, @Json(name = "has_plastic_card") boolean hasPlasticCard) {
        return new CardInfo(cardCount, promoCount, action, image, status, hasPlasticCard);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardInfo)) {
            return false;
        }
        CardInfo cardInfo = (CardInfo) other;
        return this.cardCount == cardInfo.cardCount && this.promoCount == cardInfo.promoCount && jl40.l(this.action, cardInfo.action) && jl40.l(this.image, cardInfo.image) && jl40.l(this.status, cardInfo.status) && this.hasPlasticCard == cardInfo.hasPlasticCard;
    }

    public final String getAction() {
        return this.action;
    }

    public final int getCardCount() {
        return this.cardCount;
    }

    public final boolean getHasPlasticCard() {
        return this.hasPlasticCard;
    }

    public final Themes<String> getImage() {
        return this.image;
    }

    public final int getPromoCount() {
        return this.promoCount;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int b = oyr.b(this.promoCount, Integer.hashCode(this.cardCount) * 31, 31);
        String str = this.action;
        return Boolean.hashCode(this.hasPlasticCard) + unr0.b(nnm.c(this.image, (b + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.status);
    }

    public String toString() {
        int i = this.cardCount;
        int i2 = this.promoCount;
        String str = this.action;
        Themes<String> themes = this.image;
        String str2 = this.status;
        boolean z = this.hasPlasticCard;
        StringBuilder s = b64.s(i, i2, "CardInfo(cardCount=", ", promoCount=", ", action=");
        n.B(s, str, ", image=", themes, ", status=");
        return nnm.i(str2, ", hasPlasticCard=", Extension.C_BRAKE, s, z);
    }
}
