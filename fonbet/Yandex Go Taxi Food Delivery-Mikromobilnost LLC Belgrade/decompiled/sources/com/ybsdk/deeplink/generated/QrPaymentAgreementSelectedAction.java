package com.ybsdk.deeplink.generated;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J<\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0011J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\u0013R \u0010&\u001a\u00020%8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/ybsdk/deeplink/generated/QrPaymentAgreementSelectedAction;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "", "id", "productCode", "autopaymentId", "memberId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/deeplink/generated/QrPaymentAgreementSelectedAction;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getProductCode", "getAutopaymentId", "getMemberId", "Landroid/net/Uri;", "deeplinkUri", "Landroid/net/Uri;", "getDeeplinkUri", "()Landroid/net/Uri;", "getDeeplinkUri$annotations", "()V", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class QrPaymentAgreementSelectedAction implements BaseDeeplinkAction {
    public static final Parcelable.Creator<QrPaymentAgreementSelectedAction> CREATOR = new Creator();
    private final String autopaymentId;
    private final Uri deeplinkUri;
    private final String id;
    private final String memberId;
    private final String productCode;

    public QrPaymentAgreementSelectedAction(String str, String str2, String str3, String str4) {
        this.id = str;
        this.productCode = str2;
        this.autopaymentId = str3;
        this.memberId = str4;
        Uri.Builder j = ly3.j("ybapp", "screen.open", "/qr_payment_agreement_selected", "id", str);
        j.appendQueryParameter("product_code", str2);
        if (str3 != null) {
            j.appendQueryParameter("autopayment_id", str3);
        }
        if (str4 != null) {
            j.appendQueryParameter("member_id", str4);
        }
        this.deeplinkUri = j.build();
    }

    public static /* synthetic */ QrPaymentAgreementSelectedAction copy$default(QrPaymentAgreementSelectedAction qrPaymentAgreementSelectedAction, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qrPaymentAgreementSelectedAction.id;
        }
        if ((i & 2) != 0) {
            str2 = qrPaymentAgreementSelectedAction.productCode;
        }
        if ((i & 4) != 0) {
            str3 = qrPaymentAgreementSelectedAction.autopaymentId;
        }
        if ((i & 8) != 0) {
            str4 = qrPaymentAgreementSelectedAction.memberId;
        }
        return qrPaymentAgreementSelectedAction.copy(str, str2, str3, str4);
    }

    public static /* synthetic */ void getDeeplinkUri$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getProductCode() {
        return this.productCode;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAutopaymentId() {
        return this.autopaymentId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMemberId() {
        return this.memberId;
    }

    public final QrPaymentAgreementSelectedAction copy(String id, String productCode, String autopaymentId, String memberId) {
        return new QrPaymentAgreementSelectedAction(id, productCode, autopaymentId, memberId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QrPaymentAgreementSelectedAction)) {
            return false;
        }
        QrPaymentAgreementSelectedAction qrPaymentAgreementSelectedAction = (QrPaymentAgreementSelectedAction) other;
        return jl40.l(this.id, qrPaymentAgreementSelectedAction.id) && jl40.l(this.productCode, qrPaymentAgreementSelectedAction.productCode) && jl40.l(this.autopaymentId, qrPaymentAgreementSelectedAction.autopaymentId) && jl40.l(this.memberId, qrPaymentAgreementSelectedAction.memberId);
    }

    public final String getAutopaymentId() {
        return this.autopaymentId;
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public final String getId() {
        return this.id;
    }

    public final String getMemberId() {
        return this.memberId;
    }

    public final String getProductCode() {
        return this.productCode;
    }

    public int hashCode() {
        int b = unr0.b(this.id.hashCode() * 31, 31, this.productCode);
        String str = this.autopaymentId;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.memberId;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.productCode;
        return g8e.r(b64.v("QrPaymentAgreementSelectedAction(id=", str, ", productCode=", str2, ", autopaymentId="), this.autopaymentId, ", memberId=", this.memberId, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.productCode);
        dest.writeString(this.autopaymentId);
        dest.writeString(this.memberId);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<QrPaymentAgreementSelectedAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QrPaymentAgreementSelectedAction createFromParcel(Parcel parcel) {
            return new QrPaymentAgreementSelectedAction(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QrPaymentAgreementSelectedAction[] newArray(int i) {
            return new QrPaymentAgreementSelectedAction[i];
        }
    }

    public /* synthetic */ QrPaymentAgreementSelectedAction(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
