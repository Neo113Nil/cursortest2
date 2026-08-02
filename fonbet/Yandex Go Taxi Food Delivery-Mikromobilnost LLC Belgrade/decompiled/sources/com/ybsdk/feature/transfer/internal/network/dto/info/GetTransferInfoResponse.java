package com.ybsdk.feature.transfer.internal.network.dto.info;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/transfer/internal/network/dto/info/GetTransferInfoResponse;", "", "transferId", "", "minLimit", "Lcom/ybsdk/feature/transfer/internal/network/dto/info/WalletLimit;", "maxLimit", "isFpsOn", "", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/transfer/internal/network/dto/info/WalletLimit;Lcom/ybsdk/feature/transfer/internal/network/dto/info/WalletLimit;Z)V", "getTransferId", "()Ljava/lang/String;", "getMinLimit", "()Lcom/ybsdk/feature/transfer/internal/network/dto/info/WalletLimit;", "getMaxLimit", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-transfer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetTransferInfoResponse {
    private final boolean isFpsOn;
    private final WalletLimit maxLimit;
    private final WalletLimit minLimit;
    private final String transferId;

    public GetTransferInfoResponse(@Json(name = "transfer_id") String str, @Json(name = "min_limit") WalletLimit walletLimit, @Json(name = "max_limit") WalletLimit walletLimit2, @Json(name = "fps_on") boolean z) {
        this.transferId = str;
        this.minLimit = walletLimit;
        this.maxLimit = walletLimit2;
        this.isFpsOn = z;
    }

    public static /* synthetic */ GetTransferInfoResponse copy$default(GetTransferInfoResponse getTransferInfoResponse, String str, WalletLimit walletLimit, WalletLimit walletLimit2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getTransferInfoResponse.transferId;
        }
        if ((i & 2) != 0) {
            walletLimit = getTransferInfoResponse.minLimit;
        }
        if ((i & 4) != 0) {
            walletLimit2 = getTransferInfoResponse.maxLimit;
        }
        if ((i & 8) != 0) {
            z = getTransferInfoResponse.isFpsOn;
        }
        return getTransferInfoResponse.copy(str, walletLimit, walletLimit2, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTransferId() {
        return this.transferId;
    }

    /* renamed from: component2, reason: from getter */
    public final WalletLimit getMinLimit() {
        return this.minLimit;
    }

    /* renamed from: component3, reason: from getter */
    public final WalletLimit getMaxLimit() {
        return this.maxLimit;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsFpsOn() {
        return this.isFpsOn;
    }

    public final GetTransferInfoResponse copy(@Json(name = "transfer_id") String transferId, @Json(name = "min_limit") WalletLimit minLimit, @Json(name = "max_limit") WalletLimit maxLimit, @Json(name = "fps_on") boolean isFpsOn) {
        return new GetTransferInfoResponse(transferId, minLimit, maxLimit, isFpsOn);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetTransferInfoResponse)) {
            return false;
        }
        GetTransferInfoResponse getTransferInfoResponse = (GetTransferInfoResponse) other;
        return jl40.l(this.transferId, getTransferInfoResponse.transferId) && jl40.l(this.minLimit, getTransferInfoResponse.minLimit) && jl40.l(this.maxLimit, getTransferInfoResponse.maxLimit) && this.isFpsOn == getTransferInfoResponse.isFpsOn;
    }

    public final WalletLimit getMaxLimit() {
        return this.maxLimit;
    }

    public final WalletLimit getMinLimit() {
        return this.minLimit;
    }

    public final String getTransferId() {
        return this.transferId;
    }

    public int hashCode() {
        int hashCode = this.transferId.hashCode() * 31;
        WalletLimit walletLimit = this.minLimit;
        int hashCode2 = (hashCode + (walletLimit == null ? 0 : walletLimit.hashCode())) * 31;
        WalletLimit walletLimit2 = this.maxLimit;
        return Boolean.hashCode(this.isFpsOn) + ((hashCode2 + (walletLimit2 != null ? walletLimit2.hashCode() : 0)) * 31);
    }

    public final boolean isFpsOn() {
        return this.isFpsOn;
    }

    public String toString() {
        return "GetTransferInfoResponse(transferId=" + this.transferId + ", minLimit=" + this.minLimit + ", maxLimit=" + this.maxLimit + ", isFpsOn=" + this.isFpsOn + Extension.C_BRAKE;
    }

    public /* synthetic */ GetTransferInfoResponse(String str, WalletLimit walletLimit, WalletLimit walletLimit2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, walletLimit, walletLimit2, (i & 8) != 0 ? true : z);
    }
}
