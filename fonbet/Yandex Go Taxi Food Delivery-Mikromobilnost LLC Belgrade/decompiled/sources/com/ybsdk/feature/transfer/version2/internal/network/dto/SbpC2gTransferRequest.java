package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.feature.transfer.version2.api.dto.C2gTransferRequisitesDto;
import defpackage.jl40;
import defpackage.tse0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/SbpC2gTransferRequest;", "", "agreementId", "", "money", "Lcom/ybsdk/core/common/data/network/dto/Money;", "invoiceId", "requisites", "Lcom/ybsdk/feature/transfer/version2/api/dto/C2gTransferRequisitesDto;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/dto/C2gTransferRequisitesDto;)V", "getAgreementId", "()Ljava/lang/String;", "getMoney", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getInvoiceId", "getRequisites", "()Lcom/ybsdk/feature/transfer/version2/api/dto/C2gTransferRequisitesDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SbpC2gTransferRequest {
    private final String agreementId;
    private final String invoiceId;
    private final Money money;
    private final C2gTransferRequisitesDto requisites;

    public SbpC2gTransferRequest(@Json(name = "agreement_id") String str, @Json(name = "money") Money money, @Json(name = "invoice_id") String str2, @Json(name = "requisites") C2gTransferRequisitesDto c2gTransferRequisitesDto) {
        this.agreementId = str;
        this.money = money;
        this.invoiceId = str2;
        this.requisites = c2gTransferRequisitesDto;
    }

    public static /* synthetic */ SbpC2gTransferRequest copy$default(SbpC2gTransferRequest sbpC2gTransferRequest, String str, Money money, String str2, C2gTransferRequisitesDto c2gTransferRequisitesDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sbpC2gTransferRequest.agreementId;
        }
        if ((i & 2) != 0) {
            money = sbpC2gTransferRequest.money;
        }
        if ((i & 4) != 0) {
            str2 = sbpC2gTransferRequest.invoiceId;
        }
        if ((i & 8) != 0) {
            c2gTransferRequisitesDto = sbpC2gTransferRequest.requisites;
        }
        return sbpC2gTransferRequest.copy(str, money, str2, c2gTransferRequisitesDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component2, reason: from getter */
    public final Money getMoney() {
        return this.money;
    }

    /* renamed from: component3, reason: from getter */
    public final String getInvoiceId() {
        return this.invoiceId;
    }

    /* renamed from: component4, reason: from getter */
    public final C2gTransferRequisitesDto getRequisites() {
        return this.requisites;
    }

    public final SbpC2gTransferRequest copy(@Json(name = "agreement_id") String agreementId, @Json(name = "money") Money money, @Json(name = "invoice_id") String invoiceId, @Json(name = "requisites") C2gTransferRequisitesDto requisites) {
        return new SbpC2gTransferRequest(agreementId, money, invoiceId, requisites);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SbpC2gTransferRequest)) {
            return false;
        }
        SbpC2gTransferRequest sbpC2gTransferRequest = (SbpC2gTransferRequest) other;
        return jl40.l(this.agreementId, sbpC2gTransferRequest.agreementId) && jl40.l(this.money, sbpC2gTransferRequest.money) && jl40.l(this.invoiceId, sbpC2gTransferRequest.invoiceId) && jl40.l(this.requisites, sbpC2gTransferRequest.requisites);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final String getInvoiceId() {
        return this.invoiceId;
    }

    public final Money getMoney() {
        return this.money;
    }

    public final C2gTransferRequisitesDto getRequisites() {
        return this.requisites;
    }

    public int hashCode() {
        return this.requisites.hashCode() + unr0.b(tse0.c(this.money, this.agreementId.hashCode() * 31, 31), 31, this.invoiceId);
    }

    public String toString() {
        return "SbpC2gTransferRequest(agreementId=" + this.agreementId + ", money=" + this.money + ", invoiceId=" + this.invoiceId + ", requisites=" + this.requisites + Extension.C_BRAKE;
    }
}
