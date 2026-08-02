package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/rconfig/configs/SslTrustConfig;", "", "Lcom/ybsdk/rconfig/configs/SslTrustMode;", "mode", "<init>", "(Lcom/ybsdk/rconfig/configs/SslTrustMode;)V", "component1", "()Lcom/ybsdk/rconfig/configs/SslTrustMode;", "copy", "(Lcom/ybsdk/rconfig/configs/SslTrustMode;)Lcom/ybsdk/rconfig/configs/SslTrustConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/rconfig/configs/SslTrustMode;", "getMode", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class SslTrustConfig {

    @Json(name = "mode")
    private final SslTrustMode mode;

    public SslTrustConfig(SslTrustMode sslTrustMode) {
        this.mode = sslTrustMode;
    }

    public static /* synthetic */ SslTrustConfig copy$default(SslTrustConfig sslTrustConfig, SslTrustMode sslTrustMode, int i, Object obj) {
        if ((i & 1) != 0) {
            sslTrustMode = sslTrustConfig.mode;
        }
        return sslTrustConfig.copy(sslTrustMode);
    }

    /* renamed from: component1, reason: from getter */
    public final SslTrustMode getMode() {
        return this.mode;
    }

    public final SslTrustConfig copy(SslTrustMode mode) {
        return new SslTrustConfig(mode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SslTrustConfig) && this.mode == ((SslTrustConfig) other).mode;
    }

    public final SslTrustMode getMode() {
        return this.mode;
    }

    public int hashCode() {
        return this.mode.hashCode();
    }

    public String toString() {
        return "SslTrustConfig(mode=" + this.mode + Extension.C_BRAKE;
    }
}
