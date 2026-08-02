package com.ybsdk.feature.pin.internal.screens.biometry;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.navigation.ScreenParams;
import com.ybsdk.feature.pin.api.entities.PinScenario;
import com.ybsdk.feature.pin.internal.entities.PinCode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J\u0010\u0010\u001b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0010J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0014¨\u0006%"}, d2 = {"Lcom/ybsdk/feature/pin/internal/screens/biometry/BiometricScreenParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", "Lcom/ybsdk/feature/pin/api/entities/PinScenario;", "analyticsScenario", "Lcom/ybsdk/feature/pin/internal/entities/PinCode;", "pinCode", "<init>", "(Lcom/ybsdk/feature/pin/api/entities/PinScenario;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/feature/pin/api/entities/PinScenario;", "component2-ZhXAj9Q", "()Ljava/lang/String;", "component2", "copy-j0wfMRs", "(Lcom/ybsdk/feature/pin/api/entities/PinScenario;Ljava/lang/String;)Lcom/ybsdk/feature/pin/internal/screens/biometry/BiometricScreenParams;", "copy", "", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/pin/api/entities/PinScenario;", "getAnalyticsScenario", "Ljava/lang/String;", "getPinCode-ZhXAj9Q", "feature-pin_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BiometricScreenParams implements ScreenParams {
    public static final Parcelable.Creator<BiometricScreenParams> CREATOR = new Creator();
    private final PinScenario analyticsScenario;
    private final String pinCode;

    private BiometricScreenParams(PinScenario pinScenario, String str) {
        this.analyticsScenario = pinScenario;
        this.pinCode = str;
    }

    /* renamed from: copy-j0wfMRs$default, reason: not valid java name */
    public static /* synthetic */ BiometricScreenParams m457copyj0wfMRs$default(BiometricScreenParams biometricScreenParams, PinScenario pinScenario, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            pinScenario = biometricScreenParams.analyticsScenario;
        }
        if ((i & 2) != 0) {
            str = biometricScreenParams.pinCode;
        }
        return biometricScreenParams.m459copyj0wfMRs(pinScenario, str);
    }

    /* renamed from: component1, reason: from getter */
    public final PinScenario getAnalyticsScenario() {
        return this.analyticsScenario;
    }

    /* renamed from: component2-ZhXAj9Q, reason: not valid java name and from getter */
    public final String getPinCode() {
        return this.pinCode;
    }

    /* renamed from: copy-j0wfMRs, reason: not valid java name */
    public final BiometricScreenParams m459copyj0wfMRs(PinScenario analyticsScenario, String pinCode) {
        return new BiometricScreenParams(analyticsScenario, pinCode, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BiometricScreenParams)) {
            return false;
        }
        BiometricScreenParams biometricScreenParams = (BiometricScreenParams) other;
        return this.analyticsScenario == biometricScreenParams.analyticsScenario && PinCode.m451equalsimpl0(this.pinCode, biometricScreenParams.pinCode);
    }

    public final PinScenario getAnalyticsScenario() {
        return this.analyticsScenario;
    }

    /* renamed from: getPinCode-ZhXAj9Q, reason: not valid java name */
    public final String m460getPinCodeZhXAj9Q() {
        return this.pinCode;
    }

    public int hashCode() {
        return PinCode.m452hashCodeimpl(this.pinCode) + (this.analyticsScenario.hashCode() * 31);
    }

    public String toString() {
        return "BiometricScreenParams(analyticsScenario=" + this.analyticsScenario + ", pinCode=" + PinCode.m453toStringimpl(this.pinCode) + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.analyticsScenario.name());
        PinCode.m454writeToParcelimpl(this.pinCode, dest, flags);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BiometricScreenParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BiometricScreenParams createFromParcel(Parcel parcel) {
            return new BiometricScreenParams(PinScenario.valueOf(parcel.readString()), PinCode.CREATOR.createFromParcel(parcel).m455unboximpl(), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BiometricScreenParams[] newArray(int i) {
            return new BiometricScreenParams[i];
        }
    }

    public /* synthetic */ BiometricScreenParams(PinScenario pinScenario, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(pinScenario, str);
    }
}
