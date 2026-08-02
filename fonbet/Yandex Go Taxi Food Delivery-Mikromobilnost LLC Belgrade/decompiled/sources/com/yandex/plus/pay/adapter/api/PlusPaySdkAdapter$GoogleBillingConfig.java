package com.yandex.plus.pay.adapter.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.afd0;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.psq0;
import defpackage.qje;
import defpackage.unr0;
import defpackage.yjd;
import defpackage.zed0;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J$\u0010\"\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001fJ\u0010\u0010%\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b%\u0010\u0018J\u001a\u0010(\u001a\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b\u0005\u0010!¨\u00060"}, d2 = {"com/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$GoogleBillingConfig", "Landroid/os/Parcelable;", "", "googleCountryCode", "", "isNativePaymentAllowed", "<init>", "(Ljava/lang/String;Z)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;ZLpsq0;)V", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$GoogleBillingConfig;", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$plus_home_pay_sdk_adapter_api_release", "(Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$GoogleBillingConfig;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$GoogleBillingConfig;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getGoogleCountryCode", "Z", "Companion", "zed0", "afd0", "plus-home-pay-sdk-adapter-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PlusPaySdkAdapter$GoogleBillingConfig implements Parcelable {
    private final String googleCountryCode;
    private final boolean isNativePaymentAllowed;
    public static final afd0 Companion = new afd0();
    public static final Parcelable.Creator<PlusPaySdkAdapter$GoogleBillingConfig> CREATOR = new Creator();

    public /* synthetic */ PlusPaySdkAdapter$GoogleBillingConfig(int i, String str, boolean z, psq0 psq0Var) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, zed0.a.getDescriptor());
            throw null;
        }
        this.googleCountryCode = str;
        this.isNativePaymentAllowed = z;
    }

    public static /* synthetic */ PlusPaySdkAdapter$GoogleBillingConfig copy$default(PlusPaySdkAdapter$GoogleBillingConfig plusPaySdkAdapter$GoogleBillingConfig, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = plusPaySdkAdapter$GoogleBillingConfig.googleCountryCode;
        }
        if ((i & 2) != 0) {
            z = plusPaySdkAdapter$GoogleBillingConfig.isNativePaymentAllowed;
        }
        return plusPaySdkAdapter$GoogleBillingConfig.copy(str, z);
    }

    public static final /* synthetic */ void write$Self$plus_home_pay_sdk_adapter_api_release(PlusPaySdkAdapter$GoogleBillingConfig self, yjd output, SerialDescriptor serialDesc) {
        output.o(serialDesc, 0, self.googleCountryCode);
        output.n(serialDesc, 1, self.isNativePaymentAllowed);
    }

    /* renamed from: component1, reason: from getter */
    public final String getGoogleCountryCode() {
        return this.googleCountryCode;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsNativePaymentAllowed() {
        return this.isNativePaymentAllowed;
    }

    public final PlusPaySdkAdapter$GoogleBillingConfig copy(String googleCountryCode, boolean isNativePaymentAllowed) {
        return new PlusPaySdkAdapter$GoogleBillingConfig(googleCountryCode, isNativePaymentAllowed);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlusPaySdkAdapter$GoogleBillingConfig)) {
            return false;
        }
        PlusPaySdkAdapter$GoogleBillingConfig plusPaySdkAdapter$GoogleBillingConfig = (PlusPaySdkAdapter$GoogleBillingConfig) other;
        return jl40.l(this.googleCountryCode, plusPaySdkAdapter$GoogleBillingConfig.googleCountryCode) && this.isNativePaymentAllowed == plusPaySdkAdapter$GoogleBillingConfig.isNativePaymentAllowed;
    }

    public final String getGoogleCountryCode() {
        return this.googleCountryCode;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isNativePaymentAllowed) + (this.googleCountryCode.hashCode() * 31);
    }

    public final boolean isNativePaymentAllowed() {
        return this.isNativePaymentAllowed;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GoogleBillingConfig(googleCountryCode=");
        sb.append(this.googleCountryCode);
        sb.append(", isNativePaymentAllowed=");
        return unr0.u(sb, this.isNativePaymentAllowed, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.googleCountryCode);
        dest.writeInt(this.isNativePaymentAllowed ? 1 : 0);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PlusPaySdkAdapter$GoogleBillingConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusPaySdkAdapter$GoogleBillingConfig createFromParcel(Parcel parcel) {
            return new PlusPaySdkAdapter$GoogleBillingConfig(parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusPaySdkAdapter$GoogleBillingConfig[] newArray(int i) {
            return new PlusPaySdkAdapter$GoogleBillingConfig[i];
        }
    }

    public PlusPaySdkAdapter$GoogleBillingConfig(String str, boolean z) {
        this.googleCountryCode = str;
        this.isNativePaymentAllowed = z;
    }
}
