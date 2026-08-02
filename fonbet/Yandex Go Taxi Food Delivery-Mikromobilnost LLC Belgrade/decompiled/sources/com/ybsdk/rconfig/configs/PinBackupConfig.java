package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.nzs;
import defpackage.qv10;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0003\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/rconfig/configs/PinBackupConfig;", "", "", "isEnabled", "resetPinAfterFirstWrongEntering", "hasPinCacheEnabled", "<init>", "(ZZLjava/lang/Boolean;)V", "component1", "()Z", "component2", "component3", "()Ljava/lang/Boolean;", "copy", "(ZZLjava/lang/Boolean;)Lcom/ybsdk/rconfig/configs/PinBackupConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getResetPinAfterFirstWrongEntering", "Ljava/lang/Boolean;", "getHasPinCacheEnabled", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class PinBackupConfig {

    @Json(name = "has_pin_cache_enabled")
    private final Boolean hasPinCacheEnabled;

    @Json(name = "is_enabled")
    private final boolean isEnabled;

    @Json(name = "reset_pin_after_first_wrong_entering")
    private final boolean resetPinAfterFirstWrongEntering;

    public PinBackupConfig(boolean z, boolean z2, Boolean bool) {
        this.isEnabled = z;
        this.resetPinAfterFirstWrongEntering = z2;
        this.hasPinCacheEnabled = bool;
    }

    public static /* synthetic */ PinBackupConfig copy$default(PinBackupConfig pinBackupConfig, boolean z, boolean z2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            z = pinBackupConfig.isEnabled;
        }
        if ((i & 2) != 0) {
            z2 = pinBackupConfig.resetPinAfterFirstWrongEntering;
        }
        if ((i & 4) != 0) {
            bool = pinBackupConfig.hasPinCacheEnabled;
        }
        return pinBackupConfig.copy(z, z2, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getResetPinAfterFirstWrongEntering() {
        return this.resetPinAfterFirstWrongEntering;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getHasPinCacheEnabled() {
        return this.hasPinCacheEnabled;
    }

    public final PinBackupConfig copy(boolean isEnabled, boolean resetPinAfterFirstWrongEntering, Boolean hasPinCacheEnabled) {
        return new PinBackupConfig(isEnabled, resetPinAfterFirstWrongEntering, hasPinCacheEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PinBackupConfig)) {
            return false;
        }
        PinBackupConfig pinBackupConfig = (PinBackupConfig) other;
        return this.isEnabled == pinBackupConfig.isEnabled && this.resetPinAfterFirstWrongEntering == pinBackupConfig.resetPinAfterFirstWrongEntering && jl40.l(this.hasPinCacheEnabled, pinBackupConfig.hasPinCacheEnabled);
    }

    public final Boolean getHasPinCacheEnabled() {
        return this.hasPinCacheEnabled;
    }

    public final boolean getResetPinAfterFirstWrongEntering() {
        return this.resetPinAfterFirstWrongEntering;
    }

    public int hashCode() {
        int e = unr0.e(Boolean.hashCode(this.isEnabled) * 31, 31, this.resetPinAfterFirstWrongEntering);
        Boolean bool = this.hasPinCacheEnabled;
        return e + (bool == null ? 0 : bool.hashCode());
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        boolean z = this.isEnabled;
        boolean z2 = this.resetPinAfterFirstWrongEntering;
        return nzs.d(qv10.u("PinBackupConfig(isEnabled=", ", resetPinAfterFirstWrongEntering=", ", hasPinCacheEnabled=", z, z2), this.hasPinCacheEnabled, Extension.C_BRAKE);
    }
}
