package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.card.api.entities.YbCardStatusEntity;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/YbCardSetStatusRequest;", "", "cardId", "", "cardStatus", "Lcom/ybsdk/feature/card/api/entities/YbCardStatusEntity;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/card/api/entities/YbCardStatusEntity;)V", "getCardId", "()Ljava/lang/String;", "getCardStatus", "()Lcom/ybsdk/feature/card/api/entities/YbCardStatusEntity;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class YbCardSetStatusRequest {
    private final String cardId;
    private final YbCardStatusEntity cardStatus;

    public YbCardSetStatusRequest(@Json(name = "card_id") String str, @Json(name = "status") YbCardStatusEntity ybCardStatusEntity) {
        this.cardId = str;
        this.cardStatus = ybCardStatusEntity;
    }

    public static /* synthetic */ YbCardSetStatusRequest copy$default(YbCardSetStatusRequest ybCardSetStatusRequest, String str, YbCardStatusEntity ybCardStatusEntity, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ybCardSetStatusRequest.cardId;
        }
        if ((i & 2) != 0) {
            ybCardStatusEntity = ybCardSetStatusRequest.cardStatus;
        }
        return ybCardSetStatusRequest.copy(str, ybCardStatusEntity);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCardId() {
        return this.cardId;
    }

    /* renamed from: component2, reason: from getter */
    public final YbCardStatusEntity getCardStatus() {
        return this.cardStatus;
    }

    public final YbCardSetStatusRequest copy(@Json(name = "card_id") String cardId, @Json(name = "status") YbCardStatusEntity cardStatus) {
        return new YbCardSetStatusRequest(cardId, cardStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof YbCardSetStatusRequest)) {
            return false;
        }
        YbCardSetStatusRequest ybCardSetStatusRequest = (YbCardSetStatusRequest) other;
        return jl40.l(this.cardId, ybCardSetStatusRequest.cardId) && this.cardStatus == ybCardSetStatusRequest.cardStatus;
    }

    public final String getCardId() {
        return this.cardId;
    }

    public final YbCardStatusEntity getCardStatus() {
        return this.cardStatus;
    }

    public int hashCode() {
        return this.cardStatus.hashCode() + (this.cardId.hashCode() * 31);
    }

    public String toString() {
        return "YbCardSetStatusRequest(cardId=" + this.cardId + ", cardStatus=" + this.cardStatus + Extension.C_BRAKE;
    }
}
