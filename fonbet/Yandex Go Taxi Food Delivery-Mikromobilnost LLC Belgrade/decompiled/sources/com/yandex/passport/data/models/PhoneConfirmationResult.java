package com.yandex.passport.data.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/passport/data/models/PhoneConfirmationResult;", "Landroid/os/Parcelable;", "<init>", "()V", "", "isAlreadyConfirmed", "Z", "()Z", "BindPhoneConfirmationResult", "CodePhoneConfirmationResult", "ConfirmedPhoneConfirmationResult", "com/yandex/passport/data/models/k", "Lcom/yandex/passport/data/models/PhoneConfirmationResult$BindPhoneConfirmationResult;", "Lcom/yandex/passport/data/models/PhoneConfirmationResult$CodePhoneConfirmationResult;", "Lcom/yandex/passport/data/models/PhoneConfirmationResult$ConfirmedPhoneConfirmationResult;", "passport-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class PhoneConfirmationResult implements Parcelable {
    private final boolean isAlreadyConfirmed;

    public /* synthetic */ PhoneConfirmationResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: isAlreadyConfirmed, reason: from getter */
    public boolean getIsAlreadyConfirmed() {
        return this.isAlreadyConfirmed;
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013¨\u0006\u001d"}, d2 = {"Lcom/yandex/passport/data/models/PhoneConfirmationResult$BindPhoneConfirmationResult;", "Lcom/yandex/passport/data/models/PhoneConfirmationResult;", "Lcom/yandex/passport/data/models/k;", "", "trackId", "formattedPhone", "", "denyResendUntil", "", "codeLength", "<init>", "(Ljava/lang/String;Ljava/lang/String;JI)V", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Ljava/lang/String;", "getTrackId", "()Ljava/lang/String;", "getFormattedPhone", "J", "getDenyResendUntil", "()J", CA20Status.STATUS_USER_I, "getCodeLength", "passport-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BindPhoneConfirmationResult extends PhoneConfirmationResult implements k {
        public static final Parcelable.Creator<BindPhoneConfirmationResult> CREATOR = new Creator();
        private final int codeLength;
        private final long denyResendUntil;
        private final String formattedPhone;
        private final String trackId;

        public /* synthetic */ BindPhoneConfirmationResult(String str, String str2, long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, j, (i2 & 8) != 0 ? 6 : i);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.yandex.passport.data.models.k
        public int getCodeLength() {
            return this.codeLength;
        }

        @Override // com.yandex.passport.data.models.k
        public long getDenyResendUntil() {
            return this.denyResendUntil;
        }

        public final String getFormattedPhone() {
            return this.formattedPhone;
        }

        public final String getTrackId() {
            return this.trackId;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.trackId);
            dest.writeString(this.formattedPhone);
            dest.writeLong(this.denyResendUntil);
            dest.writeInt(this.codeLength);
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BindPhoneConfirmationResult> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BindPhoneConfirmationResult createFromParcel(Parcel parcel) {
                return new BindPhoneConfirmationResult(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BindPhoneConfirmationResult[] newArray(int i) {
                return new BindPhoneConfirmationResult[i];
            }
        }

        public BindPhoneConfirmationResult(String str, String str2, long j, int i) {
            super(null);
            this.trackId = str;
            this.formattedPhone = str2;
            this.denyResendUntil = j;
            this.codeLength = i;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u0012¨\u0006\u001b"}, d2 = {"Lcom/yandex/passport/data/models/PhoneConfirmationResult$CodePhoneConfirmationResult;", "Lcom/yandex/passport/data/models/PhoneConfirmationResult;", "Lcom/yandex/passport/data/models/k;", "", "denyResendUntil", "", "callingNumberTemplate", "", "codeLength", "<init>", "(JLjava/lang/String;I)V", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "J", "getDenyResendUntil", "()J", "Ljava/lang/String;", "getCallingNumberTemplate", "()Ljava/lang/String;", CA20Status.STATUS_USER_I, "getCodeLength", "passport-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CodePhoneConfirmationResult extends PhoneConfirmationResult implements k {
        public static final Parcelable.Creator<CodePhoneConfirmationResult> CREATOR = new Creator();
        private final String callingNumberTemplate;
        private final int codeLength;
        private final long denyResendUntil;

        public CodePhoneConfirmationResult(long j, String str, int i) {
            super(null);
            this.denyResendUntil = j;
            this.callingNumberTemplate = str;
            this.codeLength = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String getCallingNumberTemplate() {
            return this.callingNumberTemplate;
        }

        @Override // com.yandex.passport.data.models.k
        public int getCodeLength() {
            return this.codeLength;
        }

        @Override // com.yandex.passport.data.models.k
        public long getDenyResendUntil() {
            return this.denyResendUntil;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeLong(this.denyResendUntil);
            dest.writeString(this.callingNumberTemplate);
            dest.writeInt(this.codeLength);
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CodePhoneConfirmationResult> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CodePhoneConfirmationResult createFromParcel(Parcel parcel) {
                return new CodePhoneConfirmationResult(parcel.readLong(), parcel.readString(), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CodePhoneConfirmationResult[] newArray(int i) {
                return new CodePhoneConfirmationResult[i];
            }
        }

        public /* synthetic */ CodePhoneConfirmationResult(long j, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, str, (i2 & 4) != 0 ? 4 : i);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\u00020\r8\u0016X\u0096D¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/yandex/passport/data/models/PhoneConfirmationResult$ConfirmedPhoneConfirmationResult;", "Lcom/yandex/passport/data/models/PhoneConfirmationResult;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "isAlreadyConfirmed", "Z", "()Z", "isAlreadyConfirmed$annotations", "passport-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ConfirmedPhoneConfirmationResult extends PhoneConfirmationResult {
        public static final Parcelable.Creator<ConfirmedPhoneConfirmationResult> CREATOR = new Creator();
        private final boolean isAlreadyConfirmed;

        public ConfirmedPhoneConfirmationResult() {
            super(null);
            this.isAlreadyConfirmed = true;
        }

        public static /* synthetic */ void isAlreadyConfirmed$annotations() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.yandex.passport.data.models.PhoneConfirmationResult
        /* renamed from: isAlreadyConfirmed, reason: from getter */
        public boolean getIsAlreadyConfirmed() {
            return this.isAlreadyConfirmed;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ConfirmedPhoneConfirmationResult> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ConfirmedPhoneConfirmationResult createFromParcel(Parcel parcel) {
                parcel.readInt();
                return new ConfirmedPhoneConfirmationResult();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ConfirmedPhoneConfirmationResult[] newArray(int i) {
                return new ConfirmedPhoneConfirmationResult[i];
            }
        }
    }

    private PhoneConfirmationResult() {
    }
}
