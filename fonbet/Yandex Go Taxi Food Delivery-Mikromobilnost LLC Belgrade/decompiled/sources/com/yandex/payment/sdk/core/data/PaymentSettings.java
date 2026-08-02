package com.yandex.payment.sdk.core.data;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011BS\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b&\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b-\u0010\u001eR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b.\u0010\u001e¨\u0006/"}, d2 = {"Lcom/yandex/payment/sdk/core/data/PaymentSettings;", "Landroid/os/Parcelable;", "", "total", "currency", "Landroid/net/Uri;", "licenseURL", "Lcom/yandex/payment/sdk/core/data/Acquirer;", "acquirer", WebViewActivity.KEY_ENVIRONMENT, "Lcom/yandex/payment/sdk/core/data/MerchantInfo;", "merchantInfo", "Lcom/yandex/payment/sdk/core/data/PayMethodMarkup;", "payMethodMarkup", "creditFormUrl", "payload", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Lcom/yandex/payment/sdk/core/data/Acquirer;Ljava/lang/String;Lcom/yandex/payment/sdk/core/data/MerchantInfo;Lcom/yandex/payment/sdk/core/data/PayMethodMarkup;Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Lcom/yandex/payment/sdk/core/data/Acquirer;Ljava/lang/String;Lcom/yandex/payment/sdk/core/data/MerchantInfo;Lcom/yandex/payment/sdk/core/data/PayMethodMarkup;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTotal", "()Ljava/lang/String;", "getCurrency", "Landroid/net/Uri;", "getLicenseURL", "()Landroid/net/Uri;", "Lcom/yandex/payment/sdk/core/data/Acquirer;", "getAcquirer", "()Lcom/yandex/payment/sdk/core/data/Acquirer;", "getEnvironment", "Lcom/yandex/payment/sdk/core/data/MerchantInfo;", "getMerchantInfo", "()Lcom/yandex/payment/sdk/core/data/MerchantInfo;", "Lcom/yandex/payment/sdk/core/data/PayMethodMarkup;", "getPayMethodMarkup", "()Lcom/yandex/payment/sdk/core/data/PayMethodMarkup;", "getCreditFormUrl", "getPayload", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PaymentSettings implements Parcelable {
    public static final Parcelable.Creator<PaymentSettings> CREATOR = new Creator();
    private final Acquirer acquirer;
    private final String creditFormUrl;
    private final String currency;
    private final String environment;
    private final Uri licenseURL;
    private final MerchantInfo merchantInfo;
    private final PayMethodMarkup payMethodMarkup;
    private final String payload;
    private final String total;

    public PaymentSettings(String str, String str2, Uri uri, Acquirer acquirer, String str3, MerchantInfo merchantInfo, PayMethodMarkup payMethodMarkup, String str4, String str5) {
        this.total = str;
        this.currency = str2;
        this.licenseURL = uri;
        this.acquirer = acquirer;
        this.environment = str3;
        this.merchantInfo = merchantInfo;
        this.payMethodMarkup = payMethodMarkup;
        this.creditFormUrl = str4;
        this.payload = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
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

    public final Uri getLicenseURL() {
        return this.licenseURL;
    }

    public final MerchantInfo getMerchantInfo() {
        return this.merchantInfo;
    }

    public final PayMethodMarkup getPayMethodMarkup() {
        return this.payMethodMarkup;
    }

    public final String getPayload() {
        return this.payload;
    }

    public final String getTotal() {
        return this.total;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.total);
        dest.writeString(this.currency);
        dest.writeParcelable(this.licenseURL, flags);
        Acquirer acquirer = this.acquirer;
        if (acquirer == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(acquirer.name());
        }
        dest.writeString(this.environment);
        MerchantInfo merchantInfo = this.merchantInfo;
        if (merchantInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            merchantInfo.writeToParcel(dest, flags);
        }
        PayMethodMarkup payMethodMarkup = this.payMethodMarkup;
        if (payMethodMarkup == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            payMethodMarkup.writeToParcel(dest, flags);
        }
        dest.writeString(this.creditFormUrl);
        dest.writeString(this.payload);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PaymentSettings> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentSettings createFromParcel(Parcel parcel) {
            return new PaymentSettings(parcel.readString(), parcel.readString(), (Uri) parcel.readParcelable(PaymentSettings.class.getClassLoader()), parcel.readInt() == 0 ? null : Acquirer.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : MerchantInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PayMethodMarkup.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentSettings[] newArray(int i) {
            return new PaymentSettings[i];
        }
    }

    public PaymentSettings(String str, String str2, Uri uri, Acquirer acquirer, String str3, MerchantInfo merchantInfo, PayMethodMarkup payMethodMarkup, String str4) {
        this(str, str2, uri, acquirer, str3, merchantInfo, payMethodMarkup, str4, null);
    }
}
