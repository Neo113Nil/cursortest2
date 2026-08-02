package com.ybsdk.feature.trackid.push.internal.network.dto;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/trackid/push/internal/network/dto/OverrideDto;", "", Constants.DEEPLINK, "", "title", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDeeplink", "()Ljava/lang/String;", "getTitle", "getSubtitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-trackid-push_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OverrideDto {

    @Json(name = Constants.DEEPLINK)
    private final String deeplink;

    @Json(name = "subtitle")
    private final String subtitle;

    @Json(name = "title")
    private final String title;

    public OverrideDto(String str, String str2, String str3) {
        this.deeplink = str;
        this.title = str2;
        this.subtitle = str3;
    }

    public static /* synthetic */ OverrideDto copy$default(OverrideDto overrideDto, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = overrideDto.deeplink;
        }
        if ((i & 2) != 0) {
            str2 = overrideDto.title;
        }
        if ((i & 4) != 0) {
            str3 = overrideDto.subtitle;
        }
        return overrideDto.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final OverrideDto copy(String deeplink, String title, String subtitle) {
        return new OverrideDto(deeplink, title, subtitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OverrideDto)) {
            return false;
        }
        OverrideDto overrideDto = (OverrideDto) other;
        return jl40.l(this.deeplink, overrideDto.deeplink) && jl40.l(this.title, overrideDto.title) && jl40.l(this.subtitle, overrideDto.subtitle);
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
        return this.subtitle.hashCode() + unr0.b(this.deeplink.hashCode() * 31, 31, this.title);
    }

    public String toString() {
        String str = this.deeplink;
        String str2 = this.title;
        return oyr.t(b64.v("OverrideDto(deeplink=", str, ", title=", str2, ", subtitle="), this.subtitle, Extension.C_BRAKE);
    }
}
