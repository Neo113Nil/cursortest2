package com.ybsdk.feature.qr.payments.internal.network.dto.info;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/HeaderDto;", "", "image", "", "themedImage", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/String;Ljava/lang/String;)V", "getImage$annotations", "()V", "getImage", "()Ljava/lang/String;", "getThemedImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getTitle", "getDescription", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HeaderDto {
    private final String description;
    private final String image;
    private final Themes<String> themedImage;
    private final String title;

    public HeaderDto(@Json(name = "image") String str, @Json(name = "themed_image") Themes<String> themes, @Json(name = "title") String str2, @Json(name = "description") String str3) {
        this.image = str;
        this.themedImage = themes;
        this.title = str2;
        this.description = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HeaderDto copy$default(HeaderDto headerDto, String str, Themes themes, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = headerDto.image;
        }
        if ((i & 2) != 0) {
            themes = headerDto.themedImage;
        }
        if ((i & 4) != 0) {
            str2 = headerDto.title;
        }
        if ((i & 8) != 0) {
            str3 = headerDto.description;
        }
        return headerDto.copy(str, themes, str2, str3);
    }

    @jxi
    public static /* synthetic */ void getImage$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    public final Themes<String> component2() {
        return this.themedImage;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final HeaderDto copy(@Json(name = "image") String image, @Json(name = "themed_image") Themes<String> themedImage, @Json(name = "title") String title, @Json(name = "description") String description) {
        return new HeaderDto(image, themedImage, title, description);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderDto)) {
            return false;
        }
        HeaderDto headerDto = (HeaderDto) other;
        return jl40.l(this.image, headerDto.image) && jl40.l(this.themedImage, headerDto.themedImage) && jl40.l(this.title, headerDto.title) && jl40.l(this.description, headerDto.description);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getImage() {
        return this.image;
    }

    public final Themes<String> getThemedImage() {
        return this.themedImage;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.image;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Themes<String> themes = this.themedImage;
        return this.description.hashCode() + unr0.b((hashCode + (themes != null ? themes.hashCode() : 0)) * 31, 31, this.title);
    }

    public String toString() {
        String str = this.image;
        Themes<String> themes = this.themedImage;
        String str2 = this.title;
        String str3 = this.description;
        StringBuilder sb = new StringBuilder("HeaderDto(image=");
        sb.append(str);
        sb.append(", themedImage=");
        sb.append(themes);
        sb.append(", title=");
        return g8e.r(sb, str2, ", description=", str3, Extension.C_BRAKE);
    }
}
