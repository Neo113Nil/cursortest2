package com.yandex.xplat.payment.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0017\u0018\u00002\u00060\u0001j\u0002`\u0002Bc\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b,\u0010\u001fR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b0\u0010\u001f¨\u00061"}, d2 = {"Lcom/yandex/xplat/payment/sdk/PaymentSettings;", "Landroid/os/Parcelable;", "Lcom/yandex/xplat/common/Parcelable;", "", "total", "currency", "licenseURL", "Lcom/yandex/xplat/payment/sdk/Acquirer;", "acquirer", WebViewActivity.KEY_ENVIRONMENT, "Lcom/yandex/xplat/payment/sdk/MerchantInfo;", "merchantInfo", "Lcom/yandex/xplat/payment/sdk/PaymethodMarkup;", "payMethodMarkup", "creditFormUrl", "", "legalForSbpQr", "payload", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/xplat/payment/sdk/Acquirer;Ljava/lang/String;Lcom/yandex/xplat/payment/sdk/MerchantInfo;Lcom/yandex/xplat/payment/sdk/PaymethodMarkup;Ljava/lang/String;ZLjava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTotal", "()Ljava/lang/String;", "getCurrency", "getLicenseURL", "Lcom/yandex/xplat/payment/sdk/Acquirer;", "getAcquirer", "()Lcom/yandex/xplat/payment/sdk/Acquirer;", "getEnvironment", "Lcom/yandex/xplat/payment/sdk/MerchantInfo;", "getMerchantInfo", "()Lcom/yandex/xplat/payment/sdk/MerchantInfo;", "Lcom/yandex/xplat/payment/sdk/PaymethodMarkup;", "getPayMethodMarkup", "()Lcom/yandex/xplat/payment/sdk/PaymethodMarkup;", "getCreditFormUrl", "Z", "getLegalForSbpQr", "()Z", "getPayload", "xplat-payment-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public class PaymentSettings implements Parcelable {
    public static final Parcelable.Creator<PaymentSettings> CREATOR = new Creator();
    private final Acquirer acquirer;
    private final String creditFormUrl;
    private final String currency;
    private final String environment;
    private final boolean legalForSbpQr;
    private final String licenseURL;
    private final MerchantInfo merchantInfo;
    private final PaymethodMarkup payMethodMarkup;
    private final String payload;
    private final String total;

    public PaymentSettings(String str, String str2, String str3, Acquirer acquirer, String str4, MerchantInfo merchantInfo, PaymethodMarkup paymethodMarkup, String str5, boolean z, String str6) {
        this.total = str;
        this.currency = str2;
        this.licenseURL = str3;
        this.acquirer = acquirer;
        this.environment = str4;
        this.merchantInfo = merchantInfo;
        this.payMethodMarkup = paymethodMarkup;
        this.creditFormUrl = str5;
        this.legalForSbpQr = z;
        this.payload = str6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Acquirer getAcquirer() {
        return this.acquirer;
    }

    public final String getCreditFormUrl() {
        return this.creditFormUrl;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getEnvironment() {
        return this.environment;
    }

    public final boolean getLegalForSbpQr() {
        return this.legalForSbpQr;
    }

    public final String getLicenseURL() {
        return this.licenseURL;
    }

    public final MerchantInfo getMerchantInfo() {
        return this.merchantInfo;
    }

    public final PaymethodMarkup getPayMethodMarkup() {
        return this.payMethodMarkup;
    }

    public final String getPayload() {
        return this.payload;
    }

    public final String getTotal() {
        return this.total;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.total);
        dest.writeString(this.currency);
        dest.writeString(this.licenseURL);
        Acquirer acquirer = this.acquirer;
        if (acquirer == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(acquirer.name());
        }
        dest.writeString(this.environment);
        dest.writeParcelable(this.merchantInfo, flags);
        dest.writeParcelable(this.payMethodMarkup, flags);
        dest.writeString(this.creditFormUrl);
        dest.writeInt(this.legalForSbpQr ? 1 : 0);
        dest.writeString(this.payload);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PaymentSettings> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentSettings createFromParcel(Parcel parcel) {
            return new PaymentSettings(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Acquirer.valueOf(parcel.readString()), parcel.readString(), (MerchantInfo) parcel.readParcelable(PaymentSettings.class.getClassLoader()), (PaymethodMarkup) parcel.readParcelable(PaymentSettings.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentSettings[] newArray(int i) {
            return new PaymentSettings[i];
        }
    }
}
