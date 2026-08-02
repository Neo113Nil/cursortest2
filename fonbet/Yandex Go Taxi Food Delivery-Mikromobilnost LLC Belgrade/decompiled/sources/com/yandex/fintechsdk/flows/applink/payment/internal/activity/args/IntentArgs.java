package com.yandex.fintechsdk.flows.applink.payment.internal.activity.args;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.fintechsdk.entities.region.Region;
import com.yandex.fintechsdk.flows.applink.payment.internal.model.feature.FeatureFlag;
import com.yandex.fintechsdk.flows.applink.payment.internal.model.payment.PayboxScenario;
import com.yandex.pay.InternalSessionDependencies;
import com.yandex.pay.PaymentSessionKey;
import com.yandex.pay.data.config.BoltConfig;
import com.yandex.pay.payment.PaymentData;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.nzs;
import defpackage.unr0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0081\b\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u001b¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010)J\u0012\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b5\u00106J\u008a\u0001\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b9\u0010,J\u0010\u0010:\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b:\u0010!J\u001a\u0010=\u001a\u00020\u00022\b\u0010<\u001a\u0004\u0018\u00010;HÖ\u0003¢\u0006\u0004\b=\u0010>R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010?\u001a\u0004\b@\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010A\u001a\u0004\bB\u0010%R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010C\u001a\u0004\bD\u0010'R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010E\u001a\u0004\b\t\u0010)R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010E\u001a\u0004\b\n\u0010)R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010F\u001a\u0004\bG\u0010,R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010H\u001a\u0004\bI\u0010.R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010J\u001a\u0004\bK\u00100R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010L\u001a\u0004\bM\u00102R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010N\u001a\u0004\bO\u00104R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010P\u001a\u0004\bQ\u00106¨\u0006R"}, d2 = {"Lcom/yandex/fintechsdk/flows/applink/payment/internal/activity/args/IntentArgs;", "Landroid/os/Parcelable;", "", "canBeAnonymous", "Lcom/yandex/pay/data/config/BoltConfig;", ConfigConstants.CONFIG, "", "Lcom/yandex/fintechsdk/flows/applink/payment/internal/model/feature/FeatureFlag;", "featureFlags", "isStartedFromInternalScanner", "isStartedFromQr", "", "merchantClientId", "Lcom/yandex/fintechsdk/flows/applink/payment/internal/model/payment/PayboxScenario;", "payboxScenario", "Lcom/yandex/pay/payment/PaymentData;", "paymentData", "Lcom/yandex/pay/PaymentSessionKey;", "paymentSessionKey", "Lcom/yandex/fintechsdk/entities/region/Region;", "region", "Lcom/yandex/pay/InternalSessionDependencies;", "sessionDependencies", "<init>", "(Ljava/lang/Boolean;Lcom/yandex/pay/data/config/BoltConfig;Ljava/util/Set;ZZLjava/lang/String;Lcom/yandex/fintechsdk/flows/applink/payment/internal/model/payment/PayboxScenario;Lcom/yandex/pay/payment/PaymentData;Lcom/yandex/pay/PaymentSessionKey;Lcom/yandex/fintechsdk/entities/region/Region;Lcom/yandex/pay/InternalSessionDependencies;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/Boolean;", "component2", "()Lcom/yandex/pay/data/config/BoltConfig;", "component3", "()Ljava/util/Set;", "component4", "()Z", "component5", "component6", "()Ljava/lang/String;", "component7", "()Lcom/yandex/fintechsdk/flows/applink/payment/internal/model/payment/PayboxScenario;", "component8", "()Lcom/yandex/pay/payment/PaymentData;", "component9", "()Lcom/yandex/pay/PaymentSessionKey;", "component10", "()Lcom/yandex/fintechsdk/entities/region/Region;", "component11", "()Lcom/yandex/pay/InternalSessionDependencies;", "copy", "(Ljava/lang/Boolean;Lcom/yandex/pay/data/config/BoltConfig;Ljava/util/Set;ZZLjava/lang/String;Lcom/yandex/fintechsdk/flows/applink/payment/internal/model/payment/PayboxScenario;Lcom/yandex/pay/payment/PaymentData;Lcom/yandex/pay/PaymentSessionKey;Lcom/yandex/fintechsdk/entities/region/Region;Lcom/yandex/pay/InternalSessionDependencies;)Lcom/yandex/fintechsdk/flows/applink/payment/internal/activity/args/IntentArgs;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getCanBeAnonymous", "Lcom/yandex/pay/data/config/BoltConfig;", "getConfig", "Ljava/util/Set;", "getFeatureFlags", "Z", "Ljava/lang/String;", "getMerchantClientId", "Lcom/yandex/fintechsdk/flows/applink/payment/internal/model/payment/PayboxScenario;", "getPayboxScenario", "Lcom/yandex/pay/payment/PaymentData;", "getPaymentData", "Lcom/yandex/pay/PaymentSessionKey;", "getPaymentSessionKey", "Lcom/yandex/fintechsdk/entities/region/Region;", "getRegion", "Lcom/yandex/pay/InternalSessionDependencies;", "getSessionDependencies", "flows-applink-payment_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class IntentArgs implements Parcelable {
    public static final Parcelable.Creator<IntentArgs> CREATOR = new Creator();
    private final Boolean canBeAnonymous;
    private final BoltConfig config;
    private final Set<FeatureFlag> featureFlags;
    private final boolean isStartedFromInternalScanner;
    private final boolean isStartedFromQr;
    private final String merchantClientId;
    private final PayboxScenario payboxScenario;
    private final PaymentData paymentData;
    private final PaymentSessionKey paymentSessionKey;
    private final Region region;
    private final InternalSessionDependencies sessionDependencies;

    public IntentArgs(Boolean bool, BoltConfig boltConfig, Set<FeatureFlag> set, boolean z, boolean z2, String str, PayboxScenario payboxScenario, PaymentData paymentData, PaymentSessionKey paymentSessionKey, Region region, InternalSessionDependencies internalSessionDependencies) {
        this.canBeAnonymous = bool;
        this.config = boltConfig;
        this.featureFlags = set;
        this.isStartedFromInternalScanner = z;
        this.isStartedFromQr = z2;
        this.merchantClientId = str;
        this.payboxScenario = payboxScenario;
        this.paymentData = paymentData;
        this.paymentSessionKey = paymentSessionKey;
        this.region = region;
        this.sessionDependencies = internalSessionDependencies;
    }

    public static /* synthetic */ IntentArgs copy$default(IntentArgs intentArgs, Boolean bool, BoltConfig boltConfig, Set set, boolean z, boolean z2, String str, PayboxScenario payboxScenario, PaymentData paymentData, PaymentSessionKey paymentSessionKey, Region region, InternalSessionDependencies internalSessionDependencies, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = intentArgs.canBeAnonymous;
        }
        if ((i & 2) != 0) {
            boltConfig = intentArgs.config;
        }
        if ((i & 4) != 0) {
            set = intentArgs.featureFlags;
        }
        if ((i & 8) != 0) {
            z = intentArgs.isStartedFromInternalScanner;
        }
        if ((i & 16) != 0) {
            z2 = intentArgs.isStartedFromQr;
        }
        if ((i & 32) != 0) {
            str = intentArgs.merchantClientId;
        }
        if ((i & 64) != 0) {
            payboxScenario = intentArgs.payboxScenario;
        }
        if ((i & 128) != 0) {
            paymentData = intentArgs.paymentData;
        }
        if ((i & 256) != 0) {
            paymentSessionKey = intentArgs.paymentSessionKey;
        }
        if ((i & 512) != 0) {
            region = intentArgs.region;
        }
        if ((i & 1024) != 0) {
            internalSessionDependencies = intentArgs.sessionDependencies;
        }
        Region region2 = region;
        InternalSessionDependencies internalSessionDependencies2 = internalSessionDependencies;
        PaymentData paymentData2 = paymentData;
        PaymentSessionKey paymentSessionKey2 = paymentSessionKey;
        String str2 = str;
        PayboxScenario payboxScenario2 = payboxScenario;
        boolean z3 = z2;
        Set set2 = set;
        return intentArgs.copy(bool, boltConfig, set2, z, z3, str2, payboxScenario2, paymentData2, paymentSessionKey2, region2, internalSessionDependencies2);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getCanBeAnonymous() {
        return this.canBeAnonymous;
    }

    /* renamed from: component10, reason: from getter */
    public final Region getRegion() {
        return this.region;
    }

    /* renamed from: component11, reason: from getter */
    public final InternalSessionDependencies getSessionDependencies() {
        return this.sessionDependencies;
    }

    /* renamed from: component2, reason: from getter */
    public final BoltConfig getConfig() {
        return this.config;
    }

    public final Set<FeatureFlag> component3() {
        return this.featureFlags;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsStartedFromInternalScanner() {
        return this.isStartedFromInternalScanner;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsStartedFromQr() {
        return this.isStartedFromQr;
    }

    /* renamed from: component6, reason: from getter */
    public final String getMerchantClientId() {
        return this.merchantClientId;
    }

    /* renamed from: component7, reason: from getter */
    public final PayboxScenario getPayboxScenario() {
        return this.payboxScenario;
    }

    /* renamed from: component8, reason: from getter */
    public final PaymentData getPaymentData() {
        return this.paymentData;
    }

    /* renamed from: component9, reason: from getter */
    public final PaymentSessionKey getPaymentSessionKey() {
        return this.paymentSessionKey;
    }

    public final IntentArgs copy(Boolean canBeAnonymous, BoltConfig config, Set<FeatureFlag> featureFlags, boolean isStartedFromInternalScanner, boolean isStartedFromQr, String merchantClientId, PayboxScenario payboxScenario, PaymentData paymentData, PaymentSessionKey paymentSessionKey, Region region, InternalSessionDependencies sessionDependencies) {
        return new IntentArgs(canBeAnonymous, config, featureFlags, isStartedFromInternalScanner, isStartedFromQr, merchantClientId, payboxScenario, paymentData, paymentSessionKey, region, sessionDependencies);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntentArgs)) {
            return false;
        }
        IntentArgs intentArgs = (IntentArgs) other;
        return jl40.l(this.canBeAnonymous, intentArgs.canBeAnonymous) && jl40.l(this.config, intentArgs.config) && jl40.l(this.featureFlags, intentArgs.featureFlags) && this.isStartedFromInternalScanner == intentArgs.isStartedFromInternalScanner && this.isStartedFromQr == intentArgs.isStartedFromQr && jl40.l(this.merchantClientId, intentArgs.merchantClientId) && this.payboxScenario == intentArgs.payboxScenario && jl40.l(this.paymentData, intentArgs.paymentData) && jl40.l(this.paymentSessionKey, intentArgs.paymentSessionKey) && this.region == intentArgs.region && jl40.l(this.sessionDependencies, intentArgs.sessionDependencies);
    }

    public final Boolean getCanBeAnonymous() {
        return this.canBeAnonymous;
    }

    public final BoltConfig getConfig() {
        return this.config;
    }

    public final Set<FeatureFlag> getFeatureFlags() {
        return this.featureFlags;
    }

    public final String getMerchantClientId() {
        return this.merchantClientId;
    }

    public final PayboxScenario getPayboxScenario() {
        return this.payboxScenario;
    }

    public final PaymentData getPaymentData() {
        return this.paymentData;
    }

    public final PaymentSessionKey getPaymentSessionKey() {
        return this.paymentSessionKey;
    }

    public final Region getRegion() {
        return this.region;
    }

    public final InternalSessionDependencies getSessionDependencies() {
        return this.sessionDependencies;
    }

    public int hashCode() {
        Boolean bool = this.canBeAnonymous;
        int e = unr0.e(unr0.e(g8e.e(this.featureFlags, (this.config.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31)) * 31, 31), 31, this.isStartedFromInternalScanner), 31, this.isStartedFromQr);
        String str = this.merchantClientId;
        int hashCode = (this.region.hashCode() + ((this.paymentSessionKey.hashCode() + ((this.paymentData.hashCode() + ((this.payboxScenario.hashCode() + ((e + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31;
        InternalSessionDependencies internalSessionDependencies = this.sessionDependencies;
        return hashCode + (internalSessionDependencies != null ? internalSessionDependencies.hashCode() : 0);
    }

    public final boolean isStartedFromInternalScanner() {
        return this.isStartedFromInternalScanner;
    }

    public final boolean isStartedFromQr() {
        return this.isStartedFromQr;
    }

    public String toString() {
        Boolean bool = this.canBeAnonymous;
        BoltConfig boltConfig = this.config;
        Set<FeatureFlag> set = this.featureFlags;
        boolean z = this.isStartedFromInternalScanner;
        boolean z2 = this.isStartedFromQr;
        String str = this.merchantClientId;
        PayboxScenario payboxScenario = this.payboxScenario;
        PaymentData paymentData = this.paymentData;
        PaymentSessionKey paymentSessionKey = this.paymentSessionKey;
        Region region = this.region;
        InternalSessionDependencies internalSessionDependencies = this.sessionDependencies;
        StringBuilder sb = new StringBuilder("IntentArgs(canBeAnonymous=");
        sb.append(bool);
        sb.append(", config=");
        sb.append(boltConfig);
        sb.append(", featureFlags=");
        sb.append(set);
        sb.append(", isStartedFromInternalScanner=");
        sb.append(z);
        sb.append(", isStartedFromQr=");
        unr0.A(", merchantClientId=", str, ", payboxScenario=", sb, z2);
        sb.append(payboxScenario);
        sb.append(", paymentData=");
        sb.append(paymentData);
        sb.append(", paymentSessionKey=");
        sb.append(paymentSessionKey);
        sb.append(", region=");
        sb.append(region);
        sb.append(", sessionDependencies=");
        sb.append(internalSessionDependencies);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Boolean bool = this.canBeAnonymous;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            nzs.k(dest, 1, bool);
        }
        dest.writeParcelable(this.config, flags);
        Set<FeatureFlag> set = this.featureFlags;
        dest.writeInt(set.size());
        Iterator<FeatureFlag> it = set.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        dest.writeInt(this.isStartedFromInternalScanner ? 1 : 0);
        dest.writeInt(this.isStartedFromQr ? 1 : 0);
        dest.writeString(this.merchantClientId);
        dest.writeString(this.payboxScenario.name());
        dest.writeParcelable(this.paymentData, flags);
        this.paymentSessionKey.writeToParcel(dest, flags);
        dest.writeString(this.region.name());
        InternalSessionDependencies internalSessionDependencies = this.sessionDependencies;
        if (internalSessionDependencies == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            internalSessionDependencies.writeToParcel(dest, flags);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IntentArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IntentArgs createFromParcel(Parcel parcel) {
            Boolean valueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            BoltConfig boltConfig = (BoltConfig) parcel.readParcelable(IntentArgs.class.getClassLoader());
            int readInt = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashSet.add(FeatureFlag.CREATOR.createFromParcel(parcel));
            }
            return new IntentArgs(valueOf, boltConfig, linkedHashSet, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), PayboxScenario.valueOf(parcel.readString()), (PaymentData) parcel.readParcelable(IntentArgs.class.getClassLoader()), PaymentSessionKey.CREATOR.createFromParcel(parcel), Region.valueOf(parcel.readString()), parcel.readInt() != 0 ? InternalSessionDependencies.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IntentArgs[] newArray(int i) {
            return new IntentArgs[i];
        }
    }
}
