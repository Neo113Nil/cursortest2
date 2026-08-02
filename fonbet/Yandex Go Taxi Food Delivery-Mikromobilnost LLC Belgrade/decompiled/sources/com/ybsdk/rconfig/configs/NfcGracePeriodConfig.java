package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0003\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/rconfig/configs/NfcGracePeriodConfig;", "", "", "isEnabled", "", "seconds", "<init>", "(ZI)V", "component1", "()Z", "component2", "()I", "copy", "(ZI)Lcom/ybsdk/rconfig/configs/NfcGracePeriodConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Z", CA20Status.STATUS_USER_I, "getSeconds", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class NfcGracePeriodConfig {

    @Json(name = "is_enabled")
    private final boolean isEnabled;

    @Json(name = "seconds")
    private final int seconds;

    public NfcGracePeriodConfig(boolean z, int i) {
        this.isEnabled = z;
        this.seconds = i;
    }

    public static /* synthetic */ NfcGracePeriodConfig copy$default(NfcGracePeriodConfig nfcGracePeriodConfig, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = nfcGracePeriodConfig.isEnabled;
        }
        if ((i2 & 2) != 0) {
            i = nfcGracePeriodConfig.seconds;
        }
        return nfcGracePeriodConfig.copy(z, i);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSeconds() {
        return this.seconds;
    }

    public final NfcGracePeriodConfig copy(boolean isEnabled, int seconds) {
        return new NfcGracePeriodConfig(isEnabled, seconds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NfcGracePeriodConfig)) {
            return false;
        }
        NfcGracePeriodConfig nfcGracePeriodConfig = (NfcGracePeriodConfig) other;
        return this.isEnabled == nfcGracePeriodConfig.isEnabled && this.seconds == nfcGracePeriodConfig.seconds;
    }

    public final int getSeconds() {
        return this.seconds;
    }

    public int hashCode() {
        return Integer.hashCode(this.seconds) + (Boolean.hashCode(this.isEnabled) * 31);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        return "NfcGracePeriodConfig(isEnabled=" + this.isEnabled + ", seconds=" + this.seconds + Extension.C_BRAKE;
    }
}
