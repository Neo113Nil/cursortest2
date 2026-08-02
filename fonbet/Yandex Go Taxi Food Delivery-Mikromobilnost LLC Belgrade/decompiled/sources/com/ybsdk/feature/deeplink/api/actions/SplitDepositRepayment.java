package com.ybsdk.feature.deeplink.api.actions;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import defpackage.b64;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J<\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0014J\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0012J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0018¨\u0006("}, d2 = {"Lcom/ybsdk/feature/deeplink/api/actions/SplitDepositRepayment;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "", FinishFlowStatus.ORDER_ID_FIELD_NAME, "scenario", "previousPaymentIndex", "Landroid/net/Uri;", "deeplinkUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Landroid/net/Uri;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;)Lcom/ybsdk/feature/deeplink/api/actions/SplitDepositRepayment;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrderId", "getScenario", "getPreviousPaymentIndex", "Landroid/net/Uri;", "getDeeplinkUri", "feature-deeplink-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SplitDepositRepayment implements BaseDeeplinkAction {
    public static final Parcelable.Creator<SplitDepositRepayment> CREATOR = new Creator();
    private final Uri deeplinkUri;
    private final String orderId;
    private final String previousPaymentIndex;
    private final String scenario;

    public SplitDepositRepayment(String str, String str2, String str3, Uri uri) {
        this.orderId = str;
        this.scenario = str2;
        this.previousPaymentIndex = str3;
        this.deeplinkUri = uri;
    }

    public static /* synthetic */ SplitDepositRepayment copy$default(SplitDepositRepayment splitDepositRepayment, String str, String str2, String str3, Uri uri, int i, Object obj) {
        if ((i & 1) != 0) {
            str = splitDepositRepayment.orderId;
        }
        if ((i & 2) != 0) {
            str2 = splitDepositRepayment.scenario;
        }
        if ((i & 4) != 0) {
            str3 = splitDepositRepayment.previousPaymentIndex;
        }
        if ((i & 8) != 0) {
            uri = splitDepositRepayment.deeplinkUri;
        }
        return splitDepositRepayment.copy(str, str2, str3, uri);
    }

    /* renamed from: component1, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getScenario() {
        return this.scenario;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPreviousPaymentIndex() {
        return this.previousPaymentIndex;
    }

    /* renamed from: component4, reason: from getter */
    public final Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public final SplitDepositRepayment copy(String orderId, String scenario, String previousPaymentIndex, Uri deeplinkUri) {
        return new SplitDepositRepayment(orderId, scenario, previousPaymentIndex, deeplinkUri);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SplitDepositRepayment)) {
            return false;
        }
        SplitDepositRepayment splitDepositRepayment = (SplitDepositRepayment) other;
        return jl40.l(this.orderId, splitDepositRepayment.orderId) && jl40.l(this.scenario, splitDepositRepayment.scenario) && jl40.l(this.previousPaymentIndex, splitDepositRepayment.previousPaymentIndex) && jl40.l(this.deeplinkUri, splitDepositRepayment.deeplinkUri);
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getPreviousPaymentIndex() {
        return this.previousPaymentIndex;
    }

    public final String getScenario() {
        return this.scenario;
    }

    public int hashCode() {
        int hashCode = this.orderId.hashCode() * 31;
        String str = this.scenario;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.previousPaymentIndex;
        return this.deeplinkUri.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.orderId;
        String str2 = this.scenario;
        String str3 = this.previousPaymentIndex;
        Uri uri = this.deeplinkUri;
        StringBuilder v = b64.v("SplitDepositRepayment(orderId=", str, ", scenario=", str2, ", previousPaymentIndex=");
        v.append(str3);
        v.append(", deeplinkUri=");
        v.append(uri);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.orderId);
        dest.writeString(this.scenario);
        dest.writeString(this.previousPaymentIndex);
        dest.writeParcelable(this.deeplinkUri, flags);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SplitDepositRepayment> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SplitDepositRepayment createFromParcel(Parcel parcel) {
            return new SplitDepositRepayment(parcel.readString(), parcel.readString(), parcel.readString(), (Uri) parcel.readParcelable(SplitDepositRepayment.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SplitDepositRepayment[] newArray(int i) {
            return new SplitDepositRepayment[i];
        }
    }
}
