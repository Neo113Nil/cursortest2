package ru.ok.android.externcalls.sdk.ml.config;

import xsna.epx;
import xsna.n23;
import xsna.urd0;
import xsna.xe9;

/* compiled from: MLFeatureConfig.kt */
/* loaded from: classes9.dex */
public final class MLFeatureConfig {
    private final String checksum;
    private final boolean enabled;
    private final String url;

    public MLFeatureConfig(String str, String str2, boolean z) {
        this.url = str;
        this.checksum = str2;
        this.enabled = z;
    }

    public static /* synthetic */ MLFeatureConfig copy$default(MLFeatureConfig mLFeatureConfig, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mLFeatureConfig.url;
        }
        if ((i & 2) != 0) {
            str2 = mLFeatureConfig.checksum;
        }
        if ((i & 4) != 0) {
            z = mLFeatureConfig.enabled;
        }
        return mLFeatureConfig.copy(str, str2, z);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.checksum;
    }

    public final boolean component3() {
        return this.enabled;
    }

    public final MLFeatureConfig copy(String str, String str2, boolean z) {
        return new MLFeatureConfig(str, str2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MLFeatureConfig)) {
            return false;
        }
        MLFeatureConfig mLFeatureConfig = (MLFeatureConfig) obj;
        return epx.f(this.url, mLFeatureConfig.url) && epx.f(this.checksum, mLFeatureConfig.checksum) && this.enabled == mLFeatureConfig.enabled;
    }

    public final String getChecksum() {
        return this.checksum;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return Boolean.hashCode(this.enabled) + urd0.a(this.url.hashCode() * 31, 31, this.checksum);
    }

    public String toString() {
        String str = this.url;
        String str2 = this.checksum;
        return n23.b(xe9.a("MLFeatureConfig(url=", str, ", checksum=", str2, ", enabled="), this.enabled, ")");
    }
}
