package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/AftTopupRequest;", "", "agreementId", "", "cardId", "ybId", "money", "Lcom/ybsdk/core/common/data/network/dto/Money;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;)V", "getAgreementId", "()Ljava/lang/String;", "getCardId", "getYbId", "getMoney", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AftTopupRequest {
    private final String agreementId;
    private final String cardId;
    private final Money money;
    private final String ybId;

    public AftTopupRequest(@Json(name = "agreement_id") String str, @Json(name = "card_id") String str2, @Json(name = "JSON_FIELD_MEMBER_ID") String str3, @Json(name = "money") Money money) {
        this.agreementId = str;
        this.cardId = str2;
        this.ybId = str3;
        this.money = money;
    }

    public static /* synthetic */ AftTopupRequest copy$default(AftTopupRequest aftTopupRequest, String str, String str2, String str3, Money money, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aftTopupRequest.agreementId;
        }
        if ((i & 2) != 0) {
            str2 = aftTopupRequest.cardId;
        }
        if ((i & 4) != 0) {
            str3 = aftTopupRequest.ybId;
        }
        if ((i & 8) != 0) {
            money = aftTopupRequest.money;
        }
        return aftTopupRequest.copy(str, str2, str3, money);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCardId() {
        return this.cardId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getYbId() {
        return this.ybId;
    }

    /* renamed from: component4, reason: from getter */
    public final Money getMoney() {
        return this.money;
    }

    public final AftTopupRequest copy(@Json(name = "agreement_id") String agreementId, @Json(name = "card_id") String cardId, @Json(name = "JSON_FIELD_MEMBER_ID") String ybId, @Json(name = "money") Money money) {
        return new AftTopupRequest(agreementId, cardId, ybId, money);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AftTopupRequest)) {
            return false;
        }
        AftTopupRequest aftTopupRequest = (AftTopupRequest) other;
        return jl40.l(this.agreementId, aftTopupRequest.agreementId) && jl40.l(this.cardId, aftTopupRequest.cardId) && jl40.l(this.ybId, aftTopupRequest.ybId) && jl40.l(this.money, aftTopupRequest.money);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final String getCardId() {
        return this.cardId;
    }

    public final Money getMoney() {
        return this.money;
    }

    public final String getYbId() {
        return this.ybId;
    }

    public int hashCode() {
        int b = unr0.b(this.agreementId.hashCode() * 31, 31, this.cardId);
        String str = this.ybId;
        return this.money.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        String str = this.agreementId;
        String str2 = this.cardId;
        String str3 = this.ybId;
        Money money = this.money;
        StringBuilder v = b64.v("AftTopupRequest(agreementId=", str, ", cardId=", str2, ", ybId=");
        v.append(str3);
        v.append(", money=");
        v.append(money);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
