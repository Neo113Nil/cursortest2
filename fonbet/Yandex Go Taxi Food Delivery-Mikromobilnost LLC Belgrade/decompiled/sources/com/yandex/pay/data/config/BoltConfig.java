package com.yandex.pay.data.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.fintechsdk.entities.environment.PayEnvironment;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import com.yandex.pay.base.api.MerchantData;
import defpackage.jl40;
import defpackage.w511;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u0000 %2\u00020\u0001:\u0001%B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0011J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0015¨\u0006&"}, d2 = {"Lcom/yandex/pay/data/config/BoltConfig;", "Landroid/os/Parcelable;", "Lcom/yandex/pay/base/api/MerchantData;", "merchantData", "Lcom/yandex/fintechsdk/entities/environment/PayEnvironment;", WebViewActivity.KEY_ENVIRONMENT, "<init>", "(Lcom/yandex/pay/base/api/MerchantData;Lcom/yandex/fintechsdk/entities/environment/PayEnvironment;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/pay/base/api/MerchantData;", "component2", "()Lcom/yandex/fintechsdk/entities/environment/PayEnvironment;", "copy", "(Lcom/yandex/pay/base/api/MerchantData;Lcom/yandex/fintechsdk/entities/environment/PayEnvironment;)Lcom/yandex/pay/data/config/BoltConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/pay/base/api/MerchantData;", "getMerchantData", "Lcom/yandex/fintechsdk/entities/environment/PayEnvironment;", "getEnvironment", "CREATOR", "flows-applink-payment_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BoltConfig implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final PayEnvironment environment;
    private final MerchantData merchantData;

    public BoltConfig(Parcel parcel) {
        this((MerchantData) parcel.readParcelable(MerchantData.class.getClassLoader()), INSTANCE.parseEnvironment(parcel.readString()));
    }

    public static /* synthetic */ BoltConfig copy$default(BoltConfig boltConfig, MerchantData merchantData, PayEnvironment payEnvironment, int i, Object obj) {
        if ((i & 1) != 0) {
            merchantData = boltConfig.merchantData;
        }
        if ((i & 2) != 0) {
            payEnvironment = boltConfig.environment;
        }
        return boltConfig.copy(merchantData, payEnvironment);
    }

    /* renamed from: component1, reason: from getter */
    public final MerchantData getMerchantData() {
        return this.merchantData;
    }

    /* renamed from: component2, reason: from getter */
    public final PayEnvironment getEnvironment() {
        return this.environment;
    }

    public final BoltConfig copy(MerchantData merchantData, PayEnvironment environment) {
        return new BoltConfig(merchantData, environment);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoltConfig)) {
            return false;
        }
        BoltConfig boltConfig = (BoltConfig) other;
        return jl40.l(this.merchantData, boltConfig.merchantData) && this.environment == boltConfig.environment;
    }

    public final PayEnvironment getEnvironment() {
        return this.environment;
    }

    public final MerchantData getMerchantData() {
        return this.merchantData;
    }

    public int hashCode() {
        return this.environment.hashCode() + (this.merchantData.hashCode() * 31);
    }

    public String toString() {
        return "BoltConfig(merchantData=" + this.merchantData + ", environment=" + this.environment + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeParcelable(this.merchantData, flags);
        parcel.writeString(INSTANCE.toParcelToken(this.environment));
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\fJ\f\u0010\r\u001a\u00020\u000e*\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000eH\u0002¨\u0006\u0012"}, d2 = {"Lcom/yandex/pay/data/config/BoltConfig$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/yandex/pay/data/config/BoltConfig;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/yandex/pay/data/config/BoltConfig;", "toParcelToken", "", "Lcom/yandex/fintechsdk/entities/environment/PayEnvironment;", "parseEnvironment", "env", "flows-applink-payment_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.yandex.pay.data.config.BoltConfig$CREATOR, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<BoltConfig> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final PayEnvironment parseEnvironment(String env) {
            int hashCode = env.hashCode();
            if (hashCode != -1711584601) {
                if (hashCode != 67573) {
                    if (hashCode == 2464599 && env.equals("PROD")) {
                        return PayEnvironment.PRODUCTION;
                    }
                } else if (env.equals("DEV")) {
                    return PayEnvironment.TESTING;
                }
            } else if (env.equals("SANDBOX")) {
                return PayEnvironment.SANDBOX;
            }
            return PayEnvironment.PRODUCTION;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String toParcelToken(PayEnvironment payEnvironment) {
            int i = a.a[payEnvironment.ordinal()];
            if (i == 1) {
                return "DEV";
            }
            if (i == 2) {
                return "SANDBOX";
            }
            if (i == 3) {
                return "PROD";
            }
            w511.b();
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BoltConfig createFromParcel(Parcel parcel) {
            return new BoltConfig(parcel);
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BoltConfig[] newArray(int size) {
            return new BoltConfig[size];
        }
    }

    public BoltConfig(MerchantData merchantData, PayEnvironment payEnvironment) {
        this.merchantData = merchantData;
        this.environment = payEnvironment;
    }
}
