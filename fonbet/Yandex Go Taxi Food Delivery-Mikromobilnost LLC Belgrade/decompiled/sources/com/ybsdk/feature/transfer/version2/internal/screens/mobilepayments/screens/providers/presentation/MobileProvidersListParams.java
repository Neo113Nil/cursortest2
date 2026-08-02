package com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.providers.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.navigation.ScreenParams;
import defpackage.jl40;
import defpackage.oo31;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J0\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0011J\u001a\u0010\u001d\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b#\u0010\u0013¨\u0006$"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/mobilepayments/screens/providers/presentation/MobileProvidersListParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", "", "phone", "", "backVisible", "resultKey", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "copy", "(Ljava/lang/String;ZLjava/lang/String;)Lcom/ybsdk/feature/transfer/version2/internal/screens/mobilepayments/screens/providers/presentation/MobileProvidersListParams;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPhone", "Z", "getBackVisible", "getResultKey", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MobileProvidersListParams implements ScreenParams {
    public static final Parcelable.Creator<MobileProvidersListParams> CREATOR = new Creator();
    private final boolean backVisible;
    private final String phone;
    private final String resultKey;

    public MobileProvidersListParams(String str, boolean z, String str2) {
        this.phone = str;
        this.backVisible = z;
        this.resultKey = str2;
    }

    public static /* synthetic */ MobileProvidersListParams copy$default(MobileProvidersListParams mobileProvidersListParams, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mobileProvidersListParams.phone;
        }
        if ((i & 2) != 0) {
            z = mobileProvidersListParams.backVisible;
        }
        if ((i & 4) != 0) {
            str2 = mobileProvidersListParams.resultKey;
        }
        return mobileProvidersListParams.copy(str, z, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getBackVisible() {
        return this.backVisible;
    }

    /* renamed from: component3, reason: from getter */
    public final String getResultKey() {
        return this.resultKey;
    }

    public final MobileProvidersListParams copy(String phone, boolean backVisible, String resultKey) {
        return new MobileProvidersListParams(phone, backVisible, resultKey);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileProvidersListParams)) {
            return false;
        }
        MobileProvidersListParams mobileProvidersListParams = (MobileProvidersListParams) other;
        return jl40.l(this.phone, mobileProvidersListParams.phone) && this.backVisible == mobileProvidersListParams.backVisible && jl40.l(this.resultKey, mobileProvidersListParams.resultKey);
    }

    public final boolean getBackVisible() {
        return this.backVisible;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getResultKey() {
        return this.resultKey;
    }

    public int hashCode() {
        String str = this.phone;
        return this.resultKey.hashCode() + unr0.e((str == null ? 0 : str.hashCode()) * 31, 31, this.backVisible);
    }

    public String toString() {
        String str = this.phone;
        boolean z = this.backVisible;
        return oyr.t(oo31.l("MobileProvidersListParams(phone=", str, ", backVisible=", ", resultKey=", z), this.resultKey, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.phone);
        dest.writeInt(this.backVisible ? 1 : 0);
        dest.writeString(this.resultKey);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MobileProvidersListParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MobileProvidersListParams createFromParcel(Parcel parcel) {
            return new MobileProvidersListParams(parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MobileProvidersListParams[] newArray(int i) {
            return new MobileProvidersListParams[i];
        }
    }

    public /* synthetic */ MobileProvidersListParams(String str, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, (i & 4) != 0 ? MobileProvidersListFragment.DEFAULT_MOBILE_PROVIDERS_RESULT_KEY : str2);
    }
}
