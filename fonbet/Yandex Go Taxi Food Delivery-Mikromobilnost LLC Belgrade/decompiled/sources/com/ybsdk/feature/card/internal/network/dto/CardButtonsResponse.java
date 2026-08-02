package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/CardButtonsResponse;", "", "deleteButton", "Lcom/ybsdk/feature/card/internal/network/dto/CardButtonResponse;", "reissueButton", "<init>", "(Lcom/ybsdk/feature/card/internal/network/dto/CardButtonResponse;Lcom/ybsdk/feature/card/internal/network/dto/CardButtonResponse;)V", "getDeleteButton", "()Lcom/ybsdk/feature/card/internal/network/dto/CardButtonResponse;", "getReissueButton", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CardButtonsResponse {
    private final CardButtonResponse deleteButton;
    private final CardButtonResponse reissueButton;

    public CardButtonsResponse(@Json(name = "delete") CardButtonResponse cardButtonResponse, @Json(name = "reissue") CardButtonResponse cardButtonResponse2) {
        this.deleteButton = cardButtonResponse;
        this.reissueButton = cardButtonResponse2;
    }

    public static /* synthetic */ CardButtonsResponse copy$default(CardButtonsResponse cardButtonsResponse, CardButtonResponse cardButtonResponse, CardButtonResponse cardButtonResponse2, int i, Object obj) {
        if ((i & 1) != 0) {
            cardButtonResponse = cardButtonsResponse.deleteButton;
        }
        if ((i & 2) != 0) {
            cardButtonResponse2 = cardButtonsResponse.reissueButton;
        }
        return cardButtonsResponse.copy(cardButtonResponse, cardButtonResponse2);
    }

    /* renamed from: component1, reason: from getter */
    public final CardButtonResponse getDeleteButton() {
        return this.deleteButton;
    }

    /* renamed from: component2, reason: from getter */
    public final CardButtonResponse getReissueButton() {
        return this.reissueButton;
    }

    public final CardButtonsResponse copy(@Json(name = "delete") CardButtonResponse deleteButton, @Json(name = "reissue") CardButtonResponse reissueButton) {
        return new CardButtonsResponse(deleteButton, reissueButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardButtonsResponse)) {
            return false;
        }
        CardButtonsResponse cardButtonsResponse = (CardButtonsResponse) other;
        return jl40.l(this.deleteButton, cardButtonsResponse.deleteButton) && jl40.l(this.reissueButton, cardButtonsResponse.reissueButton);
    }

    public final CardButtonResponse getDeleteButton() {
        return this.deleteButton;
    }

    public final CardButtonResponse getReissueButton() {
        return this.reissueButton;
    }

    public int hashCode() {
        CardButtonResponse cardButtonResponse = this.deleteButton;
        int hashCode = (cardButtonResponse == null ? 0 : cardButtonResponse.hashCode()) * 31;
        CardButtonResponse cardButtonResponse2 = this.reissueButton;
        return hashCode + (cardButtonResponse2 != null ? cardButtonResponse2.hashCode() : 0);
    }

    public String toString() {
        return "CardButtonsResponse(deleteButton=" + this.deleteButton + ", reissueButton=" + this.reissueButton + Extension.C_BRAKE;
    }
}
