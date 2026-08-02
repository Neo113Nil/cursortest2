package com.ybsdk.core.common.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/CardInfoDto;", "", "id", "", "cardId", "partnerId", "system", "number", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getCardId", "getPartnerId", "getSystem", "getNumber", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CardInfoDto {
    private final String cardId;
    private final String id;
    private final String number;
    private final String partnerId;
    private final String system;

    public CardInfoDto(@Json(name = "id") String str, @Json(name = "card_id") String str2, @Json(name = "JSON_FIELD_MEMBER_ID") String str3, @Json(name = "system") String str4, @Json(name = "number") String str5) {
        this.id = str;
        this.cardId = str2;
        this.partnerId = str3;
        this.system = str4;
        this.number = str5;
    }

    public static /* synthetic */ CardInfoDto copy$default(CardInfoDto cardInfoDto, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardInfoDto.id;
        }
        if ((i & 2) != 0) {
            str2 = cardInfoDto.cardId;
        }
        if ((i & 4) != 0) {
            str3 = cardInfoDto.partnerId;
        }
        if ((i & 8) != 0) {
            str4 = cardInfoDto.system;
        }
        if ((i & 16) != 0) {
            str5 = cardInfoDto.number;
        }
        String str6 = str5;
        String str7 = str3;
        return cardInfoDto.copy(str, str2, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCardId() {
        return this.cardId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPartnerId() {
        return this.partnerId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSystem() {
        return this.system;
    }

    /* renamed from: component5, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    public final CardInfoDto copy(@Json(name = "id") String id, @Json(name = "card_id") String cardId, @Json(name = "JSON_FIELD_MEMBER_ID") String partnerId, @Json(name = "system") String system, @Json(name = "number") String number) {
        return new CardInfoDto(id, cardId, partnerId, system, number);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardInfoDto)) {
            return false;
        }
        CardInfoDto cardInfoDto = (CardInfoDto) other;
        return jl40.l(this.id, cardInfoDto.id) && jl40.l(this.cardId, cardInfoDto.cardId) && jl40.l(this.partnerId, cardInfoDto.partnerId) && jl40.l(this.system, cardInfoDto.system) && jl40.l(this.number, cardInfoDto.number);
    }

    public final String getCardId() {
        return this.cardId;
    }

    public final String getId() {
        return this.id;
    }

    public final String getNumber() {
        return this.number;
    }

    public final String getPartnerId() {
        return this.partnerId;
    }

    public final String getSystem() {
        return this.system;
    }

    public int hashCode() {
        int b = unr0.b(this.id.hashCode() * 31, 31, this.cardId);
        String str = this.partnerId;
        return this.number.hashCode() + unr0.b((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.system);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.cardId;
        String str3 = this.partnerId;
        String str4 = this.system;
        String str5 = this.number;
        StringBuilder v = b64.v("CardInfoDto(id=", str, ", cardId=", str2, ", partnerId=");
        g8e.D(v, str3, ", system=", str4, ", number=");
        return oyr.t(v, str5, Extension.C_BRAKE);
    }
}
