package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/CardClaimingCvvResponse;", "", "ruleRange", "Lcom/ybsdk/feature/card/internal/network/dto/CardClaimingInputRuleRangeResponse;", "ruleNonEmpty", "Lcom/ybsdk/feature/card/internal/network/dto/CardClaimingInputRuleNonEmptyResponse;", "<init>", "(Lcom/ybsdk/feature/card/internal/network/dto/CardClaimingInputRuleRangeResponse;Lcom/ybsdk/feature/card/internal/network/dto/CardClaimingInputRuleNonEmptyResponse;)V", "getRuleRange", "()Lcom/ybsdk/feature/card/internal/network/dto/CardClaimingInputRuleRangeResponse;", "getRuleNonEmpty", "()Lcom/ybsdk/feature/card/internal/network/dto/CardClaimingInputRuleNonEmptyResponse;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CardClaimingCvvResponse {
    private final CardClaimingInputRuleNonEmptyResponse ruleNonEmpty;
    private final CardClaimingInputRuleRangeResponse ruleRange;

    public CardClaimingCvvResponse(@Json(name = "length") CardClaimingInputRuleRangeResponse cardClaimingInputRuleRangeResponse, @Json(name = "non_empty") CardClaimingInputRuleNonEmptyResponse cardClaimingInputRuleNonEmptyResponse) {
        this.ruleRange = cardClaimingInputRuleRangeResponse;
        this.ruleNonEmpty = cardClaimingInputRuleNonEmptyResponse;
    }

    public static /* synthetic */ CardClaimingCvvResponse copy$default(CardClaimingCvvResponse cardClaimingCvvResponse, CardClaimingInputRuleRangeResponse cardClaimingInputRuleRangeResponse, CardClaimingInputRuleNonEmptyResponse cardClaimingInputRuleNonEmptyResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            cardClaimingInputRuleRangeResponse = cardClaimingCvvResponse.ruleRange;
        }
        if ((i & 2) != 0) {
            cardClaimingInputRuleNonEmptyResponse = cardClaimingCvvResponse.ruleNonEmpty;
        }
        return cardClaimingCvvResponse.copy(cardClaimingInputRuleRangeResponse, cardClaimingInputRuleNonEmptyResponse);
    }

    /* renamed from: component1, reason: from getter */
    public final CardClaimingInputRuleRangeResponse getRuleRange() {
        return this.ruleRange;
    }

    /* renamed from: component2, reason: from getter */
    public final CardClaimingInputRuleNonEmptyResponse getRuleNonEmpty() {
        return this.ruleNonEmpty;
    }

    public final CardClaimingCvvResponse copy(@Json(name = "length") CardClaimingInputRuleRangeResponse ruleRange, @Json(name = "non_empty") CardClaimingInputRuleNonEmptyResponse ruleNonEmpty) {
        return new CardClaimingCvvResponse(ruleRange, ruleNonEmpty);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardClaimingCvvResponse)) {
            return false;
        }
        CardClaimingCvvResponse cardClaimingCvvResponse = (CardClaimingCvvResponse) other;
        return jl40.l(this.ruleRange, cardClaimingCvvResponse.ruleRange) && jl40.l(this.ruleNonEmpty, cardClaimingCvvResponse.ruleNonEmpty);
    }

    public final CardClaimingInputRuleNonEmptyResponse getRuleNonEmpty() {
        return this.ruleNonEmpty;
    }

    public final CardClaimingInputRuleRangeResponse getRuleRange() {
        return this.ruleRange;
    }

    public int hashCode() {
        CardClaimingInputRuleRangeResponse cardClaimingInputRuleRangeResponse = this.ruleRange;
        int hashCode = (cardClaimingInputRuleRangeResponse == null ? 0 : cardClaimingInputRuleRangeResponse.hashCode()) * 31;
        CardClaimingInputRuleNonEmptyResponse cardClaimingInputRuleNonEmptyResponse = this.ruleNonEmpty;
        return hashCode + (cardClaimingInputRuleNonEmptyResponse != null ? cardClaimingInputRuleNonEmptyResponse.hashCode() : 0);
    }

    public String toString() {
        return "CardClaimingCvvResponse(ruleRange=" + this.ruleRange + ", ruleNonEmpty=" + this.ruleNonEmpty + Extension.C_BRAKE;
    }
}
