package com.ybsdk.core.stories.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.jl40;
import defpackage.n;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003JO\u0010\u0019\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\b\b\u0003\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/ybsdk/core/stories/dto/CommunicationFullScreenBullet;", "", "title", "", "titleColor", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "subtitle", "subtitleColor", "image", "Lcom/ybsdk/core/stories/dto/CommunicationFullScreenImage;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/stories/dto/CommunicationFullScreenImage;)V", "getTitle", "()Ljava/lang/String;", "getTitleColor", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getSubtitle", "getSubtitleColor", "getImage", "()Lcom/ybsdk/core/stories/dto/CommunicationFullScreenImage;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "core-stories_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CommunicationFullScreenBullet {
    private final CommunicationFullScreenImage image;
    private final String subtitle;
    private final Themes<String> subtitleColor;
    private final String title;
    private final Themes<String> titleColor;

    public CommunicationFullScreenBullet(@Json(name = "title") String str, @Json(name = "title_color") Themes<String> themes, @Json(name = "subtitle") String str2, @Json(name = "subtitle_color") Themes<String> themes2, @Json(name = "image") CommunicationFullScreenImage communicationFullScreenImage) {
        this.title = str;
        this.titleColor = themes;
        this.subtitle = str2;
        this.subtitleColor = themes2;
        this.image = communicationFullScreenImage;
    }

    public static /* synthetic */ CommunicationFullScreenBullet copy$default(CommunicationFullScreenBullet communicationFullScreenBullet, String str, Themes themes, String str2, Themes themes2, CommunicationFullScreenImage communicationFullScreenImage, int i, Object obj) {
        if ((i & 1) != 0) {
            str = communicationFullScreenBullet.title;
        }
        if ((i & 2) != 0) {
            themes = communicationFullScreenBullet.titleColor;
        }
        if ((i & 4) != 0) {
            str2 = communicationFullScreenBullet.subtitle;
        }
        if ((i & 8) != 0) {
            themes2 = communicationFullScreenBullet.subtitleColor;
        }
        if ((i & 16) != 0) {
            communicationFullScreenImage = communicationFullScreenBullet.image;
        }
        CommunicationFullScreenImage communicationFullScreenImage2 = communicationFullScreenImage;
        String str3 = str2;
        return communicationFullScreenBullet.copy(str, themes, str3, themes2, communicationFullScreenImage2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final Themes<String> component2() {
        return this.titleColor;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final Themes<String> component4() {
        return this.subtitleColor;
    }

    /* renamed from: component5, reason: from getter */
    public final CommunicationFullScreenImage getImage() {
        return this.image;
    }

    public final CommunicationFullScreenBullet copy(@Json(name = "title") String title, @Json(name = "title_color") Themes<String> titleColor, @Json(name = "subtitle") String subtitle, @Json(name = "subtitle_color") Themes<String> subtitleColor, @Json(name = "image") CommunicationFullScreenImage image) {
        return new CommunicationFullScreenBullet(title, titleColor, subtitle, subtitleColor, image);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommunicationFullScreenBullet)) {
            return false;
        }
        CommunicationFullScreenBullet communicationFullScreenBullet = (CommunicationFullScreenBullet) other;
        return jl40.l(this.title, communicationFullScreenBullet.title) && jl40.l(this.titleColor, communicationFullScreenBullet.titleColor) && jl40.l(this.subtitle, communicationFullScreenBullet.subtitle) && jl40.l(this.subtitleColor, communicationFullScreenBullet.subtitleColor) && jl40.l(this.image, communicationFullScreenBullet.image);
    }

    public final CommunicationFullScreenImage getImage() {
        return this.image;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final Themes<String> getSubtitleColor() {
        return this.subtitleColor;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Themes<String> getTitleColor() {
        return this.titleColor;
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Themes<String> themes = this.titleColor;
        int hashCode2 = (hashCode + (themes == null ? 0 : themes.hashCode())) * 31;
        String str2 = this.subtitle;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Themes<String> themes2 = this.subtitleColor;
        return this.image.hashCode() + ((hashCode3 + (themes2 != null ? themes2.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.title;
        Themes<String> themes = this.titleColor;
        String str2 = this.subtitle;
        Themes<String> themes2 = this.subtitleColor;
        CommunicationFullScreenImage communicationFullScreenImage = this.image;
        StringBuilder sb = new StringBuilder("CommunicationFullScreenBullet(title=");
        sb.append(str);
        sb.append(", titleColor=");
        sb.append(themes);
        sb.append(", subtitle=");
        n.B(sb, str2, ", subtitleColor=", themes2, ", image=");
        sb.append(communicationFullScreenImage);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
