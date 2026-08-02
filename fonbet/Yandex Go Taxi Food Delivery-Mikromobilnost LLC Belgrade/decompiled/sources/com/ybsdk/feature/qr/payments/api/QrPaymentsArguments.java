package com.ybsdk.feature.qr.payments.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.navigation.ScreenParams;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJP\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0017J\u0010\u0010\"\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\"\u0010\u0015J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b,\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b-\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b.\u0010\u0017R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u0010\u001e¨\u00061"}, d2 = {"Lcom/ybsdk/feature/qr/payments/api/QrPaymentsArguments;", "Lcom/ybsdk/core/navigation/ScreenParams;", "", "qrLink", "Lcom/ybsdk/feature/qr/payments/api/QrSource;", "qrSource", "origin", "agreementId", "autopaymentId", "Lcom/ybsdk/core/navigation/cicerone/OpenScreenRequirement;", "screenRequirement", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/qr/payments/api/QrSource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/navigation/cicerone/OpenScreenRequirement;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lcom/ybsdk/feature/qr/payments/api/QrSource;", "component3", "component4", "component5", "component6", "()Lcom/ybsdk/core/navigation/cicerone/OpenScreenRequirement;", "copy", "(Ljava/lang/String;Lcom/ybsdk/feature/qr/payments/api/QrSource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/navigation/cicerone/OpenScreenRequirement;)Lcom/ybsdk/feature/qr/payments/api/QrPaymentsArguments;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getQrLink", "Lcom/ybsdk/feature/qr/payments/api/QrSource;", "getQrSource", "getOrigin", "getAgreementId", "getAutopaymentId", "Lcom/ybsdk/core/navigation/cicerone/OpenScreenRequirement;", "getScreenRequirement", "feature-qr-payments-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class QrPaymentsArguments implements ScreenParams {
    public static final Parcelable.Creator<QrPaymentsArguments> CREATOR = new Creator();
    private final String agreementId;
    private final String autopaymentId;
    private final String origin;
    private final String qrLink;
    private final QrSource qrSource;
    private final OpenScreenRequirement screenRequirement;

    public QrPaymentsArguments(String str, QrSource qrSource, String str2, String str3, String str4, OpenScreenRequirement openScreenRequirement) {
        this.qrLink = str;
        this.qrSource = qrSource;
        this.origin = str2;
        this.agreementId = str3;
        this.autopaymentId = str4;
        this.screenRequirement = openScreenRequirement;
    }

    public static /* synthetic */ QrPaymentsArguments copy$default(QrPaymentsArguments qrPaymentsArguments, String str, QrSource qrSource, String str2, String str3, String str4, OpenScreenRequirement openScreenRequirement, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qrPaymentsArguments.qrLink;
        }
        if ((i & 2) != 0) {
            qrSource = qrPaymentsArguments.qrSource;
        }
        if ((i & 4) != 0) {
            str2 = qrPaymentsArguments.origin;
        }
        if ((i & 8) != 0) {
            str3 = qrPaymentsArguments.agreementId;
        }
        if ((i & 16) != 0) {
            str4 = qrPaymentsArguments.autopaymentId;
        }
        if ((i & 32) != 0) {
            openScreenRequirement = qrPaymentsArguments.screenRequirement;
        }
        String str5 = str4;
        OpenScreenRequirement openScreenRequirement2 = openScreenRequirement;
        return qrPaymentsArguments.copy(str, qrSource, str2, str3, str5, openScreenRequirement2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getQrLink() {
        return this.qrLink;
    }

    /* renamed from: component2, reason: from getter */
    public final QrSource getQrSource() {
        return this.qrSource;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOrigin() {
        return this.origin;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAutopaymentId() {
        return this.autopaymentId;
    }

    /* renamed from: component6, reason: from getter */
    public final OpenScreenRequirement getScreenRequirement() {
        return this.screenRequirement;
    }

    public final QrPaymentsArguments copy(String qrLink, QrSource qrSource, String origin, String agreementId, String autopaymentId, OpenScreenRequirement screenRequirement) {
        return new QrPaymentsArguments(qrLink, qrSource, origin, agreementId, autopaymentId, screenRequirement);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QrPaymentsArguments)) {
            return false;
        }
        QrPaymentsArguments qrPaymentsArguments = (QrPaymentsArguments) other;
        return jl40.l(this.qrLink, qrPaymentsArguments.qrLink) && this.qrSource == qrPaymentsArguments.qrSource && jl40.l(this.origin, qrPaymentsArguments.origin) && jl40.l(this.agreementId, qrPaymentsArguments.agreementId) && jl40.l(this.autopaymentId, qrPaymentsArguments.autopaymentId) && jl40.l(this.screenRequirement, qrPaymentsArguments.screenRequirement);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final String getAutopaymentId() {
        return this.autopaymentId;
    }

    public final String getOrigin() {
        return this.origin;
    }

    public final String getQrLink() {
        return this.qrLink;
    }

    public final QrSource getQrSource() {
        return this.qrSource;
    }

    public final OpenScreenRequirement getScreenRequirement() {
        return this.screenRequirement;
    }

    public int hashCode() {
        int b = unr0.b((this.qrSource.hashCode() + (this.qrLink.hashCode() * 31)) * 31, 31, this.origin);
        String str = this.agreementId;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.autopaymentId;
        return this.screenRequirement.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.qrLink;
        QrSource qrSource = this.qrSource;
        String str2 = this.origin;
        String str3 = this.agreementId;
        String str4 = this.autopaymentId;
        OpenScreenRequirement openScreenRequirement = this.screenRequirement;
        StringBuilder sb = new StringBuilder("QrPaymentsArguments(qrLink=");
        sb.append(str);
        sb.append(", qrSource=");
        sb.append(qrSource);
        sb.append(", origin=");
        g8e.D(sb, str2, ", agreementId=", str3, ", autopaymentId=");
        sb.append(str4);
        sb.append(", screenRequirement=");
        sb.append(openScreenRequirement);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.qrLink);
        dest.writeString(this.qrSource.name());
        dest.writeString(this.origin);
        dest.writeString(this.agreementId);
        dest.writeString(this.autopaymentId);
        dest.writeParcelable(this.screenRequirement, flags);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<QrPaymentsArguments> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QrPaymentsArguments createFromParcel(Parcel parcel) {
            return new QrPaymentsArguments(parcel.readString(), QrSource.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), (OpenScreenRequirement) parcel.readParcelable(QrPaymentsArguments.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QrPaymentsArguments[] newArray(int i) {
            return new QrPaymentsArguments[i];
        }
    }
}
