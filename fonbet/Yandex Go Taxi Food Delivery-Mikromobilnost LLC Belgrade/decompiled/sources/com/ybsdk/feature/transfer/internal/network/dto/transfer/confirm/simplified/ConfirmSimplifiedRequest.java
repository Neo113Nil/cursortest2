package com.ybsdk.feature.transfer.internal.network.dto.transfer.confirm.simplified;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.HmacDto;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.b64;
import defpackage.jl40;
import defpackage.tse0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/ybsdk/feature/transfer/internal/network/dto/transfer/confirm/simplified/ConfirmSimplifiedRequest;", "", "agreementId", "", "ybId", "money", "Lcom/ybsdk/core/common/data/network/dto/Money;", "hmac", "Lcom/ybsdk/core/common/data/network/dto/HmacDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/core/common/data/network/dto/HmacDto;)V", "getAgreementId", "()Ljava/lang/String;", "getYbId", "getMoney", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getHmac", "()Lcom/ybsdk/core/common/data/network/dto/HmacDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ConfirmSimplifiedRequest {
    private final String agreementId;
    private final HmacDto hmac;
    private final Money money;
    private final String ybId;

    public ConfirmSimplifiedRequest(@Json(name = "agreement_id") String str, @Json(name = "JSON_FIELD_MEMBER_ID") String str2, @Json(name = "money") Money money, @Json(name = "hmac") HmacDto hmacDto) {
        this.agreementId = str;
        this.ybId = str2;
        this.money = money;
        this.hmac = hmacDto;
    }

    public static /* synthetic */ ConfirmSimplifiedRequest copy$default(ConfirmSimplifiedRequest confirmSimplifiedRequest, String str, String str2, Money money, HmacDto hmacDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = confirmSimplifiedRequest.agreementId;
        }
        if ((i & 2) != 0) {
            str2 = confirmSimplifiedRequest.ybId;
        }
        if ((i & 4) != 0) {
            money = confirmSimplifiedRequest.money;
        }
        if ((i & 8) != 0) {
            hmacDto = confirmSimplifiedRequest.hmac;
        }
        return confirmSimplifiedRequest.copy(str, str2, money, hmacDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getYbId() {
        return this.ybId;
    }

    /* renamed from: component3, reason: from getter */
    public final Money getMoney() {
        return this.money;
    }

    /* renamed from: component4, reason: from getter */
    public final HmacDto getHmac() {
        return this.hmac;
    }

    public final ConfirmSimplifiedRequest copy(@Json(name = "agreement_id") String agreementId, @Json(name = "JSON_FIELD_MEMBER_ID") String ybId, @Json(name = "money") Money money, @Json(name = "hmac") HmacDto hmac) {
        return new ConfirmSimplifiedRequest(agreementId, ybId, money, hmac);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfirmSimplifiedRequest)) {
            return false;
        }
        ConfirmSimplifiedRequest confirmSimplifiedRequest = (ConfirmSimplifiedRequest) other;
        return jl40.l(this.agreementId, confirmSimplifiedRequest.agreementId) && jl40.l(this.ybId, confirmSimplifiedRequest.ybId) && jl40.l(this.money, confirmSimplifiedRequest.money) && jl40.l(this.hmac, confirmSimplifiedRequest.hmac);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final HmacDto getHmac() {
        return this.hmac;
    }

    public final Money getMoney() {
        return this.money;
    }

    public final String getYbId() {
        return this.ybId;
    }

    public int hashCode() {
        int c = tse0.c(this.money, unr0.b(this.agreementId.hashCode() * 31, 31, this.ybId), 31);
        HmacDto hmacDto = this.hmac;
        return c + (hmacDto == null ? 0 : hmacDto.hashCode());
    }

    public String toString() {
        String str = this.agreementId;
        String str2 = this.ybId;
        Money money = this.money;
        HmacDto hmacDto = this.hmac;
        StringBuilder v = b64.v("ConfirmSimplifiedRequest(agreementId=", str, ", ybId=", str2, ", money=");
        v.append(money);
        v.append(", hmac=");
        v.append(hmacDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
