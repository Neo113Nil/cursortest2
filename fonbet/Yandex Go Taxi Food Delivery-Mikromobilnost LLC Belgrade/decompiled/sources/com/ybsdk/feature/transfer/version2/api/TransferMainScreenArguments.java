package com.ybsdk.feature.transfer.version2.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.navigation.ScreenParams;
import com.ybsdk.core.transfer.utils.TransferScenario;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b)\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b*\u0010\"J\u0012\u0010+\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b+\u0010\"J\u0010\u0010,\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b.\u0010\"J\u0012\u0010/\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b/\u00100J\u008c\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b3\u0010\"J\u0010\u00104\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b4\u0010\u001eJ\u001a\u00107\u001a\u00020\n2\b\u00106\u001a\u0004\u0018\u000105HÖ\u0003¢\u0006\u0004\b7\u00108R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b<\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010=\u001a\u0004\b>\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010?\u001a\u0004\b@\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010A\u001a\u0004\bB\u0010(R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010A\u001a\u0004\bC\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\bD\u0010\"R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010;\u001a\u0004\bE\u0010\"R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010F\u001a\u0004\bG\u0010-R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010;\u001a\u0004\bH\u0010\"R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010I\u001a\u0004\bJ\u00100¨\u0006K"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/TransferMainScreenArguments;", "Lcom/ybsdk/core/navigation/ScreenParams;", "Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "direction", "", "agreementId", "Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites;", "prerequisites", "Lcom/ybsdk/core/transfer/utils/TransferScenario;", "scenario", "", "openKycEds", "shouldSelectMainAccountOnEnter", "title", "countryCode", "Lcom/ybsdk/feature/transfer/version2/api/CrossBorderScenario;", "crossBorderScenario", "preselectedPhone", "Lcom/ybsdk/feature/transfer/version2/api/TransferSkeletonType;", "skeletonType", "<init>", "(Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites;Lcom/ybsdk/core/transfer/utils/TransferScenario;ZZLjava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/CrossBorderScenario;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/TransferSkeletonType;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites;", "component4", "()Lcom/ybsdk/core/transfer/utils/TransferScenario;", "component5", "()Z", "component6", "component7", "component8", "component9", "()Lcom/ybsdk/feature/transfer/version2/api/CrossBorderScenario;", "component10", "component11", "()Lcom/ybsdk/feature/transfer/version2/api/TransferSkeletonType;", "copy", "(Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites;Lcom/ybsdk/core/transfer/utils/TransferScenario;ZZLjava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/CrossBorderScenario;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/TransferSkeletonType;)Lcom/ybsdk/feature/transfer/version2/api/TransferMainScreenArguments;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "getDirection", "Ljava/lang/String;", "getAgreementId", "Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites;", "getPrerequisites", "Lcom/ybsdk/core/transfer/utils/TransferScenario;", "getScenario", "Z", "getOpenKycEds", "getShouldSelectMainAccountOnEnter", "getTitle", "getCountryCode", "Lcom/ybsdk/feature/transfer/version2/api/CrossBorderScenario;", "getCrossBorderScenario", "getPreselectedPhone", "Lcom/ybsdk/feature/transfer/version2/api/TransferSkeletonType;", "getSkeletonType", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransferMainScreenArguments implements ScreenParams {
    public static final Parcelable.Creator<TransferMainScreenArguments> CREATOR = new Creator();
    private final String agreementId;
    private final String countryCode;
    private final CrossBorderScenario crossBorderScenario;
    private final TransferDirection direction;
    private final boolean openKycEds;
    private final TransferPrerequisites prerequisites;
    private final String preselectedPhone;
    private final TransferScenario scenario;
    private final boolean shouldSelectMainAccountOnEnter;
    private final TransferSkeletonType skeletonType;
    private final String title;

    public /* synthetic */ TransferMainScreenArguments(TransferDirection transferDirection, String str, TransferPrerequisites transferPrerequisites, TransferScenario transferScenario, boolean z, boolean z2, String str2, String str3, CrossBorderScenario crossBorderScenario, String str4, TransferSkeletonType transferSkeletonType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(transferDirection, str, transferPrerequisites, transferScenario, z, z2, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? CrossBorderScenario.PARTNER : crossBorderScenario, (i & 512) != 0 ? null : str4, (i & 1024) != 0 ? null : transferSkeletonType);
    }

    public static /* synthetic */ TransferMainScreenArguments copy$default(TransferMainScreenArguments transferMainScreenArguments, TransferDirection transferDirection, String str, TransferPrerequisites transferPrerequisites, TransferScenario transferScenario, boolean z, boolean z2, String str2, String str3, CrossBorderScenario crossBorderScenario, String str4, TransferSkeletonType transferSkeletonType, int i, Object obj) {
        if ((i & 1) != 0) {
            transferDirection = transferMainScreenArguments.direction;
        }
        if ((i & 2) != 0) {
            str = transferMainScreenArguments.agreementId;
        }
        if ((i & 4) != 0) {
            transferPrerequisites = transferMainScreenArguments.prerequisites;
        }
        if ((i & 8) != 0) {
            transferScenario = transferMainScreenArguments.scenario;
        }
        if ((i & 16) != 0) {
            z = transferMainScreenArguments.openKycEds;
        }
        if ((i & 32) != 0) {
            z2 = transferMainScreenArguments.shouldSelectMainAccountOnEnter;
        }
        if ((i & 64) != 0) {
            str2 = transferMainScreenArguments.title;
        }
        if ((i & 128) != 0) {
            str3 = transferMainScreenArguments.countryCode;
        }
        if ((i & 256) != 0) {
            crossBorderScenario = transferMainScreenArguments.crossBorderScenario;
        }
        if ((i & 512) != 0) {
            str4 = transferMainScreenArguments.preselectedPhone;
        }
        if ((i & 1024) != 0) {
            transferSkeletonType = transferMainScreenArguments.skeletonType;
        }
        String str5 = str4;
        TransferSkeletonType transferSkeletonType2 = transferSkeletonType;
        String str6 = str3;
        CrossBorderScenario crossBorderScenario2 = crossBorderScenario;
        boolean z3 = z2;
        String str7 = str2;
        boolean z4 = z;
        TransferPrerequisites transferPrerequisites2 = transferPrerequisites;
        return transferMainScreenArguments.copy(transferDirection, str, transferPrerequisites2, transferScenario, z4, z3, str7, str6, crossBorderScenario2, str5, transferSkeletonType2);
    }

    /* renamed from: component1, reason: from getter */
    public final TransferDirection getDirection() {
        return this.direction;
    }

    /* renamed from: component10, reason: from getter */
    public final String getPreselectedPhone() {
        return this.preselectedPhone;
    }

    /* renamed from: component11, reason: from getter */
    public final TransferSkeletonType getSkeletonType() {
        return this.skeletonType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component3, reason: from getter */
    public final TransferPrerequisites getPrerequisites() {
        return this.prerequisites;
    }

    /* renamed from: component4, reason: from getter */
    public final TransferScenario getScenario() {
        return this.scenario;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getOpenKycEds() {
        return this.openKycEds;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShouldSelectMainAccountOnEnter() {
        return this.shouldSelectMainAccountOnEnter;
    }

    /* renamed from: component7, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component8, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: component9, reason: from getter */
    public final CrossBorderScenario getCrossBorderScenario() {
        return this.crossBorderScenario;
    }

    public final TransferMainScreenArguments copy(TransferDirection direction, String agreementId, TransferPrerequisites prerequisites, TransferScenario scenario, boolean openKycEds, boolean shouldSelectMainAccountOnEnter, String title, String countryCode, CrossBorderScenario crossBorderScenario, String preselectedPhone, TransferSkeletonType skeletonType) {
        return new TransferMainScreenArguments(direction, agreementId, prerequisites, scenario, openKycEds, shouldSelectMainAccountOnEnter, title, countryCode, crossBorderScenario, preselectedPhone, skeletonType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferMainScreenArguments)) {
            return false;
        }
        TransferMainScreenArguments transferMainScreenArguments = (TransferMainScreenArguments) other;
        return this.direction == transferMainScreenArguments.direction && jl40.l(this.agreementId, transferMainScreenArguments.agreementId) && jl40.l(this.prerequisites, transferMainScreenArguments.prerequisites) && this.scenario == transferMainScreenArguments.scenario && this.openKycEds == transferMainScreenArguments.openKycEds && this.shouldSelectMainAccountOnEnter == transferMainScreenArguments.shouldSelectMainAccountOnEnter && jl40.l(this.title, transferMainScreenArguments.title) && jl40.l(this.countryCode, transferMainScreenArguments.countryCode) && this.crossBorderScenario == transferMainScreenArguments.crossBorderScenario && jl40.l(this.preselectedPhone, transferMainScreenArguments.preselectedPhone) && this.skeletonType == transferMainScreenArguments.skeletonType;
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final CrossBorderScenario getCrossBorderScenario() {
        return this.crossBorderScenario;
    }

    public final TransferDirection getDirection() {
        return this.direction;
    }

    public final boolean getOpenKycEds() {
        return this.openKycEds;
    }

    public final TransferPrerequisites getPrerequisites() {
        return this.prerequisites;
    }

    public final String getPreselectedPhone() {
        return this.preselectedPhone;
    }

    public final TransferScenario getScenario() {
        return this.scenario;
    }

    public final boolean getShouldSelectMainAccountOnEnter() {
        return this.shouldSelectMainAccountOnEnter;
    }

    public final TransferSkeletonType getSkeletonType() {
        return this.skeletonType;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.direction.hashCode() * 31;
        String str = this.agreementId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        TransferPrerequisites transferPrerequisites = this.prerequisites;
        int hashCode3 = (hashCode2 + (transferPrerequisites == null ? 0 : transferPrerequisites.hashCode())) * 31;
        TransferScenario transferScenario = this.scenario;
        int e = unr0.e(unr0.e((hashCode3 + (transferScenario == null ? 0 : transferScenario.hashCode())) * 31, 31, this.openKycEds), 31, this.shouldSelectMainAccountOnEnter);
        String str2 = this.title;
        int hashCode4 = (e + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.countryCode;
        int hashCode5 = (this.crossBorderScenario.hashCode() + ((hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.preselectedPhone;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        TransferSkeletonType transferSkeletonType = this.skeletonType;
        return hashCode6 + (transferSkeletonType != null ? transferSkeletonType.hashCode() : 0);
    }

    public String toString() {
        TransferDirection transferDirection = this.direction;
        String str = this.agreementId;
        TransferPrerequisites transferPrerequisites = this.prerequisites;
        TransferScenario transferScenario = this.scenario;
        boolean z = this.openKycEds;
        boolean z2 = this.shouldSelectMainAccountOnEnter;
        String str2 = this.title;
        String str3 = this.countryCode;
        CrossBorderScenario crossBorderScenario = this.crossBorderScenario;
        String str4 = this.preselectedPhone;
        TransferSkeletonType transferSkeletonType = this.skeletonType;
        StringBuilder sb = new StringBuilder("TransferMainScreenArguments(direction=");
        sb.append(transferDirection);
        sb.append(", agreementId=");
        sb.append(str);
        sb.append(", prerequisites=");
        sb.append(transferPrerequisites);
        sb.append(", scenario=");
        sb.append(transferScenario);
        sb.append(", openKycEds=");
        nnm.v(", shouldSelectMainAccountOnEnter=", ", title=", sb, z, z2);
        g8e.D(sb, str2, ", countryCode=", str3, ", crossBorderScenario=");
        sb.append(crossBorderScenario);
        sb.append(", preselectedPhone=");
        sb.append(str4);
        sb.append(", skeletonType=");
        sb.append(transferSkeletonType);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.direction.name());
        dest.writeString(this.agreementId);
        dest.writeParcelable(this.prerequisites, flags);
        TransferScenario transferScenario = this.scenario;
        if (transferScenario == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(transferScenario.name());
        }
        dest.writeInt(this.openKycEds ? 1 : 0);
        dest.writeInt(this.shouldSelectMainAccountOnEnter ? 1 : 0);
        dest.writeString(this.title);
        dest.writeString(this.countryCode);
        dest.writeString(this.crossBorderScenario.name());
        dest.writeString(this.preselectedPhone);
        TransferSkeletonType transferSkeletonType = this.skeletonType;
        if (transferSkeletonType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(transferSkeletonType.name());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TransferMainScreenArguments> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferMainScreenArguments createFromParcel(Parcel parcel) {
            return new TransferMainScreenArguments(TransferDirection.valueOf(parcel.readString()), parcel.readString(), (TransferPrerequisites) parcel.readParcelable(TransferMainScreenArguments.class.getClassLoader()), parcel.readInt() == 0 ? null : TransferScenario.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), CrossBorderScenario.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0 ? TransferSkeletonType.valueOf(parcel.readString()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferMainScreenArguments[] newArray(int i) {
            return new TransferMainScreenArguments[i];
        }
    }

    public TransferMainScreenArguments(TransferDirection transferDirection, String str, TransferPrerequisites transferPrerequisites, TransferScenario transferScenario, boolean z, boolean z2, String str2, String str3, CrossBorderScenario crossBorderScenario, String str4, TransferSkeletonType transferSkeletonType) {
        this.direction = transferDirection;
        this.agreementId = str;
        this.prerequisites = transferPrerequisites;
        this.scenario = transferScenario;
        this.openKycEds = z;
        this.shouldSelectMainAccountOnEnter = z2;
        this.title = str2;
        this.countryCode = str3;
        this.crossBorderScenario = crossBorderScenario;
        this.preselectedPhone = str4;
        this.skeletonType = transferSkeletonType;
    }
}
