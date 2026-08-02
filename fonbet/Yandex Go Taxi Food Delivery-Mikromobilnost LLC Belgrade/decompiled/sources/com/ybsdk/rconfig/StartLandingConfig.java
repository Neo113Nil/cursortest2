package com.ybsdk.rconfig;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u0003\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001d\u0010\r¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/rconfig/StartLandingConfig;", "", "", "isEnabled", "", "url", "goAction", "closeAction", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/rconfig/StartLandingConfig;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Ljava/lang/String;", "getUrl", "getGoAction", "getCloseAction", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class StartLandingConfig {

    @Json(name = "close_callback")
    private final String closeAction;

    @Json(name = "activate_callback")
    private final String goAction;

    @Json(name = "is_enabled")
    private final boolean isEnabled;

    @Json(name = "landing_url")
    private final String url;

    public StartLandingConfig(boolean z, String str, String str2, String str3) {
        this.isEnabled = z;
        this.url = str;
        this.goAction = str2;
        this.closeAction = str3;
    }

    public static /* synthetic */ StartLandingConfig copy$default(StartLandingConfig startLandingConfig, boolean z, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = startLandingConfig.isEnabled;
        }
        if ((i & 2) != 0) {
            str = startLandingConfig.url;
        }
        if ((i & 4) != 0) {
            str2 = startLandingConfig.goAction;
        }
        if ((i & 8) != 0) {
            str3 = startLandingConfig.closeAction;
        }
        return startLandingConfig.copy(z, str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component3, reason: from getter */
    public final String getGoAction() {
        return this.goAction;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCloseAction() {
        return this.closeAction;
    }

    public final StartLandingConfig copy(boolean isEnabled, String url, String goAction, String closeAction) {
        return new StartLandingConfig(isEnabled, url, goAction, closeAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StartLandingConfig)) {
            return false;
        }
        StartLandingConfig startLandingConfig = (StartLandingConfig) other;
        return this.isEnabled == startLandingConfig.isEnabled && jl40.l(this.url, startLandingConfig.url) && jl40.l(this.goAction, startLandingConfig.goAction) && jl40.l(this.closeAction, startLandingConfig.closeAction);
    }

    public final String getCloseAction() {
        return this.closeAction;
    }

    public final String getGoAction() {
        return this.goAction;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.closeAction.hashCode() + unr0.b(unr0.b(Boolean.hashCode(this.isEnabled) * 31, 31, this.url), 31, this.goAction);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        boolean z = this.isEnabled;
        String str = this.url;
        return g8e.r(ly3.v("StartLandingConfig(isEnabled=", ", url=", str, ", goAction=", z), this.goAction, ", closeAction=", this.closeAction, Extension.C_BRAKE);
    }
}
