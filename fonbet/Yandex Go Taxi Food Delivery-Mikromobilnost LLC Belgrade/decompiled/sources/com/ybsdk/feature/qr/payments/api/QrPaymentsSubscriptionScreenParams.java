package com.ybsdk.feature.qr.payments.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.navigation.ScreenParams;
import com.ybsdk.feature.qr.payments.api.data.SubscriptionInfoEntity;
import defpackage.b64;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJN\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0017J\u0010\u0010\"\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\"\u0010\u0015J\u001a\u0010%\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b,\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b-\u0010\u0017R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b\n\u0010\u001e¨\u0006/"}, d2 = {"Lcom/ybsdk/feature/qr/payments/api/QrPaymentsSubscriptionScreenParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", "", "qrcScanId", "qrcLink", "Lcom/ybsdk/feature/qr/payments/api/data/SubscriptionInfoEntity;", "subscriptionInfo", "redirectLink", "origin", "", "isSbpAccountBinding", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/qr/payments/api/data/SubscriptionInfoEntity;Ljava/lang/String;Ljava/lang/String;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/ybsdk/feature/qr/payments/api/data/SubscriptionInfoEntity;", "component4", "component5", "component6", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/qr/payments/api/data/SubscriptionInfoEntity;Ljava/lang/String;Ljava/lang/String;Z)Lcom/ybsdk/feature/qr/payments/api/QrPaymentsSubscriptionScreenParams;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getQrcScanId", "getQrcLink", "Lcom/ybsdk/feature/qr/payments/api/data/SubscriptionInfoEntity;", "getSubscriptionInfo", "getRedirectLink", "getOrigin", "Z", "feature-qr-payments-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class QrPaymentsSubscriptionScreenParams implements ScreenParams {
    public static final Parcelable.Creator<QrPaymentsSubscriptionScreenParams> CREATOR = new Creator();
    private final boolean isSbpAccountBinding;
    private final String origin;
    private final String qrcLink;
    private final String qrcScanId;
    private final String redirectLink;
    private final SubscriptionInfoEntity subscriptionInfo;

    public QrPaymentsSubscriptionScreenParams(String str, String str2, SubscriptionInfoEntity subscriptionInfoEntity, String str3, String str4, boolean z) {
        this.qrcScanId = str;
        this.qrcLink = str2;
        this.subscriptionInfo = subscriptionInfoEntity;
        this.redirectLink = str3;
        this.origin = str4;
        this.isSbpAccountBinding = z;
    }

    public static /* synthetic */ QrPaymentsSubscriptionScreenParams copy$default(QrPaymentsSubscriptionScreenParams qrPaymentsSubscriptionScreenParams, String str, String str2, SubscriptionInfoEntity subscriptionInfoEntity, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qrPaymentsSubscriptionScreenParams.qrcScanId;
        }
        if ((i & 2) != 0) {
            str2 = qrPaymentsSubscriptionScreenParams.qrcLink;
        }
        if ((i & 4) != 0) {
            subscriptionInfoEntity = qrPaymentsSubscriptionScreenParams.subscriptionInfo;
        }
        if ((i & 8) != 0) {
            str3 = qrPaymentsSubscriptionScreenParams.redirectLink;
        }
        if ((i & 16) != 0) {
            str4 = qrPaymentsSubscriptionScreenParams.origin;
        }
        if ((i & 32) != 0) {
            z = qrPaymentsSubscriptionScreenParams.isSbpAccountBinding;
        }
        String str5 = str4;
        boolean z2 = z;
        return qrPaymentsSubscriptionScreenParams.copy(str, str2, subscriptionInfoEntity, str3, str5, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getQrcScanId() {
        return this.qrcScanId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getQrcLink() {
        return this.qrcLink;
    }

    /* renamed from: component3, reason: from getter */
    public final SubscriptionInfoEntity getSubscriptionInfo() {
        return this.subscriptionInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final String getRedirectLink() {
        return this.redirectLink;
    }

    /* renamed from: component5, reason: from getter */
    public final String getOrigin() {
        return this.origin;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsSbpAccountBinding() {
        return this.isSbpAccountBinding;
    }

    public final QrPaymentsSubscriptionScreenParams copy(String qrcScanId, String qrcLink, SubscriptionInfoEntity subscriptionInfo, String redirectLink, String origin, boolean isSbpAccountBinding) {
        return new QrPaymentsSubscriptionScreenParams(qrcScanId, qrcLink, subscriptionInfo, redirectLink, origin, isSbpAccountBinding);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QrPaymentsSubscriptionScreenParams)) {
            return false;
        }
        QrPaymentsSubscriptionScreenParams qrPaymentsSubscriptionScreenParams = (QrPaymentsSubscriptionScreenParams) other;
        return jl40.l(this.qrcScanId, qrPaymentsSubscriptionScreenParams.qrcScanId) && jl40.l(this.qrcLink, qrPaymentsSubscriptionScreenParams.qrcLink) && jl40.l(this.subscriptionInfo, qrPaymentsSubscriptionScreenParams.subscriptionInfo) && jl40.l(this.redirectLink, qrPaymentsSubscriptionScreenParams.redirectLink) && jl40.l(this.origin, qrPaymentsSubscriptionScreenParams.origin) && this.isSbpAccountBinding == qrPaymentsSubscriptionScreenParams.isSbpAccountBinding;
    }

    public final String getOrigin() {
        return this.origin;
    }

    public final String getQrcLink() {
        return this.qrcLink;
    }

    public final String getQrcScanId() {
        return this.qrcScanId;
    }

    public final String getRedirectLink() {
        return this.redirectLink;
    }

    public final SubscriptionInfoEntity getSubscriptionInfo() {
        return this.subscriptionInfo;
    }

    public int hashCode() {
        int hashCode = (this.subscriptionInfo.hashCode() + unr0.b(this.qrcScanId.hashCode() * 31, 31, this.qrcLink)) * 31;
        String str = this.redirectLink;
        return Boolean.hashCode(this.isSbpAccountBinding) + unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.origin);
    }

    public final boolean isSbpAccountBinding() {
        return this.isSbpAccountBinding;
    }

    public String toString() {
        String str = this.qrcScanId;
        String str2 = this.qrcLink;
        SubscriptionInfoEntity subscriptionInfoEntity = this.subscriptionInfo;
        String str3 = this.redirectLink;
        String str4 = this.origin;
        boolean z = this.isSbpAccountBinding;
        StringBuilder v = b64.v("QrPaymentsSubscriptionScreenParams(qrcScanId=", str, ", qrcLink=", str2, ", subscriptionInfo=");
        v.append(subscriptionInfoEntity);
        v.append(", redirectLink=");
        v.append(str3);
        v.append(", origin=");
        return nnm.i(str4, ", isSbpAccountBinding=", Extension.C_BRAKE, v, z);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.qrcScanId);
        dest.writeString(this.qrcLink);
        this.subscriptionInfo.writeToParcel(dest, flags);
        dest.writeString(this.redirectLink);
        dest.writeString(this.origin);
        dest.writeInt(this.isSbpAccountBinding ? 1 : 0);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<QrPaymentsSubscriptionScreenParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QrPaymentsSubscriptionScreenParams createFromParcel(Parcel parcel) {
            return new QrPaymentsSubscriptionScreenParams(parcel.readString(), parcel.readString(), SubscriptionInfoEntity.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QrPaymentsSubscriptionScreenParams[] newArray(int i) {
            return new QrPaymentsSubscriptionScreenParams[i];
        }
    }

    public /* synthetic */ QrPaymentsSubscriptionScreenParams(String str, String str2, SubscriptionInfoEntity subscriptionInfoEntity, String str3, String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, subscriptionInfoEntity, str3, str4, (i & 32) != 0 ? false : z);
    }
}
