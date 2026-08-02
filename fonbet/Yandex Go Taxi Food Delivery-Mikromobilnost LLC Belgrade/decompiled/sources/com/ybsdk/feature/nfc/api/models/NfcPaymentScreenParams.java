package com.ybsdk.feature.nfc.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.navigation.ScreenParams;
import defpackage.jl40;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ<\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\"\u0010\u0014J\u001a\u0010%\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b\t\u0010\u001c¨\u0006."}, d2 = {"Lcom/ybsdk/feature/nfc/api/models/NfcPaymentScreenParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", "Lcom/ybsdk/feature/nfc/api/models/NfcPaymentScenario;", "nfcPaymentScenario", "Lcom/ybsdk/feature/nfc/api/models/NfcPaymentMethod;", "nfcPaymentMethod", "Lcom/ybsdk/feature/nfc/api/models/NfcPaymentResult;", "nfcPaymentResult", "", "isViewPagerMode", "<init>", "(Lcom/ybsdk/feature/nfc/api/models/NfcPaymentScenario;Lcom/ybsdk/feature/nfc/api/models/NfcPaymentMethod;Lcom/ybsdk/feature/nfc/api/models/NfcPaymentResult;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/feature/nfc/api/models/NfcPaymentScenario;", "component2", "()Lcom/ybsdk/feature/nfc/api/models/NfcPaymentMethod;", "component3", "()Lcom/ybsdk/feature/nfc/api/models/NfcPaymentResult;", "component4", "()Z", "copy", "(Lcom/ybsdk/feature/nfc/api/models/NfcPaymentScenario;Lcom/ybsdk/feature/nfc/api/models/NfcPaymentMethod;Lcom/ybsdk/feature/nfc/api/models/NfcPaymentResult;Z)Lcom/ybsdk/feature/nfc/api/models/NfcPaymentScreenParams;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/nfc/api/models/NfcPaymentScenario;", "getNfcPaymentScenario", "Lcom/ybsdk/feature/nfc/api/models/NfcPaymentMethod;", "getNfcPaymentMethod", "Lcom/ybsdk/feature/nfc/api/models/NfcPaymentResult;", "getNfcPaymentResult", "Z", "feature-nfc-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class NfcPaymentScreenParams implements ScreenParams {
    public static final Parcelable.Creator<NfcPaymentScreenParams> CREATOR = new Creator();
    private final boolean isViewPagerMode;
    private final NfcPaymentMethod nfcPaymentMethod;
    private final NfcPaymentResult nfcPaymentResult;
    private final NfcPaymentScenario nfcPaymentScenario;

    public /* synthetic */ NfcPaymentScreenParams(NfcPaymentScenario nfcPaymentScenario, NfcPaymentMethod nfcPaymentMethod, NfcPaymentResult nfcPaymentResult, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nfcPaymentScenario, (i & 2) != 0 ? null : nfcPaymentMethod, (i & 4) != 0 ? null : nfcPaymentResult, (i & 8) != 0 ? false : z);
    }

    public static /* synthetic */ NfcPaymentScreenParams copy$default(NfcPaymentScreenParams nfcPaymentScreenParams, NfcPaymentScenario nfcPaymentScenario, NfcPaymentMethod nfcPaymentMethod, NfcPaymentResult nfcPaymentResult, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            nfcPaymentScenario = nfcPaymentScreenParams.nfcPaymentScenario;
        }
        if ((i & 2) != 0) {
            nfcPaymentMethod = nfcPaymentScreenParams.nfcPaymentMethod;
        }
        if ((i & 4) != 0) {
            nfcPaymentResult = nfcPaymentScreenParams.nfcPaymentResult;
        }
        if ((i & 8) != 0) {
            z = nfcPaymentScreenParams.isViewPagerMode;
        }
        return nfcPaymentScreenParams.copy(nfcPaymentScenario, nfcPaymentMethod, nfcPaymentResult, z);
    }

    /* renamed from: component1, reason: from getter */
    public final NfcPaymentScenario getNfcPaymentScenario() {
        return this.nfcPaymentScenario;
    }

    /* renamed from: component2, reason: from getter */
    public final NfcPaymentMethod getNfcPaymentMethod() {
        return this.nfcPaymentMethod;
    }

    /* renamed from: component3, reason: from getter */
    public final NfcPaymentResult getNfcPaymentResult() {
        return this.nfcPaymentResult;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsViewPagerMode() {
        return this.isViewPagerMode;
    }

    public final NfcPaymentScreenParams copy(NfcPaymentScenario nfcPaymentScenario, NfcPaymentMethod nfcPaymentMethod, NfcPaymentResult nfcPaymentResult, boolean isViewPagerMode) {
        return new NfcPaymentScreenParams(nfcPaymentScenario, nfcPaymentMethod, nfcPaymentResult, isViewPagerMode);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NfcPaymentScreenParams)) {
            return false;
        }
        NfcPaymentScreenParams nfcPaymentScreenParams = (NfcPaymentScreenParams) other;
        return this.nfcPaymentScenario == nfcPaymentScreenParams.nfcPaymentScenario && jl40.l(this.nfcPaymentMethod, nfcPaymentScreenParams.nfcPaymentMethod) && jl40.l(this.nfcPaymentResult, nfcPaymentScreenParams.nfcPaymentResult) && this.isViewPagerMode == nfcPaymentScreenParams.isViewPagerMode;
    }

    public final NfcPaymentMethod getNfcPaymentMethod() {
        return this.nfcPaymentMethod;
    }

    public final NfcPaymentResult getNfcPaymentResult() {
        return this.nfcPaymentResult;
    }

    public final NfcPaymentScenario getNfcPaymentScenario() {
        return this.nfcPaymentScenario;
    }

    public int hashCode() {
        int hashCode = this.nfcPaymentScenario.hashCode() * 31;
        NfcPaymentMethod nfcPaymentMethod = this.nfcPaymentMethod;
        int hashCode2 = (hashCode + (nfcPaymentMethod == null ? 0 : nfcPaymentMethod.hashCode())) * 31;
        NfcPaymentResult nfcPaymentResult = this.nfcPaymentResult;
        return Boolean.hashCode(this.isViewPagerMode) + ((hashCode2 + (nfcPaymentResult != null ? nfcPaymentResult.hashCode() : 0)) * 31);
    }

    public final boolean isViewPagerMode() {
        return this.isViewPagerMode;
    }

    public String toString() {
        return "NfcPaymentScreenParams(nfcPaymentScenario=" + this.nfcPaymentScenario + ", nfcPaymentMethod=" + this.nfcPaymentMethod + ", nfcPaymentResult=" + this.nfcPaymentResult + ", isViewPagerMode=" + this.isViewPagerMode + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nfcPaymentScenario.name());
        dest.writeParcelable(this.nfcPaymentMethod, flags);
        dest.writeParcelable(this.nfcPaymentResult, flags);
        dest.writeInt(this.isViewPagerMode ? 1 : 0);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<NfcPaymentScreenParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NfcPaymentScreenParams createFromParcel(Parcel parcel) {
            return new NfcPaymentScreenParams(NfcPaymentScenario.valueOf(parcel.readString()), (NfcPaymentMethod) parcel.readParcelable(NfcPaymentScreenParams.class.getClassLoader()), (NfcPaymentResult) parcel.readParcelable(NfcPaymentScreenParams.class.getClassLoader()), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NfcPaymentScreenParams[] newArray(int i) {
            return new NfcPaymentScreenParams[i];
        }
    }

    public NfcPaymentScreenParams(NfcPaymentScenario nfcPaymentScenario, NfcPaymentMethod nfcPaymentMethod, NfcPaymentResult nfcPaymentResult, boolean z) {
        this.nfcPaymentScenario = nfcPaymentScenario;
        this.nfcPaymentMethod = nfcPaymentMethod;
        this.nfcPaymentResult = nfcPaymentResult;
        this.isViewPagerMode = z;
    }
}
