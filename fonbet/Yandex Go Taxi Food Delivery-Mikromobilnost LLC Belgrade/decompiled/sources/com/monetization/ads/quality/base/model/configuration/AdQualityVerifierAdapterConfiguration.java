package com.monetization.ads.quality.base.model.configuration;

import defpackage.jl40;
import defpackage.n;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.x4e;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/monetization/ads/quality/base/model/configuration/AdQualityVerifierAdapterConfiguration;", "", "", Constants.KEY_API_KEY, "", "verificationTimeoutInSec", "", "debug", "blockAll", "<init>", "(Ljava/lang/String;JZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getApiKey", "J", "getVerificationTimeoutInSec", "()J", "Z", "getDebug", "()Z", "getBlockAll", "mobileads_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AdQualityVerifierAdapterConfiguration {
    private final String apiKey;
    private final boolean blockAll;
    private final boolean debug;
    private final long verificationTimeoutInSec;

    public AdQualityVerifierAdapterConfiguration(String str, long j, boolean z, boolean z2) {
        this.apiKey = str;
        this.verificationTimeoutInSec = j;
        this.debug = z;
        this.blockAll = z2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdQualityVerifierAdapterConfiguration)) {
            return false;
        }
        AdQualityVerifierAdapterConfiguration adQualityVerifierAdapterConfiguration = (AdQualityVerifierAdapterConfiguration) other;
        return jl40.l(this.apiKey, adQualityVerifierAdapterConfiguration.apiKey) && this.verificationTimeoutInSec == adQualityVerifierAdapterConfiguration.verificationTimeoutInSec && this.debug == adQualityVerifierAdapterConfiguration.debug && this.blockAll == adQualityVerifierAdapterConfiguration.blockAll;
    }

    public final long getVerificationTimeoutInSec() {
        return this.verificationTimeoutInSec;
    }

    public int hashCode() {
        return Boolean.hashCode(this.blockAll) + unr0.e(qv10.c(this.apiKey.hashCode() * 31, 31, this.verificationTimeoutInSec), 31, this.debug);
    }

    public String toString() {
        String str = this.apiKey;
        long j = this.verificationTimeoutInSec;
        boolean z = this.debug;
        boolean z2 = this.blockAll;
        StringBuilder l = x4e.l("AdQualityVerifierAdapterConfiguration(apiKey=", str, ", verificationTimeoutInSec=", j);
        n.z(", debug=", ", blockAll=", l, z, z2);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
