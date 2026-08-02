package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/SetCardStatusScreenRequest;", "", "cardId", "", "setCardStatusActionType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCardId", "()Ljava/lang/String;", "getSetCardStatusActionType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SetCardStatusScreenRequest {

    @Json(name = "card_id")
    private final String cardId;

    @Json(name = "set_card_status_action_type")
    private final String setCardStatusActionType;

    public SetCardStatusScreenRequest(String str, String str2) {
        this.cardId = str;
        this.setCardStatusActionType = str2;
    }

    public static /* synthetic */ SetCardStatusScreenRequest copy$default(SetCardStatusScreenRequest setCardStatusScreenRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setCardStatusScreenRequest.cardId;
        }
        if ((i & 2) != 0) {
            str2 = setCardStatusScreenRequest.setCardStatusActionType;
        }
        return setCardStatusScreenRequest.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCardId() {
        return this.cardId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSetCardStatusActionType() {
        return this.setCardStatusActionType;
    }

    public final SetCardStatusScreenRequest copy(String cardId, String setCardStatusActionType) {
        return new SetCardStatusScreenRequest(cardId, setCardStatusActionType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetCardStatusScreenRequest)) {
            return false;
        }
        SetCardStatusScreenRequest setCardStatusScreenRequest = (SetCardStatusScreenRequest) other;
        return jl40.l(this.cardId, setCardStatusScreenRequest.cardId) && jl40.l(this.setCardStatusActionType, setCardStatusScreenRequest.setCardStatusActionType);
    }

    public final String getCardId() {
        return this.cardId;
    }

    public final String getSetCardStatusActionType() {
        return this.setCardStatusActionType;
    }

    public int hashCode() {
        return this.setCardStatusActionType.hashCode() + (this.cardId.hashCode() * 31);
    }

    public String toString() {
        return unr0.p("SetCardStatusScreenRequest(cardId=", this.cardId, ", setCardStatusActionType=", this.setCardStatusActionType, Extension.C_BRAKE);
    }
}
