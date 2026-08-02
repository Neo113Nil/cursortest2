package com.yandex.plus.pay.api.google.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b64;
import defpackage.btt;
import defpackage.ctt;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.psq0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010\u0015J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u001c¨\u0006+"}, d2 = {"Lcom/yandex/plus/pay/api/google/model/GoogleBillingConfig;", "Landroid/os/Parcelable;", "", "countryCode", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILjava/lang/String;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$pay_sdk_api_release", "(Lcom/yandex/plus/pay/api/google/model/GoogleBillingConfig;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/yandex/plus/pay/api/google/model/GoogleBillingConfig;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCountryCode", "Companion", "btt", "ctt", "pay-sdk-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class GoogleBillingConfig implements Parcelable {
    private final String countryCode;
    public static final ctt Companion = new ctt();
    public static final Parcelable.Creator<GoogleBillingConfig> CREATOR = new Creator();

    public /* synthetic */ GoogleBillingConfig(int i, String str, psq0 psq0Var) {
        if (1 == (i & 1)) {
            this.countryCode = str;
        } else {
            qje.Z(i, 1, btt.a.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ GoogleBillingConfig copy$default(GoogleBillingConfig googleBillingConfig, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = googleBillingConfig.countryCode;
        }
        return googleBillingConfig.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    public final GoogleBillingConfig copy(String countryCode) {
        return new GoogleBillingConfig(countryCode);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GoogleBillingConfig) && jl40.l(this.countryCode, ((GoogleBillingConfig) other).countryCode);
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public int hashCode() {
        return this.countryCode.hashCode();
    }

    public String toString() {
        return b64.p(new StringBuilder("GoogleBillingConfig(countryCode="), this.countryCode, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.countryCode);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GoogleBillingConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoogleBillingConfig createFromParcel(Parcel parcel) {
            return new GoogleBillingConfig(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoogleBillingConfig[] newArray(int i) {
            return new GoogleBillingConfig[i];
        }
    }

    public GoogleBillingConfig(String str) {
        this.countryCode = str;
    }
}
