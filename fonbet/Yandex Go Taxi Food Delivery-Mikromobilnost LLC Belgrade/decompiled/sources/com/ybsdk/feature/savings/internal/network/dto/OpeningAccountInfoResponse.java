package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.widgets.common.ImageScaleTypeDto;
import defpackage.b64;
import defpackage.jl40;
import defpackage.n;
import defpackage.nnm;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0010\b\u0001\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0089\u0001\u0010%\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u000e\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0010\b\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006,"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/OpeningAccountInfoResponse;", "", "titleText", "", "mainText", "action", "cardBackground", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "image", "titleTextColor", "mainTextColor", "backgroundImage", "imageScaleTypeDto", "Lcom/ybsdk/widgets/common/ImageScaleTypeDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/widgets/common/ImageScaleTypeDto;)V", "getTitleText", "()Ljava/lang/String;", "getMainText", "getAction", "getCardBackground", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getImage", "getTitleTextColor", "getMainTextColor", "getBackgroundImage", "getImageScaleTypeDto", "()Lcom/ybsdk/widgets/common/ImageScaleTypeDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OpeningAccountInfoResponse {
    private final String action;
    private final Themes<String> backgroundImage;
    private final Themes<String> cardBackground;
    private final Themes<String> image;
    private final ImageScaleTypeDto imageScaleTypeDto;
    private final String mainText;
    private final Themes<String> mainTextColor;
    private final String titleText;
    private final Themes<String> titleTextColor;

    public OpeningAccountInfoResponse(@Json(name = "title") String str, @Json(name = "main_text") String str2, @Json(name = "action") String str3, @Json(name = "background") Themes<String> themes, @Json(name = "image") Themes<String> themes2, @Json(name = "title_text_color") Themes<String> themes3, @Json(name = "main_text_color") Themes<String> themes4, @Json(name = "background_image") Themes<String> themes5, @Json(name = "background_image_scale_type") ImageScaleTypeDto imageScaleTypeDto) {
        this.titleText = str;
        this.mainText = str2;
        this.action = str3;
        this.cardBackground = themes;
        this.image = themes2;
        this.titleTextColor = themes3;
        this.mainTextColor = themes4;
        this.backgroundImage = themes5;
        this.imageScaleTypeDto = imageScaleTypeDto;
    }

    public static /* synthetic */ OpeningAccountInfoResponse copy$default(OpeningAccountInfoResponse openingAccountInfoResponse, String str, String str2, String str3, Themes themes, Themes themes2, Themes themes3, Themes themes4, Themes themes5, ImageScaleTypeDto imageScaleTypeDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = openingAccountInfoResponse.titleText;
        }
        if ((i & 2) != 0) {
            str2 = openingAccountInfoResponse.mainText;
        }
        if ((i & 4) != 0) {
            str3 = openingAccountInfoResponse.action;
        }
        if ((i & 8) != 0) {
            themes = openingAccountInfoResponse.cardBackground;
        }
        if ((i & 16) != 0) {
            themes2 = openingAccountInfoResponse.image;
        }
        if ((i & 32) != 0) {
            themes3 = openingAccountInfoResponse.titleTextColor;
        }
        if ((i & 64) != 0) {
            themes4 = openingAccountInfoResponse.mainTextColor;
        }
        if ((i & 128) != 0) {
            themes5 = openingAccountInfoResponse.backgroundImage;
        }
        if ((i & 256) != 0) {
            imageScaleTypeDto = openingAccountInfoResponse.imageScaleTypeDto;
        }
        Themes themes6 = themes5;
        ImageScaleTypeDto imageScaleTypeDto2 = imageScaleTypeDto;
        Themes themes7 = themes3;
        Themes themes8 = themes4;
        Themes themes9 = themes2;
        String str4 = str3;
        return openingAccountInfoResponse.copy(str, str2, str4, themes, themes9, themes7, themes8, themes6, imageScaleTypeDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitleText() {
        return this.titleText;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMainText() {
        return this.mainText;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    public final Themes<String> component4() {
        return this.cardBackground;
    }

    public final Themes<String> component5() {
        return this.image;
    }

    public final Themes<String> component6() {
        return this.titleTextColor;
    }

    public final Themes<String> component7() {
        return this.mainTextColor;
    }

    public final Themes<String> component8() {
        return this.backgroundImage;
    }

    /* renamed from: component9, reason: from getter */
    public final ImageScaleTypeDto getImageScaleTypeDto() {
        return this.imageScaleTypeDto;
    }

    public final OpeningAccountInfoResponse copy(@Json(name = "title") String titleText, @Json(name = "main_text") String mainText, @Json(name = "action") String action, @Json(name = "background") Themes<String> cardBackground, @Json(name = "image") Themes<String> image, @Json(name = "title_text_color") Themes<String> titleTextColor, @Json(name = "main_text_color") Themes<String> mainTextColor, @Json(name = "background_image") Themes<String> backgroundImage, @Json(name = "background_image_scale_type") ImageScaleTypeDto imageScaleTypeDto) {
        return new OpeningAccountInfoResponse(titleText, mainText, action, cardBackground, image, titleTextColor, mainTextColor, backgroundImage, imageScaleTypeDto);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpeningAccountInfoResponse)) {
            return false;
        }
        OpeningAccountInfoResponse openingAccountInfoResponse = (OpeningAccountInfoResponse) other;
        return jl40.l(this.titleText, openingAccountInfoResponse.titleText) && jl40.l(this.mainText, openingAccountInfoResponse.mainText) && jl40.l(this.action, openingAccountInfoResponse.action) && jl40.l(this.cardBackground, openingAccountInfoResponse.cardBackground) && jl40.l(this.image, openingAccountInfoResponse.image) && jl40.l(this.titleTextColor, openingAccountInfoResponse.titleTextColor) && jl40.l(this.mainTextColor, openingAccountInfoResponse.mainTextColor) && jl40.l(this.backgroundImage, openingAccountInfoResponse.backgroundImage) && this.imageScaleTypeDto == openingAccountInfoResponse.imageScaleTypeDto;
    }

    public final String getAction() {
        return this.action;
    }

    public final Themes<String> getBackgroundImage() {
        return this.backgroundImage;
    }

    public final Themes<String> getCardBackground() {
        return this.cardBackground;
    }

    public final Themes<String> getImage() {
        return this.image;
    }

    public final ImageScaleTypeDto getImageScaleTypeDto() {
        return this.imageScaleTypeDto;
    }

    public final String getMainText() {
        return this.mainText;
    }

    public final Themes<String> getMainTextColor() {
        return this.mainTextColor;
    }

    public final String getTitleText() {
        return this.titleText;
    }

    public final Themes<String> getTitleTextColor() {
        return this.titleTextColor;
    }

    public int hashCode() {
        String str = this.titleText;
        int b = unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.mainText);
        String str2 = this.action;
        int c = nnm.c(this.mainTextColor, nnm.c(this.titleTextColor, nnm.c(this.image, nnm.c(this.cardBackground, (b + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31), 31);
        Themes<String> themes = this.backgroundImage;
        int hashCode = (c + (themes == null ? 0 : themes.hashCode())) * 31;
        ImageScaleTypeDto imageScaleTypeDto = this.imageScaleTypeDto;
        return hashCode + (imageScaleTypeDto != null ? imageScaleTypeDto.hashCode() : 0);
    }

    public String toString() {
        String str = this.titleText;
        String str2 = this.mainText;
        String str3 = this.action;
        Themes<String> themes = this.cardBackground;
        Themes<String> themes2 = this.image;
        Themes<String> themes3 = this.titleTextColor;
        Themes<String> themes4 = this.mainTextColor;
        Themes<String> themes5 = this.backgroundImage;
        ImageScaleTypeDto imageScaleTypeDto = this.imageScaleTypeDto;
        StringBuilder v = b64.v("OpeningAccountInfoResponse(titleText=", str, ", mainText=", str2, ", action=");
        n.B(v, str3, ", cardBackground=", themes, ", image=");
        v.append(themes2);
        v.append(", titleTextColor=");
        v.append(themes3);
        v.append(", mainTextColor=");
        v.append(themes4);
        v.append(", backgroundImage=");
        v.append(themes5);
        v.append(", imageScaleTypeDto=");
        v.append(imageScaleTypeDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
