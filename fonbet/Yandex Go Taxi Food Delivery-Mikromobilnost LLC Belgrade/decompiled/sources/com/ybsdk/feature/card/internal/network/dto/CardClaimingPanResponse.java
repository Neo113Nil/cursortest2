package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.yphone.service.settings.AppSettingsContract$Setting;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/CardClaimingPanResponse;", "", "ruleNonEmpty", "Lcom/ybsdk/feature/card/internal/network/dto/CardClaimingInputRuleNonEmptyResponse;", "ruleRange", "Lcom/ybsdk/feature/card/internal/network/dto/CardClaimingInputRuleRangeResponse;", AppSettingsContract$Setting.COLUMN_PREFIX, "Lcom/ybsdk/feature/card/internal/network/dto/CardClaimingPrefixResponse;", "checksum", "Lcom/ybsdk/feature/card/internal/network/dto/CardClaimingInputCheckSumResponse;", "<init>", "(Lcom/ybsdk/feature/card/internal/network/dto/CardClaimingInputRuleNonEmptyResponse;Lcom/ybsdk/feature/card/internal/network/dto/CardClaimingInputRuleRangeResponse;Lcom/ybsdk/feature/card/internal/network/dto/CardClaimingPrefixResponse;Lcom/ybsdk/feature/card/internal/network/dto/CardClaimingInputCheckSumResponse;)V", "getRuleNonEmpty", "()Lcom/ybsdk/feature/card/internal/network/dto/CardClaimingInputRuleNonEmptyResponse;", "getRuleRange", "()Lcom/ybsdk/feature/card/internal/network/dto/CardClaimingInputRuleRangeResponse;", "getPrefix", "()Lcom/ybsdk/feature/card/internal/network/dto/CardClaimingPrefixResponse;", "getChecksum", "()Lcom/ybsdk/feature/card/internal/network/dto/CardClaimingInputCheckSumResponse;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CardClaimingPanResponse {
    private final CardClaimingInputCheckSumResponse checksum;
    private final CardClaimingPrefixResponse prefix;
    private final CardClaimingInputRuleNonEmptyResponse ruleNonEmpty;
    private final CardClaimingInputRuleRangeResponse ruleRange;

    public CardClaimingPanResponse(@Json(name = "non_empty") CardClaimingInputRuleNonEmptyResponse cardClaimingInputRuleNonEmptyResponse, @Json(name = "length") CardClaimingInputRuleRangeResponse cardClaimingInputRuleRangeResponse, @Json(name = "prefix") CardClaimingPrefixResponse cardClaimingPrefixResponse, @Json(name = "checksum") CardClaimingInputCheckSumResponse cardClaimingInputCheckSumResponse) {
        this.ruleNonEmpty = cardClaimingInputRuleNonEmptyResponse;
        this.ruleRange = cardClaimingInputRuleRangeResponse;
        this.prefix = cardClaimingPrefixResponse;
        this.checksum = cardClaimingInputCheckSumResponse;
    }

    public static /* synthetic */ CardClaimingPanResponse copy$default(CardClaimingPanResponse cardClaimingPanResponse, CardClaimingInputRuleNonEmptyResponse cardClaimingInputRuleNonEmptyResponse, CardClaimingInputRuleRangeResponse cardClaimingInputRuleRangeResponse, CardClaimingPrefixResponse cardClaimingPrefixResponse, CardClaimingInputCheckSumResponse cardClaimingInputCheckSumResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            cardClaimingInputRuleNonEmptyResponse = cardClaimingPanResponse.ruleNonEmpty;
        }
        if ((i & 2) != 0) {
            cardClaimingInputRuleRangeResponse = cardClaimingPanResponse.ruleRange;
        }
        if ((i & 4) != 0) {
            cardClaimingPrefixResponse = cardClaimingPanResponse.prefix;
        }
        if ((i & 8) != 0) {
            cardClaimingInputCheckSumResponse = cardClaimingPanResponse.checksum;
        }
        return cardClaimingPanResponse.copy(cardClaimingInputRuleNonEmptyResponse, cardClaimingInputRuleRangeResponse, cardClaimingPrefixResponse, cardClaimingInputCheckSumResponse);
    }

    /* renamed from: component1, reason: from getter */
    public final CardClaimingInputRuleNonEmptyResponse getRuleNonEmpty() {
        return this.ruleNonEmpty;
    }

    /* renamed from: component2, reason: from getter */
    public final CardClaimingInputRuleRangeResponse getRuleRange() {
        return this.ruleRange;
    }

    /* renamed from: component3, reason: from getter */
    public final CardClaimingPrefixResponse getPrefix() {
        return this.prefix;
    }

    /* renamed from: component4, reason: from getter */
    public final CardClaimingInputCheckSumResponse getChecksum() {
        return this.checksum;
    }

    public final CardClaimingPanResponse copy(@Json(name = "non_empty") CardClaimingInputRuleNonEmptyResponse ruleNonEmpty, @Json(name = "length") CardClaimingInputRuleRangeResponse ruleRange, @Json(name = "prefix") CardClaimingPrefixResponse prefix, @Json(name = "checksum") CardClaimingInputCheckSumResponse checksum) {
        return new CardClaimingPanResponse(ruleNonEmpty, ruleRange, prefix, checksum);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardClaimingPanResponse)) {
            return false;
        }
        CardClaimingPanResponse cardClaimingPanResponse = (CardClaimingPanResponse) other;
        return jl40.l(this.ruleNonEmpty, cardClaimingPanResponse.ruleNonEmpty) && jl40.l(this.ruleRange, cardClaimingPanResponse.ruleRange) && jl40.l(this.prefix, cardClaimingPanResponse.prefix) && jl40.l(this.checksum, cardClaimingPanResponse.checksum);
    }

    public final CardClaimingInputCheckSumResponse getChecksum() {
        return this.checksum;
    }

    public final CardClaimingPrefixResponse getPrefix() {
        return this.prefix;
    }

    public final CardClaimingInputRuleNonEmptyResponse getRuleNonEmpty() {
        return this.ruleNonEmpty;
    }

    public final CardClaimingInputRuleRangeResponse getRuleRange() {
        return this.ruleRange;
    }

    public int hashCode() {
        CardClaimingInputRuleNonEmptyResponse cardClaimingInputRuleNonEmptyResponse = this.ruleNonEmpty;
        int hashCode = (cardClaimingInputRuleNonEmptyResponse == null ? 0 : cardClaimingInputRuleNonEmptyResponse.hashCode()) * 31;
        CardClaimingInputRuleRangeResponse cardClaimingInputRuleRangeResponse = this.ruleRange;
        int hashCode2 = (hashCode + (cardClaimingInputRuleRangeResponse == null ? 0 : cardClaimingInputRuleRangeResponse.hashCode())) * 31;
        CardClaimingPrefixResponse cardClaimingPrefixResponse = this.prefix;
        int hashCode3 = (hashCode2 + (cardClaimingPrefixResponse == null ? 0 : cardClaimingPrefixResponse.hashCode())) * 31;
        CardClaimingInputCheckSumResponse cardClaimingInputCheckSumResponse = this.checksum;
        return hashCode3 + (cardClaimingInputCheckSumResponse != null ? cardClaimingInputCheckSumResponse.hashCode() : 0);
    }

    public String toString() {
        return "CardClaimingPanResponse(ruleNonEmpty=" + this.ruleNonEmpty + ", ruleRange=" + this.ruleRange + ", prefix=" + this.prefix + ", checksum=" + this.checksum + Extension.C_BRAKE;
    }
}
