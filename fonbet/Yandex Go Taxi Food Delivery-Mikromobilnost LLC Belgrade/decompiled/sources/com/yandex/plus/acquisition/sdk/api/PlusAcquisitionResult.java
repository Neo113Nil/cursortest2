package com.yandex.plus.acquisition.sdk.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.acquisition.sdk.api.exceptions.PlusAcquisitionWebException;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionResult;", "Landroid/os/Parcelable;", "Success", "Error", "Cancel", "Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionResult$Cancel;", "Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionResult$Error;", "Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionResult$Success;", "acquisition-sdk-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface PlusAcquisitionResult extends Parcelable {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionResult$Cancel;", "Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionResult;", "WebViewOnDemand", "CloseButtonWasPressed", "UserHasLoggedInFromLoginState", "UserHasLoggedInFromInaccessibilityState", "HardwareBackButtonWasPressed", "Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionResult$Cancel$CloseButtonWasPressed;", "Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionResult$Cancel$HardwareBackButtonWasPressed;", "Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionResult$Cancel$UserHasLoggedInFromInaccessibilityState;", "Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionResult$Cancel$UserHasLoggedInFromLoginState;", "Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionResult$Cancel$WebViewOnDemand;", "acquisition-sdk-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Cancel extends PlusAcquisitionResult {

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionResult$Cancel$CloseButtonWasPressed;", "Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionResult$Cancel;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "acquisition-sdk-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CloseButtonWasPressed implements Cancel {
            public static final CloseButtonWasPressed INSTANCE = new CloseButtonWasPressed();
            public static final Parcelable.Creator<CloseButtonWasPressed> CREATOR = new Creator();

            private CloseButtonWasPressed() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof CloseButtonWasPressed);
            }

            public int hashCode() {
                return -1098628454;
            }

            public String toString() {
                return "CloseButtonWasPressed";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeInt(1);
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<CloseButtonWasPressed> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CloseButtonWasPressed createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return CloseButtonWasPressed.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CloseButtonWasPressed[] newArray(int i) {
                    return new CloseButtonWasPressed[i];
                }
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionResult$Cancel$HardwareBackButtonWasPressed;", "Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionResult$Cancel;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "acquisition-sdk-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class HardwareBackButtonWasPressed implements Cancel {
            public static final HardwareBackButtonWasPressed INSTANCE = new HardwareBackButtonWasPressed();
            public static final Parcelable.Creator<HardwareBackButtonWasPressed> CREATOR = new Creator();

            private HardwareBackButtonWasPressed() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof HardwareBackButtonWasPressed);
            }

            public int hashCode() {
                return 990965827;
            }

            public String toString() {
                return "HardwareBackButtonWasPressed";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeInt(1);
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<HardwareBackButtonWasPressed> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final HardwareBackButtonWasPressed createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return HardwareBackButtonWasPressed.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final HardwareBackButtonWasPressed[] newArray(int i) {
                    return new HardwareBackButtonWasPressed[i];
                }
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionResult$Cancel$UserHasLoggedInFromInaccessibilityState;", "Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionResult$Cancel;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "acquisition-sdk-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class UserHasLoggedInFromInaccessibilityState implements Cancel {
            public static final UserHasLoggedInFromInaccessibilityState INSTANCE = new UserHasLoggedInFromInaccessibilityState();
            public static final Parcelable.Creator<UserHasLoggedInFromInaccessibilityState> CREATOR = new Creator();

            private UserHasLoggedInFromInaccessibilityState() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof UserHasLoggedInFromInaccessibilityState);
            }

            public int hashCode() {
                return -648057889;
            }

            public String toString() {
                return "UserHasLoggedInFromInaccessibilityState";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeInt(1);
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<UserHasLoggedInFromInaccessibilityState> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UserHasLoggedInFromInaccessibilityState createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return UserHasLoggedInFromInaccessibilityState.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UserHasLoggedInFromInaccessibilityState[] newArray(int i) {
                    return new UserHasLoggedInFromInaccessibilityState[i];
                }
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionResult$Cancel$UserHasLoggedInFromLoginState;", "Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionResult$Cancel;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "acquisition-sdk-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class UserHasLoggedInFromLoginState implements Cancel {
            public static final UserHasLoggedInFromLoginState INSTANCE = new UserHasLoggedInFromLoginState();
            public static final Parcelable.Creator<UserHasLoggedInFromLoginState> CREATOR = new Creator();

            private UserHasLoggedInFromLoginState() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof UserHasLoggedInFromLoginState);
            }

            public int hashCode() {
                return -1933031041;
            }

            public String toString() {
                return "UserHasLoggedInFromLoginState";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeInt(1);
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<UserHasLoggedInFromLoginState> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UserHasLoggedInFromLoginState createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return UserHasLoggedInFromLoginState.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UserHasLoggedInFromLoginState[] newArray(int i) {
                    return new UserHasLoggedInFromLoginState[i];
                }
            }
        }

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\bJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionResult$Cancel$WebViewOnDemand;", "Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionResult$Cancel;", "Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionResult$Cancel$WebViewOnDemand$Reason;", CRLReasonCodeExtension.REASON, "<init>", "(Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionResult$Cancel$WebViewOnDemand$Reason;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionResult$Cancel$WebViewOnDemand$Reason;", "copy", "(Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionResult$Cancel$WebViewOnDemand$Reason;)Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionResult$Cancel$WebViewOnDemand;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionResult$Cancel$WebViewOnDemand$Reason;", "getReason", "Reason", "acquisition-sdk-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class WebViewOnDemand implements Cancel {
            public static final Parcelable.Creator<WebViewOnDemand> CREATOR = new Creator();
            private final Reason reason;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionResult$Cancel$WebViewOnDemand$Reason;", "", "DOES_NOT_MATTER", "FEATURE_SETUP_BUTTON_WAS_CLICKED", "acquisition-sdk-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Reason {
                private static final /* synthetic */ k4o $ENTRIES;
                private static final /* synthetic */ Reason[] $VALUES;
                public static final Reason DOES_NOT_MATTER;
                public static final Reason FEATURE_SETUP_BUTTON_WAS_CLICKED;

                static {
                    Reason reason = new Reason("DOES_NOT_MATTER", 0);
                    DOES_NOT_MATTER = reason;
                    Reason reason2 = new Reason("FEATURE_SETUP_BUTTON_WAS_CLICKED", 1);
                    FEATURE_SETUP_BUTTON_WAS_CLICKED = reason2;
                    Reason[] reasonArr = {reason, reason2};
                    $VALUES = reasonArr;
                    $ENTRIES = kotlin.enums.a.a(reasonArr);
                }

                public static Reason valueOf(String str) {
                    return (Reason) Enum.valueOf(Reason.class, str);
                }

                public static Reason[] values() {
                    return (Reason[]) $VALUES.clone();
                }
            }

            public WebViewOnDemand(Reason reason) {
                this.reason = reason;
            }

            public static /* synthetic */ WebViewOnDemand copy$default(WebViewOnDemand webViewOnDemand, Reason reason, int i, Object obj) {
                if ((i & 1) != 0) {
                    reason = webViewOnDemand.reason;
                }
                return webViewOnDemand.copy(reason);
            }

            /* renamed from: component1, reason: from getter */
            public final Reason getReason() {
                return this.reason;
            }

            public final WebViewOnDemand copy(Reason reason) {
                return new WebViewOnDemand(reason);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof WebViewOnDemand) && this.reason == ((WebViewOnDemand) other).reason;
            }

            public final Reason getReason() {
                return this.reason;
            }

            public int hashCode() {
                return this.reason.hashCode();
            }

            public String toString() {
                return "WebViewOnDemand(reason=" + this.reason + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeString(this.reason.name());
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<WebViewOnDemand> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final WebViewOnDemand createFromParcel(Parcel parcel) {
                    return new WebViewOnDemand(Reason.valueOf(parcel.readString()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final WebViewOnDemand[] newArray(int i) {
                    return new WebViewOnDemand[i];
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionResult$Error;", "Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionResult;", "cause", "", "getCause", "()Ljava/lang/Throwable;", "Web", "Other", "Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionResult$Error$Other;", "Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionResult$Error$Web;", "acquisition-sdk-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Error extends PlusAcquisitionResult {
        Throwable getCause();

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\bJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionResult$Error$Other;", "Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionResult$Error;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/Throwable;)Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionResult$Error$Other;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Throwable;", "getCause", "acquisition-sdk-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Other implements Error {
            public static final Parcelable.Creator<Other> CREATOR = new Creator();
            private final Throwable cause;

            public Other(Throwable th) {
                this.cause = th;
            }

            public static /* synthetic */ Other copy$default(Other other, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = other.cause;
                }
                return other.copy(th);
            }

            /* renamed from: component1, reason: from getter */
            public final Throwable getCause() {
                return this.cause;
            }

            public final Other copy(Throwable cause) {
                return new Other(cause);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Other) && jl40.l(this.cause, ((Other) other).cause);
            }

            @Override // com.yandex.plus.acquisition.sdk.api.PlusAcquisitionResult.Error
            public Throwable getCause() {
                return this.cause;
            }

            public int hashCode() {
                return this.cause.hashCode();
            }

            public String toString() {
                return unr0.s(new StringBuilder("Other(cause="), this.cause, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeSerializable(this.cause);
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Other> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Other createFromParcel(Parcel parcel) {
                    return new Other((Throwable) parcel.readSerializable());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Other[] newArray(int i) {
                    return new Other[i];
                }
            }
        }

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\bJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionResult$Error$Web;", "Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionResult$Error;", "Lcom/yandex/plus/acquisition/sdk/api/exceptions/PlusAcquisitionWebException;", "cause", "<init>", "(Lcom/yandex/plus/acquisition/sdk/api/exceptions/PlusAcquisitionWebException;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/plus/acquisition/sdk/api/exceptions/PlusAcquisitionWebException;", "copy", "(Lcom/yandex/plus/acquisition/sdk/api/exceptions/PlusAcquisitionWebException;)Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionResult$Error$Web;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/plus/acquisition/sdk/api/exceptions/PlusAcquisitionWebException;", "getCause", "acquisition-sdk-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Web implements Error {
            public static final Parcelable.Creator<Web> CREATOR = new Creator();
            private final PlusAcquisitionWebException cause;

            public Web(PlusAcquisitionWebException plusAcquisitionWebException) {
            }

            public static /* synthetic */ Web copy$default(Web web, PlusAcquisitionWebException plusAcquisitionWebException, int i, Object obj) {
                if ((i & 1) != 0) {
                    web.getClass();
                    plusAcquisitionWebException = null;
                }
                return web.copy(plusAcquisitionWebException);
            }

            public final PlusAcquisitionWebException component1() {
                return null;
            }

            public final Web copy(PlusAcquisitionWebException cause) {
                throw null;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Web);
            }

            @Override // com.yandex.plus.acquisition.sdk.api.PlusAcquisitionResult.Error
            public /* bridge */ /* synthetic */ Throwable getCause() {
                getCause();
                return null;
            }

            public int hashCode() {
                throw null;
            }

            public String toString() {
                return "Web(cause=null)";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeSerializable(null);
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Web> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Web createFromParcel(Parcel parcel) {
                    return new Web((PlusAcquisitionWebException) parcel.readSerializable());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Web[] newArray(int i) {
                    return new Web[i];
                }
            }

            @Override // com.yandex.plus.acquisition.sdk.api.PlusAcquisitionResult.Error
            public PlusAcquisitionWebException getCause() {
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\bJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionResult$Success;", "Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionResult;", "Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionResult$Success$Reason;", CRLReasonCodeExtension.REASON, "<init>", "(Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionResult$Success$Reason;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionResult$Success$Reason;", "copy", "(Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionResult$Success$Reason;)Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionResult$Success;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionResult$Success$Reason;", "getReason", "Reason", "acquisition-sdk-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Success implements PlusAcquisitionResult {
        public static final Parcelable.Creator<Success> CREATOR = new Creator();
        private final Reason reason;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionResult$Success$Reason;", "", "USER_HAS_SUBSCRIPTION", "USER_PURCHASED_SUBSCRIPTION", "acquisition-sdk-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Reason {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ Reason[] $VALUES;
            public static final Reason USER_HAS_SUBSCRIPTION;
            public static final Reason USER_PURCHASED_SUBSCRIPTION;

            static {
                Reason reason = new Reason("USER_HAS_SUBSCRIPTION", 0);
                USER_HAS_SUBSCRIPTION = reason;
                Reason reason2 = new Reason("USER_PURCHASED_SUBSCRIPTION", 1);
                USER_PURCHASED_SUBSCRIPTION = reason2;
                Reason[] reasonArr = {reason, reason2};
                $VALUES = reasonArr;
                $ENTRIES = kotlin.enums.a.a(reasonArr);
            }

            public static Reason valueOf(String str) {
                return (Reason) Enum.valueOf(Reason.class, str);
            }

            public static Reason[] values() {
                return (Reason[]) $VALUES.clone();
            }
        }

        public Success(Reason reason) {
            this.reason = reason;
        }

        public static /* synthetic */ Success copy$default(Success success, Reason reason, int i, Object obj) {
            if ((i & 1) != 0) {
                reason = success.reason;
            }
            return success.copy(reason);
        }

        /* renamed from: component1, reason: from getter */
        public final Reason getReason() {
            return this.reason;
        }

        public final Success copy(Reason reason) {
            return new Success(reason);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && this.reason == ((Success) other).reason;
        }

        public final Reason getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        public String toString() {
            return "Success(reason=" + this.reason + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.reason.name());
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Success> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Success createFromParcel(Parcel parcel) {
                return new Success(Reason.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Success[] newArray(int i) {
                return new Success[i];
            }
        }
    }
}
