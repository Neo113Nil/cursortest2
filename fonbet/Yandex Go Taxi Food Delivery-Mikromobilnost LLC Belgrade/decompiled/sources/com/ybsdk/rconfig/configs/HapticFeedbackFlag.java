package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.ly3;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0003\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0004\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/rconfig/configs/HapticFeedbackFlag;", "", "", "isSettingEnabled", "isNativeHapticEnabled", "<init>", "(ZZ)V", "component1", "()Z", "component2", "copy", "(ZZ)Lcom/ybsdk/rconfig/configs/HapticFeedbackFlag;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class HapticFeedbackFlag {

    @Json(name = "is_native_haptic")
    private final boolean isNativeHapticEnabled;

    @Json(name = "is_setting_enabled")
    private final boolean isSettingEnabled;

    public HapticFeedbackFlag(boolean z, boolean z2) {
        this.isSettingEnabled = z;
        this.isNativeHapticEnabled = z2;
    }

    public static /* synthetic */ HapticFeedbackFlag copy$default(HapticFeedbackFlag hapticFeedbackFlag, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = hapticFeedbackFlag.isSettingEnabled;
        }
        if ((i & 2) != 0) {
            z2 = hapticFeedbackFlag.isNativeHapticEnabled;
        }
        return hapticFeedbackFlag.copy(z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsSettingEnabled() {
        return this.isSettingEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsNativeHapticEnabled() {
        return this.isNativeHapticEnabled;
    }

    public final HapticFeedbackFlag copy(boolean isSettingEnabled, boolean isNativeHapticEnabled) {
        return new HapticFeedbackFlag(isSettingEnabled, isNativeHapticEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HapticFeedbackFlag)) {
            return false;
        }
        HapticFeedbackFlag hapticFeedbackFlag = (HapticFeedbackFlag) other;
        return this.isSettingEnabled == hapticFeedbackFlag.isSettingEnabled && this.isNativeHapticEnabled == hapticFeedbackFlag.isNativeHapticEnabled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isNativeHapticEnabled) + (Boolean.hashCode(this.isSettingEnabled) * 31);
    }

    public final boolean isNativeHapticEnabled() {
        return this.isNativeHapticEnabled;
    }

    public final boolean isSettingEnabled() {
        return this.isSettingEnabled;
    }

    public String toString() {
        return ly3.o("HapticFeedbackFlag(isSettingEnabled=", ", isNativeHapticEnabled=", Extension.C_BRAKE, this.isSettingEnabled, this.isNativeHapticEnabled);
    }
}
