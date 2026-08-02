package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.feature.transfer.version2.api.dto.HcsInvoiceRequisitesDto;
import defpackage.jl40;
import defpackage.tse0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/InvoiceHcsTransferRequest;", "", "agreementId", "", "money", "Lcom/ybsdk/core/common/data/network/dto/Money;", "requisites", "Lcom/ybsdk/feature/transfer/version2/api/dto/HcsInvoiceRequisitesDto;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/feature/transfer/version2/api/dto/HcsInvoiceRequisitesDto;)V", "getAgreementId", "()Ljava/lang/String;", "getMoney", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getRequisites", "()Lcom/ybsdk/feature/transfer/version2/api/dto/HcsInvoiceRequisitesDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InvoiceHcsTransferRequest {
    private final String agreementId;
    private final Money money;
    private final HcsInvoiceRequisitesDto requisites;

    public InvoiceHcsTransferRequest(@Json(name = "agreement_id") String str, @Json(name = "money") Money money, @Json(name = "requisites") HcsInvoiceRequisitesDto hcsInvoiceRequisitesDto) {
        this.agreementId = str;
        this.money = money;
        this.requisites = hcsInvoiceRequisitesDto;
    }

    public static /* synthetic */ InvoiceHcsTransferRequest copy$default(InvoiceHcsTransferRequest invoiceHcsTransferRequest, String str, Money money, HcsInvoiceRequisitesDto hcsInvoiceRequisitesDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = invoiceHcsTransferRequest.agreementId;
        }
        if ((i & 2) != 0) {
            money = invoiceHcsTransferRequest.money;
        }
        if ((i & 4) != 0) {
            hcsInvoiceRequisitesDto = invoiceHcsTransferRequest.requisites;
        }
        return invoiceHcsTransferRequest.copy(str, money, hcsInvoiceRequisitesDto);
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
    public final HcsInvoiceRequisitesDto getRequisites() {
        return this.requisites;
    }

    public final InvoiceHcsTransferRequest copy(@Json(name = "agreement_id") String agreementId, @Json(name = "money") Money money, @Json(name = "requisites") HcsInvoiceRequisitesDto requisites) {
        return new InvoiceHcsTransferRequest(agreementId, money, requisites);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvoiceHcsTransferRequest)) {
            return false;
        }
        InvoiceHcsTransferRequest invoiceHcsTransferRequest = (InvoiceHcsTransferRequest) other;
        return jl40.l(this.agreementId, invoiceHcsTransferRequest.agreementId) && jl40.l(this.money, invoiceHcsTransferRequest.money) && jl40.l(this.requisites, invoiceHcsTransferRequest.requisites);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final Money getMoney() {
        return this.money;
    }

    public final HcsInvoiceRequisitesDto getRequisites() {
        return this.requisites;
    }

    public int hashCode() {
        return this.requisites.hashCode() + tse0.c(this.money, this.agreementId.hashCode() * 31, 31);
    }

    public String toString() {
        return "InvoiceHcsTransferRequest(agreementId=" + this.agreementId + ", money=" + this.money + ", requisites=" + this.requisites + Extension.C_BRAKE;
    }
}
