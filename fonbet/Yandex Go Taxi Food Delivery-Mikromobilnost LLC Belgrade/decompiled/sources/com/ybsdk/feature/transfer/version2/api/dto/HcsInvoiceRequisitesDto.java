package com.ybsdk.feature.transfer.version2.api.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JY\u0010\u001e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006%"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/dto/HcsInvoiceRequisitesDto;", "", "invoiceId", "", "sourceInvoiceId", "purposeOfPayment", "documentType", "documentNumber", "recipientInn", "recipientId", "recipientName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getInvoiceId", "()Ljava/lang/String;", "getSourceInvoiceId", "getPurposeOfPayment", "getDocumentType", "getDocumentNumber", "getRecipientInn", "getRecipientId", "getRecipientName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HcsInvoiceRequisitesDto {
    private final String documentNumber;
    private final String documentType;
    private final String invoiceId;
    private final String purposeOfPayment;
    private final String recipientId;
    private final String recipientInn;
    private final String recipientName;
    private final String sourceInvoiceId;

    public HcsInvoiceRequisitesDto(@Json(name = "invoice_id") String str, @Json(name = "source_invoice_id") String str2, @Json(name = "purpose_of_payment") String str3, @Json(name = "document_type") String str4, @Json(name = "document_number") String str5, @Json(name = "recipient_inn") String str6, @Json(name = "recipient_id") String str7, @Json(name = "recipient_name") String str8) {
        this.invoiceId = str;
        this.sourceInvoiceId = str2;
        this.purposeOfPayment = str3;
        this.documentType = str4;
        this.documentNumber = str5;
        this.recipientInn = str6;
        this.recipientId = str7;
        this.recipientName = str8;
    }

    public static /* synthetic */ HcsInvoiceRequisitesDto copy$default(HcsInvoiceRequisitesDto hcsInvoiceRequisitesDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hcsInvoiceRequisitesDto.invoiceId;
        }
        if ((i & 2) != 0) {
            str2 = hcsInvoiceRequisitesDto.sourceInvoiceId;
        }
        if ((i & 4) != 0) {
            str3 = hcsInvoiceRequisitesDto.purposeOfPayment;
        }
        if ((i & 8) != 0) {
            str4 = hcsInvoiceRequisitesDto.documentType;
        }
        if ((i & 16) != 0) {
            str5 = hcsInvoiceRequisitesDto.documentNumber;
        }
        if ((i & 32) != 0) {
            str6 = hcsInvoiceRequisitesDto.recipientInn;
        }
        if ((i & 64) != 0) {
            str7 = hcsInvoiceRequisitesDto.recipientId;
        }
        if ((i & 128) != 0) {
            str8 = hcsInvoiceRequisitesDto.recipientName;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return hcsInvoiceRequisitesDto.copy(str, str2, str3, str4, str11, str12, str9, str10);
    }

    /* renamed from: component1, reason: from getter */
    public final String getInvoiceId() {
        return this.invoiceId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSourceInvoiceId() {
        return this.sourceInvoiceId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPurposeOfPayment() {
        return this.purposeOfPayment;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDocumentType() {
        return this.documentType;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    /* renamed from: component6, reason: from getter */
    public final String getRecipientInn() {
        return this.recipientInn;
    }

    /* renamed from: component7, reason: from getter */
    public final String getRecipientId() {
        return this.recipientId;
    }

    /* renamed from: component8, reason: from getter */
    public final String getRecipientName() {
        return this.recipientName;
    }

    public final HcsInvoiceRequisitesDto copy(@Json(name = "invoice_id") String invoiceId, @Json(name = "source_invoice_id") String sourceInvoiceId, @Json(name = "purpose_of_payment") String purposeOfPayment, @Json(name = "document_type") String documentType, @Json(name = "document_number") String documentNumber, @Json(name = "recipient_inn") String recipientInn, @Json(name = "recipient_id") String recipientId, @Json(name = "recipient_name") String recipientName) {
        return new HcsInvoiceRequisitesDto(invoiceId, sourceInvoiceId, purposeOfPayment, documentType, documentNumber, recipientInn, recipientId, recipientName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HcsInvoiceRequisitesDto)) {
            return false;
        }
        HcsInvoiceRequisitesDto hcsInvoiceRequisitesDto = (HcsInvoiceRequisitesDto) other;
        return jl40.l(this.invoiceId, hcsInvoiceRequisitesDto.invoiceId) && jl40.l(this.sourceInvoiceId, hcsInvoiceRequisitesDto.sourceInvoiceId) && jl40.l(this.purposeOfPayment, hcsInvoiceRequisitesDto.purposeOfPayment) && jl40.l(this.documentType, hcsInvoiceRequisitesDto.documentType) && jl40.l(this.documentNumber, hcsInvoiceRequisitesDto.documentNumber) && jl40.l(this.recipientInn, hcsInvoiceRequisitesDto.recipientInn) && jl40.l(this.recipientId, hcsInvoiceRequisitesDto.recipientId) && jl40.l(this.recipientName, hcsInvoiceRequisitesDto.recipientName);
    }

    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    public final String getDocumentType() {
        return this.documentType;
    }

    public final String getInvoiceId() {
        return this.invoiceId;
    }

    public final String getPurposeOfPayment() {
        return this.purposeOfPayment;
    }

    public final String getRecipientId() {
        return this.recipientId;
    }

    public final String getRecipientInn() {
        return this.recipientInn;
    }

    public final String getRecipientName() {
        return this.recipientName;
    }

    public final String getSourceInvoiceId() {
        return this.sourceInvoiceId;
    }

    public int hashCode() {
        return this.recipientName.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(this.invoiceId.hashCode() * 31, 31, this.sourceInvoiceId), 31, this.purposeOfPayment), 31, this.documentType), 31, this.documentNumber), 31, this.recipientInn), 31, this.recipientId);
    }

    public String toString() {
        String str = this.invoiceId;
        String str2 = this.sourceInvoiceId;
        String str3 = this.purposeOfPayment;
        String str4 = this.documentType;
        String str5 = this.documentNumber;
        String str6 = this.recipientInn;
        String str7 = this.recipientId;
        String str8 = this.recipientName;
        StringBuilder v = b64.v("HcsInvoiceRequisitesDto(invoiceId=", str, ", sourceInvoiceId=", str2, ", purposeOfPayment=");
        g8e.D(v, str3, ", documentType=", str4, ", documentNumber=");
        g8e.D(v, str5, ", recipientInn=", str6, ", recipientId=");
        return g8e.r(v, str7, ", recipientName=", str8, Extension.C_BRAKE);
    }
}
