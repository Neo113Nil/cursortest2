package com.ybsdk.screens.registration.codeconfirmation.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.pin.internal.screens.createpin.CreatePinScreenParams;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationFinishStrategy;", "Landroid/os/Parcelable;", "None", "Initial", "StandAlone", "CreatePin", "Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationFinishStrategy$CreatePin;", "Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationFinishStrategy$Initial;", "Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationFinishStrategy$None;", "Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationFinishStrategy$StandAlone;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface CodeConfirmationFinishStrategy extends Parcelable {

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationFinishStrategy$CreatePin;", "Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationFinishStrategy;", "Lcom/ybsdk/feature/pin/internal/screens/createpin/CreatePinScreenParams;", "screenParams", "<init>", "(Lcom/ybsdk/feature/pin/internal/screens/createpin/CreatePinScreenParams;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/feature/pin/internal/screens/createpin/CreatePinScreenParams;", "copy", "(Lcom/ybsdk/feature/pin/internal/screens/createpin/CreatePinScreenParams;)Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationFinishStrategy$CreatePin;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/pin/internal/screens/createpin/CreatePinScreenParams;", "getScreenParams", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CreatePin implements CodeConfirmationFinishStrategy {
        public static final Parcelable.Creator<CreatePin> CREATOR = new Creator();
        private final CreatePinScreenParams screenParams;

        public CreatePin(CreatePinScreenParams createPinScreenParams) {
            this.screenParams = createPinScreenParams;
        }

        public static /* synthetic */ CreatePin copy$default(CreatePin createPin, CreatePinScreenParams createPinScreenParams, int i, Object obj) {
            if ((i & 1) != 0) {
                createPinScreenParams = createPin.screenParams;
            }
            return createPin.copy(createPinScreenParams);
        }

        /* renamed from: component1, reason: from getter */
        public final CreatePinScreenParams getScreenParams() {
            return this.screenParams;
        }

        public final CreatePin copy(CreatePinScreenParams screenParams) {
            return new CreatePin(screenParams);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CreatePin) && jl40.l(this.screenParams, ((CreatePin) other).screenParams);
        }

        public final CreatePinScreenParams getScreenParams() {
            return this.screenParams;
        }

        public int hashCode() {
            return this.screenParams.hashCode();
        }

        public String toString() {
            return "CreatePin(screenParams=" + this.screenParams + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.screenParams, flags);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CreatePin> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CreatePin createFromParcel(Parcel parcel) {
                return new CreatePin((CreatePinScreenParams) parcel.readParcelable(CreatePin.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CreatePin[] newArray(int i) {
                return new CreatePin[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationFinishStrategy$Initial;", "Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationFinishStrategy;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Initial implements CodeConfirmationFinishStrategy {
        public static final Initial INSTANCE = new Initial();
        public static final Parcelable.Creator<Initial> CREATOR = new Creator();

        private Initial() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Initial> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Initial createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Initial.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Initial[] newArray(int i) {
                return new Initial[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationFinishStrategy$None;", "Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationFinishStrategy;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class None implements CodeConfirmationFinishStrategy {
        public static final None INSTANCE = new None();
        public static final Parcelable.Creator<None> CREATOR = new Creator();

        private None() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<None> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final None createFromParcel(Parcel parcel) {
                parcel.readInt();
                return None.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final None[] newArray(int i) {
                return new None[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationFinishStrategy$StandAlone;", "Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationFinishStrategy;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StandAlone implements CodeConfirmationFinishStrategy {
        public static final StandAlone INSTANCE = new StandAlone();
        public static final Parcelable.Creator<StandAlone> CREATOR = new Creator();

        private StandAlone() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<StandAlone> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StandAlone createFromParcel(Parcel parcel) {
                parcel.readInt();
                return StandAlone.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StandAlone[] newArray(int i) {
                return new StandAlone[i];
            }
        }
    }
}
