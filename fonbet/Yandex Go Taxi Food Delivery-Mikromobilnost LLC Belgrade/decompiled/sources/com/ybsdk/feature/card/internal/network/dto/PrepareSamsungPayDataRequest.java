package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/PrepareSamsungPayDataRequest;", "", "cardId", "", "walletId", "deviceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCardId", "()Ljava/lang/String;", "getWalletId", "getDeviceId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PrepareSamsungPayDataRequest {
    private final String cardId;
    private final String deviceId;
    private final String walletId;

    public PrepareSamsungPayDataRequest(@Json(name = "card_id") String str, @Json(name = "wallet_dm_id") String str2, @Json(name = "device_id") String str3) {
        this.cardId = str;
        this.walletId = str2;
        this.deviceId = str3;
    }

    public static /* synthetic */ PrepareSamsungPayDataRequest copy$default(PrepareSamsungPayDataRequest prepareSamsungPayDataRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = prepareSamsungPayDataRequest.cardId;
        }
        if ((i & 2) != 0) {
            str2 = prepareSamsungPayDataRequest.walletId;
        }
        if ((i & 4) != 0) {
            str3 = prepareSamsungPayDataRequest.deviceId;
        }
        return prepareSamsungPayDataRequest.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCardId() {
        return this.cardId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getWalletId() {
        return this.walletId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    public final PrepareSamsungPayDataRequest copy(@Json(name = "card_id") String cardId, @Json(name = "wallet_dm_id") String walletId, @Json(name = "device_id") String deviceId) {
        return new PrepareSamsungPayDataRequest(cardId, walletId, deviceId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrepareSamsungPayDataRequest)) {
            return false;
        }
        PrepareSamsungPayDataRequest prepareSamsungPayDataRequest = (PrepareSamsungPayDataRequest) other;
        return jl40.l(this.cardId, prepareSamsungPayDataRequest.cardId) && jl40.l(this.walletId, prepareSamsungPayDataRequest.walletId) && jl40.l(this.deviceId, prepareSamsungPayDataRequest.deviceId);
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
        return this.deviceId.hashCode() + unr0.b(this.cardId.hashCode() * 31, 31, this.walletId);
    }

    public String toString() {
        String str = this.cardId;
        String str2 = this.walletId;
        return oyr.t(b64.v("PrepareSamsungPayDataRequest(cardId=", str, ", walletId=", str2, ", deviceId="), this.deviceId, Extension.C_BRAKE);
    }
}
