package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/rconfig/configs/AdjustEventTokenData;", "", "prodToken", "", "devToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getProdToken", "()Ljava/lang/String;", "getDevToken", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class AdjustEventTokenData {

    @Json(name = "dev")
    private final String devToken;

    @Json(name = "prod")
    private final String prodToken;

    public AdjustEventTokenData(String str, String str2) {
        this.prodToken = str;
        this.devToken = str2;
    }

    public static /* synthetic */ AdjustEventTokenData copy$default(AdjustEventTokenData adjustEventTokenData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = adjustEventTokenData.prodToken;
        }
        if ((i & 2) != 0) {
            str2 = adjustEventTokenData.devToken;
        }
        return adjustEventTokenData.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getProdToken() {
        return this.prodToken;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDevToken() {
        return this.devToken;
    }

    public final AdjustEventTokenData copy(String prodToken, String devToken) {
        return new AdjustEventTokenData(prodToken, devToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdjustEventTokenData)) {
            return false;
        }
        AdjustEventTokenData adjustEventTokenData = (AdjustEventTokenData) other;
        return jl40.l(this.prodToken, adjustEventTokenData.prodToken) && jl40.l(this.devToken, adjustEventTokenData.devToken);
    }

    public final String getDevToken() {
        return this.devToken;
    }

    public final String getProdToken() {
        return this.prodToken;
    }

    public int hashCode() {
        return this.devToken.hashCode() + (this.prodToken.hashCode() * 31);
    }

    public String toString() {
        return unr0.p("AdjustEventTokenData(prodToken=", this.prodToken, ", devToken=", this.devToken, Extension.C_BRAKE);
    }
}
