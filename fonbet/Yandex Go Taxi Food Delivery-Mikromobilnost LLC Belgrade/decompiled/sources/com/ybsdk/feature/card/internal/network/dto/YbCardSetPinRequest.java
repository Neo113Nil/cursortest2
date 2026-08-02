package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/YbCardSetPinRequest;", "", "cardId", "", "pin", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCardId", "()Ljava/lang/String;", "getPin", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class YbCardSetPinRequest {
    private final String cardId;
    private final String pin;

    public YbCardSetPinRequest(@Json(name = "card_id") String str, @Json(name = "pin") String str2) {
        this.cardId = str;
        this.pin = str2;
    }

    public static /* synthetic */ YbCardSetPinRequest copy$default(YbCardSetPinRequest ybCardSetPinRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ybCardSetPinRequest.cardId;
        }
        if ((i & 2) != 0) {
            str2 = ybCardSetPinRequest.pin;
        }
        return ybCardSetPinRequest.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCardId() {
        return this.cardId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPin() {
        return this.pin;
    }

    public final YbCardSetPinRequest copy(@Json(name = "card_id") String cardId, @Json(name = "pin") String pin) {
        return new YbCardSetPinRequest(cardId, pin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof YbCardSetPinRequest)) {
            return false;
        }
        YbCardSetPinRequest ybCardSetPinRequest = (YbCardSetPinRequest) other;
        return jl40.l(this.cardId, ybCardSetPinRequest.cardId) && jl40.l(this.pin, ybCardSetPinRequest.pin);
    }

    public final String getCardId() {
        return this.cardId;
    }

    public final String getPin() {
        return this.pin;
    }

    public int hashCode() {
        return this.pin.hashCode() + (this.cardId.hashCode() * 31);
    }

    public String toString() {
        return unr0.p("YbCardSetPinRequest(cardId=", this.cardId, ", pin=", this.pin, Extension.C_BRAKE);
    }
}
