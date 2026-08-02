package com.ybsdk.feature.transfer.version2.api.entities;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0017J`\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0017J\u0010\u0010\"\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\"\u0010\u0015J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b,\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b-\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b.\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b/\u0010\u0017R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b0\u0010\u0017¨\u00061"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/entities/HcsInvoiceRequisitesEntity;", "Landroid/os/Parcelable;", "", "invoiceId", "sourceInvoiceId", "purposeOfPayment", "documentType", "documentNumber", "recipientInn", "recipientId", "recipientName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/feature/transfer/version2/api/entities/HcsInvoiceRequisitesEntity;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getInvoiceId", "getSourceInvoiceId", "getPurposeOfPayment", "getDocumentType", "getDocumentNumber", "getRecipientInn", "getRecipientId", "getRecipientName", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HcsInvoiceRequisitesEntity implements Parcelable {
    public static final Parcelable.Creator<HcsInvoiceRequisitesEntity> CREATOR = new Creator();
    private final String documentNumber;
    private final String documentType;
    private final String invoiceId;
    private final String purposeOfPayment;
    private final String recipientId;
    private final String recipientInn;
    private final String recipientName;
    private final String sourceInvoiceId;

    public HcsInvoiceRequisitesEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.invoiceId = str;
        this.sourceInvoiceId = str2;
        this.purposeOfPayment = str3;
        this.documentType = str4;
        this.documentNumber = str5;
        this.recipientInn = str6;
        this.recipientId = str7;
        this.recipientName = str8;
    }

    public static /* synthetic */ HcsInvoiceRequisitesEntity copy$default(HcsInvoiceRequisitesEntity hcsInvoiceRequisitesEntity, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hcsInvoiceRequisitesEntity.invoiceId;
        }
        if ((i & 2) != 0) {
            str2 = hcsInvoiceRequisitesEntity.sourceInvoiceId;
        }
        if ((i & 4) != 0) {
            str3 = hcsInvoiceRequisitesEntity.purposeOfPayment;
        }
        if ((i & 8) != 0) {
            str4 = hcsInvoiceRequisitesEntity.documentType;
        }
        if ((i & 16) != 0) {
            str5 = hcsInvoiceRequisitesEntity.documentNumber;
        }
        if ((i & 32) != 0) {
            str6 = hcsInvoiceRequisitesEntity.recipientInn;
        }
        if ((i & 64) != 0) {
            str7 = hcsInvoiceRequisitesEntity.recipientId;
        }
        if ((i & 128) != 0) {
            str8 = hcsInvoiceRequisitesEntity.recipientName;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return hcsInvoiceRequisitesEntity.copy(str, str2, str3, str4, str11, str12, str9, str10);
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

    public final HcsInvoiceRequisitesEntity copy(String invoiceId, String sourceInvoiceId, String purposeOfPayment, String documentType, String documentNumber, String recipientInn, String recipientId, String recipientName) {
        return new HcsInvoiceRequisitesEntity(invoiceId, sourceInvoiceId, purposeOfPayment, documentType, documentNumber, recipientInn, recipientId, recipientName);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HcsInvoiceRequisitesEntity)) {
            return false;
        }
        HcsInvoiceRequisitesEntity hcsInvoiceRequisitesEntity = (HcsInvoiceRequisitesEntity) other;
        return jl40.l(this.invoiceId, hcsInvoiceRequisitesEntity.invoiceId) && jl40.l(this.sourceInvoiceId, hcsInvoiceRequisitesEntity.sourceInvoiceId) && jl40.l(this.purposeOfPayment, hcsInvoiceRequisitesEntity.purposeOfPayment) && jl40.l(this.documentType, hcsInvoiceRequisitesEntity.documentType) && jl40.l(this.documentNumber, hcsInvoiceRequisitesEntity.documentNumber) && jl40.l(this.recipientInn, hcsInvoiceRequisitesEntity.recipientInn) && jl40.l(this.recipientId, hcsInvoiceRequisitesEntity.recipientId) && jl40.l(this.recipientName, hcsInvoiceRequisitesEntity.recipientName);
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
        StringBuilder v = b64.v("HcsInvoiceRequisitesEntity(invoiceId=", str, ", sourceInvoiceId=", str2, ", purposeOfPayment=");
        g8e.D(v, str3, ", documentType=", str4, ", documentNumber=");
        g8e.D(v, str5, ", recipientInn=", str6, ", recipientId=");
        return g8e.r(v, str7, ", recipientName=", str8, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.invoiceId);
        dest.writeString(this.sourceInvoiceId);
        dest.writeString(this.purposeOfPayment);
        dest.writeString(this.documentType);
        dest.writeString(this.documentNumber);
        dest.writeString(this.recipientInn);
        dest.writeString(this.recipientId);
        dest.writeString(this.recipientName);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<HcsInvoiceRequisitesEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HcsInvoiceRequisitesEntity createFromParcel(Parcel parcel) {
            return new HcsInvoiceRequisitesEntity(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HcsInvoiceRequisitesEntity[] newArray(int i) {
            return new HcsInvoiceRequisitesEntity[i];
        }
    }
}
