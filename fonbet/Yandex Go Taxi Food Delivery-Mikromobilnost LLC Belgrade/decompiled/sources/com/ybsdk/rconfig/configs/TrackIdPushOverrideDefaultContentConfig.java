package com.ybsdk.rconfig.configs;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/rconfig/configs/TrackIdPushOverrideDefaultContentConfig;", "", "", "title", "subtitle", Constants.DEEPLINK, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/rconfig/configs/TrackIdPushOverrideDefaultContentConfig;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "getDeeplink", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TrackIdPushOverrideDefaultContentConfig {

    @Json(name = Constants.DEEPLINK)
    private final String deeplink;

    @Json(name = "subtitle")
    private final String subtitle;

    @Json(name = "title")
    private final String title;

    public TrackIdPushOverrideDefaultContentConfig(String str, String str2, String str3) {
        this.title = str;
        this.subtitle = str2;
        this.deeplink = str3;
    }

    public static /* synthetic */ TrackIdPushOverrideDefaultContentConfig copy$default(TrackIdPushOverrideDefaultContentConfig trackIdPushOverrideDefaultContentConfig, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = trackIdPushOverrideDefaultContentConfig.title;
        }
        if ((i & 2) != 0) {
            str2 = trackIdPushOverrideDefaultContentConfig.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = trackIdPushOverrideDefaultContentConfig.deeplink;
        }
        return trackIdPushOverrideDefaultContentConfig.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    public final TrackIdPushOverrideDefaultContentConfig copy(String title, String subtitle, String deeplink) {
        return new TrackIdPushOverrideDefaultContentConfig(title, subtitle, deeplink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackIdPushOverrideDefaultContentConfig)) {
            return false;
        }
        TrackIdPushOverrideDefaultContentConfig trackIdPushOverrideDefaultContentConfig = (TrackIdPushOverrideDefaultContentConfig) other;
        return jl40.l(this.title, trackIdPushOverrideDefaultContentConfig.title) && jl40.l(this.subtitle, trackIdPushOverrideDefaultContentConfig.subtitle) && jl40.l(this.deeplink, trackIdPushOverrideDefaultContentConfig.deeplink);
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deeplink;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        return oyr.t(b64.v("TrackIdPushOverrideDefaultContentConfig(title=", str, ", subtitle=", str2, ", deeplink="), this.deeplink, Extension.C_BRAKE);
    }
}
