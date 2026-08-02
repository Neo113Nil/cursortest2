package com.ybsdk.feature.autotopup.internal.network.dto.regular;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/ToolbarDataDto;", "", "title", "", "subtitle", "subtitleAmount", "subtitleLeftImage", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getSubtitleAmount", "getSubtitleLeftImage", "()Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ToolbarDataDto {
    private final String subtitle;
    private final String subtitleAmount;
    private final ThemedParameter<String> subtitleLeftImage;
    private final String title;

    public ToolbarDataDto(@Json(name = "title") String str, @Json(name = "subtitle") String str2, @Json(name = "subtitle_amount") String str3, @Json(name = "subtitle_left_image") ThemedParameter<String> themedParameter) {
        this.title = str;
        this.subtitle = str2;
        this.subtitleAmount = str3;
        this.subtitleLeftImage = themedParameter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ToolbarDataDto copy$default(ToolbarDataDto toolbarDataDto, String str, String str2, String str3, ThemedParameter themedParameter, int i, Object obj) {
        if ((i & 1) != 0) {
            str = toolbarDataDto.title;
        }
        if ((i & 2) != 0) {
            str2 = toolbarDataDto.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = toolbarDataDto.subtitleAmount;
        }
        if ((i & 8) != 0) {
            themedParameter = toolbarDataDto.subtitleLeftImage;
        }
        return toolbarDataDto.copy(str, str2, str3, themedParameter);
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
    public final String getSubtitleAmount() {
        return this.subtitleAmount;
    }

    public final ThemedParameter<String> component4() {
        return this.subtitleLeftImage;
    }

    public final ToolbarDataDto copy(@Json(name = "title") String title, @Json(name = "subtitle") String subtitle, @Json(name = "subtitle_amount") String subtitleAmount, @Json(name = "subtitle_left_image") ThemedParameter<String> subtitleLeftImage) {
        return new ToolbarDataDto(title, subtitle, subtitleAmount, subtitleLeftImage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToolbarDataDto)) {
            return false;
        }
        ToolbarDataDto toolbarDataDto = (ToolbarDataDto) other;
        return jl40.l(this.title, toolbarDataDto.title) && jl40.l(this.subtitle, toolbarDataDto.subtitle) && jl40.l(this.subtitleAmount, toolbarDataDto.subtitleAmount) && jl40.l(this.subtitleLeftImage, toolbarDataDto.subtitleLeftImage);
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getSubtitleAmount() {
        return this.subtitleAmount;
    }

    public final ThemedParameter<String> getSubtitleLeftImage() {
        return this.subtitleLeftImage;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b = unr0.b(this.title.hashCode() * 31, 31, this.subtitle);
        String str = this.subtitleAmount;
        return this.subtitleLeftImage.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.subtitleAmount;
        ThemedParameter<String> themedParameter = this.subtitleLeftImage;
        StringBuilder v = b64.v("ToolbarDataDto(title=", str, ", subtitle=", str2, ", subtitleAmount=");
        v.append(str3);
        v.append(", subtitleLeftImage=");
        v.append(themedParameter);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
