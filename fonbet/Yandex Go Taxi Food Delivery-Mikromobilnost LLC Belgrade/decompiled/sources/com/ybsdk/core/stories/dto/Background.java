package com.ybsdk.core.stories.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.widgets.common.ImageScaleTypeDto;
import defpackage.jl40;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0010\b\u0001\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0016\b\u0001\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003JK\u0010\u0019\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\b\u0003\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0004HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/ybsdk/core/stories/dto/Background;", "", "themedColor", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "gradientColors", "", "image", "Lcom/ybsdk/core/stories/dto/CommunicationFullScreenImage;", "imageScaleType", "Lcom/ybsdk/widgets/common/ImageScaleTypeDto;", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/util/List;Lcom/ybsdk/core/stories/dto/CommunicationFullScreenImage;Lcom/ybsdk/widgets/common/ImageScaleTypeDto;)V", "getThemedColor", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getGradientColors", "()Ljava/util/List;", "getImage", "()Lcom/ybsdk/core/stories/dto/CommunicationFullScreenImage;", "getImageScaleType", "()Lcom/ybsdk/widgets/common/ImageScaleTypeDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "core-stories_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Background {
    private final List<Themes<String>> gradientColors;
    private final CommunicationFullScreenImage image;
    private final ImageScaleTypeDto imageScaleType;
    private final Themes<String> themedColor;

    public Background(@Json(name = "color") Themes<String> themes, @Json(name = "gradient_colors") List<Themes<String>> list, @Json(name = "image") CommunicationFullScreenImage communicationFullScreenImage, @Json(name = "scale_type") ImageScaleTypeDto imageScaleTypeDto) {
        this.themedColor = themes;
        this.gradientColors = list;
        this.image = communicationFullScreenImage;
        this.imageScaleType = imageScaleTypeDto;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Background copy$default(Background background, Themes themes, List list, CommunicationFullScreenImage communicationFullScreenImage, ImageScaleTypeDto imageScaleTypeDto, int i, Object obj) {
        if ((i & 1) != 0) {
            themes = background.themedColor;
        }
        if ((i & 2) != 0) {
            list = background.gradientColors;
        }
        if ((i & 4) != 0) {
            communicationFullScreenImage = background.image;
        }
        if ((i & 8) != 0) {
            imageScaleTypeDto = background.imageScaleType;
        }
        return background.copy(themes, list, communicationFullScreenImage, imageScaleTypeDto);
    }

    public final Themes<String> component1() {
        return this.themedColor;
    }

    public final List<Themes<String>> component2() {
        return this.gradientColors;
    }

    /* renamed from: component3, reason: from getter */
    public final CommunicationFullScreenImage getImage() {
        return this.image;
    }

    /* renamed from: component4, reason: from getter */
    public final ImageScaleTypeDto getImageScaleType() {
        return this.imageScaleType;
    }

    public final Background copy(@Json(name = "color") Themes<String> themedColor, @Json(name = "gradient_colors") List<Themes<String>> gradientColors, @Json(name = "image") CommunicationFullScreenImage image, @Json(name = "scale_type") ImageScaleTypeDto imageScaleType) {
        return new Background(themedColor, gradientColors, image, imageScaleType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Background)) {
            return false;
        }
        Background background = (Background) other;
        return jl40.l(this.themedColor, background.themedColor) && jl40.l(this.gradientColors, background.gradientColors) && jl40.l(this.image, background.image) && this.imageScaleType == background.imageScaleType;
    }

    public final List<Themes<String>> getGradientColors() {
        return this.gradientColors;
    }

    public final CommunicationFullScreenImage getImage() {
        return this.image;
    }

    public final ImageScaleTypeDto getImageScaleType() {
        return this.imageScaleType;
    }

    public final Themes<String> getThemedColor() {
        return this.themedColor;
    }

    public int hashCode() {
        Themes<String> themes = this.themedColor;
        int hashCode = (themes == null ? 0 : themes.hashCode()) * 31;
        List<Themes<String>> list = this.gradientColors;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        CommunicationFullScreenImage communicationFullScreenImage = this.image;
        int hashCode3 = (hashCode2 + (communicationFullScreenImage == null ? 0 : communicationFullScreenImage.hashCode())) * 31;
        ImageScaleTypeDto imageScaleTypeDto = this.imageScaleType;
        return hashCode3 + (imageScaleTypeDto != null ? imageScaleTypeDto.hashCode() : 0);
    }

    public String toString() {
        return "Background(themedColor=" + this.themedColor + ", gradientColors=" + this.gradientColors + ", image=" + this.image + ", imageScaleType=" + this.imageScaleType + Extension.C_BRAKE;
    }
}
