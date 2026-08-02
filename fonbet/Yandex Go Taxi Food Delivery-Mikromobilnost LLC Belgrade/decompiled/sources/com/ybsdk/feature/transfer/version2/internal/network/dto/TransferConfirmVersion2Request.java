package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.HmacDto;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferConfirmVersion2Request;", "", "transferRequest", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferRequest;", "checkId", "", "hmac", "Lcom/ybsdk/core/common/data/network/dto/HmacDto;", "referrer", "<init>", "(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferRequest;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/HmacDto;Ljava/lang/String;)V", "getTransferRequest", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferRequest;", "getCheckId", "()Ljava/lang/String;", "getHmac", "()Lcom/ybsdk/core/common/data/network/dto/HmacDto;", "getReferrer", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransferConfirmVersion2Request {
    private final String checkId;
    private final HmacDto hmac;
    private final String referrer;
    private final TransferRequest transferRequest;

    public TransferConfirmVersion2Request(@Json(name = "transfer") TransferRequest transferRequest, @Json(name = "check_id") String str, @Json(name = "hmac") HmacDto hmacDto, @Json(name = "referrer") String str2) {
        this.transferRequest = transferRequest;
        this.checkId = str;
        this.hmac = hmacDto;
        this.referrer = str2;
    }

    public static /* synthetic */ TransferConfirmVersion2Request copy$default(TransferConfirmVersion2Request transferConfirmVersion2Request, TransferRequest transferRequest, String str, HmacDto hmacDto, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            transferRequest = transferConfirmVersion2Request.transferRequest;
        }
        if ((i & 2) != 0) {
            str = transferConfirmVersion2Request.checkId;
        }
        if ((i & 4) != 0) {
            hmacDto = transferConfirmVersion2Request.hmac;
        }
        if ((i & 8) != 0) {
            str2 = transferConfirmVersion2Request.referrer;
        }
        return transferConfirmVersion2Request.copy(transferRequest, str, hmacDto, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final TransferRequest getTransferRequest() {
        return this.transferRequest;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCheckId() {
        return this.checkId;
    }

    /* renamed from: component3, reason: from getter */
    public final HmacDto getHmac() {
        return this.hmac;
    }

    /* renamed from: component4, reason: from getter */
    public final String getReferrer() {
        return this.referrer;
    }

    public final TransferConfirmVersion2Request copy(@Json(name = "transfer") TransferRequest transferRequest, @Json(name = "check_id") String checkId, @Json(name = "hmac") HmacDto hmac, @Json(name = "referrer") String referrer) {
        return new TransferConfirmVersion2Request(transferRequest, checkId, hmac, referrer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferConfirmVersion2Request)) {
            return false;
        }
        TransferConfirmVersion2Request transferConfirmVersion2Request = (TransferConfirmVersion2Request) other;
        return jl40.l(this.transferRequest, transferConfirmVersion2Request.transferRequest) && jl40.l(this.checkId, transferConfirmVersion2Request.checkId) && jl40.l(this.hmac, transferConfirmVersion2Request.hmac) && jl40.l(this.referrer, transferConfirmVersion2Request.referrer);
    }

    public final String getCheckId() {
        return this.checkId;
    }

    public final HmacDto getHmac() {
        return this.hmac;
    }

    public final String getReferrer() {
        return this.referrer;
    }

    public final TransferRequest getTransferRequest() {
        return this.transferRequest;
    }

    public int hashCode() {
        int b = unr0.b(this.transferRequest.hashCode() * 31, 31, this.checkId);
        HmacDto hmacDto = this.hmac;
        int hashCode = (b + (hmacDto == null ? 0 : hmacDto.hashCode())) * 31;
        String str = this.referrer;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "TransferConfirmVersion2Request(transferRequest=" + this.transferRequest + ", checkId=" + this.checkId + ", hmac=" + this.hmac + ", referrer=" + this.referrer + Extension.C_BRAKE;
    }
}
