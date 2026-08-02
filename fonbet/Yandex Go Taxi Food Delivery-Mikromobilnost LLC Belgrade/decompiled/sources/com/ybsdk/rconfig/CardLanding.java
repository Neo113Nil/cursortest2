package com.ybsdk.rconfig;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.xvz;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0003\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/rconfig/CardLanding;", "", "", "isNativeCardLandingEnabled", "", "url", "<init>", "(ZLjava/lang/String;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "copy", "(ZLjava/lang/String;)Lcom/ybsdk/rconfig/CardLanding;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Ljava/lang/String;", "getUrl", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CardLanding {

    @Json(name = "is_native_card_landing_enabled")
    private final boolean isNativeCardLandingEnabled;

    @Json(name = "landing_url")
    private final String url;

    public CardLanding(boolean z, String str) {
        this.isNativeCardLandingEnabled = z;
        this.url = str;
    }

    public static /* synthetic */ CardLanding copy$default(CardLanding cardLanding, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = cardLanding.isNativeCardLandingEnabled;
        }
        if ((i & 2) != 0) {
            str = cardLanding.url;
        }
        return cardLanding.copy(z, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsNativeCardLandingEnabled() {
        return this.isNativeCardLandingEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final CardLanding copy(boolean isNativeCardLandingEnabled, String url) {
        return new CardLanding(isNativeCardLandingEnabled, url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardLanding)) {
            return false;
        }
        CardLanding cardLanding = (CardLanding) other;
        return this.isNativeCardLandingEnabled == cardLanding.isNativeCardLandingEnabled && jl40.l(this.url, cardLanding.url);
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode() + (Boolean.hashCode(this.isNativeCardLandingEnabled) * 31);
    }

    public final boolean isNativeCardLandingEnabled() {
        return this.isNativeCardLandingEnabled;
    }

    public String toString() {
        return xvz.m("CardLanding(isNativeCardLandingEnabled=", this.isNativeCardLandingEnabled, ", url=", this.url, Extension.C_BRAKE);
    }
}
