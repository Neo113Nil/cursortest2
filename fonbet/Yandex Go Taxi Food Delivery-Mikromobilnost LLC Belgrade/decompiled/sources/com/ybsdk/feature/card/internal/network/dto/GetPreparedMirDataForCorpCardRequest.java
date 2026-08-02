package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/GetPreparedMirDataForCorpCardRequest;", "", "cardId", "", "deviceId", "walletId", "afsParams", "Lcom/ybsdk/feature/card/internal/network/dto/AfsParamsDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/card/internal/network/dto/AfsParamsDto;)V", "getCardId", "()Ljava/lang/String;", "getDeviceId", "getWalletId", "getAfsParams", "()Lcom/ybsdk/feature/card/internal/network/dto/AfsParamsDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetPreparedMirDataForCorpCardRequest {
    private final AfsParamsDto afsParams;
    private final String cardId;
    private final String deviceId;
    private final String walletId;

    public GetPreparedMirDataForCorpCardRequest(@Json(name = "card_id") String str, @Json(name = "device_id") String str2, @Json(name = "wallet_id") String str3, @Json(name = "afs_params") AfsParamsDto afsParamsDto) {
        this.cardId = str;
        this.deviceId = str2;
        this.walletId = str3;
        this.afsParams = afsParamsDto;
    }

    public static /* synthetic */ GetPreparedMirDataForCorpCardRequest copy$default(GetPreparedMirDataForCorpCardRequest getPreparedMirDataForCorpCardRequest, String str, String str2, String str3, AfsParamsDto afsParamsDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getPreparedMirDataForCorpCardRequest.cardId;
        }
        if ((i & 2) != 0) {
            str2 = getPreparedMirDataForCorpCardRequest.deviceId;
        }
        if ((i & 4) != 0) {
            str3 = getPreparedMirDataForCorpCardRequest.walletId;
        }
        if ((i & 8) != 0) {
            afsParamsDto = getPreparedMirDataForCorpCardRequest.afsParams;
        }
        return getPreparedMirDataForCorpCardRequest.copy(str, str2, str3, afsParamsDto);
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
    public final AfsParamsDto getAfsParams() {
        return this.afsParams;
    }

    public final GetPreparedMirDataForCorpCardRequest copy(@Json(name = "card_id") String cardId, @Json(name = "device_id") String deviceId, @Json(name = "wallet_id") String walletId, @Json(name = "afs_params") AfsParamsDto afsParams) {
        return new GetPreparedMirDataForCorpCardRequest(cardId, deviceId, walletId, afsParams);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetPreparedMirDataForCorpCardRequest)) {
            return false;
        }
        GetPreparedMirDataForCorpCardRequest getPreparedMirDataForCorpCardRequest = (GetPreparedMirDataForCorpCardRequest) other;
        return jl40.l(this.cardId, getPreparedMirDataForCorpCardRequest.cardId) && jl40.l(this.deviceId, getPreparedMirDataForCorpCardRequest.deviceId) && jl40.l(this.walletId, getPreparedMirDataForCorpCardRequest.walletId) && jl40.l(this.afsParams, getPreparedMirDataForCorpCardRequest.afsParams);
    }

    public final AfsParamsDto getAfsParams() {
        return this.afsParams;
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
        return this.afsParams.hashCode() + unr0.b(unr0.b(this.cardId.hashCode() * 31, 31, this.deviceId), 31, this.walletId);
    }

    public String toString() {
        String str = this.cardId;
        String str2 = this.deviceId;
        String str3 = this.walletId;
        AfsParamsDto afsParamsDto = this.afsParams;
        StringBuilder v = b64.v("GetPreparedMirDataForCorpCardRequest(cardId=", str, ", deviceId=", str2, ", walletId=");
        v.append(str3);
        v.append(", afsParams=");
        v.append(afsParamsDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
