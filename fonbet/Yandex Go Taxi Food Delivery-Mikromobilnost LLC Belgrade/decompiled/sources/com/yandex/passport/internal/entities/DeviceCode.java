package com.yandex.passport.internal.entities;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.wwg;
import kotlin.Metadata;
import kotlin.Pair;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001-B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016JD\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b \u0010\u0016J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b'\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b(\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0016R\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b+\u0010\u0016¨\u0006."}, d2 = {"Lcom/yandex/passport/internal/entities/DeviceCode;", "Landroid/os/Parcelable;", "", "", "deviceCode", "userCode", "verificationUrl", "", "interval", "expiresIn", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)Lcom/yandex/passport/internal/entities/DeviceCode;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDeviceCode", "getUserCode", "getVerificationUrl", CA20Status.STATUS_USER_I, "getInterval", "getExpiresIn", "Companion", "com/yandex/passport/internal/entities/e", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DeviceCode implements Parcelable {
    public static final int $stable = 0;
    private static final String KEY_DEVICE_CODE = "device-code";
    private final String deviceCode;
    private final int expiresIn;
    private final int interval;
    private final String userCode;
    private final String verificationUrl;
    public static final e Companion = new e();
    public static final Parcelable.Creator<DeviceCode> CREATOR = new Creator();

    public DeviceCode(String str, String str2, String str3, int i, int i2) {
        this.deviceCode = str;
        this.userCode = str2;
        this.verificationUrl = str3;
        this.interval = i;
        this.expiresIn = i2;
    }

    public static /* synthetic */ DeviceCode copy$default(DeviceCode deviceCode, String str, String str2, String str3, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = deviceCode.deviceCode;
        }
        if ((i3 & 2) != 0) {
            str2 = deviceCode.userCode;
        }
        if ((i3 & 4) != 0) {
            str3 = deviceCode.verificationUrl;
        }
        if ((i3 & 8) != 0) {
            i = deviceCode.interval;
        }
        if ((i3 & 16) != 0) {
            i2 = deviceCode.expiresIn;
        }
        int i4 = i2;
        String str4 = str3;
        return deviceCode.copy(str, str2, str4, i, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDeviceCode() {
        return this.deviceCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUserCode() {
        return this.userCode;
    }

    /* renamed from: component3, reason: from getter */
    public final String getVerificationUrl() {
        return this.verificationUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final int getInterval() {
        return this.interval;
    }

    /* renamed from: component5, reason: from getter */
    public final int getExpiresIn() {
        return this.expiresIn;
    }

    public final DeviceCode copy(String deviceCode, String userCode, String verificationUrl, int interval, int expiresIn) {
        return new DeviceCode(deviceCode, userCode, verificationUrl, interval, expiresIn);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceCode)) {
            return false;
        }
        DeviceCode deviceCode = (DeviceCode) other;
        return jl40.l(this.deviceCode, deviceCode.deviceCode) && jl40.l(this.userCode, deviceCode.userCode) && jl40.l(this.verificationUrl, deviceCode.verificationUrl) && this.interval == deviceCode.interval && this.expiresIn == deviceCode.expiresIn;
    }

    public String getDeviceCode() {
        return this.deviceCode;
    }

    public int getExpiresIn() {
        return this.expiresIn;
    }

    public int getInterval() {
        return this.interval;
    }

    public String getUserCode() {
        return this.userCode;
    }

    public String getVerificationUrl() {
        return this.verificationUrl;
    }

    public int hashCode() {
        int b = unr0.b(this.deviceCode.hashCode() * 31, 31, this.userCode);
        String str = this.verificationUrl;
        return Integer.hashCode(this.expiresIn) + oyr.b(this.interval, (b + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final Bundle toBundle() {
        return wwg.g(new Pair(KEY_DEVICE_CODE, this));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DeviceCode(deviceCode=");
        sb.append(this.deviceCode);
        sb.append(", userCode=");
        sb.append(this.userCode);
        sb.append(", verificationUrl=");
        sb.append(this.verificationUrl);
        sb.append(", interval=");
        sb.append(this.interval);
        sb.append(", expiresIn=");
        return oyr.s(sb, this.expiresIn, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.deviceCode);
        dest.writeString(this.userCode);
        dest.writeString(this.verificationUrl);
        dest.writeInt(this.interval);
        dest.writeInt(this.expiresIn);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeviceCode> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeviceCode createFromParcel(Parcel parcel) {
            return new DeviceCode(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeviceCode[] newArray(int i) {
            return new DeviceCode[i];
        }
    }
}
