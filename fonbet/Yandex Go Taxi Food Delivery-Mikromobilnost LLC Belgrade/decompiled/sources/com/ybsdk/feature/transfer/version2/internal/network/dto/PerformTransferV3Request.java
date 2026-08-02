package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.HmacDto;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/PerformTransferV3Request;", "", "transfer", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferV3Request;", "checkId", "", "hmac", "Lcom/ybsdk/core/common/data/network/dto/HmacDto;", "tfa", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TfaInfoDto;", "<init>", "(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferV3Request;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/HmacDto;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TfaInfoDto;)V", "getTransfer", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferV3Request;", "getCheckId", "()Ljava/lang/String;", "getHmac", "()Lcom/ybsdk/core/common/data/network/dto/HmacDto;", "getTfa", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TfaInfoDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PerformTransferV3Request {
    private final String checkId;
    private final HmacDto hmac;
    private final TfaInfoDto tfa;
    private final TransferV3Request transfer;

    public PerformTransferV3Request(@Json(name = "transfer") TransferV3Request transferV3Request, @Json(name = "check_id") String str, @Json(name = "hmac") HmacDto hmacDto, @Json(name = "tfa") TfaInfoDto tfaInfoDto) {
        this.transfer = transferV3Request;
        this.checkId = str;
        this.hmac = hmacDto;
        this.tfa = tfaInfoDto;
    }

    public static /* synthetic */ PerformTransferV3Request copy$default(PerformTransferV3Request performTransferV3Request, TransferV3Request transferV3Request, String str, HmacDto hmacDto, TfaInfoDto tfaInfoDto, int i, Object obj) {
        if ((i & 1) != 0) {
            transferV3Request = performTransferV3Request.transfer;
        }
        if ((i & 2) != 0) {
            str = performTransferV3Request.checkId;
        }
        if ((i & 4) != 0) {
            hmacDto = performTransferV3Request.hmac;
        }
        if ((i & 8) != 0) {
            tfaInfoDto = performTransferV3Request.tfa;
        }
        return performTransferV3Request.copy(transferV3Request, str, hmacDto, tfaInfoDto);
    }

    /* renamed from: component1, reason: from getter */
    public final TransferV3Request getTransfer() {
        return this.transfer;
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
    public final TfaInfoDto getTfa() {
        return this.tfa;
    }

    public final PerformTransferV3Request copy(@Json(name = "transfer") TransferV3Request transfer, @Json(name = "check_id") String checkId, @Json(name = "hmac") HmacDto hmac, @Json(name = "tfa") TfaInfoDto tfa) {
        return new PerformTransferV3Request(transfer, checkId, hmac, tfa);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PerformTransferV3Request)) {
            return false;
        }
        PerformTransferV3Request performTransferV3Request = (PerformTransferV3Request) other;
        return jl40.l(this.transfer, performTransferV3Request.transfer) && jl40.l(this.checkId, performTransferV3Request.checkId) && jl40.l(this.hmac, performTransferV3Request.hmac) && jl40.l(this.tfa, performTransferV3Request.tfa);
    }

    public final String getCheckId() {
        return this.checkId;
    }

    public final HmacDto getHmac() {
        return this.hmac;
    }

    public final TfaInfoDto getTfa() {
        return this.tfa;
    }

    public final TransferV3Request getTransfer() {
        return this.transfer;
    }

    public int hashCode() {
        int hashCode = (this.hmac.hashCode() + unr0.b(this.transfer.hashCode() * 31, 31, this.checkId)) * 31;
        TfaInfoDto tfaInfoDto = this.tfa;
        return hashCode + (tfaInfoDto == null ? 0 : tfaInfoDto.hashCode());
    }

    public String toString() {
        return "PerformTransferV3Request(transfer=" + this.transfer + ", checkId=" + this.checkId + ", hmac=" + this.hmac + ", tfa=" + this.tfa + Extension.C_BRAKE;
    }

    public /* synthetic */ PerformTransferV3Request(TransferV3Request transferV3Request, String str, HmacDto hmacDto, TfaInfoDto tfaInfoDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(transferV3Request, str, hmacDto, (i & 8) != 0 ? null : tfaInfoDto);
    }
}
