package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/CardClaimingInputRuleRangeResponse;", "", "upperLimit", "", "lowerLimit", "violationMessage", "", "<init>", "(IILjava/lang/String;)V", "getUpperLimit", "()I", "getLowerLimit", "getViolationMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CardClaimingInputRuleRangeResponse {
    private final int lowerLimit;
    private final int upperLimit;
    private final String violationMessage;

    public CardClaimingInputRuleRangeResponse(@Json(name = "upper_limit") int i, @Json(name = "lower_limit") int i2, @Json(name = "violation_message") String str) {
        this.upperLimit = i;
        this.lowerLimit = i2;
        this.violationMessage = str;
    }

    public static /* synthetic */ CardClaimingInputRuleRangeResponse copy$default(CardClaimingInputRuleRangeResponse cardClaimingInputRuleRangeResponse, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = cardClaimingInputRuleRangeResponse.upperLimit;
        }
        if ((i3 & 2) != 0) {
            i2 = cardClaimingInputRuleRangeResponse.lowerLimit;
        }
        if ((i3 & 4) != 0) {
            str = cardClaimingInputRuleRangeResponse.violationMessage;
        }
        return cardClaimingInputRuleRangeResponse.copy(i, i2, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getUpperLimit() {
        return this.upperLimit;
    }

    /* renamed from: component2, reason: from getter */
    public final int getLowerLimit() {
        return this.lowerLimit;
    }

    /* renamed from: component3, reason: from getter */
    public final String getViolationMessage() {
        return this.violationMessage;
    }

    public final CardClaimingInputRuleRangeResponse copy(@Json(name = "upper_limit") int upperLimit, @Json(name = "lower_limit") int lowerLimit, @Json(name = "violation_message") String violationMessage) {
        return new CardClaimingInputRuleRangeResponse(upperLimit, lowerLimit, violationMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardClaimingInputRuleRangeResponse)) {
            return false;
        }
        CardClaimingInputRuleRangeResponse cardClaimingInputRuleRangeResponse = (CardClaimingInputRuleRangeResponse) other;
        return this.upperLimit == cardClaimingInputRuleRangeResponse.upperLimit && this.lowerLimit == cardClaimingInputRuleRangeResponse.lowerLimit && jl40.l(this.violationMessage, cardClaimingInputRuleRangeResponse.violationMessage);
    }

    public final int getLowerLimit() {
        return this.lowerLimit;
    }

    public final int getUpperLimit() {
        return this.upperLimit;
    }

    public final String getViolationMessage() {
        return this.violationMessage;
    }

    public int hashCode() {
        return this.violationMessage.hashCode() + oyr.b(this.lowerLimit, Integer.hashCode(this.upperLimit) * 31, 31);
    }

    public String toString() {
        int i = this.upperLimit;
        int i2 = this.lowerLimit;
        return oyr.t(b64.s(i, i2, "CardClaimingInputRuleRangeResponse(upperLimit=", ", lowerLimit=", ", violationMessage="), this.violationMessage, Extension.C_BRAKE);
    }
}
