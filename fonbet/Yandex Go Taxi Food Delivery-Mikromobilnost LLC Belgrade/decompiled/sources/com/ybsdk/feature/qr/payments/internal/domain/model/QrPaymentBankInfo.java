package com.ybsdk.feature.qr.payments.internal.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.qr.payments.api.data.ProductType;
import com.ybsdk.feature.qr.payments.internal.network.common.ExternalBankPayloadDto;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J2\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0014J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b'\u0010\u0018¨\u0006("}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/domain/model/QrPaymentBankInfo;", "Landroid/os/Parcelable;", "Lcom/ybsdk/feature/qr/payments/api/data/ProductType;", "productType", "", "autopaymentId", "memberId", "<init>", "(Lcom/ybsdk/feature/qr/payments/api/data/ProductType;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/ybsdk/feature/qr/payments/internal/network/common/ExternalBankPayloadDto;", "toExternalBankPayloadDto", "()Lcom/ybsdk/feature/qr/payments/internal/network/common/ExternalBankPayloadDto;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/feature/qr/payments/api/data/ProductType;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/ybsdk/feature/qr/payments/api/data/ProductType;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/feature/qr/payments/internal/domain/model/QrPaymentBankInfo;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/qr/payments/api/data/ProductType;", "getProductType", "Ljava/lang/String;", "getAutopaymentId", "getMemberId", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class QrPaymentBankInfo implements Parcelable {
    public static final Parcelable.Creator<QrPaymentBankInfo> CREATOR = new Creator();
    private final String autopaymentId;
    private final String memberId;
    private final ProductType productType;

    public QrPaymentBankInfo(ProductType productType, String str, String str2) {
        this.productType = productType;
        this.autopaymentId = str;
        this.memberId = str2;
    }

    public static /* synthetic */ QrPaymentBankInfo copy$default(QrPaymentBankInfo qrPaymentBankInfo, ProductType productType, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            productType = qrPaymentBankInfo.productType;
        }
        if ((i & 2) != 0) {
            str = qrPaymentBankInfo.autopaymentId;
        }
        if ((i & 4) != 0) {
            str2 = qrPaymentBankInfo.memberId;
        }
        return qrPaymentBankInfo.copy(productType, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final ProductType getProductType() {
        return this.productType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAutopaymentId() {
        return this.autopaymentId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMemberId() {
        return this.memberId;
    }

    public final QrPaymentBankInfo copy(ProductType productType, String autopaymentId, String memberId) {
        return new QrPaymentBankInfo(productType, autopaymentId, memberId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QrPaymentBankInfo)) {
            return false;
        }
        QrPaymentBankInfo qrPaymentBankInfo = (QrPaymentBankInfo) other;
        return this.productType == qrPaymentBankInfo.productType && jl40.l(this.autopaymentId, qrPaymentBankInfo.autopaymentId) && jl40.l(this.memberId, qrPaymentBankInfo.memberId);
    }

    public final String getAutopaymentId() {
        return this.autopaymentId;
    }

    public final String getMemberId() {
        return this.memberId;
    }

    public final ProductType getProductType() {
        return this.productType;
    }

    public int hashCode() {
        int hashCode = this.productType.hashCode() * 31;
        String str = this.autopaymentId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.memberId;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final ExternalBankPayloadDto toExternalBankPayloadDto() {
        String str = this.autopaymentId;
        if (str != null) {
            return new ExternalBankPayloadDto(str, this.memberId);
        }
        return null;
    }

    public String toString() {
        ProductType productType = this.productType;
        String str = this.autopaymentId;
        String str2 = this.memberId;
        StringBuilder sb = new StringBuilder("QrPaymentBankInfo(productType=");
        sb.append(productType);
        sb.append(", autopaymentId=");
        sb.append(str);
        sb.append(", memberId=");
        return oyr.t(sb, str2, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.productType.name());
        dest.writeString(this.autopaymentId);
        dest.writeString(this.memberId);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<QrPaymentBankInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QrPaymentBankInfo createFromParcel(Parcel parcel) {
            return new QrPaymentBankInfo(ProductType.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QrPaymentBankInfo[] newArray(int i) {
            return new QrPaymentBankInfo[i];
        }
    }
}
