package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/CardClaimingInputRuleLengthResponse;", "", "length", "", "violationMessage", "", "<init>", "(ILjava/lang/String;)V", "getLength", "()I", "getViolationMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CardClaimingInputRuleLengthResponse {
    private final int length;
    private final String violationMessage;

    public CardClaimingInputRuleLengthResponse(@Json(name = "value") int i, @Json(name = "violation_message") String str) {
        this.length = i;
        this.violationMessage = str;
    }

    public static /* synthetic */ CardClaimingInputRuleLengthResponse copy$default(CardClaimingInputRuleLengthResponse cardClaimingInputRuleLengthResponse, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cardClaimingInputRuleLengthResponse.length;
        }
        if ((i2 & 2) != 0) {
            str = cardClaimingInputRuleLengthResponse.violationMessage;
        }
        return cardClaimingInputRuleLengthResponse.copy(i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getLength() {
        return this.length;
    }

    /* renamed from: component2, reason: from getter */
    public final String getViolationMessage() {
        return this.violationMessage;
    }

    public final CardClaimingInputRuleLengthResponse copy(@Json(name = "value") int length, @Json(name = "violation_message") String violationMessage) {
        return new CardClaimingInputRuleLengthResponse(length, violationMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardClaimingInputRuleLengthResponse)) {
            return false;
        }
        CardClaimingInputRuleLengthResponse cardClaimingInputRuleLengthResponse = (CardClaimingInputRuleLengthResponse) other;
        return this.length == cardClaimingInputRuleLengthResponse.length && jl40.l(this.violationMessage, cardClaimingInputRuleLengthResponse.violationMessage);
    }

    public final int getLength() {
        return this.length;
    }

    public final String getViolationMessage() {
        return this.violationMessage;
    }

    public int hashCode() {
        return this.violationMessage.hashCode() + (Integer.hashCode(this.length) * 31);
    }

    public String toString() {
        return oyr.l(this.length, "CardClaimingInputRuleLengthResponse(length=", ", violationMessage=", this.violationMessage, Extension.C_BRAKE);
    }
}
