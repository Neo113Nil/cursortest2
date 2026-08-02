package com.ybsdk.feature.card.internal.network.dto;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/CardSkinResponse;", "", "default", "Lcom/ybsdk/feature/card/internal/network/dto/CardSkinLayerResponse;", Constants.REFERRER_API_SAMSUNG, "<init>", "(Lcom/ybsdk/feature/card/internal/network/dto/CardSkinLayerResponse;Lcom/ybsdk/feature/card/internal/network/dto/CardSkinLayerResponse;)V", "getDefault", "()Lcom/ybsdk/feature/card/internal/network/dto/CardSkinLayerResponse;", "getSamsung", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CardSkinResponse {
    private final CardSkinLayerResponse default;
    private final CardSkinLayerResponse samsung;

    public CardSkinResponse(@Json(name = "default") CardSkinLayerResponse cardSkinLayerResponse, @Json(name = "samsung") CardSkinLayerResponse cardSkinLayerResponse2) {
        this.default = cardSkinLayerResponse;
        this.samsung = cardSkinLayerResponse2;
    }

    public static /* synthetic */ CardSkinResponse copy$default(CardSkinResponse cardSkinResponse, CardSkinLayerResponse cardSkinLayerResponse, CardSkinLayerResponse cardSkinLayerResponse2, int i, Object obj) {
        if ((i & 1) != 0) {
            cardSkinLayerResponse = cardSkinResponse.default;
        }
        if ((i & 2) != 0) {
            cardSkinLayerResponse2 = cardSkinResponse.samsung;
        }
        return cardSkinResponse.copy(cardSkinLayerResponse, cardSkinLayerResponse2);
    }

    /* renamed from: component1, reason: from getter */
    public final CardSkinLayerResponse getDefault() {
        return this.default;
    }

    /* renamed from: component2, reason: from getter */
    public final CardSkinLayerResponse getSamsung() {
        return this.samsung;
    }

    public final CardSkinResponse copy(@Json(name = "default") CardSkinLayerResponse r1, @Json(name = "samsung") CardSkinLayerResponse samsung) {
        return new CardSkinResponse(r1, samsung);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardSkinResponse)) {
            return false;
        }
        CardSkinResponse cardSkinResponse = (CardSkinResponse) other;
        return jl40.l(this.default, cardSkinResponse.default) && jl40.l(this.samsung, cardSkinResponse.samsung);
    }

    public final CardSkinLayerResponse getDefault() {
        return this.default;
    }

    public final CardSkinLayerResponse getSamsung() {
        return this.samsung;
    }

    public int hashCode() {
        int hashCode = this.default.hashCode() * 31;
        CardSkinLayerResponse cardSkinLayerResponse = this.samsung;
        return hashCode + (cardSkinLayerResponse == null ? 0 : cardSkinLayerResponse.hashCode());
    }

    public String toString() {
        return "CardSkinResponse(default=" + this.default + ", samsung=" + this.samsung + Extension.C_BRAKE;
    }
}
