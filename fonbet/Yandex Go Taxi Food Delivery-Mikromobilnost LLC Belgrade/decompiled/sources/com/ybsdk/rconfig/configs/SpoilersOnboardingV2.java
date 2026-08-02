package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.tse0;
import kotlin.Metadata;
import org.webrtc.MediaStreamTrack;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0013Jf\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0013J\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\u0003\u0010\u000fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b&\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b'\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b(\u0010\u0013R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b)\u0010\u0013¨\u0006*"}, d2 = {"Lcom/ybsdk/rconfig/configs/SpoilersOnboardingV2;", "", "", "isEnabled", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "", MediaStreamTrack.VIDEO_TRACK_KIND, "title", "subtitle", "descriptionHtml", "primaryButtonTitle", "secondaryButtonTitle", "<init>", "(ZLcom/ybsdk/core/common/data/network/dto/ThemedParameter;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Z", "component2", "()Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "copy", "(ZLcom/ybsdk/core/common/data/network/dto/ThemedParameter;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/rconfig/configs/SpoilersOnboardingV2;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "getVideo", "Ljava/lang/String;", "getTitle", "getSubtitle", "getDescriptionHtml", "getPrimaryButtonTitle", "getSecondaryButtonTitle", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class SpoilersOnboardingV2 {

    @Json(name = "description_html")
    private final String descriptionHtml;

    @Json(name = "is_enabled")
    private final boolean isEnabled;

    @Json(name = "primary_button_title")
    private final String primaryButtonTitle;

    @Json(name = "secondary_button_title")
    private final String secondaryButtonTitle;

    @Json(name = "subtitle")
    private final String subtitle;

    @Json(name = "title")
    private final String title;

    @Json(name = MediaStreamTrack.VIDEO_TRACK_KIND)
    private final ThemedParameter<String> video;

    public SpoilersOnboardingV2(boolean z, ThemedParameter<String> themedParameter, String str, String str2, String str3, String str4, String str5) {
        this.isEnabled = z;
        this.video = themedParameter;
        this.title = str;
        this.subtitle = str2;
        this.descriptionHtml = str3;
        this.primaryButtonTitle = str4;
        this.secondaryButtonTitle = str5;
    }

    public static /* synthetic */ SpoilersOnboardingV2 copy$default(SpoilersOnboardingV2 spoilersOnboardingV2, boolean z, ThemedParameter themedParameter, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            z = spoilersOnboardingV2.isEnabled;
        }
        if ((i & 2) != 0) {
            themedParameter = spoilersOnboardingV2.video;
        }
        if ((i & 4) != 0) {
            str = spoilersOnboardingV2.title;
        }
        if ((i & 8) != 0) {
            str2 = spoilersOnboardingV2.subtitle;
        }
        if ((i & 16) != 0) {
            str3 = spoilersOnboardingV2.descriptionHtml;
        }
        if ((i & 32) != 0) {
            str4 = spoilersOnboardingV2.primaryButtonTitle;
        }
        if ((i & 64) != 0) {
            str5 = spoilersOnboardingV2.secondaryButtonTitle;
        }
        String str6 = str4;
        String str7 = str5;
        String str8 = str3;
        String str9 = str;
        return spoilersOnboardingV2.copy(z, themedParameter, str9, str2, str8, str6, str7);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public final ThemedParameter<String> component2() {
        return this.video;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDescriptionHtml() {
        return this.descriptionHtml;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPrimaryButtonTitle() {
        return this.primaryButtonTitle;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSecondaryButtonTitle() {
        return this.secondaryButtonTitle;
    }

    public final SpoilersOnboardingV2 copy(boolean isEnabled, ThemedParameter<String> video, String title, String subtitle, String descriptionHtml, String primaryButtonTitle, String secondaryButtonTitle) {
        return new SpoilersOnboardingV2(isEnabled, video, title, subtitle, descriptionHtml, primaryButtonTitle, secondaryButtonTitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpoilersOnboardingV2)) {
            return false;
        }
        SpoilersOnboardingV2 spoilersOnboardingV2 = (SpoilersOnboardingV2) other;
        return this.isEnabled == spoilersOnboardingV2.isEnabled && jl40.l(this.video, spoilersOnboardingV2.video) && jl40.l(this.title, spoilersOnboardingV2.title) && jl40.l(this.subtitle, spoilersOnboardingV2.subtitle) && jl40.l(this.descriptionHtml, spoilersOnboardingV2.descriptionHtml) && jl40.l(this.primaryButtonTitle, spoilersOnboardingV2.primaryButtonTitle) && jl40.l(this.secondaryButtonTitle, spoilersOnboardingV2.secondaryButtonTitle);
    }

    public final String getDescriptionHtml() {
        return this.descriptionHtml;
    }

    public final String getPrimaryButtonTitle() {
        return this.primaryButtonTitle;
    }

    public final String getSecondaryButtonTitle() {
        return this.secondaryButtonTitle;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final ThemedParameter<String> getVideo() {
        return this.video;
    }

    public int hashCode() {
        int d = tse0.d(this.video, Boolean.hashCode(this.isEnabled) * 31, 31);
        String str = this.title;
        int hashCode = (d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.descriptionHtml;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.primaryButtonTitle;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.secondaryButtonTitle;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        boolean z = this.isEnabled;
        ThemedParameter<String> themedParameter = this.video;
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.descriptionHtml;
        String str4 = this.primaryButtonTitle;
        String str5 = this.secondaryButtonTitle;
        StringBuilder sb = new StringBuilder("SpoilersOnboardingV2(isEnabled=");
        sb.append(z);
        sb.append(", video=");
        sb.append(themedParameter);
        sb.append(", title=");
        g8e.D(sb, str, ", subtitle=", str2, ", descriptionHtml=");
        g8e.D(sb, str3, ", primaryButtonTitle=", str4, ", secondaryButtonTitle=");
        return oyr.t(sb, str5, Extension.C_BRAKE);
    }
}
