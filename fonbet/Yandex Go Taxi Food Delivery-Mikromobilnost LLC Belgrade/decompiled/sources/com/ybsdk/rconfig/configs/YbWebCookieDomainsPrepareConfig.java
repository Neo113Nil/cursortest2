package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.qv10;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u0003\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u0004\u0010\u000bR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/rconfig/configs/YbWebCookieDomainsPrepareConfig;", "", "", "isEnabled", "isPassportApiUnauthHandleEnabled", "", "", "domains", "<init>", "(ZZLjava/util/List;)V", "component1", "()Z", "component2", "component3", "()Ljava/util/List;", "copy", "(ZZLjava/util/List;)Lcom/ybsdk/rconfig/configs/YbWebCookieDomainsPrepareConfig;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Ljava/util/List;", "getDomains", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class YbWebCookieDomainsPrepareConfig {

    @Json(name = "domains")
    private final List<String> domains;

    @Json(name = "is_enabled")
    private final boolean isEnabled;

    @Json(name = "is_passport_api_unauth_handle_enabled")
    private final boolean isPassportApiUnauthHandleEnabled;

    public YbWebCookieDomainsPrepareConfig(boolean z, boolean z2, List<String> list) {
        this.isEnabled = z;
        this.isPassportApiUnauthHandleEnabled = z2;
        this.domains = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ YbWebCookieDomainsPrepareConfig copy$default(YbWebCookieDomainsPrepareConfig ybWebCookieDomainsPrepareConfig, boolean z, boolean z2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = ybWebCookieDomainsPrepareConfig.isEnabled;
        }
        if ((i & 2) != 0) {
            z2 = ybWebCookieDomainsPrepareConfig.isPassportApiUnauthHandleEnabled;
        }
        if ((i & 4) != 0) {
            list = ybWebCookieDomainsPrepareConfig.domains;
        }
        return ybWebCookieDomainsPrepareConfig.copy(z, z2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsPassportApiUnauthHandleEnabled() {
        return this.isPassportApiUnauthHandleEnabled;
    }

    public final List<String> component3() {
        return this.domains;
    }

    public final YbWebCookieDomainsPrepareConfig copy(boolean isEnabled, boolean isPassportApiUnauthHandleEnabled, List<String> domains) {
        return new YbWebCookieDomainsPrepareConfig(isEnabled, isPassportApiUnauthHandleEnabled, domains);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof YbWebCookieDomainsPrepareConfig)) {
            return false;
        }
        YbWebCookieDomainsPrepareConfig ybWebCookieDomainsPrepareConfig = (YbWebCookieDomainsPrepareConfig) other;
        return this.isEnabled == ybWebCookieDomainsPrepareConfig.isEnabled && this.isPassportApiUnauthHandleEnabled == ybWebCookieDomainsPrepareConfig.isPassportApiUnauthHandleEnabled && jl40.l(this.domains, ybWebCookieDomainsPrepareConfig.domains);
    }

    public final List<String> getDomains() {
        return this.domains;
    }

    public int hashCode() {
        return this.domains.hashCode() + unr0.e(Boolean.hashCode(this.isEnabled) * 31, 31, this.isPassportApiUnauthHandleEnabled);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final boolean isPassportApiUnauthHandleEnabled() {
        return this.isPassportApiUnauthHandleEnabled;
    }

    public String toString() {
        boolean z = this.isEnabled;
        boolean z2 = this.isPassportApiUnauthHandleEnabled;
        return ly3.s(qv10.u("YbWebCookieDomainsPrepareConfig(isEnabled=", ", isPassportApiUnauthHandleEnabled=", ", domains=", z, z2), this.domains, Extension.C_BRAKE);
    }
}
