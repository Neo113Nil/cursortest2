package com.ybsdk.screens.changephone.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.navigation.ScreenParams;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oo31;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001:\u0001*B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0015J\u0010\u0010\u001e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0013J\u001a\u0010!\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b'\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010\u001a¨\u0006+"}, d2 = {"Lcom/ybsdk/screens/changephone/presentation/ChangePhoneStatusScreenParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", "", "applicationId", "", "forceNavigateToInitialViewModelOnResult", "showLogoutButton", "Lcom/ybsdk/screens/changephone/presentation/ChangePhoneStatusScreenParams$Status;", "showStatus", "<init>", "(Ljava/lang/String;ZZLcom/ybsdk/screens/changephone/presentation/ChangePhoneStatusScreenParams$Status;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "()Lcom/ybsdk/screens/changephone/presentation/ChangePhoneStatusScreenParams$Status;", "copy", "(Ljava/lang/String;ZZLcom/ybsdk/screens/changephone/presentation/ChangePhoneStatusScreenParams$Status;)Lcom/ybsdk/screens/changephone/presentation/ChangePhoneStatusScreenParams;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getApplicationId", "Z", "getForceNavigateToInitialViewModelOnResult", "getShowLogoutButton", "Lcom/ybsdk/screens/changephone/presentation/ChangePhoneStatusScreenParams$Status;", "getShowStatus", "Status", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ChangePhoneStatusScreenParams implements ScreenParams {
    public static final Parcelable.Creator<ChangePhoneStatusScreenParams> CREATOR = new Creator();
    private final String applicationId;
    private final boolean forceNavigateToInitialViewModelOnResult;
    private final boolean showLogoutButton;
    private final Status showStatus;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/screens/changephone/presentation/ChangePhoneStatusScreenParams$Status;", "", "<init>", "(Ljava/lang/String;I)V", "INITIAL", "SUCCESS", "FAIL", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Status {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status INITIAL = new Status("INITIAL", 0);
        public static final Status SUCCESS = new Status("SUCCESS", 1);
        public static final Status FAIL = new Status("FAIL", 2);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{INITIAL, SUCCESS, FAIL};
        }

        static {
            Status[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private Status(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public ChangePhoneStatusScreenParams(String str, boolean z, boolean z2, Status status) {
        this.applicationId = str;
        this.forceNavigateToInitialViewModelOnResult = z;
        this.showLogoutButton = z2;
        this.showStatus = status;
    }

    public static /* synthetic */ ChangePhoneStatusScreenParams copy$default(ChangePhoneStatusScreenParams changePhoneStatusScreenParams, String str, boolean z, boolean z2, Status status, int i, Object obj) {
        if ((i & 1) != 0) {
            str = changePhoneStatusScreenParams.applicationId;
        }
        if ((i & 2) != 0) {
            z = changePhoneStatusScreenParams.forceNavigateToInitialViewModelOnResult;
        }
        if ((i & 4) != 0) {
            z2 = changePhoneStatusScreenParams.showLogoutButton;
        }
        if ((i & 8) != 0) {
            status = changePhoneStatusScreenParams.showStatus;
        }
        return changePhoneStatusScreenParams.copy(str, z, z2, status);
    }

    /* renamed from: component1, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getForceNavigateToInitialViewModelOnResult() {
        return this.forceNavigateToInitialViewModelOnResult;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowLogoutButton() {
        return this.showLogoutButton;
    }

    /* renamed from: component4, reason: from getter */
    public final Status getShowStatus() {
        return this.showStatus;
    }

    public final ChangePhoneStatusScreenParams copy(String applicationId, boolean forceNavigateToInitialViewModelOnResult, boolean showLogoutButton, Status showStatus) {
        return new ChangePhoneStatusScreenParams(applicationId, forceNavigateToInitialViewModelOnResult, showLogoutButton, showStatus);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangePhoneStatusScreenParams)) {
            return false;
        }
        ChangePhoneStatusScreenParams changePhoneStatusScreenParams = (ChangePhoneStatusScreenParams) other;
        return jl40.l(this.applicationId, changePhoneStatusScreenParams.applicationId) && this.forceNavigateToInitialViewModelOnResult == changePhoneStatusScreenParams.forceNavigateToInitialViewModelOnResult && this.showLogoutButton == changePhoneStatusScreenParams.showLogoutButton && this.showStatus == changePhoneStatusScreenParams.showStatus;
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    public final boolean getForceNavigateToInitialViewModelOnResult() {
        return this.forceNavigateToInitialViewModelOnResult;
    }

    public final boolean getShowLogoutButton() {
        return this.showLogoutButton;
    }

    public final Status getShowStatus() {
        return this.showStatus;
    }

    public int hashCode() {
        return this.showStatus.hashCode() + unr0.e(unr0.e(this.applicationId.hashCode() * 31, 31, this.forceNavigateToInitialViewModelOnResult), 31, this.showLogoutButton);
    }

    public String toString() {
        String str = this.applicationId;
        boolean z = this.forceNavigateToInitialViewModelOnResult;
        boolean z2 = this.showLogoutButton;
        Status status = this.showStatus;
        StringBuilder l = oo31.l("ChangePhoneStatusScreenParams(applicationId=", str, ", forceNavigateToInitialViewModelOnResult=", ", showLogoutButton=", z);
        l.append(z2);
        l.append(", showStatus=");
        l.append(status);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.applicationId);
        dest.writeInt(this.forceNavigateToInitialViewModelOnResult ? 1 : 0);
        dest.writeInt(this.showLogoutButton ? 1 : 0);
        dest.writeString(this.showStatus.name());
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ChangePhoneStatusScreenParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChangePhoneStatusScreenParams createFromParcel(Parcel parcel) {
            return new ChangePhoneStatusScreenParams(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, Status.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChangePhoneStatusScreenParams[] newArray(int i) {
            return new ChangePhoneStatusScreenParams[i];
        }
    }

    public /* synthetic */ ChangePhoneStatusScreenParams(String str, boolean z, boolean z2, Status status, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? true : z, z2, status);
    }
}
