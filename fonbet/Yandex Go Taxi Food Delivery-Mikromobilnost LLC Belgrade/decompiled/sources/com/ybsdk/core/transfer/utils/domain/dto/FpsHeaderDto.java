package com.ybsdk.core.transfer.utils.domain.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/core/transfer/utils/domain/dto/FpsHeaderDto;", "", "image", "", "themedImage", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "title", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/String;)V", "getImage$annotations", "()V", "getImage", "()Ljava/lang/String;", "getThemedImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "core-transfer-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FpsHeaderDto {
    private final String image;
    private final Themes<String> themedImage;
    private final String title;

    public FpsHeaderDto(@Json(name = "image") String str, @Json(name = "themed_image") Themes<String> themes, @Json(name = "title") String str2) {
        this.image = str;
        this.themedImage = themes;
        this.title = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FpsHeaderDto copy$default(FpsHeaderDto fpsHeaderDto, String str, Themes themes, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fpsHeaderDto.image;
        }
        if ((i & 2) != 0) {
            themes = fpsHeaderDto.themedImage;
        }
        if ((i & 4) != 0) {
            str2 = fpsHeaderDto.title;
        }
        return fpsHeaderDto.copy(str, themes, str2);
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

    public final FpsHeaderDto copy(@Json(name = "image") String image, @Json(name = "themed_image") Themes<String> themedImage, @Json(name = "title") String title) {
        return new FpsHeaderDto(image, themedImage, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FpsHeaderDto)) {
            return false;
        }
        FpsHeaderDto fpsHeaderDto = (FpsHeaderDto) other;
        return jl40.l(this.image, fpsHeaderDto.image) && jl40.l(this.themedImage, fpsHeaderDto.themedImage) && jl40.l(this.title, fpsHeaderDto.title);
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
        int hashCode2 = (hashCode + (themes == null ? 0 : themes.hashCode())) * 31;
        String str2 = this.title;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.image;
        Themes<String> themes = this.themedImage;
        String str2 = this.title;
        StringBuilder sb = new StringBuilder("FpsHeaderDto(image=");
        sb.append(str);
        sb.append(", themedImage=");
        sb.append(themes);
        sb.append(", title=");
        return oyr.t(sb, str2, Extension.C_BRAKE);
    }
}
