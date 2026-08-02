package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/GetPreparedYandexDataV2Request;", "", "cardId", "", "deviceId", "walletId", "autopaymentId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCardId", "()Ljava/lang/String;", "getDeviceId", "getWalletId", "getAutopaymentId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetPreparedYandexDataV2Request {
    private final String autopaymentId;
    private final String cardId;
    private final String deviceId;
    private final String walletId;

    public GetPreparedYandexDataV2Request(@Json(name = "card_id") String str, @Json(name = "device_id") String str2, @Json(name = "wallet_id") String str3, @Json(name = "autopayment_id") String str4) {
        this.cardId = str;
        this.deviceId = str2;
        this.walletId = str3;
        this.autopaymentId = str4;
    }

    public static /* synthetic */ GetPreparedYandexDataV2Request copy$default(GetPreparedYandexDataV2Request getPreparedYandexDataV2Request, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getPreparedYandexDataV2Request.cardId;
        }
        if ((i & 2) != 0) {
            str2 = getPreparedYandexDataV2Request.deviceId;
        }
        if ((i & 4) != 0) {
            str3 = getPreparedYandexDataV2Request.walletId;
        }
        if ((i & 8) != 0) {
            str4 = getPreparedYandexDataV2Request.autopaymentId;
        }
        return getPreparedYandexDataV2Request.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCardId() {
        return this.cardId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getWalletId() {
        return this.walletId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAutopaymentId() {
        return this.autopaymentId;
    }

    public final GetPreparedYandexDataV2Request copy(@Json(name = "card_id") String cardId, @Json(name = "device_id") String deviceId, @Json(name = "wallet_id") String walletId, @Json(name = "autopayment_id") String autopaymentId) {
        return new GetPreparedYandexDataV2Request(cardId, deviceId, walletId, autopaymentId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetPreparedYandexDataV2Request)) {
            return false;
        }
        GetPreparedYandexDataV2Request getPreparedYandexDataV2Request = (GetPreparedYandexDataV2Request) other;
        return jl40.l(this.cardId, getPreparedYandexDataV2Request.cardId) && jl40.l(this.deviceId, getPreparedYandexDataV2Request.deviceId) && jl40.l(this.walletId, getPreparedYandexDataV2Request.walletId) && jl40.l(this.autopaymentId, getPreparedYandexDataV2Request.autopaymentId);
    }

    public final String getAutopaymentId() {
        return this.autopaymentId;
    }

    public final String getCardId() {
        return this.cardId;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getWalletId() {
        return this.walletId;
    }

    public int hashCode() {
        int b = unr0.b(unr0.b(this.cardId.hashCode() * 31, 31, this.deviceId), 31, this.walletId);
        String str = this.autopaymentId;
        return b + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.cardId;
        String str2 = this.deviceId;
        return g8e.r(b64.v("GetPreparedYandexDataV2Request(cardId=", str, ", deviceId=", str2, ", walletId="), this.walletId, ", autopaymentId=", this.autopaymentId, Extension.C_BRAKE);
    }
}
