package com.yandex.payment.sdk.core.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.ly3;
import defpackage.qv10;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001:\u00016BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001aJZ\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b$\u0010\u0010J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b.\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b1\u0010\u001aR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b2\u0010\u001aR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b3\u0010\u001aR\u0011\u00104\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lcom/yandex/payment/sdk/core/data/SbpChallengeInfo;", "Landroid/os/Parcelable;", "Lcom/yandex/payment/sdk/core/data/SbpChallengeInfo$SbpChallengeMethod;", "method", "", ACSPConstants.STATUS, "verificationId", "", "denyResendUntil", "currency", "format", "maskedPhone", "<init>", "(Lcom/yandex/payment/sdk/core/data/SbpChallengeInfo$SbpChallengeMethod;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/payment/sdk/core/data/SbpChallengeInfo$SbpChallengeMethod;", "component2", "()Ljava/lang/String;", "component3", "component4", "()J", "component5", "component6", "component7", "copy", "(Lcom/yandex/payment/sdk/core/data/SbpChallengeInfo$SbpChallengeMethod;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/payment/sdk/core/data/SbpChallengeInfo;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/payment/sdk/core/data/SbpChallengeInfo$SbpChallengeMethod;", "getMethod", "Ljava/lang/String;", "getStatus", "getVerificationId", "J", "getDenyResendUntil", "getCurrency", "getFormat", "getMaskedPhone", "isSmsChallenge", "()Z", "SbpChallengeMethod", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SbpChallengeInfo implements Parcelable {
    public static final Parcelable.Creator<SbpChallengeInfo> CREATOR = new Creator();
    private final String currency;
    private final long denyResendUntil;
    private final String format;
    private final String maskedPhone;
    private final SbpChallengeMethod method;
    private final String status;
    private final String verificationId;

    public SbpChallengeInfo(SbpChallengeMethod sbpChallengeMethod, String str, String str2, long j, String str3, String str4, String str5) {
        this.method = sbpChallengeMethod;
        this.status = str;
        this.verificationId = str2;
        this.denyResendUntil = j;
        this.currency = str3;
        this.format = str4;
        this.maskedPhone = str5;
    }

    public static /* synthetic */ SbpChallengeInfo copy$default(SbpChallengeInfo sbpChallengeInfo, SbpChallengeMethod sbpChallengeMethod, String str, String str2, long j, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            sbpChallengeMethod = sbpChallengeInfo.method;
        }
        if ((i & 2) != 0) {
            str = sbpChallengeInfo.status;
        }
        if ((i & 4) != 0) {
            str2 = sbpChallengeInfo.verificationId;
        }
        if ((i & 8) != 0) {
            j = sbpChallengeInfo.denyResendUntil;
        }
        if ((i & 16) != 0) {
            str3 = sbpChallengeInfo.currency;
        }
        if ((i & 32) != 0) {
            str4 = sbpChallengeInfo.format;
        }
        if ((i & 64) != 0) {
            str5 = sbpChallengeInfo.maskedPhone;
        }
        String str6 = str5;
        String str7 = str3;
        long j2 = j;
        String str8 = str2;
        return sbpChallengeInfo.copy(sbpChallengeMethod, str, str8, j2, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final SbpChallengeMethod getMethod() {
        return this.method;
    }

    /* renamed from: component2, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component3, reason: from getter */
    public final String getVerificationId() {
        return this.verificationId;
    }

    /* renamed from: component4, reason: from getter */
    public final long getDenyResendUntil() {
        return this.denyResendUntil;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* renamed from: component6, reason: from getter */
    public final String getFormat() {
        return this.format;
    }

    /* renamed from: component7, reason: from getter */
    public final String getMaskedPhone() {
        return this.maskedPhone;
    }

    public final SbpChallengeInfo copy(SbpChallengeMethod method, String status, String verificationId, long denyResendUntil, String currency, String format, String maskedPhone) {
        return new SbpChallengeInfo(method, status, verificationId, denyResendUntil, currency, format, maskedPhone);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SbpChallengeInfo)) {
            return false;
        }
        SbpChallengeInfo sbpChallengeInfo = (SbpChallengeInfo) other;
        return this.method == sbpChallengeInfo.method && jl40.l(this.status, sbpChallengeInfo.status) && jl40.l(this.verificationId, sbpChallengeInfo.verificationId) && this.denyResendUntil == sbpChallengeInfo.denyResendUntil && jl40.l(this.currency, sbpChallengeInfo.currency) && jl40.l(this.format, sbpChallengeInfo.format) && jl40.l(this.maskedPhone, sbpChallengeInfo.maskedPhone);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final long getDenyResendUntil() {
        return this.denyResendUntil;
    }

    public final String getFormat() {
        return this.format;
    }

    public final String getMaskedPhone() {
        return this.maskedPhone;
    }

    public final SbpChallengeMethod getMethod() {
        return this.method;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getVerificationId() {
        return this.verificationId;
    }

    public int hashCode() {
        int b = unr0.b(qv10.c(unr0.b(unr0.b(this.method.hashCode() * 31, 31, this.status), 31, this.verificationId), 31, this.denyResendUntil), 31, this.currency);
        String str = this.format;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.maskedPhone;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isSmsChallenge() {
        return this.method == SbpChallengeMethod.SmsChallenge;
    }

    public String toString() {
        SbpChallengeMethod sbpChallengeMethod = this.method;
        String str = this.status;
        String str2 = this.verificationId;
        long j = this.denyResendUntil;
        String str3 = this.currency;
        String str4 = this.format;
        String str5 = this.maskedPhone;
        StringBuilder sb = new StringBuilder("SbpChallengeInfo(method=");
        sb.append(sbpChallengeMethod);
        sb.append(", status=");
        sb.append(str);
        sb.append(", verificationId=");
        ly3.y(j, str2, ", denyResendUntil=", sb);
        g8e.D(sb, ", currency=", str3, ", format=", str4);
        return unr0.r(sb, ", maskedPhone=", str5, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        this.method.writeToParcel(dest, flags);
        dest.writeString(this.status);
        dest.writeString(this.verificationId);
        dest.writeLong(this.denyResendUntil);
        dest.writeString(this.currency);
        dest.writeString(this.format);
        dest.writeString(this.maskedPhone);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\bj\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/payment/sdk/core/data/SbpChallengeInfo$SbpChallengeMethod;", "Landroid/os/Parcelable;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getValue", "RandomAmount", "SmsChallenge", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SbpChallengeMethod implements Parcelable {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ SbpChallengeMethod[] $VALUES;
        public static final Parcelable.Creator<SbpChallengeMethod> CREATOR;
        public static final SbpChallengeMethod RandomAmount = new SbpChallengeMethod("RandomAmount", 0, "random_amt");
        public static final SbpChallengeMethod SmsChallenge = new SbpChallengeMethod("SmsChallenge", 1, "sms_challenge");
        private final String value;

        private static final /* synthetic */ SbpChallengeMethod[] $values() {
            return new SbpChallengeMethod[]{RandomAmount, SmsChallenge};
        }

        static {
            SbpChallengeMethod[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
            CREATOR = new Creator();
        }

        private SbpChallengeMethod(String str, int i, String str2) {
            this.value = str2;
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static SbpChallengeMethod valueOf(String str) {
            return (SbpChallengeMethod) Enum.valueOf(SbpChallengeMethod.class, str);
        }

        public static SbpChallengeMethod[] values() {
            return (SbpChallengeMethod[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(name());
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SbpChallengeMethod> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SbpChallengeMethod createFromParcel(Parcel parcel) {
                return SbpChallengeMethod.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SbpChallengeMethod[] newArray(int i) {
                return new SbpChallengeMethod[i];
            }
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SbpChallengeInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SbpChallengeInfo createFromParcel(Parcel parcel) {
            return new SbpChallengeInfo(SbpChallengeMethod.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SbpChallengeInfo[] newArray(int i) {
            return new SbpChallengeInfo[i];
        }
    }
}
