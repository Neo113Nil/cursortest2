package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/rconfig/configs/NfcPinsConfig;", "", "Lcom/ybsdk/rconfig/configs/NfcPinsEnvironment;", "prod", "uat", "<init>", "(Lcom/ybsdk/rconfig/configs/NfcPinsEnvironment;Lcom/ybsdk/rconfig/configs/NfcPinsEnvironment;)V", "component1", "()Lcom/ybsdk/rconfig/configs/NfcPinsEnvironment;", "component2", "copy", "(Lcom/ybsdk/rconfig/configs/NfcPinsEnvironment;Lcom/ybsdk/rconfig/configs/NfcPinsEnvironment;)Lcom/ybsdk/rconfig/configs/NfcPinsConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/rconfig/configs/NfcPinsEnvironment;", "getProd", "getUat", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class NfcPinsConfig {

    @Json(name = "prod")
    private final NfcPinsEnvironment prod;

    @Json(name = "uat")
    private final NfcPinsEnvironment uat;

    public NfcPinsConfig(NfcPinsEnvironment nfcPinsEnvironment, NfcPinsEnvironment nfcPinsEnvironment2) {
        this.prod = nfcPinsEnvironment;
        this.uat = nfcPinsEnvironment2;
    }

    public static /* synthetic */ NfcPinsConfig copy$default(NfcPinsConfig nfcPinsConfig, NfcPinsEnvironment nfcPinsEnvironment, NfcPinsEnvironment nfcPinsEnvironment2, int i, Object obj) {
        if ((i & 1) != 0) {
            nfcPinsEnvironment = nfcPinsConfig.prod;
        }
        if ((i & 2) != 0) {
            nfcPinsEnvironment2 = nfcPinsConfig.uat;
        }
        return nfcPinsConfig.copy(nfcPinsEnvironment, nfcPinsEnvironment2);
    }

    /* renamed from: component1, reason: from getter */
    public final NfcPinsEnvironment getProd() {
        return this.prod;
    }

    /* renamed from: component2, reason: from getter */
    public final NfcPinsEnvironment getUat() {
        return this.uat;
    }

    public final NfcPinsConfig copy(NfcPinsEnvironment prod, NfcPinsEnvironment uat) {
        return new NfcPinsConfig(prod, uat);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NfcPinsConfig)) {
            return false;
        }
        NfcPinsConfig nfcPinsConfig = (NfcPinsConfig) other;
        return jl40.l(this.prod, nfcPinsConfig.prod) && jl40.l(this.uat, nfcPinsConfig.uat);
    }

    public final NfcPinsEnvironment getProd() {
        return this.prod;
    }

    public final NfcPinsEnvironment getUat() {
        return this.uat;
    }

    public int hashCode() {
        return this.uat.hashCode() + (this.prod.hashCode() * 31);
    }

    public String toString() {
        return "NfcPinsConfig(prod=" + this.prod + ", uat=" + this.uat + Extension.C_BRAKE;
    }
}
