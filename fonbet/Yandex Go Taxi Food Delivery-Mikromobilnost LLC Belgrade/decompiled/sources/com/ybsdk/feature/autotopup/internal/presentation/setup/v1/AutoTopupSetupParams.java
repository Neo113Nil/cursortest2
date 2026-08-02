package com.ybsdk.feature.autotopup.internal.presentation.setup.v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.navigation.ScreenParams;
import com.ybsdk.feature.autotopup.api.AutoTopupShowOnly;
import com.ybsdk.feature.autotopup.api.AutoTopupType;
import defpackage.b64;
import defpackage.jl40;
import java.math.BigDecimal;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0019J\u0012\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b!\u0010\"Jd\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0019J\u0010\u0010&\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b&\u0010\u0017J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b3\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b4\u0010\u0019R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b6\u0010\"¨\u00067"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/presentation/setup/v1/AutoTopupSetupParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", "", "autoTopupId", "agreementId", "Lcom/ybsdk/feature/autotopup/api/AutoTopupType;", "autoTopupType", "Ljava/math/BigDecimal;", "amount", "threshold", "source", "Lcom/ybsdk/feature/autotopup/api/AutoTopupShowOnly;", "autoTopupShowOnly", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/autotopup/api/AutoTopupType;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Lcom/ybsdk/feature/autotopup/api/AutoTopupShowOnly;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/ybsdk/feature/autotopup/api/AutoTopupType;", "component4", "()Ljava/math/BigDecimal;", "component5", "component6", "component7", "()Lcom/ybsdk/feature/autotopup/api/AutoTopupShowOnly;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/autotopup/api/AutoTopupType;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Lcom/ybsdk/feature/autotopup/api/AutoTopupShowOnly;)Lcom/ybsdk/feature/autotopup/internal/presentation/setup/v1/AutoTopupSetupParams;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAutoTopupId", "getAgreementId", "Lcom/ybsdk/feature/autotopup/api/AutoTopupType;", "getAutoTopupType", "Ljava/math/BigDecimal;", "getAmount", "getThreshold", "getSource", "Lcom/ybsdk/feature/autotopup/api/AutoTopupShowOnly;", "getAutoTopupShowOnly", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutoTopupSetupParams implements ScreenParams {
    public static final Parcelable.Creator<AutoTopupSetupParams> CREATOR = new Creator();
    private final String agreementId;
    private final BigDecimal amount;
    private final String autoTopupId;
    private final AutoTopupShowOnly autoTopupShowOnly;
    private final AutoTopupType autoTopupType;
    private final String source;
    private final BigDecimal threshold;

    public AutoTopupSetupParams(String str, String str2, AutoTopupType autoTopupType, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str3, AutoTopupShowOnly autoTopupShowOnly) {
        this.autoTopupId = str;
        this.agreementId = str2;
        this.autoTopupType = autoTopupType;
        this.amount = bigDecimal;
        this.threshold = bigDecimal2;
        this.source = str3;
        this.autoTopupShowOnly = autoTopupShowOnly;
    }

    public static /* synthetic */ AutoTopupSetupParams copy$default(AutoTopupSetupParams autoTopupSetupParams, String str, String str2, AutoTopupType autoTopupType, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str3, AutoTopupShowOnly autoTopupShowOnly, int i, Object obj) {
        if ((i & 1) != 0) {
            str = autoTopupSetupParams.autoTopupId;
        }
        if ((i & 2) != 0) {
            str2 = autoTopupSetupParams.agreementId;
        }
        if ((i & 4) != 0) {
            autoTopupType = autoTopupSetupParams.autoTopupType;
        }
        if ((i & 8) != 0) {
            bigDecimal = autoTopupSetupParams.amount;
        }
        if ((i & 16) != 0) {
            bigDecimal2 = autoTopupSetupParams.threshold;
        }
        if ((i & 32) != 0) {
            str3 = autoTopupSetupParams.source;
        }
        if ((i & 64) != 0) {
            autoTopupShowOnly = autoTopupSetupParams.autoTopupShowOnly;
        }
        String str4 = str3;
        AutoTopupShowOnly autoTopupShowOnly2 = autoTopupShowOnly;
        BigDecimal bigDecimal3 = bigDecimal2;
        AutoTopupType autoTopupType2 = autoTopupType;
        return autoTopupSetupParams.copy(str, str2, autoTopupType2, bigDecimal, bigDecimal3, str4, autoTopupShowOnly2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAutoTopupId() {
        return this.autoTopupId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component3, reason: from getter */
    public final AutoTopupType getAutoTopupType() {
        return this.autoTopupType;
    }

    /* renamed from: component4, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    /* renamed from: component5, reason: from getter */
    public final BigDecimal getThreshold() {
        return this.threshold;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component7, reason: from getter */
    public final AutoTopupShowOnly getAutoTopupShowOnly() {
        return this.autoTopupShowOnly;
    }

    public final AutoTopupSetupParams copy(String autoTopupId, String agreementId, AutoTopupType autoTopupType, BigDecimal amount, BigDecimal threshold, String source, AutoTopupShowOnly autoTopupShowOnly) {
        return new AutoTopupSetupParams(autoTopupId, agreementId, autoTopupType, amount, threshold, source, autoTopupShowOnly);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoTopupSetupParams)) {
            return false;
        }
        AutoTopupSetupParams autoTopupSetupParams = (AutoTopupSetupParams) other;
        return jl40.l(this.autoTopupId, autoTopupSetupParams.autoTopupId) && jl40.l(this.agreementId, autoTopupSetupParams.agreementId) && this.autoTopupType == autoTopupSetupParams.autoTopupType && jl40.l(this.amount, autoTopupSetupParams.amount) && jl40.l(this.threshold, autoTopupSetupParams.threshold) && jl40.l(this.source, autoTopupSetupParams.source) && this.autoTopupShowOnly == autoTopupSetupParams.autoTopupShowOnly;
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final String getAutoTopupId() {
        return this.autoTopupId;
    }

    public final AutoTopupShowOnly getAutoTopupShowOnly() {
        return this.autoTopupShowOnly;
    }

    public final AutoTopupType getAutoTopupType() {
        return this.autoTopupType;
    }

    public final String getSource() {
        return this.source;
    }

    public final BigDecimal getThreshold() {
        return this.threshold;
    }

    public int hashCode() {
        String str = this.autoTopupId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.agreementId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        AutoTopupType autoTopupType = this.autoTopupType;
        int hashCode3 = (hashCode2 + (autoTopupType == null ? 0 : autoTopupType.hashCode())) * 31;
        BigDecimal bigDecimal = this.amount;
        int hashCode4 = (hashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.threshold;
        int hashCode5 = (hashCode4 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str3 = this.source;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AutoTopupShowOnly autoTopupShowOnly = this.autoTopupShowOnly;
        return hashCode6 + (autoTopupShowOnly != null ? autoTopupShowOnly.hashCode() : 0);
    }

    public String toString() {
        String str = this.autoTopupId;
        String str2 = this.agreementId;
        AutoTopupType autoTopupType = this.autoTopupType;
        BigDecimal bigDecimal = this.amount;
        BigDecimal bigDecimal2 = this.threshold;
        String str3 = this.source;
        AutoTopupShowOnly autoTopupShowOnly = this.autoTopupShowOnly;
        StringBuilder v = b64.v("AutoTopupSetupParams(autoTopupId=", str, ", agreementId=", str2, ", autoTopupType=");
        v.append(autoTopupType);
        v.append(", amount=");
        v.append(bigDecimal);
        v.append(", threshold=");
        v.append(bigDecimal2);
        v.append(", source=");
        v.append(str3);
        v.append(", autoTopupShowOnly=");
        v.append(autoTopupShowOnly);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.autoTopupId);
        dest.writeString(this.agreementId);
        AutoTopupType autoTopupType = this.autoTopupType;
        if (autoTopupType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(autoTopupType.name());
        }
        dest.writeSerializable(this.amount);
        dest.writeSerializable(this.threshold);
        dest.writeString(this.source);
        AutoTopupShowOnly autoTopupShowOnly = this.autoTopupShowOnly;
        if (autoTopupShowOnly == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(autoTopupShowOnly.name());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AutoTopupSetupParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoTopupSetupParams createFromParcel(Parcel parcel) {
            return new AutoTopupSetupParams(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : AutoTopupType.valueOf(parcel.readString()), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readInt() != 0 ? AutoTopupShowOnly.valueOf(parcel.readString()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoTopupSetupParams[] newArray(int i) {
            return new AutoTopupSetupParams[i];
        }
    }
}
