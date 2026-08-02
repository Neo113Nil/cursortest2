package com.ybsdk.screens.registration.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.utils.text.Text;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import defpackage.smw0;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0081\b\u0018\u00002\u00020\u0001:\u0003CDEB[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b#\u0010\u001bJ\u0012\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b(\u0010%J\u0010\u0010)\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b)\u0010*Jt\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b-\u0010%J\u0010\u0010.\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b.\u0010\u001bJ\u001a\u00101\u001a\u00020\r2\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b7\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b9\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\b;\u0010\u001bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\b=\u0010%R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\b?\u0010'R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010<\u001a\u0004\b@\u0010%R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010A\u001a\u0004\bB\u0010*¨\u0006F"}, d2 = {"Lcom/ybsdk/screens/registration/domain/OtpResponseDataEntity;", "Landroid/os/Parcelable;", "Lcom/ybsdk/screens/registration/domain/OtpResponseDataEntity$Status;", ACSPConstants.STATUS, "Lcom/ybsdk/core/utils/text/Text;", "hint", "deprecatedHint", "Lcom/ybsdk/screens/registration/domain/OtpResponseDataEntity$Action;", "action", "", "secondsToAction", "", "supportUrl", "", "noAttemptsLeft", "phone", "Lcom/ybsdk/screens/registration/domain/OtpResponseDataEntity$CodeFormat;", "codeFormat", "<init>", "(Lcom/ybsdk/screens/registration/domain/OtpResponseDataEntity$Status;Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/screens/registration/domain/OtpResponseDataEntity$Action;ILjava/lang/String;ZLjava/lang/String;Lcom/ybsdk/screens/registration/domain/OtpResponseDataEntity$CodeFormat;)V", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/screens/registration/domain/OtpResponseDataEntity$Status;", "component2", "()Lcom/ybsdk/core/utils/text/Text;", "component3", "component4", "()Lcom/ybsdk/screens/registration/domain/OtpResponseDataEntity$Action;", "component5", "component6", "()Ljava/lang/String;", "component7", "()Z", "component8", "component9", "()Lcom/ybsdk/screens/registration/domain/OtpResponseDataEntity$CodeFormat;", "copy", "(Lcom/ybsdk/screens/registration/domain/OtpResponseDataEntity$Status;Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/screens/registration/domain/OtpResponseDataEntity$Action;ILjava/lang/String;ZLjava/lang/String;Lcom/ybsdk/screens/registration/domain/OtpResponseDataEntity$CodeFormat;)Lcom/ybsdk/screens/registration/domain/OtpResponseDataEntity;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/screens/registration/domain/OtpResponseDataEntity$Status;", "getStatus", "Lcom/ybsdk/core/utils/text/Text;", "getHint", "getDeprecatedHint", "Lcom/ybsdk/screens/registration/domain/OtpResponseDataEntity$Action;", "getAction", CA20Status.STATUS_USER_I, "getSecondsToAction", "Ljava/lang/String;", "getSupportUrl", "Z", "getNoAttemptsLeft", "getPhone", "Lcom/ybsdk/screens/registration/domain/OtpResponseDataEntity$CodeFormat;", "getCodeFormat", "Status", "Action", "CodeFormat", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class OtpResponseDataEntity implements Parcelable {
    public static final Parcelable.Creator<OtpResponseDataEntity> CREATOR = new Creator();
    private final Action action;
    private final CodeFormat codeFormat;
    private final Text deprecatedHint;
    private final Text hint;
    private final boolean noAttemptsLeft;
    private final String phone;
    private final int secondsToAction;
    private final Status status;
    private final String supportUrl;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/screens/registration/domain/OtpResponseDataEntity$Action;", "", "<init>", "(Ljava/lang/String;I)V", "RETRY", "SUPPORT", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Action {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;
        public static final Action RETRY = new Action("RETRY", 0);
        public static final Action SUPPORT = new Action("SUPPORT", 1);

        private static final /* synthetic */ Action[] $values() {
            return new Action[]{RETRY, SUPPORT};
        }

        static {
            Action[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private Action(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ybsdk/screens/registration/domain/OtpResponseDataEntity$CodeFormat;", "", "digitsAmount", "", "<init>", "(Ljava/lang/String;II)V", "getDigitsAmount", "()I", "DIGIT_4", "DIGIT_6", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CodeFormat {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ CodeFormat[] $VALUES;
        public static final CodeFormat DIGIT_4 = new CodeFormat("DIGIT_4", 0, 4);
        public static final CodeFormat DIGIT_6 = new CodeFormat("DIGIT_6", 1, 6);
        private final int digitsAmount;

        private static final /* synthetic */ CodeFormat[] $values() {
            return new CodeFormat[]{DIGIT_4, DIGIT_6};
        }

        static {
            CodeFormat[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private CodeFormat(String str, int i, int i2) {
            this.digitsAmount = i2;
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static CodeFormat valueOf(String str) {
            return (CodeFormat) Enum.valueOf(CodeFormat.class, str);
        }

        public static CodeFormat[] values() {
            return (CodeFormat[]) $VALUES.clone();
        }

        public final int getDigitsAmount() {
            return this.digitsAmount;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/screens/registration/domain/OtpResponseDataEntity$Status;", "", "<init>", "(Ljava/lang/String;I)V", "OK", "FAILED", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Status {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status OK = new Status("OK", 0);
        public static final Status FAILED = new Status("FAILED", 1);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{OK, FAILED};
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

    public /* synthetic */ OtpResponseDataEntity(Status status, Text text, Text text2, Action action, int i, String str, boolean z, String str2, CodeFormat codeFormat, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(status, text, text2, action, i, str, (i2 & 64) != 0 ? false : z, str2, codeFormat);
    }

    public static /* synthetic */ OtpResponseDataEntity copy$default(OtpResponseDataEntity otpResponseDataEntity, Status status, Text text, Text text2, Action action, int i, String str, boolean z, String str2, CodeFormat codeFormat, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            status = otpResponseDataEntity.status;
        }
        if ((i2 & 2) != 0) {
            text = otpResponseDataEntity.hint;
        }
        if ((i2 & 4) != 0) {
            text2 = otpResponseDataEntity.deprecatedHint;
        }
        if ((i2 & 8) != 0) {
            action = otpResponseDataEntity.action;
        }
        if ((i2 & 16) != 0) {
            i = otpResponseDataEntity.secondsToAction;
        }
        if ((i2 & 32) != 0) {
            str = otpResponseDataEntity.supportUrl;
        }
        if ((i2 & 64) != 0) {
            z = otpResponseDataEntity.noAttemptsLeft;
        }
        if ((i2 & 128) != 0) {
            str2 = otpResponseDataEntity.phone;
        }
        if ((i2 & 256) != 0) {
            codeFormat = otpResponseDataEntity.codeFormat;
        }
        String str3 = str2;
        CodeFormat codeFormat2 = codeFormat;
        String str4 = str;
        boolean z2 = z;
        int i3 = i;
        Text text3 = text2;
        return otpResponseDataEntity.copy(status, text, text3, action, i3, str4, z2, str3, codeFormat2);
    }

    /* renamed from: component1, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final Text getHint() {
        return this.hint;
    }

    /* renamed from: component3, reason: from getter */
    public final Text getDeprecatedHint() {
        return this.deprecatedHint;
    }

    /* renamed from: component4, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    /* renamed from: component5, reason: from getter */
    public final int getSecondsToAction() {
        return this.secondsToAction;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSupportUrl() {
        return this.supportUrl;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getNoAttemptsLeft() {
        return this.noAttemptsLeft;
    }

    /* renamed from: component8, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* renamed from: component9, reason: from getter */
    public final CodeFormat getCodeFormat() {
        return this.codeFormat;
    }

    public final OtpResponseDataEntity copy(Status status, Text hint, Text deprecatedHint, Action action, int secondsToAction, String supportUrl, boolean noAttemptsLeft, String phone, CodeFormat codeFormat) {
        return new OtpResponseDataEntity(status, hint, deprecatedHint, action, secondsToAction, supportUrl, noAttemptsLeft, phone, codeFormat);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OtpResponseDataEntity)) {
            return false;
        }
        OtpResponseDataEntity otpResponseDataEntity = (OtpResponseDataEntity) other;
        return this.status == otpResponseDataEntity.status && jl40.l(this.hint, otpResponseDataEntity.hint) && jl40.l(this.deprecatedHint, otpResponseDataEntity.deprecatedHint) && this.action == otpResponseDataEntity.action && this.secondsToAction == otpResponseDataEntity.secondsToAction && jl40.l(this.supportUrl, otpResponseDataEntity.supportUrl) && this.noAttemptsLeft == otpResponseDataEntity.noAttemptsLeft && jl40.l(this.phone, otpResponseDataEntity.phone) && this.codeFormat == otpResponseDataEntity.codeFormat;
    }

    public final Action getAction() {
        return this.action;
    }

    public final CodeFormat getCodeFormat() {
        return this.codeFormat;
    }

    public final Text getDeprecatedHint() {
        return this.deprecatedHint;
    }

    public final Text getHint() {
        return this.hint;
    }

    public final boolean getNoAttemptsLeft() {
        return this.noAttemptsLeft;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final int getSecondsToAction() {
        return this.secondsToAction;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final String getSupportUrl() {
        return this.supportUrl;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        Text text = this.hint;
        int hashCode2 = (hashCode + (text == null ? 0 : text.hashCode())) * 31;
        Text text2 = this.deprecatedHint;
        int hashCode3 = (hashCode2 + (text2 == null ? 0 : text2.hashCode())) * 31;
        Action action = this.action;
        int b = oyr.b(this.secondsToAction, (hashCode3 + (action == null ? 0 : action.hashCode())) * 31, 31);
        String str = this.supportUrl;
        int e = unr0.e((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.noAttemptsLeft);
        String str2 = this.phone;
        return this.codeFormat.hashCode() + ((e + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        Status status = this.status;
        Text text = this.hint;
        Text text2 = this.deprecatedHint;
        Action action = this.action;
        int i = this.secondsToAction;
        String str = this.supportUrl;
        boolean z = this.noAttemptsLeft;
        String str2 = this.phone;
        CodeFormat codeFormat = this.codeFormat;
        StringBuilder sb = new StringBuilder("OtpResponseDataEntity(status=");
        sb.append(status);
        sb.append(", hint=");
        sb.append(text);
        sb.append(", deprecatedHint=");
        sb.append(text2);
        sb.append(", action=");
        sb.append(action);
        sb.append(", secondsToAction=");
        smw0.t(i, ", supportUrl=", str, ", noAttemptsLeft=", sb);
        unr0.A(", phone=", str2, ", codeFormat=", sb, z);
        sb.append(codeFormat);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.status.name());
        dest.writeParcelable(this.hint, flags);
        dest.writeParcelable(this.deprecatedHint, flags);
        Action action = this.action;
        if (action == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(action.name());
        }
        dest.writeInt(this.secondsToAction);
        dest.writeString(this.supportUrl);
        dest.writeInt(this.noAttemptsLeft ? 1 : 0);
        dest.writeString(this.phone);
        dest.writeString(this.codeFormat.name());
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OtpResponseDataEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OtpResponseDataEntity createFromParcel(Parcel parcel) {
            return new OtpResponseDataEntity(Status.valueOf(parcel.readString()), (Text) parcel.readParcelable(OtpResponseDataEntity.class.getClassLoader()), (Text) parcel.readParcelable(OtpResponseDataEntity.class.getClassLoader()), parcel.readInt() == 0 ? null : Action.valueOf(parcel.readString()), parcel.readInt(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), CodeFormat.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OtpResponseDataEntity[] newArray(int i) {
            return new OtpResponseDataEntity[i];
        }
    }

    public OtpResponseDataEntity(Status status, Text text, Text text2, Action action, int i, String str, boolean z, String str2, CodeFormat codeFormat) {
        this.status = status;
        this.hint = text;
        this.deprecatedHint = text2;
        this.action = action;
        this.secondsToAction = i;
        this.supportUrl = str;
        this.noAttemptsLeft = z;
        this.phone = str2;
        this.codeFormat = codeFormat;
    }
}
